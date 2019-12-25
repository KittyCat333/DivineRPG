package divinerpg.entities.bosses.ayeraco;

import divinerpg.entities.base.DivineBatBoss;
import divinerpg.entities.base.DivineBoss;
import divinerpg.entities.bosses.ayeraco.manager.AyeracoManager;
import divinerpg.registry.EntitiesRegistry;
import divinerpg.registry.SoundRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BossInfo;
import net.minecraft.world.World;

import java.util.List;

public class Ayeraco extends DivineBatBoss {
    private final static String beamKey = "BeamPos";
    private final AyeracoManager model;
    private BlockPos beam;

    public Ayeraco(World world) {
        this(world, null, DivineBoss.randomColor(AyeracoManager.beamLocations.keySet()));
    }

    public Ayeraco(World world, BlockPos summoner, BossInfo.Color color) {
        super(EntitiesRegistry.ayeraco, world, SoundRegistry.AYERACO_HURT, SoundRegistry.AYERACO, color, 2000);
        model = new AyeracoManager(this);
        beam = model.getBeamLocation(summoner);

        BlockPos pos = beam == null
                ? summoner
                : beam;

        // todo ayeracos move to zero coords after update NBT tag hanling
        if (pos != null)
            setPosition(pos.getX(), pos.getY() + 1, pos.getZ());
    }

    public void initGang(List<Ayeraco> ayeracos) {
        model.initGang(ayeracos);
    }

    @Override
    protected void registerAttributes() {
        super.registerAttributes();

        initAttr(600, 5, 0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();

        initAI(false, true);
    }

    public BossInfo.Color getColor() {
        return info.getColor();
    }

    public BlockPos getBeam() {
        return beam;
    }

    @Override
    public void read(CompoundNBT compound) {
        super.read(compound);
        model.read(compound);

        if (compound.contains(beamKey)) {
            beam = BlockPos.fromLong(compound.getLong(beamKey));
        }
    }

    @Override
    public void writeAdditional(CompoundNBT compound) {
        super.writeAdditional(compound);
        model.write(compound);

        if (beam != null) {
            compound.putLong(beamKey, beam.toLong());
        }
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        return !model.isProtected(source) && super.attackEntityFrom(source, amount);
    }

    @Override
    public void setHealth(float health) {
        if (model == null) {
            super.setHealth(health);
        } else {
            boolean wasAngry = model.isAngry(this);

            super.setHealth(health);

            // if become angry
            if (!wasAngry && model.isAngry(this)) {
                this.playSound(SoundRegistry.AYERACO_HALF_HEALTH, 20, 0.4F / (this.rand.nextFloat() * 0.4F + 0.8F));
            }
        }
    }

    @Override
    protected void updateAITasks() {
        super.updateAITasks();
        model.afterAITasks();
    }

    @Override
    public void onDeath(DamageSource cause) {
        super.onDeath(cause);

        if (beam != null) {
            world.setBlockState(beam, Blocks.AIR.getDefaultState());
        }
    }

    @Override
    public void attackEntityWithRangedAttack(LivingEntity target, float distanceFactor) {

    }
}
