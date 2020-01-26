package divinerpg.objects.entities.assets.render.twilight;

import javax.annotation.Nullable;

import divinerpg.objects.entities.assets.model.twilight.ModelTwilightGolem;
import divinerpg.objects.entities.entity.twilight.EntitySkythernGolem;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderSkythernGolem extends RenderLiving<EntitySkythernGolem> {
    public static final IRenderFactory FACTORY = new Factory();
    ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/skythern_golem.png");

    public RenderSkythernGolem(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelTwilightGolem(), shadowsizeIn);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntitySkythernGolem entity) {
        return texture;
    }

    public static class Factory implements IRenderFactory<EntitySkythernGolem> {
        @Override
        public Render<? super EntitySkythernGolem> createRenderFor(RenderManager manager) {
            return new RenderSkythernGolem(manager, new ModelTwilightGolem(), 0);
        }
    }
}