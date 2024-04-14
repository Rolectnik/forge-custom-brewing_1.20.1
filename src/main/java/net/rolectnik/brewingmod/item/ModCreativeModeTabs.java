package net.rolectnik.brewingmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rolectnik.brewingmod.BrewingMod;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BrewingMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BREWING_MOD_TAB = CREATIVE_MODE_TABS.register("brewing_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHARGED_CINNABAR.get()))
                    .title(Component.translatable("creativetab.brew_mod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CHARGED_CINNABAR.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
