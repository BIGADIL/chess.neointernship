package neointernship.chess.game.model.figure.piece;

import neointernship.chess.game.model.enums.Color;
import neointernship.chess.game.model.figure.Figure;

public class Rook extends Figure {
    public Rook(Color color) {
        super("Rook", 'R', color, (short) 5);
    }
}