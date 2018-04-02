package javatechy;

/**
 * Private methods are allowed in Java 9
 * 
 * @author deepak
 *
 */
@FunctionalInterface
interface PrivateInterface {
	void performOpr();

	public default void functionalInterfaceMethod() {
		System.out.println("Can Call private method in  a functional Interface" + test());
	}

	private int test() {
		return 1;
	}
}

public class PrivateMethodInterface {
	public static void main(String ar[]) {
		System.out.println("Hello");
		PrivateInterface pre = () -> {
			System.out.println("Hello2");
		};
		pre.performOpr();
		pre.functionalInterfaceMethod();
	}
}
