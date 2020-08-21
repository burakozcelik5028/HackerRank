// https://github.com/burakozcelik5028/HackerRank/issues/6
public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        int i = 0;
        int k = 0;
        int l = 1;
        for(;i<n;){
            for(;k<(n-l);){
               System.out.print(" ");
               k++;
            }
            k=0;
            for(;k<l;){
               System.out.print("#");
               k++;
            }
            System.out.print("\n");
            i++;
            l++;
            k=0;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
