package com.raptor.mcloottable.util;

import com.raptor.mcloottable.util.BooleanProperty;
import com.raptor.mcloottable.util.EnumProperty;
import com.raptor.mcloottable.util.IntProperty;
import com.raptor.mcloottable.util.Property;
import java.io.BufferedInputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class MinecraftData {
  public static class Properties {
    public static final EnumProperty HORIZONTAL_FACES = new EnumProperty(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("north", "south", "east", "west")));
    
    public static final EnumProperty ALL_FACES = new EnumProperty(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("north", "south", "east", "west", "up", "down")));
    
    public static final EnumProperty BLOCK_HALF = new EnumProperty(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("bottom", "top")));
    
    public static final EnumProperty DOOR_HALF = new EnumProperty(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("upper", "lower")));
    
    public static final EnumProperty DOOR_HINGE = new EnumProperty(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("left", "right")));
    
    public static final EnumProperty BUTTON_FACE = new EnumProperty(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("floor", "ceiling", "wall")));
    
    public static final IntProperty INT16 = new IntProperty(0, 15);
    
    public static final EnumProperty STAIR_SHAPE = new EnumProperty(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("inner_left", "outer_left", "outer_right", "inner_right", "straight")));
    
    public static final EnumProperty SLAB_TYPE = new EnumProperty(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("bottom", "double", "top")));
    
    public static final EnumProperty AXIS = new EnumProperty(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("x", "y", "z")));
    
    public static final EnumProperty WALL_TYPE = new EnumProperty(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("none", "low", "tall")));
    
    public static final EnumProperty BED_HALF = new EnumProperty(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("head", "foot")));
    
    public static final EnumProperty RAIL_ORIENTATION = new EnumProperty(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("ascending_east", "east_west", "north_south", "ascending_north", "ascending_west", "ascending_south")));
    
    public static final EnumProperty CHEST_SHAPE = new EnumProperty(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("single", "left", "right")));
    
    public static final EnumProperty PISTON_STATUS = new EnumProperty(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("normal", "sticky")));
    
    public static final EnumProperty REDSTONE_WIRE_DIRECTION = new EnumProperty(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("up", "none", "side")));
    
    public static final BooleanProperty BOOLEAN = new BooleanProperty();
    
    private static final Map<String, Property> values = new Function0<Map<String, Property>>() {
      @Override
      public Map<String, Property> apply() {
        try {
          Map<String, Property> _xblockexpression = null;
          {
            final HashMap<String, Property> values = new HashMap<String, Property>();
            Field[] _fields = MinecraftData.Properties.class.getFields();
            for (final Field field : _fields) {
              boolean _isAssignableFrom = Property.class.isAssignableFrom(field.getType());
              if (_isAssignableFrom) {
                Object _get = field.get(null);
                values.put(field.getName(), ((Property) _get));
              }
            }
            _xblockexpression = Collections.<String, Property>unmodifiableMap(values);
          }
          return _xblockexpression;
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      }
    }.apply();
  }
  
  public static final Set<String> VANILLA_LOOT_TABLES = MinecraftData.loadStringSet("loot_tables.txt");
  
  public static boolean isVanillaLootTable(final String str) {
    return MinecraftData.VANILLA_LOOT_TABLES.contains(str);
  }
  
  public static final HashMap<String, Map<String, ? extends Property>> VANILLA_BLOCK_TAG_STATES = MinecraftData.loadBlockstateMap("block_tag_states.txt");
  
  public static boolean isVanillaBlockTag(final String str) {
    return MinecraftData.VANILLA_BLOCK_TAG_STATES.containsKey(str);
  }
  
  public static final Set<String> VANILLA_ENTITY_TYPE_TAGS = MinecraftData.loadStringSet("entity_type_tags.txt");
  
  public static boolean isVanillaEntityTypeTag(final String str) {
    return MinecraftData.VANILLA_ENTITY_TYPE_TAGS.contains(str);
  }
  
  public static final Set<String> VANILLA_ITEM_TAGS = MinecraftData.loadStringSet("item_tags.txt");
  
  public static boolean isVanillaItemTag(final String str) {
    return MinecraftData.VANILLA_ITEM_TAGS.contains(str);
  }
  
  public static final HashMap<String, Map<String, ? extends Property>> VANILLA_BLOCK_STATES = MinecraftData.loadBlockstateMap("block_states.txt");
  
  public static boolean isVanillaBlock(final String str) {
    return MinecraftData.VANILLA_BLOCK_STATES.containsKey(str);
  }
  
  public static final Set<String> VANILLA_ITEMS = MinecraftData.loadStringSet("items.txt");
  
  public static boolean isVanillaItem(final String str) {
    return MinecraftData.VANILLA_ITEMS.contains(str);
  }
  
  public static final Set<String> VANILLA_FLUIDS = MinecraftData.loadStringSet("fluids.txt");
  
  public static boolean isVanillaFluid(final String str) {
    return MinecraftData.VANILLA_FLUIDS.contains(str);
  }
  
  public static final Set<String> VANILLA_MOB_EFFECTS = MinecraftData.loadStringSet("mob_effects.txt");
  
  public static boolean isVanillaMobEffect(final String str) {
    return MinecraftData.VANILLA_MOB_EFFECTS.contains(str);
  }
  
  public static final Set<String> VANILLA_ENCHANTMENTS = MinecraftData.loadStringSet("enchantments.txt");
  
  public static boolean isVanillaEnchantment(final String str) {
    return MinecraftData.VANILLA_ENCHANTMENTS.contains(str);
  }
  
  public static final Set<String> VANILLA_ENTITY_TYPES = MinecraftData.loadStringSet("entity_types.txt");
  
  public static boolean isVanillaEntityType(final String str) {
    return MinecraftData.VANILLA_ENTITY_TYPES.contains(str);
  }
  
  public static final Set<String> VANILLA_POTIONS = MinecraftData.loadStringSet("potions.txt");
  
  public static boolean isVanillaPotion(final String str) {
    return MinecraftData.VANILLA_POTIONS.contains(str);
  }
  
  public static final Set<String> VANILLA_BIOMES = MinecraftData.loadStringSet("biomes.txt");
  
  public static boolean isVanillaBiome(final String str) {
    return MinecraftData.VANILLA_BIOMES.contains(str);
  }
  
  public static final Set<String> VANILLA_STRUCTURE_FEATURES = MinecraftData.loadStringSet("structure_features.txt");
  
  public static boolean isVanillaStructureFeature(final String str) {
    return MinecraftData.VANILLA_STRUCTURE_FEATURES.contains(str);
  }
  
  public static final Set<String> VANILLA_DIMENSION_TYPES = MinecraftData.loadStringSet("dimension_types.txt");
  
  public static boolean isVanillaDimensionType(final String str) {
    return MinecraftData.VANILLA_DIMENSION_TYPES.contains(str);
  }
  
  public static final Set<String> VANILLA_ATTRIBUTES = MinecraftData.loadStringSet("attributes.txt");
  
  public static boolean isVanillaAttribute(final String str) {
    return MinecraftData.VANILLA_ATTRIBUTES.contains(str);
  }
  
  public static final Set<String> VANILLA_MAP_ICONS = MinecraftData.loadStringSet("map_icons.txt");
  
  public static boolean isVanillaMapIcon(final String str) {
    return MinecraftData.VANILLA_MAP_ICONS.contains(str);
  }
  
  private static ArrayList<String> readResource(final String resourceName) {
    final ArrayList<String> lines = new ArrayList<String>();
    try (final Scanner scanner = new Scanner(new BufferedInputStream(MinecraftData.class.getResourceAsStream(("mcdata/" + resourceName))))) {
      while (scanner.hasNext()) {
        String _nextLine = scanner.nextLine();
        lines.add(_nextLine);
      }
    }
    return lines;
  }
  
  private static Set<String> loadStringSet(final String resourceName) {
    ArrayList<String> _readResource = MinecraftData.readResource(resourceName);
    return Collections.<String>unmodifiableSet(new HashSet<String>(_readResource));
  }
  
  private static HashMap<String, Map<String, ? extends Property>> loadBlockstateMap(final String resourceName) {
    final ArrayList<String> lines = MinecraftData.readResource(resourceName);
    final HashMap<String, Map<String, ? extends Property>> map = new HashMap<String, Map<String, ? extends Property>>();
    for (int i = 0; (i < lines.size());) {
      {
        final String key = lines.get(i);
        i++;
        final HashMap<String, Property> states = new HashMap<String, Property>();
        for (; ((i < lines.size()) && lines.get(i).startsWith("    ")); i++) {
          {
            final String line = lines.get(i);
            final int eq_idx = line.indexOf("=");
            final String stateName = line.substring(4, eq_idx);
            final String stateValue = line.substring((eq_idx + 1));
            Property _xifexpression = null;
            boolean _startsWith = stateValue.startsWith("#");
            if (_startsWith) {
              Property _xifexpression_1 = null;
              boolean _isDigit = Character.isDigit(stateValue.charAt(1));
              if (_isDigit) {
                IntProperty _xblockexpression = null;
                {
                  final int slice = stateValue.indexOf("..");
                  final int start = Integer.parseInt(stateValue.substring(1, slice));
                  final int end = Integer.parseInt(stateValue.substring((slice + 2)));
                  _xblockexpression = new IntProperty(start, end);
                }
                _xifexpression_1 = _xblockexpression;
              } else {
                _xifexpression_1 = MinecraftData.Properties.values.get(stateValue.substring(1));
              }
              _xifexpression = _xifexpression_1;
            } else {
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("\\s+");
              HashSet<String> _newHashSet = CollectionLiterals.<String>newHashSet(stateValue.split(_builder.toString()));
              _xifexpression = new EnumProperty(_newHashSet);
            }
            final Property property = _xifexpression;
            states.put(stateName, property);
          }
        }
        Map<String, Property> _xifexpression = null;
        boolean _isEmpty = states.isEmpty();
        if (_isEmpty) {
          _xifexpression = Collections.<String, Property>emptyMap();
        } else {
          _xifexpression = Collections.<String, Property>unmodifiableMap(states);
        }
        map.put(key, _xifexpression);
      }
    }
    return map;
  }
}
