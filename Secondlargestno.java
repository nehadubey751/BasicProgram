package programs;

public class Secondlargestno {

 public static int Secondlargestno(int a[],int total) {
	int temp;	
	for(int i=0;i<total;i++) {
		for(int j=i+1;j<total;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	 		
		}
	     return a[total-2];
 }
	     
public static void main(String[]args) {
	int[] a= {2,5,6,3,8,7};
	System.out.println("second largest element in array:"+Secondlargestno(a,6));
	}
	

}
