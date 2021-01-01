package assignments.assignment14_OOP;

public class Question12_Phone {
	
	public static void main(String[] args) {
		
		CameraPhone cp1 = new CameraPhone(4,4);
		System.out.println(cp1.numPictures());
		
	}

}

class Phone{
	
}

class CameraPhone extends Phone{
	int imageSize;
	int memorySize;
	
	public CameraPhone(int imageSize, int memorySize) {
		this.imageSize = imageSize;
		this.memorySize = memorySize;
	}
	
	public int numPictures() {
		return (memorySize*1000)/imageSize;
	}
	
	
	
	
}