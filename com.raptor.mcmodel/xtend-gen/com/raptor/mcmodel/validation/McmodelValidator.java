/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcmodel.validation;

import com.google.common.base.Objects;
import com.raptor.mcmodel.mcmodel.Element;
import com.raptor.mcmodel.mcmodel.EnumFace;
import com.raptor.mcmodel.mcmodel.Face;
import com.raptor.mcmodel.mcmodel.Faces;
import com.raptor.mcmodel.mcmodel.ItemOverride;
import com.raptor.mcmodel.mcmodel.MCJsonEntry;
import com.raptor.mcmodel.mcmodel.MCJsonObject;
import com.raptor.mcmodel.mcmodel.McmodelPackage;
import com.raptor.mcmodel.mcmodel.Model;
import com.raptor.mcmodel.mcmodel.Morph;
import com.raptor.mcmodel.mcmodel.OverridePredicate;
import com.raptor.mcmodel.mcmodel.Rotation;
import com.raptor.mcmodel.mcmodel.Texture;
import com.raptor.mcmodel.mcmodel.Vec3d;
import com.raptor.mcmodel.mcmodel.Vec4d;
import com.raptor.mcmodel.util.McmodelUtils;
import com.raptor.mcmodel.validation.AbstractMcmodelValidator;
import com.raptor.mcmodel.validation.SeenInfo;
import java.util.EnumMap;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Pair;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class McmodelValidator extends AbstractMcmodelValidator {
  @Check
  public void checkNoDuplicates(final MCJsonObject it) {
    final HashMap<String, SeenInfo<MCJsonEntry>> seenEntries = McmodelValidator.<MCJsonEntry>newSeenMap();
    EList<MCJsonEntry> _entries = it.getEntries();
    for (final MCJsonEntry entry : _entries) {
      {
        final SeenInfo<MCJsonEntry> info = seenEntries.get(entry.getName());
        if ((info == null)) {
          seenEntries.put(entry.getName(), McmodelValidator.<MCJsonEntry>seen(entry));
        } else {
          if ((!info.errored)) {
            info.errored = true;
            this.error("Duplicate entry", 
              info.value, 
              McmodelPackage.Literals.MC_JSON_ENTRY__NAME);
          }
          this.error("Duplicate entry", entry, 
            McmodelPackage.Literals.MC_JSON_ENTRY__NAME);
        }
      }
    }
  }
  
  @Check
  public void checkNoDuplicates(final Model it) {
    final HashMap<String, SeenInfo<Texture>> seen = McmodelValidator.<Texture>newSeenMap(it.getTextures().size());
    EList<Texture> _textures = it.getTextures();
    for (final Texture texture : _textures) {
      {
        final SeenInfo<Texture> info = seen.get(texture.getName());
        if ((info == null)) {
          seen.put(texture.getName(), McmodelValidator.<Texture>seen(texture));
        } else {
          if ((!info.errored)) {
            info.errored = true;
            this.error("Duplicate texture", 
              info.value, 
              McmodelPackage.Literals.TEXTURE__NAME);
          }
          this.error("Duplicate texture", texture, 
            McmodelPackage.Literals.TEXTURE__NAME);
        }
      }
    }
  }
  
  @Check
  public Object checkModel(final Model it) {
    Object _xifexpression = null;
    String _parent = it.getParent();
    boolean _tripleNotEquals = (_parent != null);
    if (_tripleNotEquals) {
      Object _switchResult = null;
      String _parent_1 = it.getParent();
      if (_parent_1 != null) {
        switch (_parent_1) {
          case "minecraft:item/generated":
          case "item/generated":
            boolean foundLayer0 = false;
            EList<Texture> _textures = it.getTextures();
            for (final Texture texture : _textures) {
              String _name = texture.getName();
              boolean _equals = Objects.equal(_name, "layer0");
              if (_equals) {
                foundLayer0 = true;
              }
            }
            if ((!foundLayer0)) {
              this.warning("Missing \"layer0\" texture", 
                McmodelPackage.Literals.MODEL__TEXTURES_DEFINED);
            }
            break;
          case "minecraft:builtin/entity":
          case "builtin/entity":
            Object _xblockexpression = null;
            {
              boolean _isElementsDefined = it.isElementsDefined();
              if (_isElementsDefined) {
                this.warning("\"elements\" and \"parent\":\"builtin/entity\" are not compatible", 
                  McmodelPackage.Literals.MODEL__ELEMENTS_DEFINED);
              }
              Object _switchResult_1 = null;
              String _fileNameNoExt = McmodelUtils.getFileNameNoExt(it.eResource());
              final String filename = _fileNameNoExt;
              boolean _matched = false;
              if (Objects.equal(filename, "chest")) {
                _matched=true;
              }
              if (!_matched) {
                if (Objects.equal(filename, "ender_chest")) {
                  _matched=true;
                }
              }
              if (!_matched) {
                if (Objects.equal(filename, "player_head")) {
                  _matched=true;
                }
              }
              if (!_matched) {
                if (Objects.equal(filename, "creeper_head")) {
                  _matched=true;
                }
              }
              if (!_matched) {
                if (Objects.equal(filename, "dragon_head")) {
                  _matched=true;
                }
              }
              if (!_matched) {
                if (Objects.equal(filename, "skeleton_skull")) {
                  _matched=true;
                }
              }
              if (!_matched) {
                if (Objects.equal(filename, "wither_skeleton_skull")) {
                  _matched=true;
                }
              }
              if (!_matched) {
                if (Objects.equal(filename, "shield")) {
                  _matched=true;
                }
              }
              if (!_matched) {
                boolean _endsWith = filename.endsWith("_banner");
                if (_endsWith) {
                  _matched=true;
                }
              }
              if (!_matched) {
                if (Objects.equal(filename, "trident")) {
                  _matched=true;
                }
              }
              if (_matched) {
                _switchResult_1 = null;
              }
              if (!_matched) {
                this.error("\"parent\":\"builtin/entity\" only allowed for chests, ender chests, mob heads, shields, banners, and tridents", 
                  McmodelPackage.Literals.MODEL__PARENT);
              }
              _xblockexpression = _switchResult_1;
            }
            _switchResult = _xblockexpression;
            break;
        }
      }
      _xifexpression = _switchResult;
    }
    return _xifexpression;
  }
  
  @Check
  public void checkElement(final Element it) {
    boolean _isEmpty = it.getFaces().isEmpty();
    if (_isEmpty) {
      Face _defaultFace = it.getDefaultFace();
      boolean _tripleEquals = (_defaultFace == null);
      if (_tripleEquals) {
        this.error("No faces defined", 
          McmodelPackage.Literals.ELEMENT__FACES);
      }
    } else {
      final EnumMap<EnumFace, SeenInfo<Pair<Faces, Integer>>> seen = new EnumMap<EnumFace, SeenInfo<Pair<Faces, Integer>>>(EnumFace.class);
      EList<Faces> _faces = it.getFaces();
      for (final Faces face : _faces) {
        {
          final EList<EnumFace> sides = face.getSides();
          for (int i = 0; (i < sides.size()); i++) {
            {
              final EnumFace enumFace = sides.get(i);
              final SeenInfo<Pair<Faces, Integer>> info = seen.get(enumFace);
              if ((info == null)) {
                Pair<Faces, Integer> _mappedTo = Pair.<Faces, Integer>of(face, Integer.valueOf(i));
                seen.put(enumFace, McmodelValidator.<Pair<Faces, Integer>>seen(_mappedTo));
              } else {
                if ((!info.errored)) {
                  info.errored = true;
                  this.error("Duplicate face definition", 
                    info.value.getKey(), 
                    McmodelPackage.Literals.FACES__SIDES, (info.value.getValue()).intValue());
                }
                this.error("Duplicate face definition", face, 
                  McmodelPackage.Literals.FACES__SIDES, i);
              }
            }
          }
        }
      }
      if (((seen.size() == 6) && (it.getDefaultFace() != null))) {
        this.warning("Unused default face", 
          McmodelPackage.Literals.ELEMENT__DEFAULT_FACE);
      }
    }
    this.checkPosition(it.getFrom());
    this.checkPosition(it.getTo());
  }
  
  @Check
  public void checkRotation(final Rotation it) {
    if (((Math.abs(it.getAngle()) > 45.0f) || ((it.getAngle() % 22.5f) != 0.0f))) {
      this.error("Value must be between -45 and 45 degrees in 22.5 degree increments", 
        McmodelPackage.Literals.ROTATION__ANGLE);
    }
  }
  
  @Check
  public Object checkFace(final Face it) {
    Object _xblockexpression = null;
    {
      Vec4d _uv = it.getUv();
      boolean _tripleNotEquals = (_uv != null);
      if (_tripleNotEquals) {
        for (final EStructuralFeature feature : McmodelUtils.VEC4D$FEATURES) {
          {
            Object _eGet = it.getUv().eGet(feature);
            final double value = (((Double) _eGet)).doubleValue();
            if (((value < 0) || (value > 16))) {
              this.warning("Texture behavior inconsistent if UV is below 0 or above 16", 
                it.getUv(), feature);
            }
          }
        }
      }
      Object _xifexpression = null;
      boolean _isRotationDefined = it.isRotationDefined();
      if (_isRotationDefined) {
        Object _switchResult = null;
        long _rotation = it.getRotation();
        boolean _matched = false;
        if (Objects.equal(_rotation, 0L)) {
          _matched=true;
        }
        if (!_matched) {
          if (Objects.equal(_rotation, 90L)) {
            _matched=true;
          }
        }
        if (!_matched) {
          if (Objects.equal(_rotation, 180)) {
            _matched=true;
          }
        }
        if (!_matched) {
          if (Objects.equal(_rotation, 270L)) {
            _matched=true;
          }
        }
        if (_matched) {
          _switchResult = null;
        }
        if (!_matched) {
          this.error("Value must be either 0, 90, 180, or 270", 
            McmodelPackage.Literals.FACE__ROTATION);
        }
        _xifexpression = _switchResult;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  @Check
  public void checkOverridePredicate(final OverridePredicate it) {
    boolean _isAngleDefined = it.isAngleDefined();
    if (_isAngleDefined) {
      this.checkPercentage(it, McmodelPackage.Literals.OVERRIDE_PREDICATE__ANGLE);
    }
    boolean _isCooldownDefined = it.isCooldownDefined();
    if (_isCooldownDefined) {
      this.checkPercentage(it, McmodelPackage.Literals.OVERRIDE_PREDICATE__COOLDOWN);
    }
    boolean _isDamageDefined = it.isDamageDefined();
    if (_isDamageDefined) {
      this.checkPercentage(it, McmodelPackage.Literals.OVERRIDE_PREDICATE__DAMAGE);
    }
    boolean _isPullDefined = it.isPullDefined();
    if (_isPullDefined) {
      this.checkPercentage(it, McmodelPackage.Literals.OVERRIDE_PREDICATE__PULL);
    }
    boolean _isTimeDefined = it.isTimeDefined();
    if (_isTimeDefined) {
      this.checkPercentage(it, McmodelPackage.Literals.OVERRIDE_PREDICATE__TIME);
    }
  }
  
  @Check
  public void checkItemOverride(final ItemOverride it) {
    boolean _isEmpty = McmodelUtils.isEmpty(it.getPredicate());
    if (_isEmpty) {
      this.error("Empty predicate", 
        McmodelPackage.Literals.ITEM_OVERRIDE__PREDICATE);
    }
  }
  
  @Check
  public void checkMorph(final Morph it) {
    Vec3d _translation = it.getTranslation();
    boolean _tripleNotEquals = (_translation != null);
    if (_tripleNotEquals) {
      for (final EStructuralFeature feature : McmodelUtils.VEC3D$FEATURES) {
        {
          Object _eGet = it.getTranslation().eGet(feature);
          final double value = (((Double) _eGet)).doubleValue();
          double _abs = Math.abs(value);
          boolean _greaterThan = (_abs > 80);
          if (_greaterThan) {
            this.warning("Value should be between -80 and 80", 
              it.getTranslation(), feature);
          }
        }
      }
    }
    Vec3d _scale = it.getScale();
    boolean _tripleNotEquals_1 = (_scale != null);
    if (_tripleNotEquals_1) {
      for (final EStructuralFeature feature_1 : McmodelUtils.VEC3D$FEATURES) {
        {
          Object _eGet = it.getScale().eGet(feature_1);
          final double value = (((Double) _eGet)).doubleValue();
          double _abs = Math.abs(value);
          boolean _greaterThan = (_abs > 4);
          if (_greaterThan) {
            this.warning("Value should be between -4 and 4", 
              it.getScale(), feature_1);
          }
        }
      }
    }
  }
  
  public void checkPercentage(final EObject object, final EStructuralFeature feature) {
    Object _eGet = object.eGet(feature);
    final double value = (((Double) _eGet)).doubleValue();
    if (((value < 0) || (value > 1))) {
      this.error("Value must be between 0 and 1", object, feature);
    }
  }
  
  public void checkPosition(final Vec3d it) {
    for (final EStructuralFeature feature : McmodelUtils.VEC3D$FEATURES) {
      {
        Object _eGet = it.eGet(feature);
        final double value = (((Double) _eGet)).doubleValue();
        if (((value < (-16)) || (value > 32))) {
          this.error("Value must be between -16 and 32", it, feature);
        }
      }
    }
  }
  
  private static <T extends Object> SeenInfo<T> seen(final T value) {
    return new SeenInfo<T>(value);
  }
  
  private static <T extends Object> HashMap<String, SeenInfo<T>> newSeenMap() {
    return new HashMap<String, SeenInfo<T>>();
  }
  
  private static <T extends Object> HashMap<String, SeenInfo<T>> newSeenMap(final int capacity) {
    return new HashMap<String, SeenInfo<T>>(capacity);
  }
}
