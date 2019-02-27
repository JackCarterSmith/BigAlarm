package fr.jcs.bigalarm.tileentitys;

import cpw.mods.fml.common.FMLCommonHandler;
import fr.jcs.bigalarm.BigAlarmRefs;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityAlarm extends TileEntity {
	private static final String DEFAULT_SOUND_NAME = "default";
	private static final float BASE_SOUND_RANGE = 16F;
	private static final String SOUND_PREFIX = BigAlarmRefs.MOD_ID + ":alarm-";
	
	public int range;
	private int prevRange;
	public String soundName;
	private String prevSoundName;

	private int updateTicker;
	protected int tickRate;
	private TileEntitySound sound;
	
	public TileEntityAlarm() {
		soundName = "";
		//range = IC2NuclearControl.instance.alarmRange;
		range = 0;
		if (FMLCommonHandler.instance().getEffectiveSide().isClient()) {
			sound = new TileEntitySound();
		}
	}
	
	public int getRange() {
		return range;
	}

	public void setRange(int r) {
		range = r;
		if (prevRange != r) {
			//IC2.network.get().updateTileEntityField(this, "range");
		}
		prevRange = range;
	}

	public String getSoundName() {
		return soundName;
	}

	public void setSoundName(String name) {
		soundName = name;
		if (prevSoundName != name){
			//IC2.network.get().updateTileEntityField(this, "soundName");
		}
		prevSoundName = name;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbttagcompound) {
		super.readFromNBT(nbttagcompound);
		if (nbttagcompound.hasKey("soundName")) {
			prevSoundName = soundName = nbttagcompound.getString("soundName");
			prevRange = range = nbttagcompound.getInteger("range");
		}
	}

	@Override
	public void writeToNBT(NBTTagCompound nbttagcompound) {
		super.writeToNBT(nbttagcompound);
		nbttagcompound.setString("soundName", soundName);
		nbttagcompound.setInteger("range", range);
	}
}
