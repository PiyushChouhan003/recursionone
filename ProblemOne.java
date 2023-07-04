import java.util.*;
public class ProblemOne {
    public static int sum(int A){
        if (A==0){
            return 0;
        }
        return (A%10) + sum(A/10);

    }
   
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int ans = sum(A);
        System.out.println(ans);
       
       
        
    }
}
