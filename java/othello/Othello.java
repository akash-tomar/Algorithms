package othello;

import java.util.Scanner;

public class Othello {

	public static Player getPlayer(int playerNumber) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter player "+playerNumber+" name :");
		String name=s.nextLine();
		System.out.println("Enter player "+playerNumber+" symbol :");
		char symbol=s.nextLine().charAt(0);
		return new Player(name, symbol);
	}

	public static void start() {
		Scanner s =new Scanner(System.in);
		Player p1,p2;
		Board b;
		p1=getPlayer(1);
		while(true) {
			p2=getPlayer(2);
			if(p1.symbol!=p2.symbol) {
				break;
			} else {
				System.out.println("Both players cannot have same symbol!");
			}
		}
		b=new Board(p1.symbol, p2.symbol);
		boolean firstPlayerTurn=true;
		b.print();
		while(b.gameStatus()) {
			Player currentPlayer;
			if(firstPlayerTurn)
				currentPlayer=p1;
			else
				currentPlayer=p2;
			System.out.println("Enter x coordinate :");
			int x=s.nextInt();
			System.out.println("Enter y coordinare : ");
			int y=s.nextInt();
			b.move(x,y,currentPlayer.symbol);
			b.print();
		}
		
		int result=b.gameStatus();
		if(result==1) {
			System.out.println(p1.name+" won!");
		}
		else if(result==2) {
			System.out.println(p2.name+" won!");
		}
		else {
			System.out.println("Tie!");
		}


	}

	public static void main(String[] args) {
		start();
	}
}
