package com.raptor.mcloottable.mcloot.impl;

import com.raptor.mcloottable.mcloot.impl.EntityFlagsImpl;

@SuppressWarnings("all")
public class EntityFlagsImpl2 extends EntityFlagsImpl {
  @Override
  public boolean isOnFireDefined() {
    return (this.onFireDefined || this.onFire);
  }
  
  @Override
  public boolean isBabyDefined() {
    return (this.babyDefined || this.baby);
  }
  
  @Override
  public boolean isSneakingDefined() {
    return (this.sneakingDefined || this.sneaking);
  }
  
  @Override
  public boolean isSprintingDefined() {
    return (this.sprintingDefined || this.sprinting);
  }
  
  @Override
  public boolean isSwimmingDefined() {
    return (this.swimmingDefined || this.swimming);
  }
}
