package datasturcures.Java.Elemetarysortings;

public class SecletionSort {
        
	public static void main(String aregs[])
	{
		int[] arr = new int[]{4,7,2,4,0,1,8,5,15};
		selectionSort( arr);
		for(int i=0;i<arr.length;i++)
		     System.out.println(arr[i]);
	}
		
	
	 public static void selectionSort(int[] arr)
	 {
		 for(int i=0; i<arr.length;i++)
		 {
			 int iMin=i;
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if (max(arr,j,iMin))
					 iMin=j;
			 }
			//int temp=arr[i];
		   // arr[i]=arr[iMin];
		    //arr[iMin]=temp;
		swap(arr,i,iMin);
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
