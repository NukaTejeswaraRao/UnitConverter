package nucleusteq.factory;

public interface Measurement {
	public abstract double toMeterStandard(double number);
	public abstract double fromMeterStandard(double number);

}