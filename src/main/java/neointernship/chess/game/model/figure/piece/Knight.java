package neointernship.chess.game.model.figure.piece;

import neointernship.chess.game.model.enums.Color;
import neointernship.chess.game.model.figure.Figure;

public class Knight extends Figure {
    public Knight( Color color) {
        super("Knight", 'N', color, (short) 3);
    }
}