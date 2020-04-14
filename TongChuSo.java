//tính tổng các chữ số trong 1 số
import java.util.Scanner;
public class TongChuSo {
    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập số:");
        int a= scanner.nextInt();
        int s=0;
        while(a>0)
        {
            s+=a%10;
            a=a/10;
        }
        System.out.println("\n Tổng các chữ số trong số trên là: "+s);
    }
}
