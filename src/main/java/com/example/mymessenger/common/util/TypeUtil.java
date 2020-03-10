package com.example.mymessenger.common.util;

import java.util.Date;

public class TypeUtil {

    public static byte checkNull(Byte v) {
        return v == null ? 0 : v;
    }

    public static short checkNull(Short v) {
        return v == null ? 0 : v;
    }

    public static int checkNull(Integer v) {
        return v == null ? 0 : v;
    }

    public static long checkNull(Long v) {
        return v == null ? 0L : v;
    }

    public static float checkNull(Float v) {
        return v == null ? 0f : v;
    }

    public static double checkNull(Double v) {
        return v == null ? 0d : v;
    }

    public static boolean checkNull(Boolean v) {
        return v == null ? false : v;
    }

    public static String checkNull(String v) {
        return v == null ? "" : v;
    }

    public static Date checkNull(Date v) {
        return v == null ? new Date(0L) : v;
    }
}
