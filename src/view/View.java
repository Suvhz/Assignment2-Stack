package view;

import java.util.Scanner;

import serviceImpl.ServiceImpl;

public class View {
	public void menu() {
		System.out.println("WELCOME TO THE STACK");
		System.out.println("1. Press 1 to push the item.");
		System.out.println("2. Press 2 to pop the top item");
		System.out.println("3. Press 3 to peek the top item");
		System.out.println("4. Press 4 to get all item");
	}
	public void controller(Scanner scan, ServiceImpl stack) {
		while (true) {
			menu();
			switch (scan.nextInt()) {
			case 1:
				System.out.println("Enter the item");
				System.out.println(stack.push("\n" + scan.next()) + " has been inserted.");
				System.out.println("\n-----------------------------------------------\n");
				break;
			case 2:
				String pop = stack.pop();
				if (pop != null) {
					System.out.println(pop + " has been removed");
				} else {
					System.out.println("No record found");
				}

				System.out.println("\n-----------------------------------------------\n");
				break;
			case 3:
				String peek = stack.peek();
				if (peek != null) {
					System.out.println(peek);
				} else {
					System.out.println("No record found.");
				}
				System.out.println("\n-----------------------------------------------\n");
				break;
			case 4:
				System.out.println("\n-----------------------------------------------\n");
				if(stack.getAll()!=null) {
					for (String ex : stack.getAll()) {
						System.out.println(ex);
					}
				}else {
					System.out.println("No record found");
				}
				System.out.println("\n-----------------------------------------------\n");
				break;
			default:
				scan.close();
				System.exit(0);

			}

		}
	}

}
