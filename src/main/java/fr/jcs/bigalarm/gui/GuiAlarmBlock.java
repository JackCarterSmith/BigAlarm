package fr.jcs.bigalarm.gui;

import java.util.ArrayList;
import java.util.List;

import org.lwjgl.input.Keyboard;

import fr.jcs.bigalarm.tileentitys.TileEntityAlarm;
import fr.jcs.bigalarm.utils.GuiHelper;
import fr.jcs.bigalarm.utils.ResourceHandler;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

public class GuiAlarmBlock extends GuiScreen{
	private TileEntityAlarm tile;
	
	public GuiAlarmBlock(TileEntityAlarm alarm) {
		this.tile = alarm;
	}

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
	
	@Override
	public void initGui() {
        int guiLeft = (width / 2) - (197 / 2);
        int guiTop = (height / 2) - (88 / 2);
        buttonList.clear();
        
        buttonList.add(new GuiTextureButton(0, guiLeft + 20, guiTop + 20, 0, 108, 18, 18, ""));
        buttonList.add(new GuiTextureButton(1, guiLeft + 159, guiTop + 20, 0, 54, 18, 18, ""));

        buttonList.add(new GuiTextureButton(2, guiLeft + 20, guiTop + 50, 0, 108, 18, 18, ""));
        buttonList.add(new GuiTextureButton(3, guiLeft + 159, guiTop + 50, 0, 54, 18, 18, ""));       
        
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
        ResourceHandler.bindResource("textures/gui/configPanel.png");
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, 197, 88);
        fontRendererObj.drawString(StatCollector.translateToLocal("gui.bigalarm.alarmBlock.name"), guiCrt - (fontRendererObj.getStringWidth(StatCollector.translateToLocal("gui.bigalarm.alarmBlock.name")) / 2), guiTop + 5, 0x2c2c2c);
        
        ResourceHandler.bindResource("textures/gui/widgets.png");
        super.drawScreen(mouseX, mouseY, partialTicks);
        
        List<String> hoverText = new ArrayList<String>();
        boolean shift = Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT);
        boolean ctrl = Keyboard.isKeyDown(Keyboard.KEY_LCONTROL) || Keyboard.isKeyDown(Keyboard.KEY_RCONTROL);

        if (GuiHelper.isInRect(guiLeft + 20, guiTop + 20, 18, 18, mouseX, mouseY)) {
            //hoverText.add(StatCollector.translateToLocal("gui.de.decrement.name") + " " + tile.getToolTip(1, shift, ctrl));
        	hoverText.add(StatCollector.translateToLocal("gui.de.decrement.name"));
        }
        if (GuiHelper.isInRect(guiLeft + 159, guiTop + 20, 18, 18, mouseX, mouseY)) {
            //hoverText.add(StatCollector.translateToLocal("gui.de.increment.name") + " " + tile.getToolTip(1, shift, ctrl));
        	hoverText.add(StatCollector.translateToLocal("gui.de.increment.name"));
        }

        if (GuiHelper.isInRect(guiLeft + 20, guiTop + 50, 18, 18, mouseX, mouseY)) {
            //hoverText.add(StatCollector.translateToLocal("gui.de.decrement.name") + " " + tile.getToolTip(0, shift, ctrl));
        	hoverText.add(StatCollector.translateToLocal("gui.de.decrement.name"));
        }
        if (GuiHelper.isInRect(guiLeft + 159, guiTop + 50, 18, 18, mouseX, mouseY)) {
            //hoverText.add(StatCollector.translateToLocal("gui.de.increment.name") + " " + tile.getToolTip(0, shift, ctrl));
        	hoverText.add(StatCollector.translateToLocal("gui.de.increment.name"));
        }

        if (!hoverText.isEmpty()) {
            hoverText.add(EnumChatFormatting.GRAY + StatCollector.translateToLocal("gui.de.pressOrScroll.name"));
            //drawHoveringText(hoverText, x - (x < width / 2 ? fontRendererObj.getStringWidth(StatCollector.translateToLocal("gui.de.decrement.name") + " " + tile.getToolTip(1, shift, ctrl)) + 25 : 0), y, fontRendererObj);
            drawHoveringText(hoverText, mouseX - (mouseX < width / 2 ? fontRendererObj.getStringWidth(StatCollector.translateToLocal("gui.de.decrement.name")) + 25 : 0), mouseY, fontRendererObj);
        }
	}
}
