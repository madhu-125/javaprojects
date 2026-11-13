package com.Arrays;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {

		int arr[] = { 1, 0, 2, 0, 0, 9, 1, 0, 7, 0 };
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}
}

//  int n=arr.length;
//	index=n-1;
//	for(int i=n-1;i>0;i--)
//	if(arr(i)!=0)
//	arr[idex] = arr(i);
//	index--;
//	
//

