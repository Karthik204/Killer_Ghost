package Practice_programs;

public class Replaceduplicates {

	public static void main(String[] args) {
		String a="manjunath";
		String s1="";

 //logic-1 to replace the char in given string 
 
 char[] charr = a.toCharArray();
 int length = charr.length;
 System.out.println(length);
 System.out.println(charr);
 
 for (int i = 0; i < length; i++) 
 {
	if(charr[i]=='a')
	{
		s1 = s1+'o';
	}
	else
	{
	s1=s1+charr[i];
		
	}
	}
 System.out.println(s1);
 
 //logic 2 
 String replace = a.replace('a', 'o');
 System.out.println(replace);
 
 
 //logic 3 
 StringBuilder st = new StringBuilder(a);
 StringBuilder rep = st.replace(0, 5, "bham");// 0-5 index replaced by mentioned string 	
 System.out.println(rep);
 
 }
 
 
 
 
}
