package iniciante;

public class Exercicio03 {
	double r;
	float area,PI;
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double getArea() {
		return (double) ((r*r)*Math.PI);
	}
}