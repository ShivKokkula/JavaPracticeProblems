package Charge;

public class Charge {
	
	private final double rx;
	private final double ry;
	private final double q;
	
	public Charge(double x0, double y0, double q0) {
		this.rx = x0;
		this.ry = y0;
		this.q = q0;
	}
	
	public double potentailAt(double x, double y) {
		
		double k = 8.99e09;
		double dx = x - rx;
		double dy = y - ry;
		
		return k+q/Math.sqrt(dx*dx + dy*dy);
	}
	
	public String toString() {
		return q + "at" + "{" + rx + "," + ry + "}";
	}

	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		Charge c1 = new Charge(0.51, 0.63, 21.3);
		Charge c2 = new Charge(0.13, 0.64, 81.9);
		double v1 = c1.potentailAt(x, y);
		double v2 = c2.potentailAt(x, y);
		System.out.printf("%.2e\n",(v1 + v2));
//		System.out.println(new Charge(1.0,2.0,3.0));
		

	}

}
