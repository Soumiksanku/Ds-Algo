package Strings;

public class AnagramOfStringMethodTwo {

	public static void main(String[] args) {
		String a = "#dsae";
		String b = "#ased";
		boolean isAnagram = true;
		int al[] = new int[256];
		//int bl[] = new int[256];
		for (char c: a.toCharArray())
		{
			int index = (int) c;
			al[index]++;
		}
		for (char c: b.toCharArray())
		{
			int index = (int) c;
			al[index]--;
		}
		for(int i =0;i <256 ; i++)
		{
			if(al[i] !=0) 
			{
				isAnagram = false;
				break;
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
		//System.out.println(a.toCharArray());

	}

}
