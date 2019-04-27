package fr.jcs.bigalarm.gui;

import fr.jcs.bigalarm.tileentitys.TileEntityAlarm;
import net.minecraft.client.gui.GuiScreen;

public class GuiAlarmBlock extends GuiScreen{
	private TileEntityAlarm tile;
	
	public GuiAlarmBlock(TileEntityAlarm alarm) {
		this.tile = alarm;
	}

	@Override
	public void initGui() {
        int guiLeft = (width / 2) - (197 / 2);
        int guiTop = (height / 2) - (88 / 2);
        buttonList.clear();
        
        
        /*
        if (tile.flowOverridden) return;
        buttonList.add(new GuiTextureButton(0, guiLeft + 20, guiTop + 20, 0, 108, 18, 18, ""));
        buttonList.add(new GuiTextureButton(1, guiLeft + 159, guiTop + 20, 0, 54, 18, 18, ""));

        buttonList.add(new GuiTextureButton(2, guiLeft + 20, guiTop + 50, 0, 108, 18, 18, ""));
        buttonList.add(new GuiTextureButton(3, guiLeft + 159, guiTop + 50, 0, 54, 18, 18, ""));
        */
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		int guiLeft = (width / 2) - (197 / 2);
        int guiCrt = (width / 2);
        int guiTop = (height / 2) - (88 / 2);
        
        drawDefaultBackground();
        //ResourceHandler.bindResource("textures/gui/ToolConfig.png");
	}
}
