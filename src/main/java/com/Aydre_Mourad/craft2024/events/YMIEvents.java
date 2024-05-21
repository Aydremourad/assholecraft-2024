package com.Aydre_Mourad.craft2024.events;

import com.Aydre_Mourad.craft2024.craft2024;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.living.LivingAttackEvent;

@Mod.EventBusSubscriber(modid = craft2024.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class YMIEvents {

    @SubscribeEvent
    public static void doAThing(LivingAttackEvent event) {

    }

}
