public class maxnumberofarray{
	public static void main(String[] args) {
		
		System.out.println("maximum number from the array");
		int[] numbers = {10, 20, 300, 40, 50};
		int maxnum = numbers[0];
		for (int i = 0; i<numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		for (int i = 0; i<numbers.length; i++){
			if (numbers[i]>maxnum){
				maxnum = numbers[i];
			}
		}
		System.out.println("max number is "+maxnum);
		
		
	}
}