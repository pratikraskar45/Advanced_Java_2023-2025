package com.jsp.array;

import java.util.Arrays;

public class Calculate {
	public static void main(String[] args) {
		 int [] fisrt= {3,5,2,8};
		 int [] res=new int [fisrt.length];
		 
		 res[0]=fisrt[0];
		 
		 for(int i=1;  i< fisrt.length; i++) {
			 res[i]= fisrt[i]+fisrt[i-1];
			 
		 }
		 System.out.println(Arrays.toString(fisrt));
		 System.out.println(Arrays.toString(res));
		 
		
	}

}
