package org.newdawn.slick.tests;
	
import org.newdawn.slick.*;
import org.newdawn.slick.input.sources.keymaps.USKeyboard;
import org.newdawn.slick.util.Log;

/**
 * A test of the font rendering capabilities
 *
 * @author kevin
 */
public class FontTest extends BasicGame {
	private static final Log LOG = new Log(FontTest.class);

	/** The font we're going to use to render */
	private AngelCodeFont font;
	/** The font we're going to use to render */
	private AngelCodeFont font2;
	/** The image of the font to compare against */
	private Image image;
	
	/**
	 * Create a new test for font rendering
	 */
	public FontTest() {
		super("Font Test");
	}
	
	/**
	 * @see org.newdawn.slick.Game#init(org.newdawn.slick.GameContainer)
	 */
	public void init(GameContainer container) {
		try {
			font = new AngelCodeFont("testdata/demo2.fnt", "testdata/demo2_00.tga");
			font2 = new AngelCodeFont("testdata/hiero.fnt", "testdata/hiero.png");
			image = new Image("testdata/demo2_00.tga", false);
		} catch (SlickException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * @see org.newdawn.slick.BasicGame#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
	 */
	public void render(GameContainer container, Graphics g) {
		font.drawString(80, 5, "A Font Example", Color.red);
		font.drawString(100, 32, "We - AV - Here is a more complete line that hopefully");
		font.drawString(100, 36 + font.getHeight("We Here is a more complete line that hopefully"), 
				             "will show some kerning.");
		
		font2.drawString(80, 85, "A Font Example", Color.red);
		font2.drawString(100, 132, "We - AV - Here is a more complete line that hopefully");
		font2.drawString(100, 136 + font2.getHeight("We - Here is a more complete line that hopefully"), 
				             "will show some kerning.");
		image.draw(100,400);
		
		String testStr = "Testing Font";
		font2.drawString(100, 300, testStr);
		g.setColor(Color.white);
		g.drawRect(100,300+font2.getYOffset(testStr),font2.getWidth(testStr),font2.getHeight(testStr)-font2.getYOffset(testStr));
		font.drawString(500, 300, testStr);
		g.setColor(Color.white);
		g.drawRect(500,300+font.getYOffset(testStr),font.getWidth(testStr),font.getHeight(testStr)-font.getYOffset(testStr));
	}

	/**
	 * @see org.newdawn.slick.BasicGame#update(org.newdawn.slick.GameContainer, int)
	 */
	public void update(GameContainer container, int delta) throws SlickException {
	}
	
	/**
	 * @see org.newdawn.slick.BasicGame#keyPressed(int, char)
	 */
	public void keyPressed(int key, char c) {
		if (key == USKeyboard.KEY_ESCAPE) {
			System.exit(0);
		}
		if (key == USKeyboard.KEY_SPACE) {
			container.setDisplayMode(640, 480, DisplayMode.Opt.WINDOWED);
		}
	}
	
	/** The container we're using */
	private static AppGameContainer container;
	
	/**
	 * Entry point to our test
	 * 
	 * @param argv The arguments passed in the test
	 */
	public static void main(String[] argv) {
		container = new AppGameContainer(new FontTest(), 800, 600, DisplayMode.Opt.WINDOWED);
		container.setDisplayMode(800,600, DisplayMode.Opt.WINDOWED);
		container.start();
	}
}
