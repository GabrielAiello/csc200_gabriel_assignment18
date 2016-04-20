package homeworkassignment18;

public class Driver {

	public static void main(String[] args)
	{
		String s = "";
		System.out.println(Driver.stringToCharArray(s) + "");
		System.out.println(Driver.doubler(Driver.stringToCharArray(s)) + "");
	}

	static char stringToCharArray(String s)
	{
		char b = 0;
		for(int i = 0; i < s.length(); i++)
			{
			
			b = (char) ((char) b + (char) s.charAt(i));
			}
		return b;
	}
	static char doubler(char s)
	{
		char n = (char) (s+s);
		return n;
	}
}
