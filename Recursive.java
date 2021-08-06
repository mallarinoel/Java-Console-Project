import java.util.*;
class Recursion {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  System.out.print("Enter 2 numbers: ");
		  int fNum = sc.nextInt();
		  int sNum = sc.nextInt();
		  
		  System.out.println("Addition of two numbers is: " + additionNumbers(fNum + sNum));
		  
		  System.out.println("Subtraction of two numbers is: " + subtractionNumbers(fNum - sNum));
		  
		  System.out.println("Multiplication of two numbers is: " + multiplicationNumbers(fNum * sNum));
		  
		  System.out.println("Division of two numbers is: " + divisionNumbers(fNum / sNum));
		  sc.close();
		}

		public static int additionNumbers(int n){
		  if(n == 0)
			  return (n + additionNumbers(n - 1));
		  else
		   return(n);
		}
		   
		public static int subtractionNumbers(int n){
		  if(n == 0)
			  return (n - subtractionNumbers(n - 1)); 
		  else
		     return(n);
		}

		public static int multiplicationNumbers(int n){
		  if(n == 0)
		  return (n * multiplicationNumbers(n - 1));
		  else
		   return(n);
		}

		public static int divisionNumbers(int n){
		  if(n==1)
		   return(n);
		  else
		   return (n / divisionNumbers(n - 1));   
		}
}
