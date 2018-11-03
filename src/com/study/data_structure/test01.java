package com.study.data_structure;

public class test01 {

	public static void main(String[] args) {
		String s = "1+2*7";
		String[]arr=  s.split("");
		for(String i:arr) {
			System.out.println(Integer.parseInt(i));
		}
	}

}
