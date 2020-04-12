package com.raptor.mcloottable.ui.editor.syntaxcoloring;

import com.raptor.mcloottable.ui.editor.syntaxcoloring.MclootHighlightingConfiguration;
import java.util.regex.Pattern;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;

@SuppressWarnings("all")
public class MclootAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
  private static final Pattern QUOTED = Pattern.compile("(?:^\'([^\']*)\'$)|(?:^\"([^\"]*)\")$", Pattern.MULTILINE);
  
  @Override
  protected String calculateId(final String tokenName, final int tokenType) {
    String _switchResult = null;
    if (tokenName != null) {
      switch (tokenName) {
        case "\'apply_bonus\'":
        case "\'copy_name\'":
        case "\'copy_nbt\'":
        case "\'copy_state\'":
        case "\'enchant_randomly\'":
        case "\'enchant_with_levels\'":
        case "\'exploration_map\'":
        case "\'explosion_decay\'":
        case "\'furnace_smelt\'":
        case "\'fill_player_head\'":
        case "\'limit\'":
        case "\'looting_enchant\'":
        case "\'set_attributes\'":
        case "\'set_contents\'":
        case "\'set_count\'":
        case "\'set_damage\'":
        case "\'set_lore\'":
        case "\'set_name\'":
        case "\'set_nbt\'":
        case "\'set_stew_effect\'":
          _switchResult = MclootHighlightingConfiguration.FUNCTION_ID;
          break;
        case "\'damage_source\'":
        case "\'entity_scores\'":
        case "\'killed_by_player\'":
        case "\'location\'":
        case "\'tool\'":
        case "\'random_chance\'":
        case "\'survives_explosion\'":
        case "\'table_bonus\'":
        case "\'time\'":
        case "\'enchantments\'":
        case "\'weather\'":
          _switchResult = MclootHighlightingConfiguration.CONDITION_ID;
          break;
        case "\'bypasses_armor\'":
        case "\'bypasses_invulnerability\'":
        case "\'bypasses_magic\'":
        case "\'direct_entity\'":
        case "\'is_explosion\'":
        case "\'is_fire\'":
        case "\'is_magic\'":
        case "\'is_projectile\'":
        case "\'is_lightning\'":
        case "\'source_entity\'":
          _switchResult = MclootHighlightingConfiguration.CONDITION_ID;
          break;
        case "\'is_on_fire\'":
        case "\'is_sneaking\'":
        case "\'is_sprinting\'":
        case "\'is_swimming\'":
        case "\'is_baby\'":
          _switchResult = MclootHighlightingConfiguration.CONDITION_ID;
          break;
        case "\'min\'":
        case "\'max\'":
        case "\'enchantment\'":
        case "\'formula\'":
        case "\'extra\'":
        case "\'probability\'":
        case "\'bonusMultiplier\'":
        case "\'treasure\'":
        case "\'destination\'":
        case "\'zoom\'":
        case "\'search_radius\'":
        case "\'skip_existing_chunks\'":
        case "\'decoration\'":
        case "\'levels\'":
        case "\'n\'":
        case "\'p\'":
          _switchResult = DefaultHighlightingConfiguration.DEFAULT_ID;
          break;
        case "\'generic.max_health\'":
        case "\'generic.follow_range\'":
        case "\'generic.knockback_resistance\'":
        case "\'generic.movement_speed\'":
        case "\'generic.attack_damage\'":
        case "\'generic.armor\'":
        case "\'generic.armor_toughness\'":
        case "\'generic.attack_knockback\'":
        case "\'generic.attack_speed\'":
        case "\'generic.luck\'":
        case "\'horse.jump_strength\'":
        case "\'generic.flying_speed\'":
        case "\'zombie.spawn_reinforcements\'":
          _switchResult = DefaultHighlightingConfiguration.DEFAULT_ID;
          break;
        case "RULE_PERCENTAGE":
        case "RULE_DOUBLE":
        case "RULE_ULONG":
        case "RULE_SLONG":
        case "RULE_RANGE":
        case "RULE_ULONG_RANGE_START":
        case "RULE_SLONG_RANGE_START":
        case "RULE_DOUBLE_RANGE_START":
        case "\'~\'":
          _switchResult = DefaultHighlightingConfiguration.NUMBER_ID;
          break;
        case "RULE_UUID":
          _switchResult = DefaultHighlightingConfiguration.STRING_ID;
          break;
        case "\'#\'":
          _switchResult = MclootHighlightingConfiguration.NAMESPACE_ID;
          break;
        default:
          _switchResult = super.calculateId(tokenName, tokenType);
          break;
      }
    } else {
      _switchResult = super.calculateId(tokenName, tokenType);
    }
    return _switchResult;
  }
}
