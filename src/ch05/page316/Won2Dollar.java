package ch05.page316;

public class Won2Dollar extends Converter {

	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		double wonDollar = src / ratio;
		return wonDollar;
	}

	@Override
	protected String getSrcString() {
		String won = "원";
		return won;
	}

	@Override
	protected String getDestString() {
		String dollar = "달러";
		return dollar;
	}
}
