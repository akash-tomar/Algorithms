package _2048;

import java.util.HashMap;

public class TwoZeroFourEight {

	int[][] matrix=new int[4][4];
	HashMap<Integer, Boolean> vacantPlaces=new HashMap<Integer, Boolean>();

	public TwoZeroFourEight() {

		//----------Set all boxes to empty--------
		for(int i=0;i<16;i++) {
			vacantPlaces.put(i, true);
		}

		//------Generate two random numbers to start the game with--------
		for(int i=0;i<2;i++) {
			int pos=newTilePos();
			int value=newValueGen();
			placeTheTile(pos,value);
		}
		printBoard();
	}

	int newTilePos() {
		int rand;
		do {
			rand = (int)(16*Math.random());
		} while(!vacantPlaces.get(rand));
		return rand;
	}

	int newValueGen() {
		double rand = Math.random();
		if(rand<0.9) {
			return 2;
		}
		return 4;
	}

	void placeTheTile(int pos,int value) {
		vacantPlaces.put(pos, false);
		switch(pos) {
		case 0:
			matrix[0][0]=value;
			break;
		case 1:
			matrix[0][1]=value;
			break;
		case 2:
			matrix[0][2]=value;
			break;
		case 3:
			matrix[0][3]=value;
			break;
		case 4:
			matrix[1][0]=value;
			break;
		case 5:
			matrix[1][1]=value;
			break;
		case 6:
			matrix[1][2]=value;
			break;
		case 7:
			matrix[1][3]=value;
			break;
		case 8:
			matrix[2][0]=value;
			break;
		case 9:
			matrix[2][1]=value;
			break;
		case 10:
			matrix[2][2]=value;
			break;
		case 11:
			matrix[2][3]=value;
			break;
		case 12:
			matrix[3][0]=value;
			break;
		case 13:
			matrix[3][1]=value;
			break;
		case 14:
			matrix[3][2]=value;
			break;
		case 15:
			matrix[3][3]=value;
			break;
		}
	}

	public void moveUp() {
		//------Lets join the tiles-------
		boolean newTile=false;
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				if(matrix[i][j]!=0) {
					for(int k=i+1;k<4;k++) {
						if(matrix[k][j]!=0 && matrix[k][j]!=matrix[i][j]) {
							break;
						}else if(matrix[i][j]!=0 && matrix[i][j]==matrix[k][j]) {
							matrix[i][j]*=2;
							matrix[k][j]=0;
							newTile=true;
							break;
						}
					}
				}
			}
		}

		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				if(matrix[i][j]==0) {
					for(int k=i+1;k<4;k++) {
						if(matrix[k][j]!=0) {
							matrix[i][j]=matrix[k][j];
							matrix[k][j]=0;
							break;
						}
					}
				}
			}
		}

		//-----now lets see which places are now left vacant--------
		int count=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(matrix[i][j]!=0)
					vacantPlaces.put(count, false);
				else 
					vacantPlaces.put(count, true);
				count++;
			}
		}

		//------Now finally lets create one additional tile-------
		if(newTile)
			for(int i=0;i<16;i++) {
				if(vacantPlaces.get(i)) {
					int pos=newTilePos();
					int value=newValueGen();
					placeTheTile(pos,value);
					break;
				}
			}



	}

	void moveDown() {
		//------Lets join the tiles-------
		for(int i=3;i>=1;i--) {
			for(int j=3;j>=0;j--) {
				if(matrix[i][j]!=0) {
					for(int k=i-1;k>=0;k--) {
						if(matrix[k][j]!=0 && matrix[k][j]!=matrix[i][j]) {
							break;
						}else if(matrix[i][j]!=0 && matrix[i][j]==matrix[k][j]) {
							matrix[i][j]*=2;
							matrix[k][j]=0;
							break;
						}
					}
				}
			}
		}

		for(int i=3;i>=0;i--) {
			for(int j=3;j>=0;j--) {
				if(matrix[i][j]==0) {
					for(int k=i-1;k>=0;k--) {
						if(matrix[k][j]!=0) {
							matrix[i][j]=matrix[k][j];
							matrix[k][j]=0;
							break;
						}
					}
				}
			}
		}

		//-----now lets see which places are now left vacant--------
		int count=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(matrix[i][j]!=0)
					vacantPlaces.put(count, false);
				else 
					vacantPlaces.put(count, true);
				count++;
			}
		}

		//------Now finally lets create one additional tile-------
		for(int i=0;i<16;i++) {
			if(vacantPlaces.get(i)) {
				int pos=newTilePos();
				int value=newValueGen();
				placeTheTile(pos,value);
				break;
			}
		}
	}

	void moveLeft() {
		//------Lets join the tiles-------
		for(int j=0;j<3;j++) {
			for(int i=0;i<4;i++) {
				if(matrix[i][j]!=0) {
					for(int k=j+1;k<4;k++) {
						if(matrix[i][k]!=0 && matrix[i][k]!=matrix[i][j]) {
							break;
						}else if(matrix[i][j]!=0 && matrix[i][j]==matrix[i][k]) {
							matrix[i][j]*=2;
							matrix[i][k]=0;
							break;
						}
					}
				}
			}
		}

		for(int j=0;j<3;j++) {
			for(int i=0;i<4;i++) {
				if(matrix[i][j]==0) {
					for(int k=j+1;k<4;k++) {
						if(matrix[i][k]!=0) {
							matrix[i][j]=matrix[i][k];
							matrix[i][k]=0;
							break;
						}
					}
				}
			}
		}

		//-----now lets see which places are now left vacant--------
		int count=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(matrix[i][j]!=0)
					vacantPlaces.put(count, false);
				else 
					vacantPlaces.put(count, true);
				count++;
			}
		}

		//------Now finally lets create one additional tile-------
		for(int i=0;i<16;i++) {
			if(vacantPlaces.get(i)) {
				int pos=newTilePos();
				int value=newValueGen();
				placeTheTile(pos,value);
				break;
			}
		}
	}

	void moveRight() {
		//------Lets join the tiles-------
		for(int j=3;j>=1;j--) {
			for(int i=3;i>=0;i--) {
				if(matrix[i][j]!=0) {
					for(int k=j-1;k>=0;k--) {
						if(matrix[i][k]!=0 && matrix[i][k]!=matrix[i][j]) {
							break;
						}else if(matrix[i][j]!=0 && matrix[i][j]==matrix[i][k]) {
							matrix[i][j]*=2;
							matrix[i][k]=0;
							break;
						}
					}
				}
			}
		}

		for(int j=3;j>=1;j--) {
			for(int i=3;i>=0;i--) {
				if(matrix[i][j]==0) {
					for(int k=j-1;k>=0;k--) {
						if(matrix[i][k]!=0) {
							matrix[i][j]=matrix[i][k];
							matrix[i][k]=0;
							break;
						}
					}
				}
			}
		}

		//-----now lets see which places are now left vacant--------
		int count=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(matrix[i][j]!=0)
					vacantPlaces.put(count, false);
				else 
					vacantPlaces.put(count, true);
				count++;
			}
		}

		//------Now finally lets create one additional tile-------
		for(int i=0;i<16;i++) {
			if(vacantPlaces.get(i)) {
				int pos=newTilePos();
				int value=newValueGen();
				placeTheTile(pos,value);
				break;
			}
		}
	}

	boolean isGameFinished() {
		for(int i=0;i<16;i++) {
			if(vacantPlaces.get(i)) {
				return false;
			}
		}

		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				if(matrix[i][j]!=0) {
					for(int k=i+1;k<4;k++) {
						if(matrix[k][j]!=0 && matrix[k][j]!=matrix[i][j]) {
							break;
						}else if(matrix[i][j]!=0 && matrix[i][j]==matrix[k][j]) {
							return false;
						}
					}
				}
			}
		}

		for(int i=3;i>=1;i--) {
			for(int j=3;j>=0;j--) {
				if(matrix[i][j]!=0) {
					for(int k=i-1;k>=0;k--) {
						if(matrix[k][j]!=0 && matrix[k][j]!=matrix[i][j]) {
							break;
						}else if(matrix[i][j]!=0 && matrix[i][j]==matrix[k][j]) {
							return false;
						}
					}
				}
			}
		}

		for(int j=0;j<3;j++) {
			for(int i=0;i<4;i++) {
				if(matrix[i][j]!=0) {
					for(int k=j+1;k<4;k++) {
						if(matrix[i][k]!=0 && matrix[i][k]!=matrix[i][j]) {
							break;
						}else if(matrix[i][j]!=0 && matrix[i][j]==matrix[i][k]) {
							return false;
						}
					}
				}
			}
		}

		for(int j=3;j>=1;j--) {
			for(int i=3;i>=0;i--) {
				if(matrix[i][j]!=0) {
					for(int k=j-1;k>=0;k--) {
						if(matrix[i][k]!=0 && matrix[i][k]!=matrix[i][j]) {
							break;
						}else if(matrix[i][j]!=0 && matrix[i][j]==matrix[i][k]) {
							return false;
						}
					}
				}
			}
		}

		return true;
	}

	void printBoard() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(" "+matrix[i][j]+" ");
			}
			System.out.println();
		}
	}



}
