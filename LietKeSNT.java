//liệt kê n số nguyên tố
import java.util.Scanner;
public class LietKeSNT {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập n:");
        int n=scanner.nextInt();
        int dem=0;
        int i=2;
        while(dem<n) {
             {
                if (SNT(i) == true) {
                    dem++;
                    System.out.println(i);
                }
                i++;
            }
        }
    }
    public static boolean SNT(int t){
        if(t<2)     return false;
        for(int i=2;i<=Math.sqrt(t);i++)
        {
            if(t%i==0)      return false;
        }
        return true;
    }
}
