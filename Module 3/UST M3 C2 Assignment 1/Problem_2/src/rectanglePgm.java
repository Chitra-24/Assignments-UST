
class rectangle{
	int length;
	int breadth;
	public rectangle() {
		this.length=10;
		this.breadth=10;
	}
	public rectangle(int l,int b) {
		this.length=l;
		this.breadth=b;
	}
	void area() {
		float A=length*breadth;
		System.out.println("Area of rectangle is "+ A);
	}
}

public class rectanglePgm {

	public static void main(String[] args) {
		rectangle R=new rectangle();
		rectangle R1=new rectangle(5,6);
		R.area();
		R1.area();

	}

}
