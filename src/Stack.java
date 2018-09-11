import java.util.Scanner;

import serviceImpl.ServiceImpl;
import view.View;

public class Stack {
	public static void main(String[] args) {
		ServiceImpl stack = new ServiceImpl();
		View view = new View();
		Scanner scan = new Scanner(System.in);
		view.controller(scan, stack);


	}

}
