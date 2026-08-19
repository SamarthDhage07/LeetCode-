class Solution {

    public static boolean search(char[][] board, String word, int count, int i, int j) {
        
        // word complete found
        if(count == word.length()) {
            return true;
        }

        //out of bound 
        if( i<0 || i>=board.length ||
            j<0 || j>=board[0].length) {
                return false;
        }

        //character does not match or already visited
        if(board[i][j] != word.charAt(count) || board[i][j] == '1') {
            return false;
        }

        //mark currrent cell as visited 
        char temp = board[i][j];
        board[i][j] = '1';

        //search in all four direction
        boolean found = search(board,word,count+1,i,j+1) ||
                        search(board,word,count+1,i+1,j) ||
                        search(board,word,count+1,i,j-1) ||
                        search(board,word,count+1,i-1,j) ;
        
        //backtracking step , restore the cell
        board[i][j] =temp;
        return found;
    }

    public boolean exist(char[][] board, String word) {

        // i will check is element is equa
        // if equal good , just mark that place as true because you visited that place 
        // if not equal go down

         for(int i =0;i<board.length;i++) {
            for(int j =0;j<board[0].length;j++) {
                //start searching when the first element found
                if(board[i][j] == word.charAt(0)){
                    if(search(board,word,0,i,j)) {
                        return true;
                    }
                }
            }
        }
        return false;  
    }
}