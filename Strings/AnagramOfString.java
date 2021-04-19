package Strings;;

public class AnagramOfString {

	public static void main(String[] args) {
		String a = "aab";
		String b = "bca";
		boolean isAnagram = false;
		boolean visited[] = new boolean[b.length()];
		if(a.length() == b.length())
		{
			for(int i=0; i<a.length(); i++)
			{
				int c = a.charAt(i);
				for(int j=0; j<b.length(); j++)
				{
					if(b.charAt(j) == c && !visited[j])
					{
						visited[j] = true;
						isAnagram = true;
						break;
					}
				}
				if(!isAnagram)
				{
					break;
				}
			}
		}
		if(isAnagram)
		{
			System.out.println("The strings are anagram of each other");
		}
		else
		{
			System.out.println("The srings are not anagram of each other");
		}

	}

}
