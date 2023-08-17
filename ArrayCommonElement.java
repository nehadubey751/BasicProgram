package programs;

import java.util.HashSet;

public class ArrayCommonElement {
	public static void main(String[]args) {
		//String arrys
		String[] arr1= {"neha","pallu","mani","pooja"};
		String[] arr2 = {"neha","pallu","nisha","pisha"};
		
		HashSet<String> hs=new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					hs.add(arr1[i]);
					break;
				}
			}
		}
		for(String i:hs) {
			System.out.println(i);
		}
//		Interger array
//		int[] arr1= {1,4,2,5};
//		int[] arr2= {1,2,7,8};
//		HashSet<Integer> hs=new HashSet<Integer>();
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr2.length;j++) {
//				if(arr1[i]==arr2[j]) {
//					hs.add(arr1[i]);
//		             break;
//				}
//			}
//		}
//		for(Integer i:hs) {
//			System.out.println(i);
//		}
		
		
	}

}
