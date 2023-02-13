import java.util.*;

class Main{
public static void reverseString(String str) {

		char[] c = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i=c.length-1; i>=0; i--) {

			sb.append(c[i]);
			
		}

		System.out.println(sb.toString());
	}

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the String");
String str = sc.next();

reverseString(str);


}
}