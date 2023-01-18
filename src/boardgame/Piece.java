package boardgame;

public class Piece {

    // Posição de matriz
    protected  Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        // A posição da peça recem criada será como nula,
        // para informar que não foi colocada no tabuleiro ainda
        position = null;
    }

    protected Board getBoard() {
        return board;
    }
}
