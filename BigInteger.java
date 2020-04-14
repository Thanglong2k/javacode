package BT;

import java.math.BigDecimal;

public class BigInteger {
    public static void main(String[] args){
        java.math.BigInteger a=new java.math.BigInteger("453464763436836435432");//số nguyên lớn
        java.math.BigInteger b=new java.math.BigInteger("453464763436836435432");
        java.math.BigInteger c=a.add(b);
        java.math.BigInteger d=a.subtract(b);

        System.out.println(c);
        System.out.println(d);
        System.out.println(a.multiply(b));
        System.out.println(a.divide(b));
//---------------------------------------------------------------------------------
        BigDecimal e=new BigDecimal("1.999999999999999999999999999999999999999999999");
        BigDecimal f=new BigDecimal("2.000000000000000000000000000000000000000000001");
        System.out.println(e);
        System.out.println(e.add(f));
    }
}
