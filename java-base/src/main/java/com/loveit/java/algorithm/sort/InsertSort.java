package com.loveit.java.algorithm.sort;

import java.util.ArrayList;
import java.util.List;



/**
 * ��������
 * @author derek
 * 9.8.7.6
 * 8.9.7.6
 * Ҫ�����ô��λ
 * 
 * 
 */

public class InsertSort<T extends Comparable<T>> {
	
	
	public void sort(List<T> list){	
		for(int i=1;i<list.size() ;i++) {
			
			T temp = list.get(i);
			int j = i;
			for(;j > 0; j--) {
				if( temp.compareTo(list.get(j-1)) < 0 ){
					list.set(j, list.get(j-1));
					System.out.println("..");
				} else {
					// ��Ϊǰ�����������飬���ԣ�����ֱ���˳����� �൱���Ǵ� ����ǰ�Ƚϡ��������ǰ��һ��С,��ǰ��ĺ���
					break;
				}
				
			}
			list.set(j, temp);
		}
	}
	
/**
 *  10.6.3.5
 * @param list
 */
	public void sort2( T[] list){
		for(int i=1;i<list.length;i++){
			T temp = list[i];
			int j=i;
			for(;j>0;j--){
				if( temp.compareTo(list[j-1]) < 0){
					list[j] = list[j-1];
					System.out.println("...");
				} else {
					break;
				}
			}
			list[j] = temp;
		}
		
	}
	
	public static void  main(String []args){
		InsertSort<Integer> p = new InsertSort<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		Integer [] list2 = {10,6,3,5};
		list.add(new Integer(10));
		list.add(new Integer(6));
		list.add(new Integer(3));
		list.add(new Integer(5));	
		p.sort2(list2);
		for(Integer i : list2){
			System.out.println(i);
		}
	}

}
