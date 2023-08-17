package programs;

public class SecondLargest {
	public static void main(String[]args) {
	    int[] a= {1,4,6,3,8,9,4};
        int largest=Integer.MIN_VALUE;
		int second_largest =Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) 
  { 
		 if(a[i]>largest) {
				             second_largest=largest;
				             largest=a[i];
			         }
		 else if(a[i]> second_largest && a[i]!= largest)
		 {
			  second_largest=a[i];
		 }
  
  }
		if(second_largest==Integer.MIN_VALUE)
		{
			System.out.println("there is no second largest element in list");
		}
			else {
				System.out.println("second largest value is:"+second_largest);
			}
	}

}
