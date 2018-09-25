
import java.util.Collection;
import java.util.Scanner;
public class CarInstall {
	
 public static int MonthlyPayment (int CarPrice,int DownPayment, int LenghtofLoan, int Interest) {
    	 
    	 int monthlyPayment, value ;
    	 
    	 value  = CarPrice-DownPayment;
    	 value = (value)* (Interest)  / 100;
    	 
    	 return value;
    	 
    	 
     }
 
 
 public static int TotalInterest (int CarPrice,int DownPayment, int LenghtofLoan, int Interest) {
	 
	 int monthlyPayment, value ,total=0;
	 
	 value  = CarPrice-DownPayment;
	 while (value>0){
	 value = (value)* (Interest)  / 100;
	 total= value + total ;
	 }
	 return total/100;
	 
	 
 }

	public static void main(String[] args) {
		
		int CarPrice,DownPayment,Interest, LenghtOfLoan ;
		Scanner Input = new Scanner (System.in);		
		System.out.println("Whats the price of the Car");
		Scanner br = new Scanner(System.in);
		CarPrice= br.nextInt();
		
		System.out.println("How Much Downpayment");
		DownPayment= br.nextInt();
		
		System.out.println("Enter Lenght Of loan");
		Interest= br.nextInt();
		
		System.out.println("Enter Interest Rate");
		LenghtOfLoan= br.nextInt();
		
		
		System.out.println("Monthly payment Will be ");

		System.out.println(MonthlyPayment (CarPrice, DownPayment, Interest, LenghtOfLoan));
		
		
		System.out.println("Total Interest paid will be  ");
		System.out.println(TotalInterest (CarPrice, DownPayment, Interest, LenghtOfLoan));



		


		
		
		
		
			
	
		
		
	
		
		

	}

}
