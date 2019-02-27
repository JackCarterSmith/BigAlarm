package fr.jcs.bigalarm.tileentitys;

import fr.jcs.bigalarm.utils.SoundHelper;
import net.minecraft.client.audio.PositionedSoundRecord;

public class TileEntitySound {
	private PositionedSoundRecord sound;

	public TileEntitySound() {
	}

	public void stopAlarm() {
		if (sound != null) {
			SoundHelper.stopAlarm(sound);
			sound = null;
		}
	}

	public void playAlarm(double x, double y, double z, String soundName,
			float range, boolean skipCheck) {
		if (sound == null || skipCheck) {
			sound = SoundHelper.playAlarm(x, y, z, soundName, range);
		}
	}

	public boolean isPlaying() {
		if (sound == null) {
			return false;
		}
		return SoundHelper.isPlaying(sound);
	}
}
