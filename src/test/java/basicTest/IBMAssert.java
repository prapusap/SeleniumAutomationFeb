package basicTest;

public class IBMAssert {

	
	
	public static void main(String[] args) {

		
		
		
		//Create an object --- IBMAssert
		
		IBMAssert obj = new IBMAssert();
		
		
		//call method by method name
		
		//AssertEqual();

		obj.AssertEqual("https://www.amazon.in/", "https://www.amazon.com/", "Amazon Application URL not matched");
		
		obj.AssertEqual("", "");
		
		
		
	}

	
	
	
	public void AssertEqual(String expectedValue, String actualValue) {
		
		
		if(expectedValue.equals(actualValue)) {
			
			System.out.println("Actual and expected value matched..." + actualValue);
		}
		
		else {
			
			System.out.println("Validation of Actual and expected value not matched..." + actualValue + " : " + expectedValue);
		}
		
		
		
	}
	
	
	
		
	
	public void AssertEqual(String expectedValue, String actualValue, String errorMessage) {
		
		
		if(expectedValue.equals(actualValue)) {
			
			System.out.println("Actual and expected value matched..." + actualValue);
		}
		
		else {
			
			System.out.println("Validation of Actual and expected value not matched..." + actualValue + " : " + expectedValue);
			System.out.println("Error Message: " + errorMessage);
		}
		
		
		
	}
	
	
	
	
	
}
