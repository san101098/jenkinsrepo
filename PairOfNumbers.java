package package3;

public class PairOfNumbers {
	public static void main(String args[])
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
		int i,j;
		for(i=0; i<arr.length;i++)
		{
			for(j=arr.length-1;j>=0;j--)
			{
				if(arr[i]+arr[j] == 9)
				{
					System.out.println(arr[i] + " + " + arr[j] + " = 9");
					break;
				}
			}
		}
	}
}
