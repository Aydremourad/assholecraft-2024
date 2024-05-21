package com.Aydre_Mourad.craft2024.registry;

import com.Aydre_Mourad.craft2024.craft2024;
import com.Aydre_Mourad.craft2024.craft2024;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class YMICreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, craft2024.MOD_ID);

    //CreativeModeTabs go here
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register(
            "example_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.creative_tab"))
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> YMIItems.Example_Item.get().getDefaultInstance())
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(YMIItems.Example_Item);
                        pOutput.accept(YMIItems.Second_Item);
                    }))
                    .build()
    );
    public static void register(IEventBus bus) { CREATIVE_MODE_TABS.register(bus); }

}
