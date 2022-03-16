class loops {
	public static void main(String[] args) {
		
		// for loop 
		int n = 4;
		int sum = 0;
		int forSum = 0;
		int i = 0;
		while(i<=n){
			sum = sum+i;
			i++;
		}
		for(int j =0; j<=n;j++){
			forSum = forSum +j;
		}
		System.out.println("sum is "+sum);
		System.out.println("sum is "+forSum);
		
		
		
	}
}