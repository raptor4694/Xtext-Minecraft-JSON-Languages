package com.raptor.mcloottable.ui.editor.syntaxcoloring

import com.raptor.mcloottable.mcloot.*
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.nodemodel.ILeafNode
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.util.CancelIndicator

import static com.raptor.mcloottable.ui.editor.syntaxcoloring.MclootHighlightingConfiguration.*
import static com.raptor.mcloottable.mcloot.MclootPackage.Literals.*
import static extension com.raptor.mcloottable.util.MclootUtils.*
import java.util.regex.Pattern
import org.eclipse.xtext.TerminalRule

class MclootSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
    
    static val CONTINUE = false
    static val STOP = true
    static val ALL = -1
    
    def protected dispatch boolean highlightElement(
        EObject it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        StewEffect it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        acceptor.highlightNamespacedKey(it, STEW_EFFECT__TYPE)
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        LootTable it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        if (typeDefined) {
            acceptor.highlightFeature(it, LOOT_TABLE__TYPE, DEFAULT_ID)
        }
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        LootPool it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        acceptor.highlightFeature(it, LOOT_POOL__NAME, DEFAULT_ID)
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        LootEntry it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        if (type != "dynamic" && name !== null) {
            acceptor.highlightNamespacedKey(it, LOOT_ENTRY__NAME)
        }
        if (entryName !== null) {
            acceptor.highlightFeature(it, LOOT_ENTRY__ENTRY_NAME, STRING_ID)
        }
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        ApplyBonusLootFunction it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        acceptor.highlightNamespacedKey(it, APPLY_BONUS_LOOT_FUNCTION__ENCHANTMENT)
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        NBTOperation it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        acceptor.highlightFeature(it, NBT_OPERATION__SOURCE, DEFAULT_ID)
        acceptor.highlightFeature(it, NBT_OPERATION__TARGET, DEFAULT_ID)
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        EnchantRandomlyLootFunction it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        acceptor.highlightNamespacedKey(it, ENCHANT_RANDOMLY_LOOT_FUNCTION__ENCHANTMENTS, ALL)
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        LootingEnchantLootFunction it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        val countChildren = NodeModelUtils.findNodesForFeature(it, LOOTING_ENCHANT_LOOT_FUNCTION__COUNT)
        if (!countChildren.isEmpty) {
            val countFeature = countChildren.get(0)
            acceptor.highlightFuncParamName(countFeature)
        }
        if (limitDefined) {
            acceptor.highlightFeature(it, LOOTING_ENCHANT_LOOT_FUNCTION__LIMIT_DEFINED, DEFAULT_ID)
        }
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        ExplorationMapLootFunction it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        acceptor.highlightFeature(it, EXPLORATION_MAP_LOOT_FUNCTION__DESTINATION, DEFAULT_ID)
        acceptor.highlightFeature(it, EXPLORATION_MAP_LOOT_FUNCTION__DECORATION, DEFAULT_ID)
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        AttributeModifier it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        acceptor.highlightFeature(it, ATTRIBUTE_MODIFIER__ATTRIBUTE_NAME, STRING_ID)
        if (slotDefined) {
            acceptor.highlightFeature(it, ATTRIBUTE_MODIFIER__SLOTS, ALL, DEFAULT_ID)
        }
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        SetLoreLootFunction it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        if (replaceDefined) {
            acceptor.highlightFeature(it, SET_LORE_LOOT_FUNCTION__REPLACE_DEFINED, DEFAULT_ID)
        }
        val entityChildren = NodeModelUtils.findNodesForFeature(it, SET_LORE_LOOT_FUNCTION__ENTITY)
        if (!entityChildren.isEmpty) {
            val entityFeature = entityChildren.get(0)
            acceptor.highlightFuncParamName(entityFeature)
        }
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        SetNameLootFunction it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        val entityChildren = NodeModelUtils.findNodesForFeature(it, SET_NAME_LOOT_FUNCTION__ENTITY)
        if (!entityChildren.isEmpty) {
            val entityFeature = entityChildren.get(0)
            acceptor.highlightFuncParamName(entityFeature)
        }
        val nameChildren = NodeModelUtils.findNodesForFeature(it, SET_NAME_LOOT_FUNCTION__ITEM_NAME)
        if (!nameChildren.isEmpty) {
            val nameFeature = nameChildren.get(0)
            acceptor.highlightFuncParamName(nameFeature)
        }
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        MCJsonEntry it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        acceptor.highlightFeature(it, MC_JSON_ENTRY__NAME, KEY_ID)
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        BlockStatePropertiesLootCondition it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        acceptor.highlightNamespacedKey(it, BLOCK_STATE_PROPERTIES_LOOT_CONDITION__BLOCK)
        CONTINUE
    }
    
    static val NUMBER_REGEX = Pattern.compile('''[0-9]+''')
    
    def protected dispatch boolean highlightElement(
        BlockStateProperty it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        acceptor.highlightFeature(it, BLOCK_STATE_PROPERTY__NAME, DEFAULT_ID)
        if (value != "true" && value != "false" && !NUMBER_REGEX.matcher(value).matches()) {
            acceptor.highlightFeature(it, BLOCK_STATE_PROPERTY__VALUE, STRING_ID)
        }
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        EntityScore it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        acceptor.highlightFeature(it, ENTITY_SCORE__OBJECTIVE, DEFAULT_ID)
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        TableBonusLootCondition it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        acceptor.highlightNamespacedKey(it, TABLE_BONUS_LOOT_CONDITION__ENCHANTMENT)
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        EnchantmentLevel it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        acceptor.highlightNamespacedKey(it, ENCHANTMENT_LEVEL__ENCHANTMENT)
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        EntityPredicate it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        if (team !== null) {
            acceptor.highlightFeature(it, ENTITY_PREDICATE__TEAM, DEFAULT_ID)
        }
        if (type !== null) {
            acceptor.highlightNamespacedKey(it, ENTITY_PREDICATE__TYPE)
        }
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        EffectPredicate it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        acceptor.highlightNamespacedKey(it, EFFECT_PREDICATE__ID)
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        PlayerPredicate it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        if (gamemodeDefined) {
            acceptor.highlightFeature(it, PLAYER_PREDICATE__GAMEMODE, DEFAULT_ID)
        }
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        AdvancementPredicate it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        acceptor.highlightNamespacedKey(it, ADVANCEMENT_PREDICATE__NAME)
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        AdvancementCriteria it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        acceptor.highlightNamespacedKey(it, ADVANCEMENT_CRITERIA__CRITERIA_NAMES, ALL)
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        SingleStatisticPredicate it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        acceptor.highlightNamespacedKey(it, STATISTIC_PREDICATE__TYPE)
        acceptor.highlightNamespacedKey(it, SINGLE_STATISTIC_PREDICATE__STAT)
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        UnnamespacedStatisticPredicate it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        acceptor.highlightNamespacedKey(it, UNNAMESPACED_STATISTIC_PREDICATE__STAT)
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        LocationPredicate it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        if (biome !== null) {
            acceptor.highlightNamespacedKey(it, LOCATION_PREDICATE__BIOME)
        }
        if (dimension !== null) {
            acceptor.highlightNamespacedKey(it, LOCATION_PREDICATE__DIMENSION)
        }
        if (feature !== null) {
            acceptor.highlightFeature(it, LOCATION_PREDICATE__FEATURE, DEFAULT_ID)
        }
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        ItemPredicate it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        if (tag !== null) {
            acceptor.highlightNamespacedKey(it, ITEM_PREDICATE__TAG)
        } else if (item !== null) {
            acceptor.highlightNamespacedKey(it, ITEM_PREDICATE__ITEM)
        }
        if (potion !== null) {
            acceptor.highlightNamespacedKey(it, ITEM_PREDICATE__POTION)
        }
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        BlockPredicate it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        if (tag !== null) {
            acceptor.highlightNamespacedKey(it, BLOCK_PREDICATE__TAG)
        } else if (block !== null) {
            acceptor.highlightNamespacedKey(it, BLOCK_PREDICATE__BLOCK)
        }
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        BlockStatePropertyPredicate it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        acceptor.highlightFeature(it, BLOCK_STATE_PROPERTY_PREDICATE__NAME, DEFAULT_ID)
        if (value !== null && value != "true" && value != "false" && !NUMBER_REGEX.matcher(value).matches()) {
            acceptor.highlightFeature(it, BLOCK_STATE_PROPERTY_PREDICATE__VALUE, STRING_ID)
        }
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        FluidPredicate it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        if (tag !== null) {
            acceptor.highlightNamespacedKey(it, FLUID_PREDICATE__TAG)
        } else if (fluid !== null) {
            acceptor.highlightNamespacedKey(it, FLUID_PREDICATE__FLUID)
        }
        CONTINUE
    }
    
    def protected dispatch boolean highlightElement(
        EntityPropertiesLootCondition it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
    ) {
        acceptor.highlightFeature(it, NAMED_LOOT_CONDITION__ID, CONDITION_ID)
        CONTINUE
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    
    def protected void highlightFuncParamName(IHighlightedPositionAcceptor acceptor, INode valueNode) {
        if (valueNode.hasPreviousSibling) {
            if (valueNode.previousSibling.text == '=') {
                var paramNameNode = valueNode.previousSibling.previousSibling
                while (paramNameNode.hasPreviousSibling && paramNameNode.grammarElement instanceof TerminalRule && switch (paramNameNode.grammarElement as TerminalRule).name { case "WS", case "ML_COMMENT", case "SL_COMMENT": true default: false }) {
                    paramNameNode = paramNameNode.previousSibling
                }
                acceptor.highlightNode(paramNameNode, DEFAULT_ID)
            }
        }
    }
    
    def protected void highlightFeature(IHighlightedPositionAcceptor acceptor, EObject object, EStructuralFeature feature, int index, String... styleIds) {
        val children = NodeModelUtils.findNodesForFeature(object, feature)
        if (children.size > 0) {
            if (index == ALL) {
                for (child : children) {
                    acceptor.highlightNode(child, styleIds)
                }
            } else if (index >= 0 && index < children.size) {
                acceptor.highlightNode(children.get(index), styleIds)
            }
        }
    }
    
    def protected void highlightNamespacedKey(IHighlightedPositionAcceptor acceptor, EObject object, EStructuralFeature feature) {
        val children = NodeModelUtils.findNodesForFeature(object, feature)
        if (children.size > 0) {
            acceptor.highlightNamespacedKeyNode(children.get(0))
        }
    }
    
    def protected void highlightNamespacedKey(IHighlightedPositionAcceptor acceptor, EObject object, EStructuralFeature feature, int index) {
        val children = NodeModelUtils.findNodesForFeature(object, feature)
        if (children.size > 0) {
            if (index == ALL) {
                for (child : children) {
                    acceptor.highlightNamespacedKeyNode(child)
                }
            } else if (index >= 0 && index < children.size) {
                acceptor.highlightNamespacedKeyNode(children.get(index))
            }
        }
    }
    
    def protected void highlightNamespacedKeyNode(IHighlightedPositionAcceptor acceptor, INode node) {
        if (node === null) return;
        if (node instanceof ILeafNode) {
            val textRegion = node.textRegion
            acceptor.addPosition(textRegion.offset, textRegion.length, NAMESPACE_KEY_ID)
        } else {
            val leafNodes = node.leafNodes.filter[!isHidden].toList
            var i = 0
            if (leafNodes.size >= 3 && leafNodes.get(1).text == ':') {
                for (; i < 2; i++) {
                    val textRegion = leafNodes.get(i).textRegion
                    acceptor.addPosition(textRegion.offset, textRegion.length, NAMESPACE_ID)
                }
            }
            for (; i < leafNodes.size; i++) {
                val textRegion = leafNodes.get(i).textRegion
                acceptor.addPosition(textRegion.offset, textRegion.length, NAMESPACE_KEY_ID)
            }
        }
    }
    
}