
public class CreateThread extends Thread {
	
	private int index = 0;
	Sum sum = null;
	static volatile int result = 0;
	String name = null;
	
	public CreateThread() {}
	
	public CreateThread(String name, int index, Sum sum){
		super(name);
		this.name = name;
		this.index = index;
		this.sum = sum;
	}
	
	public void run() {
		//System.out.println("Thread created "+this.getName());
		result = sum.AddNumbers(index);
		//System.out.println("Name: "+name+" Result: "+result);
		if(this.getName().equals("9")) {
			System.out.println("Result: "+result);
		}
	}
}
