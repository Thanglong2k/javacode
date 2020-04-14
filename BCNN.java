//tìm BCNN
import java.util.Scanner;

public class BCNN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap a:");
        int a= scanner.nextInt();
        System.out.println("nhap b:");
        int b= scanner.nextInt();
        int s=0;
        int t=a*b;
        int max;
        if(a>b) max=a;
        else max=b;
        for(int i=max;i<=t;i++)
        {
            if(i%a==0&&i%b==0)
            {
                s=i;
                break;
            }
        }
        System.out.println("\nBCNN của "+a+" và "+b+" là: "+s);
    }
}
