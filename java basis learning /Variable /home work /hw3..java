import java.util.*;
class Tables {
	public static void main(String[] args) {
		
		Scanner imput = new Scanner(System.in);
		int tableOf = imput.nextInt();
		System.out.println("------------ \ntable of "+ tableOf);
		for (int i = 1 ; i<11;i++) {
			int multiply = tableOf * i;
			System.out.println(tableOf + " x " +i+" = "+multiply);
			
			
		}
		
		
	}
}