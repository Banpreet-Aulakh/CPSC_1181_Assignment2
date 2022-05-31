
public class MyThread implements Runnable{
	private SharedData sd ; // shared data thread will manipulate
	private int code;
	private String name; //name of MyThread
	
	public MyThread (SharedData sd, int code, String name) { //Constructor
		this.sd = sd;
		this.code = code;
		this.name = name;
		System.out.println("Creating : " + name); // prints when thread is created through constructor
	}
	
	public void run() {
		int s;
		System.out.println("Running : " + name);
		for (int i=1 ; i <= 3 ;i++) {
				if (code == 1) { // code = Thread 1
					System.out.println("Set " + i);
					sd.setSharedData(i); 
					s = i * 100; //set s to the amount of milliseconds to sleep for
				} 
				else { // all other threads
					System.out.print("get " + i + ", "); 
					System.out.println(sd.getSharedData());
					s = 50 ; // s = 50 ms sleep on thread 2
				}
				
				try {
					Thread.sleep(s); // sleep for "s" milliseconds 100, 200, 300 for thread 1. 50ms for thread 2
				} catch (InterruptedException e) {
					System.out.println(e);
				}
		}
	}
	
	public void start() { //thread start method creates a thread
		System.out.println("Starting " + name );
		Thread theThread = new Thread(this);
		theThread.start();
	}

}
