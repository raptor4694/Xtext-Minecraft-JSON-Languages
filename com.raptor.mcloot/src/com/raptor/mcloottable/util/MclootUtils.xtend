package com.raptor.mcloottable.util

import com.raptor.mcloottable.mcloot.*

import static com.raptor.mcloottable.mcloot.MclootPackage.Literals.*
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature

class MclootUtils {
    
    def static isFeatureDefined(EObject object, EStructuralFeature feature) {
        !NodeModelUtils.findNodesForFeature(object, feature).isEmpty
    }
    
    def static isMinDefined(NormalLongRange range) {
        range.isFeatureDefined(NORMAL_LONG_RANGE__MIN)
    }
    
    def static isMaxDefined(NormalLongRange range) {
        range.isFeatureDefined(NORMAL_LONG_RANGE__MAX)
    }
    
    def static isMinDefined(NormalDoubleRange range) {
        range.isFeatureDefined(NORMAL_DOUBLE_RANGE__MIN)
    }
    
    def static isMaxDefined(NormalDoubleRange range) {
        range.isFeatureDefined(NORMAL_DOUBLE_RANGE__MAX)
    }
    
    interface CallbackResult {
        def void otherwise(Runnable action)
    }
    
    static val CallbackResult CALLBACK_PASSED = []
    static val CallbackResult CALLBACK_FAILED = [run]
    
    def static CallbackResult ifMinecraftKey(String key, (String)=>void action) {
        if (!key.contains(':')) {
            action.apply(key)
        } else if (key.startsWith("minecraft:")) {
            action.apply(key.substring(10))
        } else {
            return CALLBACK_FAILED 
        }
        return CALLBACK_PASSED
    }
    
    def static addDefaultNamespace(String key) {
        if (key.contains(':')) {
            key
        } else {
            "minecraft:" + key
        }
    }
    
}