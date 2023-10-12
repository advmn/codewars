package kyu8;

public class ReplaceVowelToExclamationMarkInSentence {
    public static String replace(final String s) {
        return s.replaceAll("[aeiouAEIOU]" , "!");
    }
}
