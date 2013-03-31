package com.loveit.java.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author derek
 *
 * @param <E>
 * 
 * ����Ϊʲô��ʹ�� extends,������ implements 
 * ע������ ���͵�ʹ�á�����ʾ��һ������..����ʵ���У���� �������������������͡���
 * ���ԣ���ͷ�������ֻ��һ����������  extends ��Ҫ������������ʵ�ֹ�Comparable
 */

public class BubbleSort2<E extends Comparable<E>> {
	
	
	/** ��һ��ѭ�� size - 1
	 *  �ڲ�ѭ��    size -i 
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
