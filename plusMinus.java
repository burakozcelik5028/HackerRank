import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int i = arr.length;
        double neg = 0;
        double pos = 0;
        double zero = 0;
        int flag = 0;
        while(flag < i){
            if(arr[flag] < 0){
                neg += 1;
            } else if(arr[flag] == 0){
                zero += 1;
            } else {
                pos += 1;
            }
            flag += 1;
        }
        System.out.print(String.format("%.6g%n", pos/i));
        System.out.print(String.format("%.6g%n", neg/i));
        System.out.print(String.format("%.6g%n", zero/i));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
