package com.raptor.mcmodel.util

import com.raptor.mcmodel.mcmodel.*

import static com.raptor.mcmodel.mcmodel.McmodelPackage.Literals.*
import org.eclipse.emf.ecore.EStructuralFeature
import java.util.List
import org.eclipse.emf.ecore.resource.Resource

class McmodelUtils {
	
//	def static isEmpty(Faces it) {
//		north === null && south === null
//		&& east === null && west === null
//		&& up === null && down === null
//	}
	
	def static isEmpty(OverridePredicate it) {
		!(
			angleDefined || blockingDefined || brokenDefined || castDefined
			|| cooldownDefined || damageDefined || damagedDefined
			|| lefthandedDefined || pullDefined || pullingDefined || throwingDefined
			|| timeDefined || customModelDataDefined 
		)
	}
	
	def static size(OverridePredicate it) {
		var result = 0
		if (angleDefined) result++
		if (blockingDefined) result++
		if (brokenDefined) result++
		if (castDefined) result++
		if (cooldownDefined) result++
		if (damageDefined) result++
		if (damagedDefined) result++
		if (lefthandedDefined) result++
		if (pullDefined) result++
		if (pullingDefined) result++
		if (throwingDefined) result++
		if (timeDefined) result++
		if (customModelDataDefined) result++
		return result 
	}
	
	def static isSmall(OverridePredicate it) {
		var result = false
		if (angleDefined) result = true
		if (blockingDefined) {
			if (result) return false
			result = true
		}
		if (brokenDefined) {
			if (result) return false
			result = true
		}
		if (castDefined) {
			if (result) return false
			result = true
		}
		if (cooldownDefined) {
			if (result) return false
			result = true
		}
		if (damageDefined) {
			if (result) return false
			result = true
		}
		if (damagedDefined) {
			if (result) return false
			result = true
		}
		if (lefthandedDefined) {
			if (result) return false
			result = true
		}
		if (pullDefined) {
			if (result) return false
			result = true
		}
		if (pullingDefined) {
			if (result) return false
			result = true
		}
		if (throwingDefined) {
			if (result) return false
			result = true
		}
		if (timeDefined) {
			if (result) return false
			result = true
		}
		if (customModelDataDefined) {
			if (result) return false
		}
		return true
	}
	
	public static List<EStructuralFeature> VEC3D$FEATURES = #[VEC3D__X, VEC3D__Y, VEC3D__Z]
	
	public static List<EStructuralFeature> VEC4D$FEATURES = #[VEC4D__X1, VEC4D__Y1, VEC4D__X2, VEC4D__Y2]
	
	public static List<EStructuralFeature> DISPLAY$FEATURES = #[DISPLAY__THIRDPERSON_LEFTHAND, DISPLAY__THIRDPERSON_RIGHTHAND, DISPLAY__FIRSTPERSON_LEFTHAND, DISPLAY__FIRSTPERSON_RIGHTHAND, DISPLAY__GUI, DISPLAY__HEAD, DISPLAY__GROUND, DISPLAY__FIXED]
	
//	public static List<EStructuralFeature> FACES$FEATURES = #[FACES__NORTH, FACES__SOUTH, FACES__EAST, FACES__WEST, FACES__UP, FACES__DOWN]
	
	def static getFileNameNoExt(Resource resource) {
		val result = resource.URI.lastSegment
		val i = result.lastIndexOf('.')
		if (i == -1) {
			result
		} else {
			result.substring(0, i)
		}
	}
	
}