
public class Sum {
	
	private volatile int result = 0;
	private int[] arr = null;
	
	public Sum() {}
	
	public Sum(int[] array) {
		this.arr = array;
	}
	
	public int AddNumbers(int a) {
		//System.out.println("here: "+arr.length);
		for(int i=a; i<a+10; i++) {
			result = result + arr[i];
		}
		return result;
	}

}
