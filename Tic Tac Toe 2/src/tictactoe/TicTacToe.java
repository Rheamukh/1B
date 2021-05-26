package tictactoe;


/**
 * 
 * @author 
 *
 */

public class TicTacToe {
	
	    private String[][] board;
	    private int turn;
	    
	    /**
	     * Creates a new Tic Tac Toe board.  Instantiates the 3x3 board
	     * with all dashes or other place holders.
	     * 
	     * initializes number of turns taken to equal 0
	     */
	    
	    public TicTacToe() {
	    	board = new String[3][3];
	        for(int row = 0; row < board.length; row++){
	            for(int col = 0; col < board[0].length; col++){
	                board[row][col] = "-"; 
	            }
	        }
	    }
	    
	    
	   
	    /**
	     * Getter method for current turn number
	     * @return number of turns taken
	     */
	    
	    public int getTurn() {
	    	return turn;
	    }
	    
	    
	    
	   
	   /**
	    * This method prints out the board array on to the console
	    */
	    
	   public void printBoard()
	   {
	       System.out.println(board[0][0] + " " + board[0][1] + " " + board[0][2] + " ");
	       System.out.println(board[1][0] + " " + board[1][1] + " " + board[1][2] + " ");
	       System.out.println(board[2][0] + " " + board[2][1] + " " + board[2][2] + " ");
	   }
	   
	   /**
	    * 
	    * This method determines if space row, col is an available space to choose
	    * @return: true if the board[row][col] is available, false otherwise
	    * 
	    */
	   
	   public boolean pickLocation(int row, int col)
	   {
		   if(board[row][col].equals("-") && !board[row][col].equals("X") && !board[row][col].equals("O")){
	           return true;
	       }
	       return false;
	   }
	   
	   /**
	    * 
	    * This method places an X or O at board[row][col] based on the int turn
	    */
	   
	   public void takeTurn(int row, int col)
	   {
		   if(pickLocation(row, col)){
	           if(turn % 2 == 1){
	               board[row][col] = "O";
	           }
	           else if(turn % 2 == 0){
	               board[row][col] = "X";
	           }
	       }
	       turn++;
	   }
	   
	   /**
	    * 
	    * This method checks if any row has all X's or all Os
	    * @return: true if there is a row with all the same value, false otherwise. 
	    */
	   
	   
	   public boolean checkRow()
	   {
		   for(int row = 0; row < board.length; row++){
	           int xSum = 0;
	           int oSum = 0;
	           for(int col = 0; col < board[row].length; col++){
	               if(board[row][col].equals("X")){
	                   xSum++;
	               }
	               else if(board[row][col].equals("O")){
	                   oSum++;
	               }
	           }
	           if(xSum == 3 || oSum == 3){
	               return true;
	           }
	       }
	       return false;
	   }
	   
	   
	   /**
	    * 
	    * This method checks if any col has all X's or all Os
	    * @return: true if there is a col with all the same value, false otherwise. 
	    */
	   
	   public boolean checkCol()
	   {
		   for(int col = 0; col < board[0].length; col++){
	           int xSum = 0;
	           int oSum = 0;
	           for(int row = 0; row < board.length; row++){
	                if(board[row][col].equals("X")){
	                   xSum++;
	                }
	                else if(board[row][col].equals("O")){
	                   oSum++;
	                }
	           }
	           if(xSum == 3 || oSum == 3){
	               return true;
	           }
	        }
	       return false;
	   }
	   
	   
	   /**
	    * 
	    * This method checks if either diagonal has all X's or all Os
	    * @return: true if either diagonal with all the same value, false otherwise. 
	    */
	   
	   public boolean checkDiag()
	   {
		   String top = board[0][0];
	        if(!top.equals("-")){
	            if(top.equals(board[1][1]) && top.equals(board[2][2])){
	                return true;
	            }
	        }
	        
	        String topR = board[0][2];
	        if(!topR.equals("-")){
	            if(topR.equals(board[1][1]) && topR.equals(board[2][0])){
	                return true;
	            }
	        }
	        
	        return false;
	   }
	   
	   /**
	    * 
	    * This method checks if a player has won the game via a row, col, or diagonal
	    * @return: true if the game is won, false otherwise
	    */
	   public boolean checkWin()
	   {
		   if(checkRow() || checkCol() || checkDiag()){
	           return true;
	       }
	       return false;
	   }

}
