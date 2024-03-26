package com.learningspring.learnspringframework;

import com.learningspring.learnspringframework.game.GameRunner;
import com.learningspring.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {

		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}

}
