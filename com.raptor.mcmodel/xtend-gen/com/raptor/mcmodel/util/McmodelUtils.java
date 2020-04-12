package com.raptor.mcmodel.util;

import com.raptor.mcmodel.mcmodel.McmodelPackage;
import com.raptor.mcmodel.mcmodel.OverridePredicate;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class McmodelUtils {
  public static boolean isEmpty(final OverridePredicate it) {
    return (!((((((((((((it.isAngleDefined() || it.isBlockingDefined()) || it.isBrokenDefined()) || it.isCastDefined()) || it.isCooldownDefined()) || it.isDamageDefined()) || it.isDamagedDefined()) || it.isLefthandedDefined()) || it.isPullDefined()) || it.isPullingDefined()) || it.isThrowingDefined()) || it.isTimeDefined()) || it.isCustomModelDataDefined()));
  }
  
  public static int size(final OverridePredicate it) {
    int result = 0;
    boolean _isAngleDefined = it.isAngleDefined();
    if (_isAngleDefined) {
      result++;
    }
    boolean _isBlockingDefined = it.isBlockingDefined();
    if (_isBlockingDefined) {
      result++;
    }
    boolean _isBrokenDefined = it.isBrokenDefined();
    if (_isBrokenDefined) {
      result++;
    }
    boolean _isCastDefined = it.isCastDefined();
    if (_isCastDefined) {
      result++;
    }
    boolean _isCooldownDefined = it.isCooldownDefined();
    if (_isCooldownDefined) {
      result++;
    }
    boolean _isDamageDefined = it.isDamageDefined();
    if (_isDamageDefined) {
      result++;
    }
    boolean _isDamagedDefined = it.isDamagedDefined();
    if (_isDamagedDefined) {
      result++;
    }
    boolean _isLefthandedDefined = it.isLefthandedDefined();
    if (_isLefthandedDefined) {
      result++;
    }
    boolean _isPullDefined = it.isPullDefined();
    if (_isPullDefined) {
      result++;
    }
    boolean _isPullingDefined = it.isPullingDefined();
    if (_isPullingDefined) {
      result++;
    }
    boolean _isThrowingDefined = it.isThrowingDefined();
    if (_isThrowingDefined) {
      result++;
    }
    boolean _isTimeDefined = it.isTimeDefined();
    if (_isTimeDefined) {
      result++;
    }
    boolean _isCustomModelDataDefined = it.isCustomModelDataDefined();
    if (_isCustomModelDataDefined) {
      result++;
    }
    return result;
  }
  
  public static boolean isSmall(final OverridePredicate it) {
    boolean result = false;
    boolean _isAngleDefined = it.isAngleDefined();
    if (_isAngleDefined) {
      result = true;
    }
    boolean _isBlockingDefined = it.isBlockingDefined();
    if (_isBlockingDefined) {
      if (result) {
        return false;
      }
      result = true;
    }
    boolean _isBrokenDefined = it.isBrokenDefined();
    if (_isBrokenDefined) {
      if (result) {
        return false;
      }
      result = true;
    }
    boolean _isCastDefined = it.isCastDefined();
    if (_isCastDefined) {
      if (result) {
        return false;
      }
      result = true;
    }
    boolean _isCooldownDefined = it.isCooldownDefined();
    if (_isCooldownDefined) {
      if (result) {
        return false;
      }
      result = true;
    }
    boolean _isDamageDefined = it.isDamageDefined();
    if (_isDamageDefined) {
      if (result) {
        return false;
      }
      result = true;
    }
    boolean _isDamagedDefined = it.isDamagedDefined();
    if (_isDamagedDefined) {
      if (result) {
        return false;
      }
      result = true;
    }
    boolean _isLefthandedDefined = it.isLefthandedDefined();
    if (_isLefthandedDefined) {
      if (result) {
        return false;
      }
      result = true;
    }
    boolean _isPullDefined = it.isPullDefined();
    if (_isPullDefined) {
      if (result) {
        return false;
      }
      result = true;
    }
    boolean _isPullingDefined = it.isPullingDefined();
    if (_isPullingDefined) {
      if (result) {
        return false;
      }
      result = true;
    }
    boolean _isThrowingDefined = it.isThrowingDefined();
    if (_isThrowingDefined) {
      if (result) {
        return false;
      }
      result = true;
    }
    boolean _isTimeDefined = it.isTimeDefined();
    if (_isTimeDefined) {
      if (result) {
        return false;
      }
      result = true;
    }
    boolean _isCustomModelDataDefined = it.isCustomModelDataDefined();
    if (_isCustomModelDataDefined) {
      if (result) {
        return false;
      }
    }
    return true;
  }
  
  public static List<EStructuralFeature> VEC3D$FEATURES = Collections.<EStructuralFeature>unmodifiableList(CollectionLiterals.<EStructuralFeature>newArrayList(McmodelPackage.Literals.VEC3D__X, McmodelPackage.Literals.VEC3D__Y, McmodelPackage.Literals.VEC3D__Z));
  
  public static List<EStructuralFeature> VEC4D$FEATURES = Collections.<EStructuralFeature>unmodifiableList(CollectionLiterals.<EStructuralFeature>newArrayList(McmodelPackage.Literals.VEC4D__X1, McmodelPackage.Literals.VEC4D__Y1, McmodelPackage.Literals.VEC4D__X2, McmodelPackage.Literals.VEC4D__Y2));
  
  public static List<EStructuralFeature> DISPLAY$FEATURES = Collections.<EStructuralFeature>unmodifiableList(CollectionLiterals.<EStructuralFeature>newArrayList(McmodelPackage.Literals.DISPLAY__THIRDPERSON_LEFTHAND, McmodelPackage.Literals.DISPLAY__THIRDPERSON_RIGHTHAND, McmodelPackage.Literals.DISPLAY__FIRSTPERSON_LEFTHAND, McmodelPackage.Literals.DISPLAY__FIRSTPERSON_RIGHTHAND, McmodelPackage.Literals.DISPLAY__GUI, McmodelPackage.Literals.DISPLAY__HEAD, McmodelPackage.Literals.DISPLAY__GROUND, McmodelPackage.Literals.DISPLAY__FIXED));
  
  public static String getFileNameNoExt(final Resource resource) {
    String _xblockexpression = null;
    {
      final String result = resource.getURI().lastSegment();
      final int i = result.lastIndexOf(".");
      String _xifexpression = null;
      if ((i == (-1))) {
        _xifexpression = result;
      } else {
        _xifexpression = result.substring(0, i);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
