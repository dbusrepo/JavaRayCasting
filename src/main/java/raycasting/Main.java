package raycasting;

import base.graphics.app.GraphApp;
import base.graphics.app.Settings;

public class Main extends GraphApp {

	public Main() throws Exception {
		Settings settings = new Settings();
		settings.title = "Java Ray Casting";
		start(settings);
	}

	public static void main(String[] args) throws Exception {
		new Main();
	}

	@Override
	public void initApp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateApp(long elapsedTime) {
		// TODO Auto-generated method stub

	}

	@Override
	public void finishOffApp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printFinalStatsApp() {
		// TODO Auto-generated method stub

	}
}
