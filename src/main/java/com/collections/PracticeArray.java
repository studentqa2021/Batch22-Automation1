package com.collections;

import java.util.Arrays;

public class PracticeArray {
	
	static int a =2; //variable => cannot handle more than one value
	static int[] b = {10, 20, 30, 50}; //array (single dimensional)
	static int[] c = {2,3,5,8}; //array (single dimensional)
	static int[][] d = {{10, 20, 30, 50},{2,3,5,8}}; //array (multidimensional) d = {b,c}
	
	
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println("Length of b="+b.length);
		
	}
	
}
