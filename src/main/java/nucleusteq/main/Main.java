package nucleusteq.main;

import nucleusteq.input.GetInput;
import nucleusteq.factory.Measurement;

public class Main {

	public static void main(String[] args) {

		String FromUnit = new GetInput().getFromUnit();
		String ToUnit = new GetInput().getToUnit();
		double value = new GetInput().getValue();

		Measurement obj1 = new ConversionFactory().getInstance(FromUnit);
		double meter = obj1.toMeterStandard(value);
		Measurement obj2 = new ConversionFactory().getInstance(ToUnit);
		double result = obj2.fromMeterStandard(meter);

		System.out.println(value + " " + FromUnit + " is converted to " + result + " " + ToUnit);
	}
}
