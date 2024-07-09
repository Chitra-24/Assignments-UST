
public class stringExample {

	public static void main(String[] args) {
		String str1 = "Hello";
        String str2 = "hello";
        String str3 = "World";
        String str4 = "World";

        System.out.println("Comparing " + str1 + " and " + str2 + " using equals(): " + str1.equals(str2));
        System.out.println("Comparing " + str3 + " and " + str4 + " using equals(): " + str3.equals(str4));

        System.out.println("Comparing " + str1 + " and " + str2 + " using the == operator: " + (str1 == str2));
        System.out.println("Comparing " + str3 + " and " + str4 + " using the == operator: " + (str3 == str4));

        System.out.println("Comparing " + str1 + " and " + str2 + " using compareTo(): " + str1.compareTo(str2));
        System.out.println("Comparing " + str3 + " and " + str4 + " using compareTo(): " + str3.compareTo(str4));

	}

}
