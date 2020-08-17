package day21;

public class Nemo implements Comparable{
	
	private int garo, sero, area;
	
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
		return "Nemo garo = " + garo + ", sero = " + sero + ", area = " + area;
	}

	@Override
	public int compareTo(Object o) {
		Nemo n = (Nemo) o;
		// 이제 필요한 데이터가 준비됐으니
		// 비교 기준을 정해준다.
		// 우리의 경우 면적(area)를 기준으로 한다.
		int area1 = n.getArea();		
		
		int result = area - area1;
		return result;
	}
	
	public Nemo() {
	}

}
