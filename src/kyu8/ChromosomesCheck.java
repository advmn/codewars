package kyu8;

public class ChromosomesCheck {

    public static String chromosomeCheck(String sperm) {

        if ( sperm.contains("Y") ) {

            return "Congratulations! You're going to have a son." ;}

        return "Congratulations! You're going to have a daughter.";

    }
}
