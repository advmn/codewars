package kyu6;

public class DetectPangram {
    public boolean check(String sentence){

        for (int i = 97; i <= 122; i++)

        {
            if (!sentence.toLowerCase().contains(Character.toString(i))) {
                return false;

            }
        }
        return true;
    }
}
