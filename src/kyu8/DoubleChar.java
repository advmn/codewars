package kyu8;

public class DoubleChar {
    public static String doubleChar(String s){

        return s.replaceAll(".", "$0$0");
    }
}
