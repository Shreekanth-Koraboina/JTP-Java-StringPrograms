
public class PunctuationCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="Hello, World! how are you?";
		int count=countPunctuation(input);
		System.out.println("Total number of punctuation Marks : "+count);
	}

	public static int countPunctuation(String input)
	{
		String punctuation = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			char c=input.charAt(i);
			if(punctuation.contains(String.valueOf(c)))
			{
				count++;
			}
		}
		return count;
	}
}
