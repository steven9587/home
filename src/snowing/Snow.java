package snowing;

import java.util.Random;

import snowing.SnowFrame.SnowCanvas;

public class Snow extends Thread {
	int x;
	int y;
	Random random = new Random();
	private SnowCanvas snowCanvas;

	public Snow(SnowCanvas snowCanvas) {
		this.snowCanvas=snowCanvas;
		x = random.nextInt(800);
		y = random.nextInt(600);
	}

	@Override
	public void run() {
		for (int i = y; i < 550; i++) {
			x += random.nextInt(3) - 1;
			y+=1;
			snowCanvas.repaint();
			try {
				sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
