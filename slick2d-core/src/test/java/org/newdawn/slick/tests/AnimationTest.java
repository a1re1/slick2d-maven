package org.newdawn.slick.tests;

import org.newdawn.slick.*;
import org.newdawn.slick.input.Input;
import org.newdawn.slick.input.sources.keymaps.USKeyboard;
import org.newdawn.slick.util.Log;

/**
 * A test for basic animation rendering
 *
 * @author kevin
 */
public class AnimationTest extends BasicGame {
	private static final Log LOG = new Log(Animation.class);

	/** The animation loaded */
	private Animation animation;
	/** The limited animation loaded */
	private Animation limited;
	/** The manual update animation loaded */
	private Animation manual;
	/** The animation loaded */
	private Animation pingPong;
	/** The container */
	private GameContainer container;
	/** Start limited counter */
	private int start = 5000;
	
	/**
	 * Create a new image rendering test
	 */
	public AnimationTest() {
		super("Animation Test");
	}

	@Override
	public void bindControls() {
		Input.bindKeyPress(USKeyboard.KEY_ESCAPE, (delta) -> container.exit());
		Input.bindKeyPress(USKeyboard.KEY_SPACE, (delta) -> limited.restart());
		Input.bindKeyPress(USKeyboard.KEY_1, true, -1, (delta) -> manual.update((int)delta));
	}

	/**
	 * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
	 */
	public void init(GameContainer container) {
		this.container = container;

		try {
			SpriteSheet sheet = new SpriteSheet("testdata/homeranim.png", 36, 65);
			animation = new Animation();
			for (int i=0;i<8;i++) {
				animation.addFrame(sheet.getSprite(i,0), 150);
			}
			limited = new Animation();
			for (int i=0;i<8;i++) {
				limited.addFrame(sheet.getSprite(i,0), 150);
			}
			limited.stopAt(7);
			manual = new Animation(false);
			for (int i=0;i<8;i++) {
				manual.addFrame(sheet.getSprite(i,0), 150);
			}
			pingPong = new Animation(sheet, 0,0,7,0,true,150,true);
			pingPong.setPingPong(true);
			container.getGraphics().setBackground(new Color(0.4f,0.6f,0.6f));
		} catch (SlickException e) {
			LOG.error("Caught exception: {}", e);
			System.exit(-1);
		}

		bindControls();
	}

	/**
	 * @see org.newdawn.slick.BasicGame#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
	 */
	public void render(GameContainer container, Graphics g) {
		g.drawString("Space to restart() animation", 100, 50);
		g.drawString("Til Limited animation: "+start, 100, 500);
		g.drawString("Hold 1 to move the manually animated", 100, 70);
		g.drawString("PingPong Frame:"+pingPong.getFrame(), 600, 70);
		
		g.scale(-1,1);
		animation.draw(-100,100);
		animation.draw(-200,100,36*4,65*4);
		if (start < 0) {
			limited.draw(-400,100,36*4,65*4);
		}
		manual.draw(-600,100,36*4,65*4);
		pingPong.draw(-700,100,36*2,65*2);
	}

	/**
	 * @see org.newdawn.slick.BasicGame#update(org.newdawn.slick.GameContainer, int)
	 */
	public void update(GameContainer container, int delta) {
		if (start >= 0) {
			start -= delta;
		}
	}

	/**
	 * Entry point to our test
	 * 
	 * @param argv The arguments to pass into the test
	 */
	public static void main(String[] argv) {
		AppGameContainer container = new AppGameContainer(new AnimationTest(), 800, 600, DisplayMode.Opt.WINDOWED);
		container.setDisplayMode(800,600, DisplayMode.Opt.WINDOWED);
		container.start();
	}
}
