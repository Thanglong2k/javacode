package java_input_output_console;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class GhiRaFile {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter printWriter=new PrintWriter("input.txt","UTF-8");
//        printWriter.println("Anh Long Đẹp Trai");//mất dữ liệu cũ trong file
//        printWriter.println("Anh Long Đẹp Trai");
        printWriter.append("Anh LOng");
        printWriter.close();
    }
}
