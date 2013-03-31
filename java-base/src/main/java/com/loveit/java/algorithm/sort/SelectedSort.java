package com.loveit.java.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author derek
 * 选择排序 . 每一趟都选择最小的那个。。并且和刚开始的调换顺序
 * 10.9.8..7.6 
 */
public class SelectedSort<T extends Comparable<T>> {
	
	public void sort(T[] list){
		
		for(int i=0;i<list.length;i++){
			T minObject = list[i];
			int position = i;
			for(int j=i+1;j<list.length;j++){				
				if(minObject.compareTo(list[j]) > 0){
					minObject = list[j];
					position = j;
				}
			}
		
			System.out.println("position:" + position + "minObject" + minObject + "i:" + i);
			
			list[position] = list[i];
			list[i] = minObject;
			for(T l :list){
				System.out.print(l);
			}
			System.out.println();
			
		}
	}
	
	public static void  main(String []args){
		SelectedSort<Integer> p = new SelectedSort<Integer>();
		Integer [] list2 = {10,6,3,5};
		p.sort(list2);
		for(Integer i : list2){
			System.out.println(i);
		}
	}
	

}
