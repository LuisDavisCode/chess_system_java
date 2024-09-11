package boardgame;

public class Piece {

    protected Piece piece;
    private Board board;
    public Position position;

    public Piece(Board board) {
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }

}
