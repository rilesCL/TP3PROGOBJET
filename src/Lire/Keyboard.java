package Lire;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Keyboard {
    private static String derniereEntree;
    private static BufferedReader keyboard = bufferedReader();
    private static boolean erreur = false;
    private static boolean finEntree = false;

    Keyboard() {
    }

    private static BufferedReader bufferedReader() {
        BufferedReader var0 = null;

        try {
            var0 = new BufferedReader(new InputStreamReader(System.in, "UTF8"));
        } catch (IOException var2) {
            var2.printStackTrace();
        }

        return var0;
    }

    private static boolean readLine() {
        try {
            erreur = false;
            derniereEntree = keyboard.readLine();
            if (derniereEntree == null) {
                finEntree = true;
                derniereEntree = "";
            }

            return true;
        } catch (IOException var1) {
            System.err.println("Erreur de lecture clavier");
            erreur = true;
            return false;
        }
    }

    public static boolean error() {
        return erreur;
    }

    public static boolean isEof() {
        return finEntree;
    }

    public static int readInt() {
        if (readLine()) {
            try {
                return Integer.parseInt(derniereEntree);
            } catch (NumberFormatException var1) {
                erreur = true;
            }
        }

        return 0;
    }

    public static float readFloat() {
        if (readLine()) {
            try {
                return Float.parseFloat(derniereEntree);
            } catch (NumberFormatException var1) {
                erreur = true;
            }
        }

        return 0.0F;
    }

    public static double readDouble() {
        if (readLine()) {
            try {
                return Double.parseDouble(derniereEntree);
            } catch (NumberFormatException var1) {
                erreur = true;
            }
        }

        return 0.0;
    }

    public static char readChar() {
        if (readLine()) {
            if (derniereEntree.length() == 1) {
                return derniereEntree.charAt(0);
            }

            erreur = true;
        }

        return '\u0000';
    }

    public static String readString() {
        if (readLine()) {
            return derniereEntree;
        } else {
            erreur = true;
            return "";
        }
    }
}
