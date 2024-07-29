public class WithoutDuplicate {
 public static void main(String args[])
    {
        int a[]={1,2,3,1,2};
        int b=0;
        public int nums(int a[])
        for(int i=0;i<a.length;i++){
            b=b^a[i];
        }
        System.out.println(b);
    }
    
}
