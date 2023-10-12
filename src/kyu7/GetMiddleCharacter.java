package kyu7;

public class GetMiddleCharacter {

    public static String getMiddle(String word) {

        int index, length;

        if(word.length()%2==0){
            index = word.length() / 2 -1;
            length = 2;
        }

        else {
            index = word.length() / 2;
            length = 1;
        }

        return word.substring(index,index+length);
    }
}
