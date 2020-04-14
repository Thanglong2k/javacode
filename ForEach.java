public class ForEach {
    public static void main(String[] args) {
        String a = "Long Nhan Hong Hanh";
        String[] b = a.split(" ");//cắt chuỗi tại vị trí dấu cách cho vào mảng
        for (String c : b)//for each(cấu trúc:for(kiểu biến : biến mảng)
        {
            System.out.println("tên:" + c);
        }
        int[] ab={1,2,3,4,5,6,7,8,9};
        for(int x: ab)
        {
            System.out.println(x);
        }
    }
}
