package datasturcures.Java.Elemetarysortings;

import java.io.File;

public class InsertionSort {//insertion sort7890 
    public static void main(String args[])
	{
	  int[] arr = new int[]{4,7,2,4,0,1,8,14,5,1};
	 //int i=arr[0];
	  for(int i=0;i<arr.length;i++)
	  {
		  int temp=arr[i];
		  int hole=i;
		  while(hole>0 && arr[hole-1]>temp)  
		  {
			  arr[hole]=arr[hole-1];
			  hole=hole-1;
		  }
	    arr[hole]=temp;
	  }
		 for(int i=0;i<arr.length;i++)
		  System.out.println(arr[i]);
		 
		 System.out.println(System.currentTimeMillis());
	}//
   
    
}
	  
		/*	public static boolean max(int[] arr,int a, int b)
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
	    	
	    }*/
