package nucleusteq.input;

import java.util.Scanner;

public class GetInput {
	Scanner scan = new Scanner(System.in);
	ValidateInput Valid = new ValidateInput();

	public String getFromUnit() {
		System.out.println("enter the FromUnit from mm,cm,m");
		String UnitFrom = scan.nextLine();
		Valid.checkInput(UnitFrom);
		return UnitFrom;
	}

	public String getToUnit() {
		System.out.println("enter the ToUnit from mm,cm,m");
		String UnitTo = scan.nextLine();
		Valid.checkInput(UnitTo);
		return UnitTo;
	}

	public double getValue() {
		double givenValue = 0;
		try {
			System.out.println("Enter the value u want to convert");
			givenValue = scan.nextDouble();
		} catch (NumberFormatException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		return givenValue;
	}
}
