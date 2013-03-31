package com.loveit.java.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author derek
 *
 * @param <E>
 * 
 * 这里为什么是使用 extends,而不是 implements 
 * 注意这里 泛型的使用。。表示了一个类型..而在实际中，这个 可以用数组组成这个泛型。。
 * 所以，在头部定义的只是一个基本类型  extends 是要求了这个类必须实现过Comparable
 */

public class BubbleSort2<E extends Comparable<E>> {
	
	
	/** 第一次循环 size - 1
	 *  内部循环    size -i 
	 * 
	 * @param list
	 */
	public  void sort(List<E> list){
		for( int i=1; i< list.size();i++ ){
			for(int j=1;j<= list.size()-i;j++ ){
				if(list.get(j-1).compareTo(list.get(j)) > 0){
					E temp = list.get(j);
					
					list.set(j, list.get(j-1));
					list.set(j-1, temp);
					System.out.println("..");
				}
			}
		}
	}
	
	public static void  main(String []args){
		BubbleSort2<Integer> p = new BubbleSort2<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(10));
		list.add(new Integer(6));
		list.add(new Integer(5));
		
		p.sort(list);
		for(Integer i : list){
			System.out.println(i);
		}
	}
	
	
	
	

}
