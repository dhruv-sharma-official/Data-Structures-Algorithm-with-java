// rotate n number of elements from and array 
// suppose array = {1,24,5,2}
// rotate 2 elements = {5,2,1,24}

import java.util.Scanner;

public class rotatenelements{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt()-1;
		int temp;
		int[] arr = {1,24,5,2};
		if (n>=arr.length){
			System.out.println("elements are less than n");
		} else {
		for (int i = 0; i<=n; i++){
			for (int j = 0; j<arr.length-1; j++){
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1]=temp;
			}
		}
		for (int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		}
	}
}
