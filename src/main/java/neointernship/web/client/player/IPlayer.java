package neointernship.web.client.player;

import neointernship.chess.game.model.answer.IAnswer;
import neointernship.chess.game.model.enums.Color;
import neointernship.chess.game.model.mediator.IMediator;
import neointernship.chess.game.model.playmap.board.IBoard;

public interface IPlayer {
    void init(final IMediator mediator, final IBoard board, final Color color);
    IAnswer getAnswer();
    String getName();
    Color getColor();
    void setMediator(IMediator mediator);
    IMediator getMediator();
}