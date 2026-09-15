package lab1;

public class Main {
    static void main() {
        FizzBuzz.doFizzBuzz(5);

        int i = 1;
//        for (int i = 1; i <= 100; i++) {
        while (i <= 100){
            FizzBuzz.doFizzBuzz(i);
            i++;
        }
    }
}

