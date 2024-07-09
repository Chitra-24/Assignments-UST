class Swapper<T> {
    public  void doSwap(T a, T b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        T temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
public class genericExample {
	
	public static void main(String[] args) {
		Swapper S=new Swapper();
        Integer x = 10, y = 20;
        S.<Integer>doSwap(x, y);

        String s1 = "hello", s2 = "world";
        S.<String>doSwap(s1, s2);

	}

}
