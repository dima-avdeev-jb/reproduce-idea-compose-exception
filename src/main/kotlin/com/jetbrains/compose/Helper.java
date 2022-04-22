package com.jetbrains.compose;

public class Helper {
    public static boolean checkCondition(IllegalStateException exception) {
        for (StackTraceElement stackTraceElement : exception.getStackTrace()) {
            if (stackTraceElement.getMethodName().contains("getContentSize")) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}

