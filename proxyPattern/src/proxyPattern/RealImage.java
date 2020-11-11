package proxyPattern;

public class RealImage implements Image {
	
	private String fileName;

	   public RealImage(String fileName){
	      this.fileName = fileName;
	      loadFromDisk(fileName);
	   }

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	private void loadFromDisk(String fileName){
	      System.out.println("Loading " + fileName);
	   }

}
