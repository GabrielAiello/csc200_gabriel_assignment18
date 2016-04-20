package homeworkassignment18;

public class Driver2
{

	public static void main(String[] args)
	{
		System.out.println(Driver.stringToCharArray("picklejuice") + "");
	}

	static char [] stringToCharArray(String s)
	{
		String alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char [] alphabet2 = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char [] a = {};
		char b = 0;
		for(int i = 0; i < s.length(); i++)
			{
			b = alphabet2.pos(alphabet.indexOf(s.charAt(i)));
			//if (alphabet2.indexOf(s.charAt(i)) == -1)
			//	{
			//	b = s.charAt(i);
			//	}
			//else
			//{
			//	b = s.charAt(i);
			//}
			a = b;
			}
		return a;
	}
	
}
