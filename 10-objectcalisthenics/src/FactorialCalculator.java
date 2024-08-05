import java.util.Scanner;

public class FactorialCalculator {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter number");
	int number=scanner.nextInt();
	
	int factorial=calculateFactorial(number);
	
	if(factorial==-1) {
		System.out.println("can not calculate factorial of a negative number");
		return;
	}
	
	
	System.out.println(factorial);
}


private static int calculateFactorial(int number) {
	
	if(number==0) return 1;
	if(number<0) return -1;
	int fact=1;
	for(int i=0;i<=number;i++) {
		fact=fact*1;
	}
	return fact;

}
}