package com.jzf.decoration;

public class IntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = Integer.decode("0x12");
		Integer i2 = Integer.decode("-012");
		Integer i3 = Integer.decode("-12");
		Integer i4 = Integer.decode("-#12");
		Integer i5 = Integer.decode("0X12");
		Integer i6 = Integer.decode("12");
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		
		System.out.println("-----------------------");
		
		System.out.println(Integer.toString(11));
		System.out.println(Integer.toString(11,2));
		System.out.println(Integer.toBinaryString(11));
		System.out.println(Integer.toHexString(11));
		System.out.println(Integer.toUnsignedString(11));
		
		
/*		因为String实现了Serializable接口，所以支持序列化和反序列化支持。
		Java的序列化机制是通过在运行时判断类的serialVersionUID来验证版本一致性的。
		在进行反序列化时，JVM会把传来的字节流中的serialVersionUID与本地相应实体（类）的serialVersionUID进行比较，
		如果相同就认为是一致的，可以进行反序列化，否则就会出现序列化版本不一致的异常(InvalidCastException)。*/
	}

}









