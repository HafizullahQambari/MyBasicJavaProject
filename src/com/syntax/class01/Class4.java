package com.syntax.class01;

public class Class4 {

	public static void main(String[] args) {
	// true && ture==>ture-
		//-true && false==> false
		/*/
		 * false && false==>false
		 * false &&  true==> false
		 * true||ture==> true
		 * false || true> false
		 * true || false == true
		 * false || false == false
		 */
	int num=78;
	if(num>=1 && num<=100) {
	System.out.println(" This number is small");
	}
	else if(num>10 && num<100) {
		System.out.println(" this is a big number");
	}else if(num>100 && num<100) {
		System.out.println("This is a large number");
	}else {
		System.out.println(" number is super large");
	}
	}

}
