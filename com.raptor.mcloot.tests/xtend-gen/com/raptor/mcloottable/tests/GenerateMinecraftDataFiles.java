package com.raptor.mcloottable.tests;

import com.google.common.base.Objects;
import com.raptor.mcloottable.util.EnumProperty;
import com.raptor.mcloottable.util.IntProperty;
import com.raptor.mcloottable.util.MinecraftData;
import com.raptor.mcloottable.util.Property;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class GenerateMinecraftDataFiles {
  private static final Path DIR = new Function0<Path>() {
    @Override
    public Path apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("C:\\Users\\flyin\\Documents\\Xtext\\com.raptor.mcloot\\src\\com\\raptor\\mcloottable\\util\\mcdata");
      Path _get = Paths.get(_builder.toString());
      return _get;
    }
  }.apply();
  
  public static void main(final String[] args) {
  }
  
  public static Path generate(final Set<String> strings, final String fileName) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final String element : strings) {
        _builder.append(element);
        _builder.newLineIfNotEmpty();
      }
    }
    return GenerateMinecraftDataFiles.write(fileName, _builder.toString());
  }
  
  public static Path generate(final Map<String, Map<String, ? extends Property>> data, final String fileName) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Set<Map.Entry<String, Map<String, ? extends Property>>> _entrySet = data.entrySet();
      for(final Map.Entry<String, Map<String, ? extends Property>> blockEntry : _entrySet) {
        {
          boolean _isEmpty = blockEntry.getValue().isEmpty();
          if (_isEmpty) {
            String _key = blockEntry.getKey();
            _builder.append(_key);
            _builder.newLineIfNotEmpty();
          } else {
            String _key_1 = blockEntry.getKey();
            _builder.append(_key_1);
            _builder.newLineIfNotEmpty();
            {
              Set<? extends Map.Entry<String, ? extends Property>> _entrySet_1 = blockEntry.getValue().entrySet();
              for(final Map.Entry<String, ? extends Property> stateEntry : _entrySet_1) {
                _builder.append("    ");
                String _key_2 = stateEntry.getKey();
                _builder.append(_key_2, "    ");
                _builder.append("=");
                CharSequence _switchResult = null;
                Property _value = stateEntry.getValue();
                final Property value = _value;
                boolean _matched = false;
                if (Objects.equal(value, MinecraftData.Properties.HORIZONTAL_FACES)) {
                  _matched=true;
                  _switchResult = "#HORIZONTAL_FACES";
                }
                if (!_matched) {
                  if (Objects.equal(value, MinecraftData.Properties.ALL_FACES)) {
                    _matched=true;
                    _switchResult = "#ALL_FACES";
                  }
                }
                if (!_matched) {
                  if (Objects.equal(value, MinecraftData.Properties.BLOCK_HALF)) {
                    _matched=true;
                    _switchResult = "#BLOCK_HALF";
                  }
                }
                if (!_matched) {
                  if (Objects.equal(value, MinecraftData.Properties.DOOR_HALF)) {
                    _matched=true;
                    _switchResult = "#DOOR_HALF";
                  }
                }
                if (!_matched) {
                  if (Objects.equal(value, MinecraftData.Properties.BUTTON_FACE)) {
                    _matched=true;
                    _switchResult = "#BUTTON_FACE";
                  }
                }
                if (!_matched) {
                  if (Objects.equal(value, MinecraftData.Properties.INT16)) {
                    _matched=true;
                    _switchResult = "#INT16";
                  }
                }
                if (!_matched) {
                  if (Objects.equal(value, MinecraftData.Properties.STAIR_SHAPE)) {
                    _matched=true;
                    _switchResult = "#STAIR_SHAPE";
                  }
                }
                if (!_matched) {
                  if (Objects.equal(value, MinecraftData.Properties.SLAB_TYPE)) {
                    _matched=true;
                    _switchResult = "#SLAB_TYPE";
                  }
                }
                if (!_matched) {
                  if (Objects.equal(value, MinecraftData.Properties.AXIS)) {
                    _matched=true;
                    _switchResult = "#AXIS";
                  }
                }
                if (!_matched) {
                  if (Objects.equal(value, MinecraftData.Properties.WALL_TYPE)) {
                    _matched=true;
                    _switchResult = "#WALL_TYPE";
                  }
                }
                if (!_matched) {
                  if (Objects.equal(value, MinecraftData.Properties.BED_HALF)) {
                    _matched=true;
                    _switchResult = "#BED_HALF";
                  }
                }
                if (!_matched) {
                  if (Objects.equal(value, MinecraftData.Properties.RAIL_ORIENTATION)) {
                    _matched=true;
                    _switchResult = "#RAIL_ORIENTATION";
                  }
                }
                if (!_matched) {
                  if (Objects.equal(value, MinecraftData.Properties.CHEST_SHAPE)) {
                    _matched=true;
                    _switchResult = "#CHEST_SHAPE";
                  }
                }
                if (!_matched) {
                  if (Objects.equal(value, MinecraftData.Properties.PISTON_STATUS)) {
                    _matched=true;
                    _switchResult = "#PISTON_STATUS";
                  }
                }
                if (!_matched) {
                  if (Objects.equal(value, MinecraftData.Properties.REDSTONE_WIRE_DIRECTION)) {
                    _matched=true;
                    _switchResult = "#REDSTONE_WIRE_DIRECTION";
                  }
                }
                if (!_matched) {
                  if (Objects.equal(value, MinecraftData.Properties.BOOLEAN)) {
                    _matched=true;
                    _switchResult = "#BOOLEAN";
                  }
                }
                if (!_matched) {
                  if (value instanceof IntProperty) {
                    _matched=true;
                    StringConcatenation _builder_1 = new StringConcatenation();
                    _builder_1.append("#");
                    _builder_1.append(((IntProperty)value).min);
                    _builder_1.append("..");
                    _builder_1.append(((IntProperty)value).max);
                    _switchResult = _builder_1;
                  }
                }
                if (!_matched) {
                  if (value instanceof EnumProperty) {
                    _matched=true;
                    _switchResult = IterableExtensions.join(((EnumProperty)value).getOptions(), " ");
                  }
                }
                if (!_matched) {
                  throw new AssertionError();
                }
                _builder.append(_switchResult, "    ");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return GenerateMinecraftDataFiles.write(fileName, _builder.toString());
  }
  
  public static Path write(final String fileName, final String text) {
    try {
      return Files.write(GenerateMinecraftDataFiles.DIR.resolve(fileName), text.getBytes());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
