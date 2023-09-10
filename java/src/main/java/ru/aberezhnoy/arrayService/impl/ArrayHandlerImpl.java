package ru.aberezhnoy.arrayService.impl;

import ru.aberezhnoy.arrayService.ArrayHandler;

import java.util.function.Predicate;

public class ArrayHandlerImpl implements ArrayHandler {
    private int dstArraySize;
    private static ArrayHandler instance;
    private final Predicate<Integer> srcArrayLength;
    private final Predicate<String> strLength;

    private ArrayHandlerImpl() {
        this.dstArraySize = 0;
        this.srcArrayLength = (i -> i < 0);
        this.strLength = (str -> str.length() <= 3);
    }

    public static ArrayHandler getInstance() {
        if (instance == null) {
            instance = new ArrayHandlerImpl();
        }
        return instance;
    }

    @Override
    public String[] getDstArray(String[] srcArray, int srcIdx) {
        if (srcArrayLength.test(srcIdx)) {
            if (dstArraySize == 0) throw new RuntimeException("No words found");
            String[] dstArray = new String[dstArraySize];
            for (int i = 0, j = 0; i < srcArray.length; i++) {
                if (strLength.test(srcArray[i])) {
                    dstArray[j++] = srcArray[i];
                }
            }
            return dstArray;
        } else if (strLength.test(srcArray[srcIdx])) {
            dstArraySize++;
        }
        return getDstArray(srcArray, srcIdx - 1);
    }
}
