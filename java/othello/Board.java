package othello;

import java.util.ArrayList;

public class Board {
	private char[][] board;
	private final char player1Symbol;
	private final char player2Symbol;
	public Board(char player1Symbol,char player2Symbol) {
		this.player1Symbol=player1Symbol;
		this.player2Symbol=player2Symbol;
		board=new char[8][8];
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				board[i][j]='-';
			}
		}
		board[3][3]=player1Symbol;
		board[3][4]=player2Symbol;
		board[4][3]=player2Symbol;
		board[4][4]=player1Symbol;
	}
	
	public int gameStatus() {
		
	}
	
	
	public void print() {
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	
	public void move(int x,int y,char symbol) {
		ArrayList<Coordinates> possibleMoves = new ArrayList<Coordinates>();
		char currentPlayerSymbol=symbol;
		char otherPlayerSymbol=' ';
		if(player1Symbol==symbol) {
			otherPlayerSymbol=player2Symbol;
		} else {
			otherPlayerSymbol=player1Symbol;
		}
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(board[i][j]==symbol) {
					
					for(int hor=i+1;hor<8;hor++) {
						if(board[i][j]!=board[hor][j] && board[hor][j]!=) {
							continue;
						} else if(board[i][j]==board[hor][j]) {
							break;
						} else if()
					}
					
					
					
					
					
					
					
					
					
					
				}
			}
		}
	}
	
}
