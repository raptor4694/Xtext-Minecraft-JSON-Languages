package com.raptor.mcloottable.util

import com.raptor.mcloottable.mcloot.ExactLongRange
import com.raptor.mcloottable.mcloot.LongRange
import com.raptor.mcloottable.mcloot.NormalLongRange
import java.io.BufferedInputStream
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import java.util.Map
import java.util.Scanner
import java.util.Set
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

import static java.util.Collections.emptyMap
import static extension java.lang.Character.isDigit

import static extension com.raptor.mcloottable.util.MclootUtils.*

class MinecraftData {
    
    static class Properties {
        public static val HORIZONTAL_FACES = new EnumProperty(#{"north", "south", "east", "west"})
        public static val ALL_FACES = new EnumProperty(#{"north", "south", "east", "west", "up", "down"})
        public static val BLOCK_HALF = new EnumProperty(#{"bottom", "top"})
        public static val DOOR_HALF = new EnumProperty(#{"upper", "lower"})
        public static val DOOR_HINGE = new EnumProperty(#{"left", "right"})
        public static val BUTTON_FACE = new EnumProperty(#{"floor", "ceiling", "wall"})
        public static val INT16 = new IntProperty(0, 15)
        public static val STAIR_SHAPE = new EnumProperty(#{"inner_left", "outer_left", "outer_right", "inner_right", "straight"})
        public static val SLAB_TYPE = new EnumProperty(#{"bottom", "double", "top"})
        public static val AXIS = new EnumProperty(#{"x", "y", "z"})
        public static val WALL_TYPE = new EnumProperty(#{"none", "low", "tall"})
        public static val BED_HALF = new EnumProperty(#{"head", "foot"})
        public static val RAIL_ORIENTATION = new EnumProperty(#{"ascending_east", "east_west", "north_south", "ascending_north", "ascending_west", "ascending_south"})
        public static val CHEST_SHAPE = new EnumProperty(#{"single", "left", "right"})
        public static val PISTON_STATUS = new EnumProperty(#{"normal", "sticky"})
        public static val REDSTONE_WIRE_DIRECTION = new EnumProperty(#{"up", "none", "side"})
        public static val BOOLEAN = new BooleanProperty
        
        static val values = {
            val values = new HashMap<String, Property>
            for (field : Properties.fields) {
                if (Property.isAssignableFrom(field.type)) {
                    values.put(field.name, field.get(null) as Property)
                }
            }
            values.unmodifiableView
        }
    }
    
    public static val VANILLA_LOOT_TABLES = loadStringSet("loot_tables.txt") 
    
    def static isVanillaLootTable(String str) { VANILLA_LOOT_TABLES.contains(str) }
    
    public static val VANILLA_BLOCK_TAG_STATES = loadBlockstateMap("block_tag_states.txt") 
    
    def static isVanillaBlockTag(String str) { VANILLA_BLOCK_TAG_STATES.containsKey(str) }
    
    public static val VANILLA_ENTITY_TYPE_TAGS = loadStringSet("entity_type_tags.txt") 
    
    def static isVanillaEntityTypeTag(String str) { VANILLA_ENTITY_TYPE_TAGS.contains(str) }

    public static val VANILLA_ITEM_TAGS = loadStringSet("item_tags.txt") 
    
    def static isVanillaItemTag(String str) { VANILLA_ITEM_TAGS.contains(str) }
    
    public static val VANILLA_BLOCK_STATES = loadBlockstateMap("block_states.txt") 
   
    def static isVanillaBlock(String str) { VANILLA_BLOCK_STATES.containsKey(str) } 

    public static val VANILLA_ITEMS = loadStringSet("items.txt") 
    
    def static isVanillaItem(String str) { VANILLA_ITEMS.contains(str) }

    public static val VANILLA_FLUIDS = loadStringSet("fluids.txt") 
    
    def static isVanillaFluid(String str) { VANILLA_FLUIDS.contains(str) }

    public static val VANILLA_MOB_EFFECTS = loadStringSet("mob_effects.txt") 
    
    def static isVanillaMobEffect(String str) { VANILLA_MOB_EFFECTS.contains(str) }

    public static val VANILLA_ENCHANTMENTS = loadStringSet("enchantments.txt") 
    
    def static isVanillaEnchantment(String str) { VANILLA_ENCHANTMENTS.contains(str) }

    public static val VANILLA_ENTITY_TYPES = loadStringSet("entity_types.txt") 
    
    def static isVanillaEntityType(String str) { VANILLA_ENTITY_TYPES.contains(str) }

    public static val VANILLA_POTIONS = loadStringSet("potions.txt") 
    
    def static isVanillaPotion(String str) { VANILLA_POTIONS.contains(str) }

    public static val VANILLA_BIOMES = loadStringSet("biomes.txt") 
    
    def static isVanillaBiome(String str) { VANILLA_BIOMES.contains(str) }

    public static val VANILLA_STRUCTURE_FEATURES = loadStringSet("structure_features.txt") 
    
    def static isVanillaStructureFeature(String str) { VANILLA_STRUCTURE_FEATURES.contains(str) }

    public static val VANILLA_DIMENSION_TYPES = loadStringSet("dimension_types.txt") 
    
    def static isVanillaDimensionType(String str) { VANILLA_DIMENSION_TYPES.contains(str) }

    public static val VANILLA_ATTRIBUTES = loadStringSet("attributes.txt") 
    
    def static isVanillaAttribute(String str) { VANILLA_ATTRIBUTES.contains(str) }
    
    public static val VANILLA_MAP_ICONS = loadStringSet("map_icons.txt") 
    
    def static isVanillaMapIcon(String str) { VANILLA_MAP_ICONS.contains(str) }
    
    def private static readResource(String resourceName) {
        val lines = new ArrayList<String>
        try (val scanner = new Scanner(new BufferedInputStream(MinecraftData.getResourceAsStream("mcdata/" + resourceName)))) {
            while (scanner.hasNext) {
                lines += scanner.nextLine
            }
        }
        return lines
    }
    
    def private static loadStringSet(String resourceName) {
        new HashSet(readResource(resourceName)).unmodifiableView
    }
    
    def private static loadBlockstateMap(String resourceName) {
        val lines = readResource(resourceName)
        val map = new HashMap<String, Map<String, ? extends Property>>
        for (var i = 0; i < lines.size;) {
            val key = lines.get(i)
            i++
            val states = new HashMap<String, Property>
            for (; i < lines.size && lines.get(i).startsWith("    "); i++) {
                val line = lines.get(i)
                val eq_idx = line.indexOf('=')
                val stateName = line.substring(4, eq_idx)
                val stateValue = line.substring(eq_idx+1)
                val property = if (stateValue.startsWith('#')) {
                    if (stateValue.charAt(1).isDigit) {
                        val slice = stateValue.indexOf('..')
                        val start = Integer.parseInt(stateValue.substring(1, slice))
                        val end = Integer.parseInt(stateValue.substring(slice + 2))
                        new IntProperty(start, end)
                    } else {
                        Properties.values.get(stateValue.substring(1))
                    }
                } else {
                    new EnumProperty(newHashSet(stateValue.split('''\s+''')))
                }
                states.put(stateName, property)
            }
            map.put(key, if (states.isEmpty) emptyMap() else states.unmodifiableView)
        }
        return map
    }
    
}

interface Property {
    def boolean isValid(String str)
    def boolean isValid(LongRange range)
}

class BooleanProperty implements Property {    
    override isValid(String str) { str == "true" || str == "false" }
    override isValid(LongRange range) { false }
}

@FinalFieldsConstructor
class IntProperty implements Property {
    public final int min
    public final int max
    
    override isValid(String str) {
        try {
            val value = Integer.parseInt(str)
            value >= min && value <= max
        } catch (NumberFormatException e) {
            false
        }
    }
    
    def dispatch isValid(ExactLongRange range) {
        range.value >= min && range.value <= max
    }
    
    def dispatch isValid(NormalLongRange range) {
        (!range.minDefined || range.min >= min)
        && (!range.maxDefined || range.max <= max)
    }
}

@FinalFieldsConstructor
class EnumProperty implements Property {
    final Set<String> options
    
    override isValid(String str) { options.contains(str) }
    override isValid(LongRange range) { false }
    
    def getOptions() { options.unmodifiableView }
}