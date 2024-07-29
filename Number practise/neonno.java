import java.util.*;
public class neonno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        int n=sc.nextInt();
        System.out.println((n%9)==0?"9":n%9);
    }    
}
