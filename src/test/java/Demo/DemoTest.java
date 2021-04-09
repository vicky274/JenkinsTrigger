package Demo;

public class DemoTest {

	
	//mvn test[optional] exec:java -Dexec.mainClass="Demo.DemoTest" -Dexec.classpathScope="test"
	
	//how to run main method in maven
	
	//using exec maven plugin
	//Note:classpath should be set to test not in main
	//mvn command in eclipse -exec:java
	
	public static void main(String[] args) {
		
		
		for(int i=0; i<10; i++){
			
			System.out.println("Executed in jenkins");
		}
		

	}

}
