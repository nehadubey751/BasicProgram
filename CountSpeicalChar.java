package programs;

public class CountSpeicalChar {
  public static void main(String s) 
  {
	  String s1="s@r$b6aa";
	   int i,l,sp=0;
	  char ch;
	  l=s1.length();
	  
	  for(i=0;i<l;i++) {
		  ch=s1.charAt(i);
		  if(Character.isLetterOrDigit(ch)==false)
			 ++sp;
		   }
	  System.out.println("number of specical chara=:"+sp);
  }
}
