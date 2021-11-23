package nucleusteq.factory;

public class MilliMeter implements Measurement {

	public double toMeterStandard(double number) {

		return number / 1000;
	}
	
	public double fromMeterStandard(double number) {

		return number * 1000;
	}
}
