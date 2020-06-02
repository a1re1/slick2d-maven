package org.newdawn.slick.tests;

import org.newdawn.slick.*;
import org.newdawn.slick.geom.Polygon;
import org.newdawn.slick.util.Log;

/**
 * Lame test
 * 
 * @author kevin
 */
public class LameTest extends BasicGame {
	private static final Log LOG = new Log(LameTest.class);

	/** The poly being drawn */
	private Polygon poly = new Polygon();
	/** The image being textured */
	private Image image;
	
	/**
	 * Create the test
	 */
	public LameTest() {
		super("Lame Test");
	}
	
	/**
	 * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
	 */
	public void init(GameContainer container) {
		poly.addPoint(100, 100);
		poly.addPoint(120, 100);
		poly.addPoint(120, 120);
		poly.addPoint(100, 120);

		try {
			image = new Image("testdata/rocks.png");
		} catch (SlickException e) {
			LOG.error("");
		}
	}

	/**
	 * @see org.newdawn.slick.BasicGame#update(org.newdawn.slick.GameContainer, int)
	 */
	public void update(GameContainer container, int delta) throws SlickException {
	}

	/**
	 * @see org.newdawn.slick.Game#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
	 */
	public void render(GameContainer container, Graphics g) throws SlickException {
		g.setColor(Color.white);
		g.texture(poly, image);
	}

	/**
	 * Entry point to our test
	 * 
	 * @param argv The arguments to pass into the test
	 */
	public static void main(String[] argv) {
		try {
			AppGameContainer container = new AppGameContainer(new LameTest());
			container.setDisplayMode(800,600, DisplayMode.Opt.WINDOWED);
			container.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
