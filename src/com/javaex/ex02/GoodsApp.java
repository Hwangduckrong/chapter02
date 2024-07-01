package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
	
		Goods computer =new Goods();
		computer.name ="LG그램";
		computer.price=10000000;
		
		Goods cup = new Goods();
		cup.name="머그컵";
		cup.price=2000;
		
		Goods nikon = new Goods();
		nikon.name="니콘카메라";
		nikon.price=360000;
		//컴퓨터가격
		System.out.println(computer.price);
		//컵이름
		System.out.println(cup.name);
		//컴퓨터이름
		System.out.println(computer.name);
		//컵가격
		System.out.println(cup.price);
		//컴퓨터가격
		System.out.println(computer.price);
		//니콘카메라가격
		System.out.println(nikon.price);
		//니콘카메라이름
		System.out.println(nikon.name);
		
		
	}

}
