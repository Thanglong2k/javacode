//tìm số Fibonacci thứ n
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập n:");
        int n= scanner.nextInt();
        int[] a=new int[n+1];
        a[0]=1;a[1]=1;
        for(int i=2;i<=n;i++)
        {
            a[i]=a[i-1] + a[i-2];
        }
        System.out.println(a[n]);
    }

}
