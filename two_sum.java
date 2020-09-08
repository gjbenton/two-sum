public class two_sum{
	public int[] two_Sum(int[] num, int sum){
		int add1, add2;
		int[] sol = {-1,-1};
		
		for(int i=0; i<num.length-1; i++){
			add1= num[i];
			for(int j=1; j<num.length; j++){
				add2=num[j];
				if(add1+add2==sum){
					sol[0]=add1;
					sol[1]=add2;
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


	public static void main(String[] args){
		two_sum add = new two_sum();

		int[] arr = {2,12,8,7};
		System.out.println("Here is the given array: ");
		add.printArray(arr);

		
		add.printArray(add.two_Sum(arr, 9));
		System.out.println("end.");

	}
}