package com.raptor.mcloottable.mcloot.impl

class DamageSourcePropertiesLootConditionImpl2 extends DamageSourcePropertiesLootConditionImpl {
    
    override isBypassesArmorDefined() {
        bypassesArmorDefined || bypassesArmor
    }
    
    override isBypassesInvulnerabilityDefined() {
        bypassesInvulnerabilityDefined || bypassesInvulnerability
    }
    
    override isBypassesMagicDefined() {
        bypassesMagicDefined || bypassesMagic
    }
    
    override isExplosionDefined() {
        explosionDefined || explosion
    }
    
    override isFireDefined() {
        fireDefined || fire
    }
    
    override isLightningDefined() {
        lightningDefined || lightning
    }
    
    override isMagicDefined() {
        magicDefined || magic
    }
    
    override isProjectileDefined() {
        projectileDefined || projectile
    }
    
}