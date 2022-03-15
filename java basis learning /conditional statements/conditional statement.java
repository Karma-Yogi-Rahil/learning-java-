import java.util.*;

class conditionalSatatement {
	
	public static void main(String[] args) {
		
		// taking the input from user
		Scanner imput = new Scanner(System.in);
		int yourAge = imput.nextInt();
		int friendsAge = imput.nextInt(); 
		
		// condition to find adult or not 
		if(yourAge >=18){
			System.out.println("You are an adult now!");
			
		}else {
			System.out.println("you are not an adult yet!");
		}
		
		// condition to find age is even or odd
		if(yourAge % 2 ==0){
			System.out.println("its an Even number");
			
		}else {
			System.out.println(yourAge + " an odd number");
		}
		
		// to find how is older 
		if(yourAge == friendsAge){
			System.out.println("both are of same age");
			
		}else if (yourAge > friendsAge) {
			
				System.out.println("you are bigger than your friend");
		}else {
				System.out.println("your friend is bigger than you");
			}
		
	
	}
		
		
		
		
		
	}
