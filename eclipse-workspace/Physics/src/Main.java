import java.util.*;
import java.time.*;

public class Main {
	public final double GRAVITY = -9.8;
	public final double XBOUND = 10.0;
	public final double YBOUND = 10.0;
	public final double FRICTION = 0.0001;
	public static boolean simRunning = false;

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int fps = 1; // number of update per second.
		double tickPerSecond = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();

		ArrayList<Particle> particleList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			particleList.add(new Particle());
		}

		// MAIN GAME LOOP
		while (true) {

			now = System.nanoTime();
			delta += (now - lastTime) / tickPerSecond;
			lastTime = now;

			if (delta >= 1) {

				updateGame(particleList);
				delta--;
			}
		}
	}

	static void updateGame(ArrayList<Particle> pList) {
		for (Particle x : pList) {
			System.out.println(x.getyVel());
		}
	}
}
