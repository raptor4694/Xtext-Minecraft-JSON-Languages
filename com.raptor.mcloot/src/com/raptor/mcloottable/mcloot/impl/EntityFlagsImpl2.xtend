package com.raptor.mcloottable.mcloot.impl

class EntityFlagsImpl2 extends EntityFlagsImpl {
    
    override isOnFireDefined() {
        onFireDefined || onFire
    }
    
    override isBabyDefined() {
        babyDefined || baby
    }
    
    override isSneakingDefined() {
        sneakingDefined || sneaking
    }
    
    override isSprintingDefined() {
        sprintingDefined || sprinting
    }
    
    override isSwimmingDefined() {
        swimmingDefined || swimming
    }
    
}