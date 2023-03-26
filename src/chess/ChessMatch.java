package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch(){
        board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int x=0; x<board.getRows(); x++){
            for(int y=0; y<board.getColumns(); y++){
                mat[x][y] = (ChessPiece) board.piece(x,y);
            }
        }
        return mat;
    }
    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column,row).toPosition());
    }
    private void initialSetup(){
        placeNewPiece('a', 5, new Rook(board, Color.WHITE));
        placeNewPiece('a',2, new King(board, Color.BLACK));
        placeNewPiece('e',1, new King(board, Color.WHITE));
    }
}
