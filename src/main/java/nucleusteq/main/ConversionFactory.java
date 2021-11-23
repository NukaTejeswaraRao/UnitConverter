package nucleusteq.main;

import java.util.InputMismatchException;

import nucleusteq.factory.CentiMeter;
import nucleusteq.factory.Measurement;
import nucleusteq.factory.Meter;
import nucleusteq.factory.MilliMeter;

public class ConversionFactory {
	String mm = "mm", cm = "cm", m = "m";

	public Measurement getInstance(String unit) {
		if (unit.equalsIgnoreCase(mm))
			return new MilliMeter();
		else if (unit.equalsIgnoreCase(cm))
			return new CentiMeter();
		else if (unit.equalsIgnoreCase(m))
			return new Meter();
		else
			throw new InputMismatchException("invalid input");
	}
}
