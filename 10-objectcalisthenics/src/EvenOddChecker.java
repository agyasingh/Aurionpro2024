import java.util.*;
public class EvenOddChecker {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int number=scanner.nextInt();
	
	if(number%2==0) {
		System.out.println("Number is even");
		return;
	}
	
		System.out.println("Number is odd");
	}
}
