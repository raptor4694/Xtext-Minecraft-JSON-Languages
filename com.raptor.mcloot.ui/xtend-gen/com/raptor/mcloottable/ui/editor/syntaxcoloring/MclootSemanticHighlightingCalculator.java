package com.raptor.mcloottable.ui.editor.syntaxcoloring;

import com.google.common.base.Objects;
import com.raptor.mcloottable.mcloot.AdvancementCriteria;
import com.raptor.mcloottable.mcloot.AdvancementPredicate;
import com.raptor.mcloottable.mcloot.ApplyBonusLootFunction;
import com.raptor.mcloottable.mcloot.AttributeModifier;
import com.raptor.mcloottable.mcloot.BlockPredicate;
import com.raptor.mcloottable.mcloot.BlockStatePropertiesLootCondition;
import com.raptor.mcloottable.mcloot.BlockStateProperty;
import com.raptor.mcloottable.mcloot.BlockStatePropertyPredicate;
import com.raptor.mcloottable.mcloot.EffectPredicate;
import com.raptor.mcloottable.mcloot.EnchantRandomlyLootFunction;
import com.raptor.mcloottable.mcloot.EnchantmentLevel;
import com.raptor.mcloottable.mcloot.EntityPredicate;
import com.raptor.mcloottable.mcloot.EntityPropertiesLootCondition;
import com.raptor.mcloottable.mcloot.EntityScore;
import com.raptor.mcloottable.mcloot.ExplorationMapLootFunction;
import com.raptor.mcloottable.mcloot.FluidPredicate;
import com.raptor.mcloottable.mcloot.ItemPredicate;
import com.raptor.mcloottable.mcloot.LocationPredicate;
import com.raptor.mcloottable.mcloot.LootEntry;
import com.raptor.mcloottable.mcloot.LootPool;
import com.raptor.mcloottable.mcloot.LootTable;
import com.raptor.mcloottable.mcloot.LootingEnchantLootFunction;
import com.raptor.mcloottable.mcloot.MCJsonEntry;
import com.raptor.mcloottable.mcloot.MclootPackage;
import com.raptor.mcloottable.mcloot.NBTOperation;
import com.raptor.mcloottable.mcloot.PlayerPredicate;
import com.raptor.mcloottable.mcloot.SetLoreLootFunction;
import com.raptor.mcloottable.mcloot.SetNameLootFunction;
import com.raptor.mcloottable.mcloot.SingleStatisticPredicate;
import com.raptor.mcloottable.mcloot.StewEffect;
import com.raptor.mcloottable.mcloot.TableBonusLootCondition;
import com.raptor.mcloottable.mcloot.UnnamespacedStatisticPredicate;
import com.raptor.mcloottable.ui.editor.syntaxcoloring.MclootHighlightingConfiguration;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class MclootSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
  private static final boolean CONTINUE = false;
  
  private static final boolean STOP = true;
  
  private static final int ALL = (-1);
  
  protected boolean _highlightElement(final EObject it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    return MclootSemanticHighlightingCalculator.CONTINUE;
  }
  
  protected boolean _highlightElement(final StewEffect it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.STEW_EFFECT__TYPE);
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final LootTable it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      boolean _isTypeDefined = it.isTypeDefined();
      if (_isTypeDefined) {
        this.highlightFeature(acceptor, it, MclootPackage.Literals.LOOT_TABLE__TYPE, DefaultHighlightingConfiguration.DEFAULT_ID);
      }
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final LootPool it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightFeature(acceptor, it, MclootPackage.Literals.LOOT_POOL__NAME, DefaultHighlightingConfiguration.DEFAULT_ID);
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final LootEntry it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      if (((!Objects.equal(it.getType(), "dynamic")) && (it.getName() != null))) {
        this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.LOOT_ENTRY__NAME);
      }
      String _entryName = it.getEntryName();
      boolean _tripleNotEquals = (_entryName != null);
      if (_tripleNotEquals) {
        this.highlightFeature(acceptor, it, MclootPackage.Literals.LOOT_ENTRY__ENTRY_NAME, DefaultHighlightingConfiguration.STRING_ID);
      }
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final ApplyBonusLootFunction it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.APPLY_BONUS_LOOT_FUNCTION__ENCHANTMENT);
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final NBTOperation it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightFeature(acceptor, it, MclootPackage.Literals.NBT_OPERATION__SOURCE, DefaultHighlightingConfiguration.DEFAULT_ID);
      this.highlightFeature(acceptor, it, MclootPackage.Literals.NBT_OPERATION__TARGET, DefaultHighlightingConfiguration.DEFAULT_ID);
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final EnchantRandomlyLootFunction it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.ENCHANT_RANDOMLY_LOOT_FUNCTION__ENCHANTMENTS, MclootSemanticHighlightingCalculator.ALL);
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final LootingEnchantLootFunction it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      final List<INode> countChildren = NodeModelUtils.findNodesForFeature(it, MclootPackage.Literals.LOOTING_ENCHANT_LOOT_FUNCTION__COUNT);
      boolean _isEmpty = countChildren.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        final INode countFeature = countChildren.get(0);
        this.highlightFuncParamName(acceptor, countFeature);
      }
      boolean _isLimitDefined = it.isLimitDefined();
      if (_isLimitDefined) {
        this.highlightFeature(acceptor, it, MclootPackage.Literals.LOOTING_ENCHANT_LOOT_FUNCTION__LIMIT_DEFINED, DefaultHighlightingConfiguration.DEFAULT_ID);
      }
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final ExplorationMapLootFunction it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightFeature(acceptor, it, MclootPackage.Literals.EXPLORATION_MAP_LOOT_FUNCTION__DESTINATION, DefaultHighlightingConfiguration.DEFAULT_ID);
      this.highlightFeature(acceptor, it, MclootPackage.Literals.EXPLORATION_MAP_LOOT_FUNCTION__DECORATION, DefaultHighlightingConfiguration.DEFAULT_ID);
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final AttributeModifier it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightFeature(acceptor, it, MclootPackage.Literals.ATTRIBUTE_MODIFIER__ATTRIBUTE_NAME, DefaultHighlightingConfiguration.STRING_ID);
      boolean _isSlotDefined = it.isSlotDefined();
      if (_isSlotDefined) {
        this.highlightFeature(acceptor, it, MclootPackage.Literals.ATTRIBUTE_MODIFIER__SLOTS, MclootSemanticHighlightingCalculator.ALL, DefaultHighlightingConfiguration.DEFAULT_ID);
      }
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final SetLoreLootFunction it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      boolean _isReplaceDefined = it.isReplaceDefined();
      if (_isReplaceDefined) {
        this.highlightFeature(acceptor, it, MclootPackage.Literals.SET_LORE_LOOT_FUNCTION__REPLACE_DEFINED, DefaultHighlightingConfiguration.DEFAULT_ID);
      }
      final List<INode> entityChildren = NodeModelUtils.findNodesForFeature(it, MclootPackage.Literals.SET_LORE_LOOT_FUNCTION__ENTITY);
      boolean _isEmpty = entityChildren.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        final INode entityFeature = entityChildren.get(0);
        this.highlightFuncParamName(acceptor, entityFeature);
      }
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final SetNameLootFunction it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      final List<INode> entityChildren = NodeModelUtils.findNodesForFeature(it, MclootPackage.Literals.SET_NAME_LOOT_FUNCTION__ENTITY);
      boolean _isEmpty = entityChildren.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        final INode entityFeature = entityChildren.get(0);
        this.highlightFuncParamName(acceptor, entityFeature);
      }
      final List<INode> nameChildren = NodeModelUtils.findNodesForFeature(it, MclootPackage.Literals.SET_NAME_LOOT_FUNCTION__ITEM_NAME);
      boolean _isEmpty_1 = nameChildren.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        final INode nameFeature = nameChildren.get(0);
        this.highlightFuncParamName(acceptor, nameFeature);
      }
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final MCJsonEntry it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightFeature(acceptor, it, MclootPackage.Literals.MC_JSON_ENTRY__NAME, MclootHighlightingConfiguration.KEY_ID);
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final BlockStatePropertiesLootCondition it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.BLOCK_STATE_PROPERTIES_LOOT_CONDITION__BLOCK);
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  private static final Pattern NUMBER_REGEX = new Function0<Pattern>() {
    @Override
    public Pattern apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("[0-9]+");
      Pattern _compile = Pattern.compile(_builder.toString());
      return _compile;
    }
  }.apply();
  
  protected boolean _highlightElement(final BlockStateProperty it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightFeature(acceptor, it, MclootPackage.Literals.BLOCK_STATE_PROPERTY__NAME, DefaultHighlightingConfiguration.DEFAULT_ID);
      if ((((!Objects.equal(it.getValue(), "true")) && (!Objects.equal(it.getValue(), "false"))) && (!MclootSemanticHighlightingCalculator.NUMBER_REGEX.matcher(it.getValue()).matches()))) {
        this.highlightFeature(acceptor, it, MclootPackage.Literals.BLOCK_STATE_PROPERTY__VALUE, DefaultHighlightingConfiguration.STRING_ID);
      }
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final EntityScore it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightFeature(acceptor, it, MclootPackage.Literals.ENTITY_SCORE__OBJECTIVE, DefaultHighlightingConfiguration.DEFAULT_ID);
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final TableBonusLootCondition it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.TABLE_BONUS_LOOT_CONDITION__ENCHANTMENT);
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final EnchantmentLevel it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.ENCHANTMENT_LEVEL__ENCHANTMENT);
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final EntityPredicate it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      String _team = it.getTeam();
      boolean _tripleNotEquals = (_team != null);
      if (_tripleNotEquals) {
        this.highlightFeature(acceptor, it, MclootPackage.Literals.ENTITY_PREDICATE__TEAM, DefaultHighlightingConfiguration.DEFAULT_ID);
      }
      String _type = it.getType();
      boolean _tripleNotEquals_1 = (_type != null);
      if (_tripleNotEquals_1) {
        this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.ENTITY_PREDICATE__TYPE);
      }
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final EffectPredicate it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.EFFECT_PREDICATE__ID);
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final PlayerPredicate it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      boolean _isGamemodeDefined = it.isGamemodeDefined();
      if (_isGamemodeDefined) {
        this.highlightFeature(acceptor, it, MclootPackage.Literals.PLAYER_PREDICATE__GAMEMODE, DefaultHighlightingConfiguration.DEFAULT_ID);
      }
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final AdvancementPredicate it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.ADVANCEMENT_PREDICATE__NAME);
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final AdvancementCriteria it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.ADVANCEMENT_CRITERIA__CRITERIA_NAMES, MclootSemanticHighlightingCalculator.ALL);
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final SingleStatisticPredicate it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.STATISTIC_PREDICATE__TYPE);
      this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.SINGLE_STATISTIC_PREDICATE__STAT);
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final UnnamespacedStatisticPredicate it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.UNNAMESPACED_STATISTIC_PREDICATE__STAT);
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final LocationPredicate it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      String _biome = it.getBiome();
      boolean _tripleNotEquals = (_biome != null);
      if (_tripleNotEquals) {
        this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.LOCATION_PREDICATE__BIOME);
      }
      String _dimension = it.getDimension();
      boolean _tripleNotEquals_1 = (_dimension != null);
      if (_tripleNotEquals_1) {
        this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.LOCATION_PREDICATE__DIMENSION);
      }
      String _feature = it.getFeature();
      boolean _tripleNotEquals_2 = (_feature != null);
      if (_tripleNotEquals_2) {
        this.highlightFeature(acceptor, it, MclootPackage.Literals.LOCATION_PREDICATE__FEATURE, DefaultHighlightingConfiguration.DEFAULT_ID);
      }
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final ItemPredicate it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      String _tag = it.getTag();
      boolean _tripleNotEquals = (_tag != null);
      if (_tripleNotEquals) {
        this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.ITEM_PREDICATE__TAG);
      } else {
        String _item = it.getItem();
        boolean _tripleNotEquals_1 = (_item != null);
        if (_tripleNotEquals_1) {
          this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.ITEM_PREDICATE__ITEM);
        }
      }
      String _potion = it.getPotion();
      boolean _tripleNotEquals_2 = (_potion != null);
      if (_tripleNotEquals_2) {
        this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.ITEM_PREDICATE__POTION);
      }
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final BlockPredicate it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      String _tag = it.getTag();
      boolean _tripleNotEquals = (_tag != null);
      if (_tripleNotEquals) {
        this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.BLOCK_PREDICATE__TAG);
      } else {
        String _block = it.getBlock();
        boolean _tripleNotEquals_1 = (_block != null);
        if (_tripleNotEquals_1) {
          this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.BLOCK_PREDICATE__BLOCK);
        }
      }
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final BlockStatePropertyPredicate it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightFeature(acceptor, it, MclootPackage.Literals.BLOCK_STATE_PROPERTY_PREDICATE__NAME, DefaultHighlightingConfiguration.DEFAULT_ID);
      if (((((it.getValue() != null) && (!Objects.equal(it.getValue(), "true"))) && (!Objects.equal(it.getValue(), "false"))) && (!MclootSemanticHighlightingCalculator.NUMBER_REGEX.matcher(it.getValue()).matches()))) {
        this.highlightFeature(acceptor, it, MclootPackage.Literals.BLOCK_STATE_PROPERTY_PREDICATE__VALUE, DefaultHighlightingConfiguration.STRING_ID);
      }
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final FluidPredicate it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      String _tag = it.getTag();
      boolean _tripleNotEquals = (_tag != null);
      if (_tripleNotEquals) {
        this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.FLUID_PREDICATE__TAG);
      } else {
        String _fluid = it.getFluid();
        boolean _tripleNotEquals_1 = (_fluid != null);
        if (_tripleNotEquals_1) {
          this.highlightNamespacedKey(acceptor, it, MclootPackage.Literals.FLUID_PREDICATE__FLUID);
        }
      }
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final EntityPropertiesLootCondition it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightFeature(acceptor, it, MclootPackage.Literals.NAMED_LOOT_CONDITION__ID, MclootHighlightingConfiguration.CONDITION_ID);
      _xblockexpression = MclootSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected void highlightFuncParamName(final IHighlightedPositionAcceptor acceptor, final INode valueNode) {
    boolean _hasPreviousSibling = valueNode.hasPreviousSibling();
    if (_hasPreviousSibling) {
      String _text = valueNode.getPreviousSibling().getText();
      boolean _equals = Objects.equal(_text, "=");
      if (_equals) {
        INode paramNameNode = valueNode.getPreviousSibling().getPreviousSibling();
        boolean _and = false;
        if (!(paramNameNode.hasPreviousSibling() && (paramNameNode.getGrammarElement() instanceof TerminalRule))) {
          _and = false;
        } else {
          boolean _switchResult = false;
          EObject _grammarElement = paramNameNode.getGrammarElement();
          String _name = ((TerminalRule) _grammarElement).getName();
          if (_name != null) {
            switch (_name) {
              case "WS":
              case "ML_COMMENT":
              case "SL_COMMENT":
                _switchResult = true;
                break;
              default:
                _switchResult = false;
                break;
            }
          } else {
            _switchResult = false;
          }
          _and = _switchResult;
        }
        boolean _while = _and;
        while (_while) {
          paramNameNode = paramNameNode.getPreviousSibling();
          boolean _and_1 = false;
          if (!(paramNameNode.hasPreviousSibling() && (paramNameNode.getGrammarElement() instanceof TerminalRule))) {
            _and_1 = false;
          } else {
            boolean _switchResult_1 = false;
            EObject _grammarElement_1 = paramNameNode.getGrammarElement();
            String _name_1 = ((TerminalRule) _grammarElement_1).getName();
            if (_name_1 != null) {
              switch (_name_1) {
                case "WS":
                case "ML_COMMENT":
                case "SL_COMMENT":
                  _switchResult_1 = true;
                  break;
                default:
                  _switchResult_1 = false;
                  break;
              }
            } else {
              _switchResult_1 = false;
            }
            _and_1 = _switchResult_1;
          }
          _while = _and_1;
        }
        this.highlightNode(acceptor, paramNameNode, DefaultHighlightingConfiguration.DEFAULT_ID);
      }
    }
  }
  
  protected void highlightFeature(final IHighlightedPositionAcceptor acceptor, final EObject object, final EStructuralFeature feature, final int index, final String... styleIds) {
    final List<INode> children = NodeModelUtils.findNodesForFeature(object, feature);
    int _size = children.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      if ((index == MclootSemanticHighlightingCalculator.ALL)) {
        for (final INode child : children) {
          this.highlightNode(acceptor, child, styleIds);
        }
      } else {
        if (((index >= 0) && (index < children.size()))) {
          this.highlightNode(acceptor, children.get(index), styleIds);
        }
      }
    }
  }
  
  protected void highlightNamespacedKey(final IHighlightedPositionAcceptor acceptor, final EObject object, final EStructuralFeature feature) {
    final List<INode> children = NodeModelUtils.findNodesForFeature(object, feature);
    int _size = children.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      this.highlightNamespacedKeyNode(acceptor, children.get(0));
    }
  }
  
  protected void highlightNamespacedKey(final IHighlightedPositionAcceptor acceptor, final EObject object, final EStructuralFeature feature, final int index) {
    final List<INode> children = NodeModelUtils.findNodesForFeature(object, feature);
    int _size = children.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      if ((index == MclootSemanticHighlightingCalculator.ALL)) {
        for (final INode child : children) {
          this.highlightNamespacedKeyNode(acceptor, child);
        }
      } else {
        if (((index >= 0) && (index < children.size()))) {
          this.highlightNamespacedKeyNode(acceptor, children.get(index));
        }
      }
    }
  }
  
  protected void highlightNamespacedKeyNode(final IHighlightedPositionAcceptor acceptor, final INode node) {
    if ((node == null)) {
      return;
    }
    if ((node instanceof ILeafNode)) {
      final ITextRegion textRegion = ((ILeafNode)node).getTextRegion();
      acceptor.addPosition(textRegion.getOffset(), textRegion.getLength(), MclootHighlightingConfiguration.NAMESPACE_KEY_ID);
    } else {
      final Function1<ILeafNode, Boolean> _function = (ILeafNode it) -> {
        boolean _isHidden = it.isHidden();
        return Boolean.valueOf((!_isHidden));
      };
      final List<ILeafNode> leafNodes = IterableExtensions.<ILeafNode>toList(IterableExtensions.<ILeafNode>filter(node.getLeafNodes(), _function));
      int i = 0;
      if (((leafNodes.size() >= 3) && Objects.equal(leafNodes.get(1).getText(), ":"))) {
        for (; (i < 2); i++) {
          {
            final ITextRegion textRegion_1 = leafNodes.get(i).getTextRegion();
            acceptor.addPosition(textRegion_1.getOffset(), textRegion_1.getLength(), MclootHighlightingConfiguration.NAMESPACE_ID);
          }
        }
      }
      for (; (i < leafNodes.size()); i++) {
        {
          final ITextRegion textRegion_1 = leafNodes.get(i).getTextRegion();
          acceptor.addPosition(textRegion_1.getOffset(), textRegion_1.getLength(), MclootHighlightingConfiguration.NAMESPACE_KEY_ID);
        }
      }
    }
  }
  
  protected boolean highlightElement(final EObject it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    if (it instanceof BlockStatePropertiesLootCondition) {
      return _highlightElement((BlockStatePropertiesLootCondition)it, acceptor, cancelIndicator);
    } else if (it instanceof EntityPropertiesLootCondition) {
      return _highlightElement((EntityPropertiesLootCondition)it, acceptor, cancelIndicator);
    } else if (it instanceof TableBonusLootCondition) {
      return _highlightElement((TableBonusLootCondition)it, acceptor, cancelIndicator);
    } else if (it instanceof ApplyBonusLootFunction) {
      return _highlightElement((ApplyBonusLootFunction)it, acceptor, cancelIndicator);
    } else if (it instanceof EnchantRandomlyLootFunction) {
      return _highlightElement((EnchantRandomlyLootFunction)it, acceptor, cancelIndicator);
    } else if (it instanceof ExplorationMapLootFunction) {
      return _highlightElement((ExplorationMapLootFunction)it, acceptor, cancelIndicator);
    } else if (it instanceof LootingEnchantLootFunction) {
      return _highlightElement((LootingEnchantLootFunction)it, acceptor, cancelIndicator);
    } else if (it instanceof SetLoreLootFunction) {
      return _highlightElement((SetLoreLootFunction)it, acceptor, cancelIndicator);
    } else if (it instanceof SetNameLootFunction) {
      return _highlightElement((SetNameLootFunction)it, acceptor, cancelIndicator);
    } else if (it instanceof SingleStatisticPredicate) {
      return _highlightElement((SingleStatisticPredicate)it, acceptor, cancelIndicator);
    } else if (it instanceof AdvancementCriteria) {
      return _highlightElement((AdvancementCriteria)it, acceptor, cancelIndicator);
    } else if (it instanceof AdvancementPredicate) {
      return _highlightElement((AdvancementPredicate)it, acceptor, cancelIndicator);
    } else if (it instanceof AttributeModifier) {
      return _highlightElement((AttributeModifier)it, acceptor, cancelIndicator);
    } else if (it instanceof BlockPredicate) {
      return _highlightElement((BlockPredicate)it, acceptor, cancelIndicator);
    } else if (it instanceof BlockStateProperty) {
      return _highlightElement((BlockStateProperty)it, acceptor, cancelIndicator);
    } else if (it instanceof BlockStatePropertyPredicate) {
      return _highlightElement((BlockStatePropertyPredicate)it, acceptor, cancelIndicator);
    } else if (it instanceof EffectPredicate) {
      return _highlightElement((EffectPredicate)it, acceptor, cancelIndicator);
    } else if (it instanceof EnchantmentLevel) {
      return _highlightElement((EnchantmentLevel)it, acceptor, cancelIndicator);
    } else if (it instanceof EntityPredicate) {
      return _highlightElement((EntityPredicate)it, acceptor, cancelIndicator);
    } else if (it instanceof EntityScore) {
      return _highlightElement((EntityScore)it, acceptor, cancelIndicator);
    } else if (it instanceof FluidPredicate) {
      return _highlightElement((FluidPredicate)it, acceptor, cancelIndicator);
    } else if (it instanceof ItemPredicate) {
      return _highlightElement((ItemPredicate)it, acceptor, cancelIndicator);
    } else if (it instanceof LocationPredicate) {
      return _highlightElement((LocationPredicate)it, acceptor, cancelIndicator);
    } else if (it instanceof LootEntry) {
      return _highlightElement((LootEntry)it, acceptor, cancelIndicator);
    } else if (it instanceof LootPool) {
      return _highlightElement((LootPool)it, acceptor, cancelIndicator);
    } else if (it instanceof LootTable) {
      return _highlightElement((LootTable)it, acceptor, cancelIndicator);
    } else if (it instanceof MCJsonEntry) {
      return _highlightElement((MCJsonEntry)it, acceptor, cancelIndicator);
    } else if (it instanceof NBTOperation) {
      return _highlightElement((NBTOperation)it, acceptor, cancelIndicator);
    } else if (it instanceof PlayerPredicate) {
      return _highlightElement((PlayerPredicate)it, acceptor, cancelIndicator);
    } else if (it instanceof StewEffect) {
      return _highlightElement((StewEffect)it, acceptor, cancelIndicator);
    } else if (it instanceof UnnamespacedStatisticPredicate) {
      return _highlightElement((UnnamespacedStatisticPredicate)it, acceptor, cancelIndicator);
    } else if (it != null) {
      return _highlightElement(it, acceptor, cancelIndicator);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it, acceptor, cancelIndicator).toString());
    }
  }
}
