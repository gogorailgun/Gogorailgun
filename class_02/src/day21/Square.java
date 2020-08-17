package day21;

public class Square implements Comparable {
	
	private int garo;
	private int sero;
	private int area;
	
	public int getGaro() {
		return garo;
	}
	public void setGaro(int garo) {
		this.garo = garo;
	}
	public int getSero() {
		return sero;
	}
	public void setSero(int sero) {
		this.sero = sero;
	}
	public int getArea() {
		return area;
	}
	public void setArea() {
		this.area = garo * sero;
	}
	
	
	@Override
	public String toString() {
		return "삼각형의 가로 : " + garo + ", 세로 : " + sero + ", 넓이 : " + area;
	}
	
	@Override
	public int compareTo(Object o) {
		Square square = (Square) o;
		double area1 = square.getArea();
		return ((area - area1) < 0 ? -1 : 1);
	}
	
	
}
