package net.rafael.mccourse.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rafael.mccourse.McCourseMod;

public class Moditems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(McCourseMod.MODID);

    public static final DeferredItem<Item> BLACK_OPAL = ITEMS.registerSimpleItem("black_opal");
    public static final DeferredItem<Item> RAW_BLACK_OPAL = ITEMS.registerSimpleItem("raw_black_opal");



    public  static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
