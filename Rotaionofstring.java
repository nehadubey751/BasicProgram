package programs;

public class Rotaionofstring {
	public static void main(String[]args) {
		String str1="abcd";
		String str2="cdab";
		
		if(str1.length()!=str2.length())
		{
			System.out.println("str1 are not rotated in str2");
		}
		
		String str3=str1+str1;
		if(str3.indexOf(str2)!=-1)
			System.out.println("Rotation");
		else
			System.out.println("not rotation");
			
		
	}

}
