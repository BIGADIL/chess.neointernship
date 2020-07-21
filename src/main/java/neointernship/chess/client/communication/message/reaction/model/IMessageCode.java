package neointernship.chess.client.communication.message.reaction.model;

import neointernship.chess.client.communication.message.IMessage;

import java.io.BufferedReader;
import java.io.BufferedWriter;

public interface IMessageCode {
    void execute(final IMessage message, final BufferedReader in, final BufferedWriter out) throws Exception;
}
