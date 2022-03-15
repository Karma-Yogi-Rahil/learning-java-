import java.util.*;
class hw1 {
	public static void main(String[] args) {
		
		// take two imputs number1 and number
		Scanner imput = new Scanner(System.in);
		System.out.println("enter number 1 ");
		int number1 = imput.nextInt();
		System.out.println("enter number 2 ");
		int number2 = imput.nextInt();
		System.out.println("select a operation number \n 1:Addition \n 2:Positive Subtraction \n 3:Multipication \n 4:Division\n 5:modulo");
		int operationNumber = imput.nextInt();
		
		
		//switch case 
		switch(operationNumber){
			case 1://addition
				int add = number1 + number2 ;
				System.out.println("the addition is "+add);
				break;
			
			case 2 ://subtraction
				if(number2 > number1){
					int sub = number2 - number1;
					System.out.println("the positive subtraction is "+ sub);
					
				}else {
					int sub = number1 - number2;
					System.out.println("the positive subtraction is "+ sub);
				}
				break;
				
			case 3://multiplication 
				int multi = number1*number2;
				System.out.println("the multiplication is "+multi);
				break;
				
			case 4://division
				int div = number1/number2;
				System.out.println("the division is "+div);
				break;
			
			case 5://modulo
				int mod = number1%number2;
				System.out.println("the modulo is "+mod);
				break;
	
			default : 
				System.out.println("enter valid operation number");
			
		}
		
		
		
		
		
	}
}