package day15;

public class Test00 {
	public Test00() {
	
	Saram[] nugu = new Saram[5];
	String[] names = {"윤요셉", "유병욱", "오혜찬", "이지우", "장성환"};
	int[] ages = {33, 29, 28, 27, 26};
	char gen = 'M';
	
	for(int i = 0; i < nugu.length; i++) {
		nugu[i] = new Saram(names[i], ages[i], gen);
	}
	
	}
	public static void main(String[] args) {
		new Test00();
	}

}

class Saram{
	String name;
	int age;
	char gen;
	
	public Saram() {}
	public Saram(String name, int age, char gen) {
		
	}
}