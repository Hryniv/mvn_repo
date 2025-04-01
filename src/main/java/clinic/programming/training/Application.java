package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }
	
	public void greet() {
		List<String> list = new ArrayList<>();
		list.add("Hello");
		
		for (String e: list) {
			System.out.println("Greeting " + e);
		}
	}

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
    }
}