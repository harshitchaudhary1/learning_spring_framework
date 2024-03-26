package com.learningspring.learnspringframework;

import com.learningspring.learnspringframework.game.GameRunner;
import com.learningspring.learnspringframework.game.MarioGame;
import com.learningspring.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {

		var game = new MarioGame();
	
//		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
