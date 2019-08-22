package com.cheyipai.test;


import java.util.ArrayList;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
//		System.out.println("Hello world!");
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i*i);
//		}
		List<String>list=new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.forEach(item->{
			System.out.println(item);
		});
	}
}
/*ComputerRectArea.java
public class ComputerRectArea
{
	public static void main (String args[])
	{
		double height; //高
		double width;  //宽
		double area;   //面积
		height=23.89;
		width=108.87;
		area=height*width;  //计算圆面积
		System.out.println(area);
	}
}



Rect.java
	public class Rect
	{
		double width;
		double height;
		double getArea()
		{
			double area=width*height;
			return area;
		}
	}*/


