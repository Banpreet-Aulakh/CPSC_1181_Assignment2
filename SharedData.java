
/*Shared Data class to be accessed by the threads*/
public class SharedData {
	private int value;
	
	public void setSharedData(int n){ //sets the instance variable
	 value = n;
	 }
	public int getSharedData(){ //gets the instance variable
	 return value;
	 }

}
