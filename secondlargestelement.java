public class secondlargestelement{
	public static void main(String[] args) {
		
		System.out.println("second largest element from the array");
		int[] arr = {100, 3, 23, 45, 52, 25, 22};
		int maxnum = arr[0];
		int smax =0;
		for (int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}

		for (int i = 0; i<arr.length; i++) {
			if (arr[i]>maxnum){
				maxnum = arr[i];
			}
		}
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]>smax && arr[i]!= maxnum){
				smax = arr[i];
			}
			
		}
		System.out.println("\nsecond maxnum is "+smax);
	}
}