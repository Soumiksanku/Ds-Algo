package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = {3,1,-2,7,4,0};
		int n = a.length;
		for(int i =0;i<n-1;i++)
		{
			int minIndex = i;
			for(int j=i;j<n;j++)
			{
				if(a[j]<a[minIndex])    //finds the least element and stores it in minIndex in each iteration
				{
					minIndex = j;
				}
			}
			int temp = a[i];    // now the minIndex is swapped with the ith position 
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
		for (int e: a)
		{
			System.out.print(e+" ");
		}
	}

}
