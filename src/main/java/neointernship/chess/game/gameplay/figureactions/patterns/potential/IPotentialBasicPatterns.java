package neointernship.chess.game.gameplay.figureactions.patterns.potential;

import neointernship.chess.game.model.figure.piece.Figure;
import neointernship.chess.game.model.playmap.field.IField;

import java.util.ArrayList;

public interface IPotentialBasicPatterns {
    ArrayList<IField> getDiagonalFields(final Figure figure);

    ArrayList<IField> getHorizonVerticalFields(final Figure figure);

    ArrayList<IField> getKnightFields(final Figure figure);

    ArrayList<IField> getPawnFields(final Figure figure);

    ArrayList<IField> getKingFields(final Figure figure);
}
