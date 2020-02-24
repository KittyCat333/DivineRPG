package divinerpg.arcana.client;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import divinerpg.DivineRPG;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.gui.GuiUtils;

public class ArcanaRender {

    private static final Minecraft mc = Minecraft.getInstance();
    private static final ResourceLocation bar = new ResourceLocation(DivineRPG.MODID, "textures/gui/arcana_bar.png");
    public static int percentage = 100;

    @SubscribeEvent
    public void onRender(RenderGameOverlayEvent.Pre e) {
        if (e.isCanceled())
            return;

        // Advise from here
        // https://www.minecraftforge.net/forum/topic/73013-1143-gui-class-replaced-custom-hud-help/
        // Apparently the TEXT 'layer' provides the best result for﻿ rendering custom things﻿﻿﻿﻿
        if (e.getType() != RenderGameOverlayEvent.ElementType.TEXT)
            return;

        int y = e.getWindow().getScaledHeight() - DivineRPG.CONFIG.arcanaBar.height.get();
        int x = e.getWindow().getScaledWidth() - DivineRPG.CONFIG.arcanaBar.width.get();


        RenderSystem.pushMatrix();
        RenderSystem.enableBlend();

        mc.getTextureManager().bindTexture(bar);
        GuiUtils.drawTexturedModalRect(x, y, 0, 0, 100, 9, 0);
        GuiUtils.drawTexturedModalRect(x, y, 0, 9, percentage, 9, 0);

        RenderSystem.disableBlend();
        RenderSystem.popMatrix();
    }
}