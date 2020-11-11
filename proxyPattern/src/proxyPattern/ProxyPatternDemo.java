package proxyPattern;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Image image = new ProxyImage("test_10mb.jpg");

	      //image will be loaded from disk
	      image.display(); 
	      System.out.println("");
	      
	      //image will not be loaded from disk
	      image.display(); 	
	}

}
