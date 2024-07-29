import java.util.*;
public class sumofno {
    public static void main(String args[])
    {
        Scanner ss= new Scanner(System.in);
        System.out.println("Enter sum of no:");
        int n=ss.nextInt();
        int a=0;
        for(int i=0;i<=n;i++)
        {
            a=(n*(n+1))/2;
         }
        System.out.print("The value is: "+a);
    }
}
