package com.raptor.mcloottable.ui.editor.syntaxcoloring

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper
import java.util.regex.Pattern

import static com.raptor.mcloottable.ui.editor.syntaxcoloring.MclootHighlightingConfiguration.*

class MclootAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	
	static val QUOTED = Pattern.compile("(?:^\'([^\']*)\'$)|(?:^\"([^\"]*)\")$", Pattern.MULTILINE)
	
	override protected calculateId(String tokenName, int tokenType) {
		switch (tokenName) {
		    // function names
		    case "'apply_bonus'",
		    case "'copy_name'",
		    case "'copy_nbt'",
		    case "'copy_state'",
		    case "'enchant_randomly'",
		    case "'enchant_with_levels'",
		    case "'exploration_map'",
		    case "'explosion_decay'",
		    case "'furnace_smelt'",
		    case "'fill_player_head'",
		    case "'limit'",
		    case "'looting_enchant'",
		    case "'set_attributes'",
		    case "'set_contents'",
		    case "'set_count'",
		    case "'set_damage'",
		    case "'set_lore'",
		    case "'set_name'",
		    case "'set_nbt'",
		    case "'set_stew_effect'": FUNCTION_ID
		    // condition names
//		    case "'block'",
		    case "'damage_source'",
//		    case "'entity'",
		    case "'entity_scores'",
		    case "'killed_by_player'",
		    case "'location'",
		    case "'tool'",
		    case "'random_chance'",
//		    case "'ref'",
		    case "'survives_explosion'",
		    case "'table_bonus'",
		    case "'time'",
		    case "'enchantments'",
		    case "'weather'": CONDITION_ID
		    // damage source properties
		    case "'bypasses_armor'", case "'bypasses_invulnerability'",
		    case "'bypasses_magic'", case "'direct_entity'",
		    case "'is_explosion'", case "'is_fire'",
		    case "'is_magic'", case "'is_projectile'",
		    case "'is_lightning'", case "'source_entity'": CONDITION_ID
		    // entity flags
		    case "'is_on_fire'", case "'is_sneaking'", case "'is_sprinting'",
		    case "'is_swimming'", case "'is_baby'": CONDITION_ID
		    // function param names
		    case "'min'", case "'max'",
		    case "'enchantment'", case "'formula'", case "'extra'",
		    case "'probability'", case "'bonusMultiplier'", case "'treasure'",
		    case "'destination'", case "'zoom'", case "'search_radius'",
		    case "'skip_existing_chunks'", case "'decoration'", case "'levels'",
		    case "'n'", case "'p'": DEFAULT_ID
		    // attribute modifiers
		    case "'generic.max_health'", case "'generic.follow_range'",
		    case "'generic.knockback_resistance'", case "'generic.movement_speed'",
		    case "'generic.attack_damage'", case "'generic.armor'",
		    case "'generic.armor_toughness'", case "'generic.attack_knockback'",
		    case "'generic.attack_speed'", case "'generic.luck'",
		    case "'horse.jump_strength'", case "'generic.flying_speed'",
		    case "'zombie.spawn_reinforcements'": DEFAULT_ID
		    // others
		    case 'RULE_PERCENTAGE', case 'RULE_DOUBLE', case 'RULE_ULONG', case 'RULE_SLONG',
		    case 'RULE_RANGE', case 'RULE_ULONG_RANGE_START', case 'RULE_SLONG_RANGE_START', case 'RULE_DOUBLE_RANGE_START',
		    case "'~'": NUMBER_ID
		    case 'RULE_UUID': STRING_ID
		    case "'#'": NAMESPACE_ID
			default: super.calculateId(tokenName, tokenType)
		}
	}
	
}