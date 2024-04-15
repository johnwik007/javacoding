package javapractice;

public class Sample {
	
 int max(int a,int b)
 {
	 if(a>b)
		 return a;
	 else
		 return b;
	 }

	public static void main(String[] args) {
		
       Sample obj = new Sample();
            int y = obj.max(44, 55);
            System.out.println(y);
	}

}
