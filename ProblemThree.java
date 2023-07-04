import java.util.Scanner;

public class ProblemThree {
   public static void reverse(String str)
    {
        if ((str==null)||(str.length() <= 1))
           System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }
    public static void main(String[] args)
    {  Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ProblemThree obj = new ProblemThree();
        obj.reverse(str);
    }   
}
