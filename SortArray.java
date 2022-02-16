public class SortArray {
	public static int[] sortArray(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			int k=i;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]<arr[k])
				{
					k=j;
				}
			}
			int temp =arr[i];
			arr[i]=arr[k];
			arr[k]=temp;
		}
		return arr;

	}
}