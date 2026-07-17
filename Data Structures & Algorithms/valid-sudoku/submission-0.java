class Solution {
    public boolean isValidSudoku(char[][] board) 
    {
        HashSet<Character>[] row=new HashSet[9];
        HashSet<Character>[] col=new HashSet[9];
        HashSet<Character>[] box=new HashSet[9];

        for(int i=0;i<9;i++)
        {
            row[i]=new HashSet<>();
            col[i]=new HashSet<>();
            box[i]=new HashSet<>();
        }        
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                  continue;
                else
                {
                    int boxnum=(i/3)*3+(j/3);
                    char c=board[i][j];
                    if(row[i].contains(c)  || col[j].contains(c) || box[boxnum].contains(c))
                    {
                        return false;
                    }
                    else
                    {
                        row[i].add(c);
                        col[j].add(c);
                        box[boxnum].add(c);
                    }
                }
                
            }
        }
        return true;
    }
}
