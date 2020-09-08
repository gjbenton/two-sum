public class two_sum{
	// public two_sum(){
	// 	int[] sol;
	// 	int add1, add2;
	// }
	public int[] two_Sum(int[] num, int sum){
		int add1, add2;
		int[] sol = {-1,-1};
		
		/*nested for loop allows function to oscilate between
		the beginning of the array with the summation of every
		index AFTER the ith term. First for loop ends at array
		length -1 to allow for the very last iteration to be the sum
		of the last 2 terms*/
		for(int i=0; i<num.length-1; i++){
			add1= num[i];
			for(int j=1; j<num.length; j++){
				add2=num[j];
				if(add1+add2==sum){
					//System.out.println(add1 + "+" + add2 + "=" + sum);
					sol[0]=i;
					sol[1]=j;
					return sol;
				}	
			}
		}
		return sol;
	}
	void printArray(int[] num){
		for(int i=0; i < num.length; i++)
			System.out.print(num[i]+" ");
		System.out.println();
	}

	void printSol(int[] sol){
		System.out.print("["+sol[0]+","+sol[1]+"]");
		System.out.println();
	}
	
	/* Want to make printSol the toString
	public String toString(){
		String output = "";
		output += "["+sol[0]+","+sol[1]+"]";
		return output;
	}*/

	public static void main(String[] args){
		two_sum add = new two_sum();

		int[] arr = {2,12,8,7};
		System.out.println("Here is the given array: ");
		add.printArray(arr);
		
		System.out.print("Sum found at index: ");
		add.printSol(add.two_Sum(arr, 9));

	}
}