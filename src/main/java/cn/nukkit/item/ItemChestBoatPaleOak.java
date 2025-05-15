package cn.nukkit.item;

import cn.nukkit.network.protocol.ProtocolInfo;

public class ItemChestBoatPaleOak extends ItemChestBoatBase {
    public ItemChestBoatPaleOak() {
        this(0, 1);
    }

    public ItemChestBoatPaleOak(Integer meta) {
        this(meta, 1);
    }

    public ItemChestBoatPaleOak(Integer meta, int count) {
        this(PALE_OAK_CHEST_BOAT, meta, count, "Pale Oak Chest Boat");
    }

    protected ItemChestBoatPaleOak(int id, Integer meta, int count, String name) {
        super(id, meta, count, name);
    }

    @Override
    public int getBoatId() {
        return 4;
    }

    @Override
    public boolean isSupportedOn(int protocolId) {
        return protocolId >= ProtocolInfo.v1_21_60;
    }
}
