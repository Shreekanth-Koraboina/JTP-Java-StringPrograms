
public class VowalConsutantCount {
	public static void main(String[] arg)
	{
		String input="Hello, World!";
		int[] counts=countVowelAndConstutance(input);
		int vowelCount=counts[0];
		int constuancyCount=counts[1];
		System.out.println("Total number of Vowels : "+ vowelCount);
		System.out.println("Total number of constuancy : "+ constuancyCount);
	}
public static int[] countVowelAndConstutance(String input)
{
	int vowelCount=0;
	int constanceCount=0;
	String lowerCaseInput=input.toLowerCase();
	for(int i=0; i<lowerCaseInput.length();i++)
	{
		char c=lowerCaseInput.charAt(i);
		if(Character.isLetter(c))
		{
			if(c=='a' || c=='e' || c=='i' || c=='o'||c=='u')
			{
				vowelCount++;
			}
			else
			{
				constanceCount++;
			}
		}
	}
	int[] counts={vowelCount,constanceCount};
	return counts;
}
}
