import java.util.Scanner;

public class ProblemTwo {
   
    public static int fact(int n){
        if (n==1) {
            return 1;
         }
         int secans=fact(n-1);
         return secans*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ans= fact(n);
        System.out.println(ans);
    }
}