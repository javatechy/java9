package javatechy;

@FunctionalInterface
interface PrivateInterface {
	void performOpr();

	private  int test(){
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
	}
}
