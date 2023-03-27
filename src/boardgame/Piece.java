package boardgame;

public abstract class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board){
        this.board = board;
        position = null;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getColumn()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove(){
        boolean[][] mat = possibleMoves();
        for(int x =0; x<mat.length; x++){
            for (int y = 0; y < mat.length; y++){
                if(mat[x][y]) return true;

            }
        }
        return false;
    }

    protected Board getBoard(){
        return this.board;
    }
}
