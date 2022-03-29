package ch05.page316;

public class Km2Mile extends Converter {

	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		double kmMile = src / ratio;
		return kmMile;
	}

	@Override
	protected String getSrcString() {
		String km = "km";
		return km;
	}

	@Override
	protected String getDestString() {
		String mile = "mile";
		return mile;
	}
}
