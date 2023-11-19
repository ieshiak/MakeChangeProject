package makechange;

public class CashRegister {
	public static void main (String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//user story 1
		System.out.print("Please enter the price for the merchadise: ");
		double price = sc.nextDouble();
		//user story 2
		System.out.print("How much money is being tendered: ");
		double fundsInput = sc.nextDouble();
		double change = fundsInput - price;
		//user story 3
	    if (price == fundsInput) {
	        System.out.println("Perfect, you have enter the exact amount.");
	      }
	      if (price > fundsInput) {
	        System.out.println("Oops, you have not entered the full amount.");     
	     //user story 4
	      }
	      else {
	    	  double[] money = {20, 10, 5, 1, 0.25, 0.1, 0.05, 0.01};
	            int[] changeCounts = new int[money.length];

	            for (int i = 0; i < money.length; i++) {
	                int count = (int) (change / money[i]);
	                if (count > 0) {
	                    changeCounts[i] = count;
	                    change -= count * money[i];
	                }
	           }
	      System.out.println("The change amount is: $" + String.format("%.2f", fundsInput - price));

	         for (int i = 0; i < money.length; i++) {
	             if (changeCounts[i] > 0) {
	                 System.out.println("$" + String.format("%.2f", money[i])
	                            + " bills/coins: " + changeCounts[i]);
	             }
	         }
	      }
	      sc.close();
	}


    }
    