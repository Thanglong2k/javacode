package java_input_output_console;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class NhapTuFile {
    public static void main(String[] args) throws IOException {
        int b,c,d,e;
        Scanner a=new Scanner(Paths.get("input.txt"),"UTF-8");//mở file
        //Scanner a=new Scanner(new File("input.txt"));//mở file

//        b=a.nextInt();
//        c=a.nextInt();
//        d=a.nextInt();
//        e=a.nextInt();
//        a.nextLine();

//        System.out.println("b="+b);
//        System.out.println("c="+c);
//        System.out.println("d="+d);
//        System.out.println("e="+d);
        System.out.println("chuỗi : "+a.nextLine());
        System.out.println("chuỗi : "+a.nextLine());
        System.out.println("chuỗi : "+a.nextLine());
        a.close();//đóng file
    }
}
