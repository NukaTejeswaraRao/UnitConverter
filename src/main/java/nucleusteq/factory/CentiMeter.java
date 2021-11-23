package nucleusteq.factory;

public class CentiMeter implements Measurement {

	public double toMeterStandard(double number) {

		return number / 100;
	}

	public double fromMeterStandard(double number) {

		return number * 100;
	}

}
