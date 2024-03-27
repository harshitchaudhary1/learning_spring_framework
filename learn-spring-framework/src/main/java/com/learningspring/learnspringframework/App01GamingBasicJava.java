package com.learningspring.learnspringframework;

import com.learningspring.learnspringframework.game.GameRunner;
import com.learningspring.learnspringframework.game.MarioGame;
import com.learningspring.learnspringframework.game.PacmanGame;
import com.learningspring.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {

//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
