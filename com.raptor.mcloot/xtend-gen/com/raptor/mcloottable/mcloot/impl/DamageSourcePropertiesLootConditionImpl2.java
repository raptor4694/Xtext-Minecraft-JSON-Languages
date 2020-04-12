package com.raptor.mcloottable.mcloot.impl;

import com.raptor.mcloottable.mcloot.impl.DamageSourcePropertiesLootConditionImpl;

@SuppressWarnings("all")
public class DamageSourcePropertiesLootConditionImpl2 extends DamageSourcePropertiesLootConditionImpl {
  @Override
  public boolean isBypassesArmorDefined() {
    return (this.bypassesArmorDefined || this.bypassesArmor);
  }
  
  @Override
  public boolean isBypassesInvulnerabilityDefined() {
    return (this.bypassesInvulnerabilityDefined || this.bypassesInvulnerability);
  }
  
  @Override
  public boolean isBypassesMagicDefined() {
    return (this.bypassesMagicDefined || this.bypassesMagic);
  }
  
  @Override
  public boolean isExplosionDefined() {
    return (this.explosionDefined || this.explosion);
  }
  
  @Override
  public boolean isFireDefined() {
    return (this.fireDefined || this.fire);
  }
  
  @Override
  public boolean isLightningDefined() {
    return (this.lightningDefined || this.lightning);
  }
  
  @Override
  public boolean isMagicDefined() {
    return (this.magicDefined || this.magic);
  }
  
  @Override
  public boolean isProjectileDefined() {
    return (this.projectileDefined || this.projectile);
  }
}
