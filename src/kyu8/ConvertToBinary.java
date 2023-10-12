package kyu8;

public class ConvertToBinary {
    public static int toBinary(int n) {

        String binary = Integer.toBinaryString(n);

        return Integer.parseInt(binary, 10);
    }

}
