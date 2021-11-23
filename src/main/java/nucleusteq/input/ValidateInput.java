package nucleusteq.input;

import java.util.InputMismatchException;

public class ValidateInput {
	public void checkInput(String unit) {
		try {
			if (!(unit.equals("mm") || unit.equals("cm") || unit.equals("m")))
				throw new InputMismatchException("value doesn't match any mentioned type");
		} catch (InputMismatchException e) {
			System.out.println("Exception: " + e.getMessage());
			return;
		}
	}
}
