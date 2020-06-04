package org.newdawn.slick.gui;

import org.newdawn.slick.Font;
import org.newdawn.slick.input.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.ImageData;

/**
 * The context in which GUI components are created and rendered
 *
 * @author kevin
 * @author tyler
 */
public interface GUIContext {
	Input getInput();

	int getScreenWidth();
	int getScreenHeight();
	int getWidth();
	int getHeight();
	
	Font getDefaultFont();
	void setMouseCursor(String ref, int hotSpotX, int hotSpotY) throws SlickException;
	void setMouseCursor(ImageData data, int hotSpotX, int hotSpotY) throws SlickException;
	void setMouseCursor(long cursor, int hotSpotX, int hotSpotY) throws SlickException;
	void setDefaultMouseCursor();
}
