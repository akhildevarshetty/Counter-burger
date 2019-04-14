package composite;

public class Client {

	public static void main(String[] args) {
		Client.runTest();
	}
	
	public static void runTest()
    {
        Component theOrder = BuildOrder.getOrder() ;
        theOrder.printDescription();

    }

}
