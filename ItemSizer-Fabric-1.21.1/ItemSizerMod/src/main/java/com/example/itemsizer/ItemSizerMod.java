package com.example.itemsizer;

import com.mojang.brigadier.arguments.FloatArgumentType;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.minecraft.text.Text;

public class ItemSizerMod implements ClientModInitializer {
    // Default scale is 1.0 (100% normal size)
    public static float globalItemScale = 1.0f;

    @Override
    public void onInitializeClient() {
        // Registers the /itemsize <scale> command
        ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> {
            dispatcher.register(ClientCommandManager.literal("itemsize")
                .then(ClientCommandManager.argument("scale", FloatArgumentType.floatArg(0.05f, 20.0f))
                    .executes(context -> {
                        globalItemScale = FloatArgumentType.getFloat(context, "scale");
                        context.getSource().sendFeedback(
                            Text.literal("§aGlobal item size set to: §e" + globalItemScale + "x")
                        );
                        return 1;
                    })
                )
            );
        });
    }
}
