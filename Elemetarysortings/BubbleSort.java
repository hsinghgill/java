package datasturcures.Java.Elemetarysortings;

public class BubbleSort {

	public static void main(String aregs[])
	{
		int[] arr = new int[]{1,2,3,4,5,6,7,8,15};
		bubbleSort( arr);
		for(int i=0;i<arr.length;i++)
		     System.out.println(arr[i]);
		 System.out.println(System.currentTimeMillis());
	}
		
	
	public static void bubbleSort(int[] arr)
	{
		
		
		for (int j=0; j<arr.length;j++)
		 {
		   int flag=0;
		 for (int i=0; i<arr.length-1;i++)
		   {
			if (max(arr,i,i+1))
			{
				swap(arr,i,i+1);
				flag=1;
			}
		   }
		 if (flag==0)
			 break;
		 }
	}
	public static boolean max(int[] arr,int a, int b)
    {
    	if(arr[a]>arr[b])
    	{
    		return true;
    	}
    	return false;
    }
	 public static void swap(int[] arr,int a, int b)
	    {
	    	int temp=arr[a];
	    	arr[a]=arr[b];
	    	arr[b]=temp;
	    	
	    }
}
