package divinerpg.structure.iceika.archerdungeon;

import divinerpg.structure.base.DivineStructureStart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.structure.StructureComponentTemplate;
import net.minecraft.world.gen.structure.template.TemplateManager;

public class ArcherDungeonStart extends DivineStructureStart {

    /**
     * nbt ctor
     */
    public ArcherDungeonStart() {
    }

    public ArcherDungeonStart(ResourceLocation location, TemplateManager templateManager, int chunkX, int chunkZ) {
        super(location, templateManager, chunkX, 100, chunkZ, 2, 1);
    }

    @Override
    protected StructureComponentTemplate getComponent(TemplateManager manager, ResourceLocation location, BlockPos pos) {
        pos = pos.add(0, 100, 0);
        return new ArcherDungeonComponent(manager, location, pos);
    }
}