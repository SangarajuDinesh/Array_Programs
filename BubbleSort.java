package com.kn.Sorting;

import java.util.Scanner;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		//Declaration and Creation of an Array
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of an Array : ");
		int[] arr=new int[sc.nextInt()];
		//Initialaization of an Array
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the Data for "+(i)+" index = ");
			arr[i]=sc.nextInt();
		}
		System.out.print("Normal Array Before Sorting = ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		BubbleSortDemo bb=new BubbleSortDemo();
		int res[]=bb.bubbleSort(arr);
		System.out.println();
		System.out.print("Sorted Array = ");
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		sc.close();
	}
}
