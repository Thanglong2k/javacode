//phân tích 1 số thành thừa số nguyên tố
import java.util.Scanner;
public class PhanTichTSNT {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số n:");
        int n=scanner.nextInt();
        int dem;
        System.out.print(n+"=");
        for(int i=2;i<=n;i++)
        {
            dem=0;
            while(n%i==0)
            {
                dem++;
                n=n/i;
            }
            if(dem!=0)
            {
                System.out.print(i);
                if(dem>1)
                    System.out.print("^"+dem);
                if(n>i)
                    System.out.print("*");
            }
        }
    }
}
