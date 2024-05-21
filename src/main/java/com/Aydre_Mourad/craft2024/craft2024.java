package com.Aydre_Mourad.craft2024;

import com.Aydre_Mourad.craft2024.registry.YMIBlocks;
import com.Aydre_Mourad.craft2024.registry.YMICreativeModeTabs;
import com.Aydre_Mourad.craft2024.registry.YMIItems;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(craft2024.MOD_ID)
public class craft2024
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "craft2024";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public craft2024(IEventBus modEventBus) {

        YMIItems.register(modEventBus);
        YMIBlocks.register(modEventBus);
        YMICreativeModeTabs.register(modEventBus);

    }

}
