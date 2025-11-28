package trainingd6.proj2;
import java.util.*;

public class MutubleStrings {
	
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("aditya");
		buffer.append("pranav");
		buffer.append("mukund");
		buffer.append("vansh");
		
		System.out.println(buffer);
		System.out.println(buffer.capacity());
		
		//orignal capacity is 16 when 17th character is entered it quickly adjusts to accomodate new character
		// this means 16, 34, 70, 142 etc.
		
		StringBuffer sbf = new StringBuffer ("name");
		System.out.println(sbf.capacity());
		sbf.ensureCapacity(15);
		System.out.println(sbf.capacity());
		sbf.ensureCapacity(30);
		System.out.println(sbf.capacity());
		
		StringBuilder builder = new StringBuilder("aditya goel");
		
		//builder.replace(7, 10, "***");
		System.out.println(builder);
		System.out.println(builder.reverse());
		
		String tr = "apple,mango,kiwi,orange,pineapple";
		
		StringTokenizer jvstr = new StringTokenizer(tr, ",");
		
		while (jvstr.hasMoreTokens()) {
			System.out.println(jvstr.nextToken());
		}
		
		StringJoiner sj = new StringJoiner(",");
		sj.add("ice-cream");
		sj.add("pizza");
		sj.add("ice-cream");
		sj.add("pizza");
		sj.add("ice-cream");
		sj.add("pizza");
		System.out.println(sj);
		
	}
	
}
