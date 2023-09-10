package ru.aberezhnoy.factory;

import ru.aberezhnoy.arrayService.ArrayHandler;
import ru.aberezhnoy.arrayService.ResponseHandler;
import ru.aberezhnoy.arrayService.UserPrompt;
import ru.aberezhnoy.arrayService.impl.ArrayHandlerImpl;
import ru.aberezhnoy.arrayService.impl.ResponseHandlerImpl;
import ru.aberezhnoy.arrayService.impl.UserPromptImpl;

public class Factory {
    public static ArrayHandler getArrayHandler() {
        return ArrayHandlerImpl.getInstance();
    }

    public static UserPrompt getUserPrompt() {
        return UserPromptImpl.getInstance();
    }

    public static ResponseHandler getResponseHandler() {
        return ResponseHandlerImpl.getInstance();
    }
}
