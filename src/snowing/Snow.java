package snowing;

import java.util.Random;

public class Snow extends Thread{
	int x;
	int y;
	Random random = new Random();

	public Snow() {
		x = random.nextInt(800);
		y = 0;
	}

	@Override
	public void run() {
		for(int i=0;i<600;i++) {
			x+=random.nextInt(3)-1;
			y+=1;
			System.out.println(new String(new char[x]).replaceAll("/0", " ")+"雪");
		}
		try {
			sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
