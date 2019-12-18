package divinerpg.entities.mortum.stealer;

import divinerpg.entities.base.DivineModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.util.math.MathHelper;

public class SoulStealerModel extends DivineModel<SoulStealer> {
    RendererModel head;
    RendererModel body;
    RendererModel rightarm;
    RendererModel leftarm;
    RendererModel rightleg;
    RendererModel leftleg;
    RendererModel Shape1;
    RendererModel Shape3;
    RendererModel Shape2;
    RendererModel Shape4;
    RendererModel Shape5;
    RendererModel Shape6;
    RendererModel Shape7;
    RendererModel Shape8;
    RendererModel Shape9;
    RendererModel Shape10;
    RendererModel back;
    RendererModel back1;
    RendererModel back2;
    RendererModel back3;
    RendererModel back4;

    public SoulStealerModel() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new RendererModel(this, 0, 0);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.body = new RendererModel(this, 16, 16);
        this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, 0.0F, 0.0F, 0.0F);
        this.rightarm = new RendererModel(this, 40, 16);
        this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
        this.rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightarm.setTextureSize(64, 32);
        this.rightarm.mirror = true;
        this.setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
        this.leftarm = new RendererModel(this, 40, 16);
        this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
        this.leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.leftarm.setTextureSize(64, 32);
        this.leftarm.mirror = true;
        this.setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
        this.rightleg = new RendererModel(this, 0, 16);
        this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.rightleg.setTextureSize(64, 32);
        this.rightleg.mirror = true;
        this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
        this.leftleg = new RendererModel(this, 0, 16);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.leftleg.setTextureSize(64, 32);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
        this.Shape1 = new RendererModel(this, 8, 0);
        this.Shape1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
        this.Shape1.setRotationPoint(2.0F, -8.0F, -9.0F);
        this.Shape1.setTextureSize(64, 32);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
        this.Shape3 = new RendererModel(this, 8, 0);
        this.Shape3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
        this.Shape3.setRotationPoint(-4.0F, -8.0F, -9.0F);
        this.Shape3.setTextureSize(64, 32);
        this.Shape3.mirror = true;
        this.setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
        this.Shape2 = new RendererModel(this, 9, 0);
        this.Shape2.addBox(0.0F, 0.0F, 0.0F, 4, 2, 2);
        this.Shape2.setRotationPoint(4.0F, -6.0F, -4.0F);
        this.Shape2.setTextureSize(64, 32);
        this.Shape2.mirror = true;
        this.setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
        this.Shape4 = new RendererModel(this, 9, 0);
        this.Shape4.addBox(0.0F, 0.0F, 0.0F, 4, 2, 2);
        this.Shape4.setRotationPoint(-8.0F, -6.0F, -4.0F);
        this.Shape4.setTextureSize(64, 32);
        this.Shape4.mirror = true;
        this.setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
        this.Shape5 = new RendererModel(this, 9, 0);
        this.Shape5.addBox(0.0F, 0.0F, 0.0F, 4, 2, 2);
        this.Shape5.setRotationPoint(4.0F, -3.0F, -4.0F);
        this.Shape5.setTextureSize(64, 32);
        this.Shape5.mirror = true;
        this.setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
        this.Shape6 = new RendererModel(this, 9, 0);
        this.Shape6.addBox(0.0F, 0.0F, 0.0F, 4, 2, 2);
        this.Shape6.setRotationPoint(-8.0F, -3.0F, -4.0F);
        this.Shape6.setTextureSize(64, 32);
        this.Shape6.mirror = true;
        this.setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
        this.Shape7 = new RendererModel(this, 8, 0);
        this.Shape7.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
        this.Shape7.setRotationPoint(6.0F, -6.0F, -9.0F);
        this.Shape7.setTextureSize(64, 32);
        this.Shape7.mirror = true;
        this.setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
        this.Shape8 = new RendererModel(this, 8, 0);
        this.Shape8.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
        this.Shape8.setRotationPoint(6.0F, -3.0F, -9.0F);
        this.Shape8.setTextureSize(64, 32);
        this.Shape8.mirror = true;
        this.setRotation(this.Shape8, 0.0F, 0.0F, 0.0F);
        this.Shape9 = new RendererModel(this, 8, 0);
        this.Shape9.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
        this.Shape9.setRotationPoint(-8.0F, -6.0F, -9.0F);
        this.Shape9.setTextureSize(64, 32);
        this.Shape9.mirror = true;
        this.setRotation(this.Shape9, 0.0F, 0.0F, 0.0F);
        this.Shape10 = new RendererModel(this, 8, 0);
        this.Shape10.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
        this.Shape10.setRotationPoint(-8.0F, -3.0F, -9.0F);
        this.Shape10.setTextureSize(64, 32);
        this.Shape10.mirror = true;
        this.setRotation(this.Shape10, 0.0F, 0.0F, 0.0F);
        this.back = new RendererModel(this, 4, 0);
        this.back.addBox(0.0F, 0.0F, 0.0F, 4, 4, 5);
        this.back.setRotationPoint(-2.0F, 0.0F, 2.0F);
        this.back.setTextureSize(64, 32);
        this.back.mirror = true;
        this.setRotation(this.back, 0.0F, 0.0F, 0.0F);
        this.back1 = new RendererModel(this, 8, 0);
        this.back1.addBox(0.0F, 0.0F, 0.0F, 5, 2, 2);
        this.back1.setRotationPoint(2.0F, 0.0F, 5.0F);
        this.back1.setTextureSize(64, 32);
        this.back1.mirror = true;
        this.setRotation(this.back1, 0.0F, 0.0F, 0.0F);
        this.back2 = new RendererModel(this, 8, 0);
        this.back2.addBox(0.0F, 0.0F, 0.0F, 5, 2, 2);
        this.back2.setRotationPoint(-7.0F, 0.0F, 5.0F);
        this.back2.setTextureSize(64, 32);
        this.back2.mirror = true;
        this.setRotation(this.back2, 0.0F, 0.0F, 0.0F);
        this.back3 = new RendererModel(this, 15, 25);
        this.back3.addBox(0.0F, 0.0F, 0.0F, 9, 2, 2);
        this.back3.setRotationPoint(5.0F, 0.0F, 5.0F);
        this.back3.setTextureSize(64, 32);
        this.back3.mirror = true;
        this.setRotation(this.back3, 0.0F, 0.0F, -((float) Math.PI / 2F));
        this.back4 = new RendererModel(this, 15, 25);
        this.back4.addBox(0.0F, -1.0F, 0.0F, 9, 2, 2);
        this.back4.setRotationPoint(-6.0F, 0.0F, 5.0F);
        this.back4.setTextureSize(64, 32);
        this.back4.mirror = true;
        this.setRotation(this.back4, 0.0F, 0.0F, -((float) Math.PI / 2F));
    }

    @Override
    public void setRotationAngles(SoulStealer entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
        super.setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);

        this.rightarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 2.0F * limbSwingAmount * 0.5F;
        this.leftarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F;
        this.rightarm.rotateAngleZ = 0.0F;
        this.leftarm.rotateAngleZ = 0.0F;
        this.rightleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
        this.rightleg.rotateAngleY = 0.0F;
        this.leftleg.rotateAngleY = 0.0F;
    }
}
