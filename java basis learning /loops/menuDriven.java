import java.util.*;
class menuDriven {
	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);
		int i;
		do{
			System.out.println("enter marks");
			int marks = imput.nextInt();
			
			if(marks>=90 && marks <= 100){
				System.out.println("This is good");
				
			}else if (60<=marks && marks <= 89) {
				System.out.println("this is also good");
			}else if (0<=marks && marks <= 59) {
				System.out.println("this is good as well ");
			}else {
				System.out.println("enter valid marks from range 0-100");
			}
			i = imput.nextInt();
			
		}while(i==1);
		
	}
}