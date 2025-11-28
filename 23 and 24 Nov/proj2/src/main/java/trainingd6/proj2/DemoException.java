package trainingd6.proj2;

public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =5, b = 0;
		String str = null;
		try {
			System.out.println(String.valueOf(str.indexOf("a")));

		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println(a);
		
	}

}
