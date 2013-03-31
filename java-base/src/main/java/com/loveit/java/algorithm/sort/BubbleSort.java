package com.loveit.java.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author derek
 *  冒泡排序
 *
 */

public class BubbleSort {
	


	
	/**
	 * 简单的比较
	 * 需要的循环次数 size -1 
	 * 一次循环需要比较的次数: size - 1 -i 
	 * @param l
	 */
	
	public static void bubbleSort(List<Integer> l){
		for(int i=1;i< l.size();i++){
			for(int j=1;j<=l.size() -i ; j ++){
				if(l.get(j-1) > l.get(j)){
					Integer inter = l.get(j);
					l.set(j, l.get(j-1)) ;
					l.set(j-1, inter);		
					System.out.println("..");
				}			
			}
		}
	}
	
	
	public static void main(String [] args){
		List<Integer> list = new ArrayList<Integer>();
	
		list.add(new Integer(10));
		list.add(new Integer(6));
		list.add(new Integer(5));

		/*		list.add(new Integer(4));
		list.add(new Integer(8));
		list.add(new Integer(1));
		list.add(new Integer(9));
		list.add(new Integer(11));
		list.add(new Integer(2));*/
		bubbleSort(list);
		for(Integer i: list){
			System.out.println(i);
		}
		
		
	}

}
