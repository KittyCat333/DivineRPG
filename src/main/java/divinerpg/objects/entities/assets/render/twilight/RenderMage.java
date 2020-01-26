package divinerpg.objects.entities.assets.render.twilight;

import javax.annotation.Nullable;

import divinerpg.objects.entities.assets.model.twilight.ModelMage;
import divinerpg.objects.entities.entity.twilight.EntityMage;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderMage extends RenderLiving<EntityMage> {
    public static final IRenderFactory FACTORY = new Factory();
    ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/mage.png");

    public RenderMage(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelMage(), shadowsizeIn);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityMage entity) {
        return texture;
    }

    public static class Factory implements IRenderFactory<EntityMage> {
        @Override
        public Render<? super EntityMage> createRenderFor(RenderManager manager) {
            return new RenderMage(manager, new ModelMage(), 0);
        }
    }
}