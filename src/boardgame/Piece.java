package boardgame;

public abstract class Piece {

    // Posição de matriz
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        // A posição da peça recem criada será como nula,
        // para informar que não foi colocada no tabuleiro ainda
        position = null;
    }

    // Método abstrato para ser implementado nas subclasses
    public abstract boolean[][] possibleMoves();

    // Método concreto que recebe uma possível implementação do método
    // abstrato possibleMoves() para verificar os possíveis movimentos
    public boolean posibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    // Verifica se a peça está presa ou não
    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }


    protected Board getBoard() {
        return board;
    }
}
