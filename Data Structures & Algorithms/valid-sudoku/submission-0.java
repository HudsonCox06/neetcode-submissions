class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Hash set for each row and column
        // Save n x n space by keeping track of both in single data structure

        // 18 hash sets, 9 rows, 9 columns
        List<HashSet<Integer>> rows = new ArrayList<>();
        HashSet<Integer>[] cols = new HashSet[9];
        HashSet<Integer>[] squares = new HashSet[9];

        for(int i = 0; i<9; i++){
            rows.add(new HashSet<Integer>());
            cols[i] = new HashSet<Integer>();
            squares[i] = new HashSet<Integer>();
        }


        for(int r = 0; r < 9; r++){
            for(int c = 0; c < 9; c++){
                if(board[r][c] == '.'){
                    continue;
                }
                int num = board[r][c] - '0';
            
                if(!rows.get(r).contains(num)){
                    rows.get(r).add(num);
                } else{
                    return false;
                }

                if(!cols[c].contains(num)){
                    cols[c].add(num);
                } else{
                    return false;
                }

                int sqrIndex = (r / 3) * 3 + (c / 3);
                if(!squares[sqrIndex].contains(num)){
                    squares[sqrIndex].add(num);
                } else{
                    return false;
                }
            }
        }

        return true;
    }
}
