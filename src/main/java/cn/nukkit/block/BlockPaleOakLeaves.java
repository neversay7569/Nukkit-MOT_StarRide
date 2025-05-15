package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemBlock;

public class BlockPaleOakLeaves extends BlockLeaves {

    public static final int UPDATE_BIT = 0b1;
    public static final int PERSISTENT_BIT = 0b10;

    @Override
    public String getName() {
        return "Pale Oak Leaves";
    }

    @Override
    public int getId() {
        return PALE_OAK_LEAVES;
    }

    @Override
    protected Item getSapling() {
        return new ItemBlock(Block.get(PALE_OAK_SAPLING));
    }

    @Override
    protected boolean canDropApple() {
        return false;
    }
}
