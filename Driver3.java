package homeworkassignment18;

public class Driver3 
{

	public static void main(String[] args)
	{
		System.out.println(Driver.stringToCharArray("pg") + "");
	}

	void stringToCharArray(String s)
	{
		for(int i = 0; i < s.length() - 1; i++)
			{
			System.out.println(s.charAt(i));
			}
	}

}
