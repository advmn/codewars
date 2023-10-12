package kyu8;

public class WillBeThereEnoughSpace {
    public static int enough(int cap, int on, int wait){

        return cap>=on+wait ? 0 : -cap+(on+wait);
    }
}
