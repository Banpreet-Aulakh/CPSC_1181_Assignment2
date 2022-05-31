
/** Explanation
 *	2 objects of the MyThread class are created using their constructors. In the MyThread class the start() method creates a
 *  thread and starts it. Once T-1 is created and runs T-2 is also created and started. Now, both threads are running. The threads
 *  execute a loop when they run and manipulate the shared data depending on the instance variables in the MyThread class. 
 *  When T-1 runs it sets the data to the number of times it has looped. T-2 gets the number of times it has looped alongside 
 *  how many times it has looped as well. T-1 sleeps for n*100 milliseconds while T-2 sleeps for 50ms. Therefore, T-2 is able to loop multiple times
 *  before T-1 races it for the resource. T-2 then exits the loop before T-1 is finished setting the last data.
 */

/** Output
 *	Creating : T-1
 *	Starting T-1
 *	Creating : T-2
 *	Starting T-2
 *	Running : T-1
 *	Set 1
 *	Running : T-2
 *	get 1, 1
 *	get 2, 1
 *	Set 2
 *	get 3, 2
 *	Set 3
 */

public class Test {
	public static void main(String[] args) {
		SharedData sd = new SharedData(); // declare shared data object
		MyThread t1 = new MyThread(sd,1,"T-1"); // create MyThread 1 object with constructor
		
		t1.start(); // start thread 1
		
		MyThread t2 = new MyThread(sd,0,"T-2"); // create MyThread 2 object with constructor
		
		t2.start(); // start thread 2
	}

}
