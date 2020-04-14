import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
        //khai báo mảng: int[] a={1,2}; hoặc int[] a=new int[]{1,2};
        int[] a=new int[5];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("Nhập a["+i+"]:");
            a[i]=scanner.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("--------------------- LỚP MẢNG ---------------------");
        Integer[] arr={1,23,4,5,8,5,2};
        String s= Arrays.toString(arr);
        System.out.println(s);
        Arrays.sort(arr);//sắp xếp mảng
        System.out.println("Sau khi sắp xếp:"+Arrays.toString(arr));
        //Arrays.sort(arr, Collections.reverseOrder());//sắp xếp giảm chỉ sử dụng cho lớp đối tượng,
        //không sử dụng cho kiểu. VD:sử dụng đc cho Integer, ko sử dụng được cho int.
        //System.out.println("Sau khi sắp xếp giảm:"+Arrays.toString(arr));
      //  int index=Arrays.binarySearch(arr,"23");
        int index=Arrays.binarySearch(arr,1,4,4);//tìm kiếm trong đoạn từ vị trí 1-4

        System.out.println(index);
        Integer[] arr2= Arrays.copyOf(arr,3);//copy mảng với độ dài...
        System.out.println(Arrays.toString(arr2));
        System.out.println("So sánh arr và arr2:"+Arrays.equals(arr,arr2));//so sánh 2 mảng
        int[] ap=new int[20];
        Arrays.fill(ap,99);//khởi tạo tất cả phần tử của mảng =99

        System.out.println(Arrays.toString(ap));
    }
}
