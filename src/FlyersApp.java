import java.text.NumberFormat;
import java.util.Scanner;

public class FlyersApp {

	public static void main(String[] args) {
		// App for determining availability of delivery and ordering food at Flyers'
		// fast-food Restaurant
		// Scanner constructors
		Scanner scn = new Scanner(System.in);
		Scanner zip = new Scanner(System.in);
		Scanner select = new Scanner(System.in);
		Scanner quant = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		// String and variable declarations
		String zipc;
		int zipcode, locale = 2;
		double total = 0, subtotal = 0, burger = 4.50, drink = 1.50, fries = 2.50, dessert = 3;
		final double TAX = .05, DELIVERY = 5, DELIVERMAX = 7;
		int orderdsg = 0, selectiondsg = 0;
		do {

			System.out.println("Welcome to Flyer's!");
			System.out.println("Will your order be for pickup or delivery?");
			String order = scn.nextLine();
			String order1 = order.toLowerCase();

			switch (order1) {
			case "pickup":
				orderdsg = 0;
				if (orderdsg == 0) {
					System.out.println("We have several menu items for you to choose from:");
					do {
						System.out.println("A) Flyers' Burger: $4.50 per order.");
						System.out.println("B) Flyers' Drink: $1.50 per order.");
						System.out.println("C) Flyers' Fries: $2.50 per order.");
						System.out.println("D) Flyers' Dessert: $3.00 per order.");
						System.out.println("E) to Exit");
						System.out.println("T) for your total when your finished");
						char selection = select.next().charAt(0);

						switch (selection) {
						case 'A':
							System.out.println("How many orders of Flyers' Burgers would you like?");
							int quantity = quant.nextInt();
							if (quantity != 0)
								subtotal += (burger * quantity);
							System.out.println("Your sub-total is:");
							System.out.println(formatter.format(subtotal));
							System.out.println("What else would you like?");
							break;
						case 'B':
							System.out.println("How many orders of Flyers' Drink would you like");
							quantity = quant.nextInt();
							if (quantity != 0)
								subtotal += (drink * quantity);
							System.out.println("Your sub-total is:");
							System.out.println(formatter.format(subtotal));
							System.out.println("What else would you like?");
							break;
						case 'C':
							System.out.println("How many orders of Flyers' Fries would you like");
							quantity = quant.nextInt();
							if (quantity != 0)
								subtotal += (fries * quantity);
							System.out.println("Your sub-total is:");
							System.out.println(formatter.format(subtotal));
							System.out.println("What else would you like?");
							break;
						case 'D':
							System.out.println("How many orders of Flyers' Dessert would you like");
							quantity = quant.nextInt();
							if (quantity != 0)
								subtotal += (dessert * quantity);
							System.out.println("Your sub-total is:");
							System.out.println(formatter.format(subtotal));
							System.out.println("What else would you like?");
							break;
						case 'E':
							System.out.println("See you next time!");
							System.exit(0);
							break;
						case 'T':
							selectiondsg = 6;
							total = (subtotal * TAX) + subtotal;
							if (orderdsg == 1)
								if (locale == 0)
									total = total + (DELIVERY);
								else {
									total = total + (DELIVERMAX);
								}

							System.out.println("Amount due:");
							System.out.println(formatter.format(total));
							break;
						}
					} while (selectiondsg <= 5);
				}
				break;
			case "delivery":
				orderdsg = 1;
				System.out.println("What is your zip code?");
				zipc = zip.next();
				zipcode = Integer.parseInt(zipc);

				switch (zipcode) {
				case 60441:
				case 60451:
					locale = 1;
					System.out.println("delivery available with extra cost");
					break;
				case 60442:
				case 60443:
				case 60444:
				case 60445:
				case 60446:
				case 60447:
				case 60448:
				case 60449:
				case 60450:
					locale = 0;
					System.out.println("delivery available");
					break;

				default:
					locale = 2;
					System.out.println("delivery not available");

					break;
				}
			}
			if (locale == 2 && orderdsg == 1) {
				System.out.println(
						"Please enter a zipcode within our delivery area or go back and select pickup to continue.");
			} else
				System.out.println("What would you like us to delivery to you?");
		}

		while (locale == 2 && orderdsg == 1);

		System.out.println("We have several menu items for you to choose from:");
		do {
			System.out.println("A) Flyers' Burger: $4.50 per order.");
			System.out.println("B) Flyers' Drink: $1.50 per order.");
			System.out.println("C) Flyers' Fries: $2.50 per order.");
			System.out.println("D) Flyers' Dessert: $3.00 per order.");
			System.out.println("E) to Exit");
			System.out.println("T) for your total when your finished");
			char selection = select.next().charAt(0);

			switch (selection) {
			case 'A':
				System.out.println("How many orders of Flyers' Burgers would you like?");
				int quantity = quant.nextInt();
				if (quantity != 0)
					subtotal += (burger * quantity);
				System.out.println("Your sub-total is:");
				System.out.println(formatter.format(subtotal));
				System.out.println("What else would you like?");
				break;
			case 'B':
				System.out.println("How many orders of Flyers' Drink would you like");
				quantity = quant.nextInt();
				if (quantity != 0)
					subtotal += (drink * quantity);
				System.out.println("Your sub-total is:");
				System.out.println(formatter.format(subtotal));
				System.out.println("What else would you like?");
				break;
			case 'C':
				System.out.println("How many orders of Flyers' Fries would you like");
				quantity = quant.nextInt();
				if (quantity != 0)
					subtotal += (fries * quantity);
				System.out.println("Your sub-total is:");
				System.out.println(formatter.format(subtotal));
				System.out.println("What else would you like?");
				break;
			case 'D':
				System.out.println("How many orders of Flyers' Dessert would you like");
				quantity = quant.nextInt();
				if (quantity != 0)
					subtotal += (dessert * quantity);
				System.out.println("Your sub-total is:");
				System.out.println(formatter.format(subtotal));
				System.out.println("What else would you like?");
				break;
			case 'E':
				System.out.println("See you next time!");
				System.exit(0);
				break;
			case 'T':
				selectiondsg = 6;
				total = (subtotal * TAX) + subtotal;
				if (orderdsg == 1)
					if (locale == 0)
						total = total + (DELIVERY);
					else {
						total = total + (DELIVERMAX);
					}

				System.out.println("Amount due:");
				System.out.println(formatter.format(total));
				break;

			}

		} while (selectiondsg != 6);
	}
}
