package com.foxmula.Assignment3;
import java.util.*;
import java.util.Map.Entry;
import java.util.Set;

public class FrequencySort {
	
	public static void main(String []args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();

		for(int i=0;i<20;i++) {
			int rand = (int)(Math.random() * 5) + 1;
			a.add(i, rand);
			
		}

		System.out.print("Input Array is:");
		
		for(int i=0;i<20;i++) {
			System.out.println(a.get(i));	
		}
		System.out.println();
		
		Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<20;i++) {
			
			if(map.containsKey(a.get(i))) {
				map.put(a.get(i), map.get(a.get(i))+1);
			}
			else {
				map.put(a.get(i), 1);
			}
		}

		System.out.print("Frequency of elements are (Element=Frequency):");
		
		System.out.println(map);
		

		//System.out.println(map.size());
		
		List<Integer> valueslist = new ArrayList<Integer>(map.values());
		Collections.sort(valueslist);

		//System.out.println(valueslist);
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		List<Entry<Integer, Integer>> list = new ArrayList<>(entrySet);
		
		Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		
		System.out.println("Elements Sorted (Number=Frequency): "+ list);
		System.out.print("Sorted Array is :");
		System.out.print("[");
		list.forEach(s->{
			System.out.print(s.getKey()+" ");
		});
		System.out.println("]");
	}
}