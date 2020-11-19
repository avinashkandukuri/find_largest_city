package com.test.findlargestcity;

import java.util.Scanner;

import com.test.findlargestcity.util.Util;
import com.test.findlargestcity.service.Service;

/**
 * 
 * Application interacts with console and reads input
 *
 */
public class Application {

	public static void main(String[] args) throws Exception {

		Service service = new Service();
		Scanner scanner = null;
		try {
			System.out.print("Search state by name or abbreviation (nm/ab) : ");
			scanner = new Scanner(System.in);
			String choice = scanner.nextLine().toLowerCase();
			if (!("nm".equals(choice) || "ab".equals(choice))) {
				System.out.println("Invalid choice!");
			} else {
				while (true) {
					System.out.print("Enter your input (Quit?q): ");
					String input = scanner.nextLine();
					if ("q".equalsIgnoreCase(input)) {
						break;
					} else {
						String stateCode = null;
						try {
							if ("nm".equals(choice)) {
								stateCode = Util.getStateCodeByName(input);
							} else {
								stateCode = input.toUpperCase();
							}
							System.out.println(service.getContent(stateCode));
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (null != scanner) {
				scanner.close();
			}
		}
	}
}
