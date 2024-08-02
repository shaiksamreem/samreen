package samreen;
import java.util.*;
public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String st1="samreen!";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name:");
		String st1=sc.next();
		String rev=" ";
		System.out.println("before reverse:"+st1);
	    for (int i=st1.length();i>0;--i){
	    	rev =rev+st1.charAt(i-1);
	    }
		System.out.println("after string:"+rev);
		
		

	}

}
