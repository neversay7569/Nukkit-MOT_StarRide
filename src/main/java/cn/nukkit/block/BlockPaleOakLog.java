package cn.nukkit.block;

public class BlockPaleOakLog extends BlockWood {

    public BlockPaleOakLog() {
        this(0);
    }

    public BlockPaleOakLog(int meta) {
        super(meta);
    }

    @Override
    public int getBurnAbility() { return 5; }

    @Override
    public String getName() {
        return "Pale Oak log";
    }

    @Override
    public int getId() {
        return PALE_OAK_LOG;
    }

    @Override
    protected int getStrippedId() {
        return STRIPPED_PALE_OAK_LOG;
    }

    @Override
    protected int getStrippedDamage() {
        return this.getDamage() & ~0x3;
    }
}