package practicejavaprogram;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
    String s= "abcdacdbcabdac";
	char ch[]=s.toCharArray();
	Set<Character> set = new HashSet<Character>();
	for(char c: ch)
	{
		set.add(c);
	}
	
	System.out.println(set);
	}

}
