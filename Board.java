package HA1507;

public class Board {
	private String[][] board = new String[3][3];
	
	public Board(){
		for(int i = 0; i<3; i++){
			for(int j = 0; j<3; j++){
				board[i][j] = " ";
			}
		}
	}
	
	public void setMark(String mark, int x, int y)throws InvalidPositionExcpetion{
		if(!((x > -1 && x < 3 ) && (y > -1 && y < 3))){
			throw new InvalidPositionExcpetion();
		}
		else{
			board[x][y] = mark;
		}
	}
	
	public boolean hasWinner(){
		
		//Zeilen
		if(board[0][0].equals("X") && board[0][1].equals("X") && board[0][2].equals("X") || board[0][0].equals("O") && board[0][1].equals("O") && board[0][2].equals("O")){
			return true;
		}
		else if(board[1][0].equals("X") && board[1][1].equals("X") && board[1][2].equals("X") || board[1][0].equals("O") && board[1][1].equals("O") && board[1][2].equals("O")){
			return true;
		}
		else if(board[2][0].equals("X") && board[2][1].equals("X") && board[2][2].equals("X") || board[2][0].equals("O") && board[2][1].equals("O") && board[2][2].equals("O")){
			return true;
		}
		//Spalten
		else if(board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("X") || board[0][0].equals("O") && board[1][0].equals("O") && board[2][0].equals("O")){
			return true;
		}
		else if(board[0][1].equals("X") && board[1][1].equals("X") && board[2][1].equals("X") || board[0][1].equals("O") && board[1][1].equals("O") && board[2][1].equals("O")){
			return true;
		}
		else if(board[0][2].equals("X") && board[1][2].equals("X") && board[2][2].equals("X") || board[0][2].equals("O") && board[1][2].equals("O") && board[2][2].equals("O")){
			return true;
		}
		//Diagonalen
		else if(board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X") || board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O")){
			return true;
		}
		else if(board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X") || board[0][2].equals("O") && board[1][1].equals("O") && board[2][0].equals("O")){
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

