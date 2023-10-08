class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        //check row
        for(char[] row: board){
            boolean[] found = new boolean[n];
            for(char ch: row){
                if(ch=='.')
                    continue;
                if(found[ch-'1']){
                    return false;
                }
                found[ch-'1'] = true;
            }
        }
        
        //check column
        for(int i=0;i<n;i++){
            boolean[] found = new boolean[n];
            for(int j=0;j<n;j++){
                char ch = board[j][i];
                if(ch == '.')
                    continue;
                if(found[ch-'1']){
                    return false;
                }
                found[ch-'1'] = true;
            }
        }
        
        //check each box
        for(int i=0;i<9;i=i+3){
            for(int j=0;j<9;j=j+3){
                boolean[] found = new boolean[n];
                for(int x=0;x<3;x++){
                    for(int y=0;y<3;y++){
                        char ch = board[i+x][j+y];
                        if(ch == '.')
                            continue;
                        if(found[ch-'1'])
                            return false;
                        found[ch-'1'] = true;
                    }
                }
            }
        }
        
        return true;
    }
}