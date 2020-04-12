package com.raptor.mcloottable.util;

import com.raptor.mcloottable.mcloot.MclootPackage;
import com.raptor.mcloottable.mcloot.NormalDoubleRange;
import com.raptor.mcloottable.mcloot.NormalLongRange;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class MclootUtils {
  public interface CallbackResult {
    void otherwise(final Runnable action);
  }
  
  public static boolean isFeatureDefined(final EObject object, final EStructuralFeature feature) {
    boolean _isEmpty = NodeModelUtils.findNodesForFeature(object, feature).isEmpty();
    return (!_isEmpty);
  }
  
  public static boolean isMinDefined(final NormalLongRange range) {
    return MclootUtils.isFeatureDefined(range, MclootPackage.Literals.NORMAL_LONG_RANGE__MIN);
  }
  
  public static boolean isMaxDefined(final NormalLongRange range) {
    return MclootUtils.isFeatureDefined(range, MclootPackage.Literals.NORMAL_LONG_RANGE__MAX);
  }
  
  public static boolean isMinDefined(final NormalDoubleRange range) {
    return MclootUtils.isFeatureDefined(range, MclootPackage.Literals.NORMAL_DOUBLE_RANGE__MIN);
  }
  
  public static boolean isMaxDefined(final NormalDoubleRange range) {
    return MclootUtils.isFeatureDefined(range, MclootPackage.Literals.NORMAL_DOUBLE_RANGE__MAX);
  }
  
  private static final MclootUtils.CallbackResult CALLBACK_PASSED = ((MclootUtils.CallbackResult) (Runnable it) -> {
  });
  
  private static final MclootUtils.CallbackResult CALLBACK_FAILED = ((MclootUtils.CallbackResult) (Runnable it) -> {
    it.run();
  });
  
  public static MclootUtils.CallbackResult ifMinecraftKey(final String key, final Procedure1<? super String> action) {
    boolean _contains = key.contains(":");
    boolean _not = (!_contains);
    if (_not) {
      action.apply(key);
    } else {
      boolean _startsWith = key.startsWith("minecraft:");
      if (_startsWith) {
        action.apply(key.substring(10));
      } else {
        return MclootUtils.CALLBACK_FAILED;
      }
    }
    return MclootUtils.CALLBACK_PASSED;
  }
  
  public static String addDefaultNamespace(final String key) {
    String _xifexpression = null;
    boolean _contains = key.contains(":");
    if (_contains) {
      _xifexpression = key;
    } else {
      _xifexpression = ("minecraft:" + key);
    }
    return _xifexpression;
  }
}
