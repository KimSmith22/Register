	package wineshop.orders;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	/**
	 * @author Kimberli
	 * 		   Jennifer
	 * 		   Daniel
	 *
	 */
	public class TestOrder {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			
			// variables
			String choice = "y";
			double price = 0.00;
			String description = null;
			double total = 0;
			 double grandTotal;
			int quantity;
			String name;
			
		Wine wine = new Wine();	
		
		
	ArrayList<Wine> winelist = new ArrayList<Wine>();
		
		winelist.add(new Wine("Villa Alena\t\t\t", "Moscato\t\t\t$ ", 6.99));
		winelist.add(new Wine("Beviano\t\t\t", "Moscato\t\t\t$ ", 9.99));
		winelist.add(new Wine("Flip Flop\t\t\t",  "Moscato\t\t\t$ ", 9.99));
		winelist.add(new Wine("Columbia Valley\t", "Merlot\t\t\t\t$", 11.99));
		winelist.add(new Wine("North Coast\t\t", "Merlot\t\t\t\t$", 17.99));
		winelist.add(new Wine("Mark West\t\t", "Pinot Noir\t\t\t$", 10.99));
		winelist.add(new Wine("DeLoach\t\t\t", "Pinot Noir\t\t\t$", 8.99));
		winelist.add(new Wine("Castle Rock\t\t", "Pinot Noir\t\t\t$", 12.99));
		winelist.add(new Wine("Murphy’s Law\t\t", "Riesling\t\t\t$", 11.99));
		winelist.add(new Wine("Washington Hills\t", "Riesling\t\t\t$", 7.99));
		winelist.add(new Wine("Standing Stone\t", "Riesling\t\t\t$", 6.99));
		winelist.add(new Wine("Bex\t\t\t\t", "Riesling\t\t\t$", 5.99));
				

			System.out.println("Welcome to our Wine Shop!");
			System.out.println();
		do{
			System.out.println("Press 1 to view our inventory:  ");
			Scanner k = new Scanner(System.in);
			int view = k.nextInt();
			if(view <1 || view > 1){//validation
				System.out.println("Please enter 1 to view our inventory:");
				view = k.nextInt();
			}//end validation
		
			switch(view){//view inventory switch

			case 1:
				System.out.printf("Wine Name\t\t\t Type \t\t\t Price\n");
		for (Wine x: winelist) {	//print inventory			
							System.out.println(x);	
				}		//end inventory print
			}//end view switch	
		do{
			k.nextLine();
			System.out.println();//blank line for visual
			System.out.println("Enter wine name:  ");
		    name = k.nextLine();
			
			
			
			if(name.equalsIgnoreCase("villa alena")){
				price = 6.99;
				description = "Moscado";
			}else if(name.equalsIgnoreCase("beviano")){
				price = 9.99;
				description = "Moscado";
			}else if(name.equalsIgnoreCase("flip flop")){
				price = 9.99;
				description = "Moscado";
			}else if(name.equalsIgnoreCase("columbia valley")){
				price = 11.99;
				description = "Merlot";
			}else if(name.equalsIgnoreCase("north coast")){
				price = 17.99;
				description = "Merlot";
			}else if(name.equalsIgnoreCase("mark west")){
				price = 10.99;
				description = "Pinot Noir";
			}else if(name.equalsIgnoreCase("deloach")){
				price = 8.99;
				description = "Pinot Noir";
			}else if(name.equalsIgnoreCase("castle rock")){
				price = 12.99;
				description = "Pinot Noir";
			}else if(name.equalsIgnoreCase("murphy's law")){
				price = 11.99;
				description = "Reisling";
			}else if(name.equalsIgnoreCase("washington hills")){
				price = 7.99;
				description = "Reisling";
			}else if(name.equalsIgnoreCase("standing stone")){
				price = 6.99;
				description = "Reisling";
			}else if(name.equalsIgnoreCase("bex")){
				price = 5.99;
				description = "Reisling";
			}
			
			System.out.println("Enter quantity:  ");
			 quantity = k.nextInt();
			 total +=price * quantity;
			grandTotal = total + (total * .06);
				
			k.nextLine();
			System.out.println("Another line item? (y/n)");
			choice = k.nextLine();
			if(choice.equalsIgnoreCase("y")){
			System.out.println("Press 'enter'");
			}
		}while(choice.equalsIgnoreCase("y"));
		
		//NumberFormatCurrency = NumberFormat.getFormattedCurrency();

		String message = "\nLINE ITEM\n"+
		"Wine:  " + name + "\n" +
		"Description:  " + description + "\n" +
		"Price:  " + (price) + "\n" +
		"Quantity:  " + quantity + "\n" +
		"Total:  " + (total) + "\n";
		
		System.out.println(message);
		
		System.out.println();
		System.out.println("Sub-total:  $" + total );
		System.out.println("Sales tax:  $" + total * .06);
		System.out.println("Order total:  $" + grandTotal);
		
		System.out.println("Select Payment Method:  1 for cash, 2 for check, or 3 for charge");
		int payment = k.nextInt();
		
		switch(payment){//payment switch
		case 1:
			System.out.println("Enter amount tendered:  ");
			double tendered = k.nextInt();
			System.out.println("Your change is:  $" + (tendered - grandTotal));
			break;
		case 2:
			System.out.println("Enter check number:  ");
			long check = k.nextLong();
			break;
		case 3:
			System.out.println("Enter credit card number:  ");
			long card = k.nextLong();
			
			System.out.println("Enter expiration date (mm/yyyy)");
			k.nextLine();
			String date = k.nextLine();
			System.out.println("Enter CVV:  ");
			int cvv = k.nextInt();
			break;
		}//end payment switch
		System.out.println("Would you like to continue shopping? y/n");
		k.nextLine();
		choice = k.nextLine();
		}while(choice.equalsIgnoreCase("y"));
		if(choice != "n"){
			System.out.println("");
		}
		}//psmv


	}// end class

