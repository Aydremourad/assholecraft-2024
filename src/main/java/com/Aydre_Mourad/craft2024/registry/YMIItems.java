package com.Aydre_Mourad.craft2024.registry;

import com.Aydre_Mourad.craft2024.craft2024;
import com.mojang.brigadier.LiteralMessage;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class YMIItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(craft2024.MOD_ID);

    //Items go here
    public static final DeferredItem<Item> Example_Item =ITEMS.registerItem( "example_item", Item::new, new Item.Properties());
    public static final DeferredItem<Item> Second_Item = ITEMS.registerSimpleItem( "second_item", new Item.Properties());

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }


}
