package org.newdawn.slick.tests;

import org.newdawn.slick.*;
import org.newdawn.slick.input.sources.keymaps.USKeyboard;
import org.newdawn.slick.util.Log;

/**
 * A test for basic image rendering
 *
 * @author kevin
 */
public class BigImageTest extends BasicGame {
	private static final Log LOG = new Log(BigImageTest.class);

	/** The original 1024x768 image loaded */
	private Image original;
	/** The image scaled */
	private Image image;
	/** The scaled image flipped on the X axis */
	private Image imageX;
	/** The scaled image flipped on the Y axis */
	private Image imageY;
	/** A sub part of the original image */
	private Image sub;
	/** The scaled version of the sub-image */
	private Image scaledSub;
	/** The x position to draw at */
	private float x;
	/** The y position to draw at */
	private float y;
	/** The angle to draw the rortating sub part at */
	private float ang = 30f;
	/** A sprite sheet made from the big image */
	private SpriteSheet bigSheet;
	
	/**
	 * Create a new image rendering test
	 */
	public BigImageTest() {
		super("Big Image Test");
	}
	
	/**
	 * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
	 */
	public void init(GameContainer container) {
		// force a 256 pixel limit for testing
		try {
			original = image = new BigImage("testdata/bigimage.tga", Image.FILTER_NEAREST, 512);
			sub = image.getSubImage(210, 210, 200, 130);
			scaledSub = sub.getScaledCopy(2);
			image = image.getScaledCopy(0.3f);
			imageX = image.getFlippedCopy(true, false);
		} catch (SlickException e) {
			LOG.error("Caught exception: {}", e);
			System.exit(-1);
		}

		imageY = imageX.getFlippedCopy(true, true);
		
		bigSheet = new SpriteSheet(original, 16, 16);
	}

	/**
	 * @see org.newdawn.slick.BasicGame#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
	 */
	public void render(GameContainer container, Graphics g) {
		original.draw(0,0,new Color(1,1,1,0.4f));
		
		image.draw(x,y);
		imageX.draw(x+400,y);
		imageY.draw(x,y+300);
		scaledSub.draw(x+300,y+300);
		
		bigSheet.getSprite(7, 5).draw(50,10);
		g.setColor(Color.white);
		g.drawRect(50,10,64,64);
		g.rotate(x+400, y+165, ang);
		g.drawImage(sub, x+300, y+100);
	}

	/**
	 * Entry point to our test
	 * 
	 * @param argv The arguments to pass into the test
	 */
	public static void main(String[] argv) {
		AppGameContainer container = new AppGameContainer(new BigImageTest(), 800, 600, DisplayMode.Opt.WINDOWED);
		container.setDisplayMode(800,600, DisplayMode.Opt.WINDOWED);
		container.start();
	}

	/**
	 * @see org.newdawn.slick.BasicGame#update(org.newdawn.slick.GameContainer, int)
	 */
	public void update(GameContainer container, int delta) throws SlickException {
		ang += delta * 0.1f;
		
		if (container.getInput().isKeyDown(USKeyboard.KEY_LEFT)) {
			x -= delta * 0.1f;
		}
		if (container.getInput().isKeyDown(USKeyboard.KEY_RIGHT)) {
			x += delta * 0.1f;
		}
		if (container.getInput().isKeyDown(USKeyboard.KEY_UP)) {
			y -= delta * 0.1f;
		}
		if (container.getInput().isKeyDown(USKeyboard.KEY_DOWN)) {
			y += delta * 0.1f;
		}
	}
}
