package snowing;

import java.util.Random;

import snowing.SnowFrame.SnowCanvas;

public class Snow extends Thread {
	int x;
	int y;
	Random randon = new Random();
	private SnowCanvas snowCanvas;

	public Snow(SnowCanvas snowCanvas) {
		this.snowCanvas=snowCanvas;
		x = randon.nextInt(800);
		y = randon.nextInt(600);
	}

	@Override
	public void run() {
		while (true) {
			x += randon.nextInt(3) - 1;
			y += 1;
			snowCanvas.repaint();
			try {
				sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(y==600) {
				y=0;
			}
		}
	}
}
