public class ThuanNghichdoc {
    public static void main(String[] args) {
        System.out.println("số thuạn nghịch độc là:");
        for(int i=100000;i<=999999;i++)
        {
//          if((i%10==i/100000)&&(i%100/10==i/10000%10)&&(i%1000/100==i/1000%10)) {
//              System.out.println(i);
//          }

            String s=String.valueOf(i);//chuyển int thành String
            String a = new StringBuffer(s).reverse().toString();// đảo ngược chuỗi bằng class StringBuffer
            if(s.equals(a))//so sánh chuỗi
            {
                System.out.println(a);
            }
        }
    }
}
