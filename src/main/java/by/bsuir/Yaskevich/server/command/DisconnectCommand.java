package by.bsuir.Yaskevich.server.command;

import by.bsuir.Yaskevich.server.command.exception.CommandException;
import by.bsuir.Yaskevich.server.model.AuthType;
import by.bsuir.Yaskevich.server.service.ServiceFactory;

public class DisconnectCommand implements Command {
    public String complete(Object caller, String request) throws CommandException {
        ServiceFactory.getInstance().getAuthService().setAuthType(caller, AuthType.UNAUTH);
        return "Bye bye!";
    }
}
