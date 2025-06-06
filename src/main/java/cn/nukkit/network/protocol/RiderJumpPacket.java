package cn.nukkit.network.protocol;

import lombok.ToString;

/**
 * @deprecated Removed as of v800 (1.21.80). Server authoritative jump is handled by {@link PlayerAuthInputPacket}
 */
@ToString
public class RiderJumpPacket extends DataPacket {

    public static final byte NETWORK_ID = ProtocolInfo.RIDER_JUMP_PACKET;

    public int jumpStrength;

    @Override
    public byte pid() {
        return NETWORK_ID;
    }

    @Override
    public void decode() {
        this.jumpStrength = this.getVarInt();
    }

    @Override
    public void encode() {
        this.reset();
        this.putVarInt(this.jumpStrength);
    }
}
