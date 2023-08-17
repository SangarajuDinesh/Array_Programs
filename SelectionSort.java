package com.kn.Sorting;

public class SelectionSort 
{
	public static void main(String[] args) 
	{
		int []arr= {48,32,16,77,44,63};
		for(int i=0;i<arr.length;i++)
		{
			int min=arr[i];
			int index=i;
			int temp=0;
			for(int j=i+1;j<arr.length;j++)//or take arr.length-1
			{
				if(min>arr[j])
				{
					min=arr[j];
					index=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
