import java.util.*;

public class Main {

    public static void main(String[] args) {

        int num = 8;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf(factorial);
    }
}
