package homeworkassignment18;

public class Driver4
{
	public static void main(String[] args)
	{
		System.out.println(Driver4.stringToCharArray("P"));
	}
	static char stringToCharArray(String s)
	{
		char b = Driver4.int2Char((Driver4.stringToInt(s)));
		return b;

	}
	static char int2Char(int num)
	{
		String map = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return map.charAt(num);
	}
	static int charToInt(char c)
	{
		return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(c);
	}
	static int stringToInt(String s)
	{
		int place = 1;
		int total = 0;
		char currChar;
		for(int i = s.length()-1; i >= 0; i--)
		{
			currChar = s.charAt(i);
			total += (Driver4.charToInt(currChar)*place);
			place *= 10;
		}
		return total;
	}
}
