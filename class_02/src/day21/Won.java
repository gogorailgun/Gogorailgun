package day21;

public class Won implements Comparable {
	private int rad;
	private double area, arround;


	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}

	public double getArea() {
		return area;
	}

	public void setArea() {
		this.area = rad * rad * Math.PI;
	}

	public double getArround() {
		return arround;
	}

	public void setArround() {
		this.arround = 2 * rad * Math.PI;
	}


	@Override
	public String toString() {
		return "원의 반지름 " + rad + ", arround = " + arround +", area = " + area;
	}

	@Override
	public int compareTo(Object o) {
		Won w = (Won) o;
		
		double area1 = w.getArea();
		
		int result = (int)(area - area1);
		return result;
	}

	public static void main(String[] args) {

	}

}
