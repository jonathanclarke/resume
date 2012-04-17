public class FizzBuzz
{
	public static void main(String[] args)
	{	
		for (int i=1; i<=100; i++)
		{
			String s = "";
			
			if (i%3 == 0) s += "fizz";
			if (i%5 == 0) s += "buzz";
			if (s.isEmpty()) s += i;
			
			System.out.println(s);
		}
	}
}