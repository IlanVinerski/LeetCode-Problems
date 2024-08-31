class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<Character>[] rowSet = new HashSet[9];
        HashSet<Character>[] columnSet = new HashSet[9];
        HashSet<Character>[] boxSet = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rowSet[i] = new HashSet<>();
            columnSet[i] = new HashSet<>();
            boxSet[i] = new HashSet<>();
        }

        for (int c = 0; c < 9; c++) {
            for (int r = 0; r < 9; r++) {
                if (board[c][r] == '.') continue;
                var boxIndex = (r / 3) * 3 + (c / 3);
                var value = Character.valueOf(board[c][r]);
                if (rowSet[r].contains(value) ||
                        columnSet[c].contains(value) ||
                        boxSet[boxIndex].contains(value)
                ) return false;

                rowSet[r].add(value);
                columnSet[c].add(value);
                boxSet[boxIndex].add(value);
            }
        }
        return true;
    }
}