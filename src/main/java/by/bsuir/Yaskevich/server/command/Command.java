package by.bsuir.Yaskevich.server.command;

import by.bsuir.Yaskevich.server.command.exception.CommandException;

public interface Command {
    String complete(Object caller, String request) throws CommandException;
}
