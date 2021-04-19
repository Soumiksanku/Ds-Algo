package Strings;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		String s  = "The sky is blue";
		String answer = "";
		int i = s.length()-1;
		
		while (i>=0)
		{
			while (i>=0 && s.charAt(i) == ' ')
				i--;
			int j = i;
			while(i>=0 && s.charAt(i)!=' ')
				i--;
			if(answer.isEmpty())
			{
				answer = answer.concat(s.substring(i+1,j+1));
			}
			else
			{
				answer = answer.concat(" "+s.substring(i+1,j+1));
			}
			
		}
		System.out.println(answer);
	}

}
