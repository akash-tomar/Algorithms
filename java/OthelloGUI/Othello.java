package OthelloGUI;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import ticTacToe.Player;

public class Othello extends JFrame implements ActionListener{
	JPanel[] row=new JPanel[8];
	JButton[] button=new JButton[64];
	Font font = new Font("Times new Roman", Font.BOLD, 14);
	JTextArea display = new JTextArea(1,10);
	Dimension displayDimension = new Dimension(100, 25);
	Dimension regularDimension = new Dimension(45, 40);
	Player currentPlayer = null;

	public static final int PLAYER1_WON = 1;
	public static final int PLAYER2_WON = 2;
	public static final int DRAW = 3;
	public static final int NOT_FINISHED = 4;
	Boolean isFirstPlayer=true;
	Player p1 = getPlayer(1);
	Player p2 = getPlayer(2);


	public othello() {
		super("Othello");
		setDesign();
		setSize(250, 270);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(4,4);
		setLayout(grid);


		FlowLayout f1 = new FlowLayout(FlowLayout.CENTER);
		FlowLayout f2 = new FlowLayout(FlowLayout.CENTER,1,1);


		// each row initialized to a jPanel
		for(int i = 0; i < 4; i++) 
			row[i] = new JPanel();


		// first row set as f1 that will work as a display for the game
		row[0].setLayout(f1);

		// rest rows set to f2 that will serve as buttons of calc.
		for(int i = 1; i < 4; i++)
			row[i].setLayout(f2);

		// button design
		for(int i = 0; i < 9; i++) {
			button[i] = new JButton();
			button[i].setText(" ");
			button[i].setBackground(Color.WHITE);
			button[i].setFont(font);
			button[i].addActionListener(this);
		}


		// display properties
		display.setFont(font);
		display.setEditable(false);
		display.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		display.setPreferredSize(displayDimension);

		// button properties
		for(int i = 0; i < 9; i++)
			button[i].setPreferredSize(regularDimension);


		// associating display with first row
		row[0].add(display);
		add(row[0]);


		// associating rest of the rows with buttons.
		for(int i = 0; i < 3; i++)
			row[1].add(button[i]);

		add(row[1]);

		for(int i = 3; i < 6; i++)
			row[2].add(button[i]);

		add(row[2]);

		for(int i = 6; i < 9; i++)
			row[3].add(button[i]);

		add(row[3]);
		//	start();

		// make visible
		display.setText("Akash's turn");
		for(int i=0;i<9;i++) {
			button[i].setText("");
		}
		setVisible(true);

	}
	

	private void setDesign() {
		try {
			UIManager.setLookAndFeel(
					"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e) {   
		}

	}

	public static Player getPlayer(int playerNumber) {
		String name;
		if(playerNumber==1) {
			name="Akash";
		} else {
			name="Abhishek";
		}
		char symbol;
		if(playerNumber==1) {
			symbol = 'O';
		} else
			symbol = 'X';
		return new Player(name, symbol);
	}	

}