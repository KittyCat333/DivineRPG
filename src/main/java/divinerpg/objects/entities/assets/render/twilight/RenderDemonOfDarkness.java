package divinerpg.objects.entities.assets.render.twilight;

import javax.annotation.Nullable;

import divinerpg.objects.entities.assets.model.twilight.ModelDemonOfDarkness;
import divinerpg.objects.entities.entity.twilight.EntityDemonOfDarkness;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderDemonOfDarkness extends RenderLiving<EntityDemonOfDarkness> {
    public static final IRenderFactory FACTORY = new Factory();
    ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/demon_of_darkness.png");

    public RenderDemonOfDarkness(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelDemonOfDarkness(), shadowsizeIn);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityDemonOfDarkness entity) {
        return texture;
    }

    public static class Factory implements IRenderFactory<EntityDemonOfDarkness> {
        @Override
        public Render<? super EntityDemonOfDarkness> createRenderFor(RenderManager manager) {
            return new RenderDemonOfDarkness(manager, new ModelDemonOfDarkness(), 0);
        }
    }
}