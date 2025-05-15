package cn.nukkit.block;

public class BlockLogStrippedPaleOak extends BlockWoodStripped {

    public BlockLogStrippedPaleOak() {
        super(0);
    }

    public BlockLogStrippedPaleOak(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return STRIPPED_PALE_OAK_LOG;
    }

    @Override
    public String getName() {
        return "Stripped Pale Oak Log";
    }

    @Override
    public double getResistance() {
        return 2;
    }
}