package day21;

public class Samgak {
	private int width, height;
	double area;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		this.area = width * height / 2;
	}
	@Override
	public String toString() {
		return "삼각형의 밑변 :" + width + ", 높이 : " + height + ", 넓이 : " + area;
	}
	
	
	
}
