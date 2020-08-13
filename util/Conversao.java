package util;

public class Conversao {
	
	public static final double IOF = 0.06;
	
	public static double calculo(double vlReal) {
		return vlReal += vlReal * IOF;
	}

}
