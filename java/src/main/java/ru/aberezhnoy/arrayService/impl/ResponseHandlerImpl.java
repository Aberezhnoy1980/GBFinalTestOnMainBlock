package ru.aberezhnoy.arrayService.impl;

import ru.aberezhnoy.arrayService.ResponseHandler;
import ru.aberezhnoy.factory.Factory;

import java.util.Arrays;

public class ResponseHandlerImpl implements ResponseHandler {
    private final String[] srcArray;
    private final String[] dstArray;
    private static ResponseHandler instance;

    private ResponseHandlerImpl() {
        this.srcArray = Factory.getUserPrompt().getSrcArray();
        this.dstArray = Factory.getArrayHandler().getDstArray(srcArray, srcArray.length - 1);
    }

    public static ResponseHandler getInstance() {
        if (instance == null) {
            instance = new ResponseHandlerImpl();
        }
        return instance;
    }

    @Override
    public void getResult() {
        System.out.println("in source array: " + Arrays.toString(srcArray) + " strings less than four characters long: " + Arrays.toString(dstArray));
    }
}
