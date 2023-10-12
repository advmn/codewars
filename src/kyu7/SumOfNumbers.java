package kyu7;

public class SumOfNumbers {
    public int GetSum(int a, int b)
    {
        int counter = 0;
        if(a > b){
            while(a >= b){
                counter += b;
                b++;
            }
        }
        else if(a < b){
            while(a <= b){
                counter += a;
                a++;
            }
        }
        else {
            counter = a;
        }
        return counter;
    }
}
