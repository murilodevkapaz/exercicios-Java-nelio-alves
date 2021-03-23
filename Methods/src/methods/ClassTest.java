package methods;

public class ClassTest {
	private String value1;
	
	
	//sadf
	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public  String method1() {
		return value1 + "add value";
	}
	
	public void method2() {
		String res = method1();
		System.out.println(res);
	}
	
	
	
}
