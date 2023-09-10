package ru.aberezhnoy.arrayService.impl;

import ru.aberezhnoy.arrayService.UserPrompt;

import java.util.Scanner;

public class UserPromptImpl implements UserPrompt {
    private final Scanner scanner;
    private static UserPrompt instance;

    private UserPromptImpl() {
        this.scanner = new Scanner(System.in);
    }

    public static UserPrompt getInstance() {
        if (instance == null) {
            instance = new UserPromptImpl();
        }
        return instance;
    }

    @Override
    public String[] getSrcArray() {
        System.out.print("Enter array size: ");
        String[] srcArray = new String[scanner.nextInt()];
        for (int i = 0; i < srcArray.length; i++) {
            System.out.printf("Enter %d string: ", i + 1);
            srcArray[i] = scanner.next();
        }
        scanner.close();
        return srcArray;
    }
}
