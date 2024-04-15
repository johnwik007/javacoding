package practicejavaprogram;

public class PrintDiditsFromString {

	public static void main(String[] args) {
		String s= "I love my country12345";
          String result = s.replaceAll("[^0-9]", "");
          System.out.println(result);
	}

}
