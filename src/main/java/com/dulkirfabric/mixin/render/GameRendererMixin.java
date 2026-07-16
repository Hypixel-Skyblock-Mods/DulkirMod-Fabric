package com.dulkirfabric.mixin.render;


import com.dulkirfabric.features.InventoryScale;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value = Gui.class, priority = 1001)
public class GameRendererMixin {

    @WrapOperation(
            method = "extractRenderState",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/gui/screens/Screen;extractRenderStateWithTooltipAndSubtitles" +
                            "(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V"
            )
    )
    private void dulkir$wrapScreenRender(Screen instance, GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float f,
                                         Operation<Void> original) {
        guiGraphics.pose().pushMatrix();
        guiGraphics.pose().scale(InventoryScale.INSTANCE.getScale(), InventoryScale.INSTANCE.getScale());
        original.call(
                instance,
                guiGraphics,
                mouseX,
                mouseY,
                f
        );
        guiGraphics.pose().popMatrix();
    }

}
