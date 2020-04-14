//liệt kê các số nguyên tố trước n
import java.util.Scanner;
public class SoNguyenTo{

    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập n:");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(KTSNT(i)==true) System.out.println(i);
        }
    }
    public static boolean KTSNT(int n){
        if(n<2)     return false;
        for(int i =2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)  return false;
        }
        return true;
    }
}
