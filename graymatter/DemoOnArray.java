package com.graymatter;

import java.util.Scanner;

public class DemoOnArray {

	
	public static boolean isPrime(int[] arr) {
		
		for(int i = 1 ; i < Math.sqrt(arr[i]) ; i++) {
			if(arr[i]%i == 0)
			{
				return false;
			}
		}
		
		//complete the prime number logic
		return true;
	}
	
	public static void lsearch (int arr[] , int key) {
		
		for(int i = 0 ; i<arr.length ; i++) {
			if(arr[i] == key) {
				System.out.println("Element found at location: " + i+1);
				break;
			}
			else
				System.out.println("Element not found");
		
		}
	}
	
	
	public static void binSearch(int arr[] , int key) {
		
		int low = 0;
		int high = arr.length - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if(key == arr[mid]) {
				System.out.println("Element found");
				break;
			}
			
			else if(key<arr[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}
		
		
	}
	
	
	
	public static void FindDuplicate(int arr[], int key) {

		int count=0;
		
		
		for (int i = 0; i< arr.length ; i++ ) {
			if(arr[i] == key)
			{
				count++;
			}
		}
		System.out.println("The number of times the element appeared : " + count);
		
	}
	
	
	public static void InsertInArray(int arr[] , int num, int location) {
		
		if (location < 0 || location > arr.length) {
			System.out.println("Invalid location to insert element.");
        }
		
		int[] newArray = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == location) {

            	newArray[i] = num;
            } 
            
            else {
                // Copy the element from the original array
                newArray[i] = arr[j++];
            }
        }
		
        for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.println(newArray[i]);
		}
		
	}
	
	
	public static void DeleteFromArray(int arr[] , int element) {
		
//		if (location < 0 || location >= arr.length) {
//            System.out.println("Invalid location to delete element.");
//        }

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }


        for (int i = index ; i < arr.length - 1 ; i++) {
            arr[i] = arr[i + 1];
        }

        // Create a new array with one less element
        int[] newArray = new int[arr.length - 1];
        
        
        for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.println(newArray[i]);
		}
  
    }
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[8];
		arr[0] = 4;
		arr[3] = 7;
		int sum = 0;
		
		System.out.println("Enter 8 elements in the array: ");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			arr[i] = sc.nextInt();
			sum+= arr[i]; 
		}
		
		System.out.println("\nThe entered array is: ");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("\nEVEN NUMBERS: ");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i]%2==0)
			System.out.println(arr[i]);
		}
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(isPrime(arr))
				System.out.println("The number is prime");
			else
				System.out.println("The number is not prime");
		}
		
		isPrime(arr);
		lsearch(arr, 55);
		FindDuplicate(arr, 5);
		InsertInArray(arr, 50, 3);
		DeleteFromArray(arr, 4);
		
	}

}
