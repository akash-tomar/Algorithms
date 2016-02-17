package _2048;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class GamePlay {

	TwoZeroFourEight newGame = new TwoZeroFourEight();

	public GamePlay() {
		while(!newGame.isGameFinished()) {
			actionPerformed2();
		}
	}
	public void actionPerformed2() {
		Scanner s = new Scanner(System.in);
		char key=s.nextLine().charAt(0);

		if (key == 'w') {
			newGame.moveUp();
		} else if(key == 'a') {
			newGame.moveLeft();
		} else if(key == 'd') {
			newGame.moveRight();
		} else if(key == 's') {
			newGame.moveDown();
		}
		newGame.printBoard();
		if(newGame.isGameFinished()) {
			System.out.println("GAME OVER!!");
		}

	}
}
