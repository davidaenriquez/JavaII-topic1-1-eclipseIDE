package app;

public class HelloWorld {
	
	/**
     * this method will print a greeting
     * message with the given name
     * @param name the name that will
     * be in the greeting message
     */
    private void sayHello(String name) {
        System.out.println("Hello, my name is " + name);
    }

    /**
     * this method is the main method which
     * will start the application
     * the main method is the entry point
     * to the application
     * @param args
     */
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.sayHello("David");
    }

}
