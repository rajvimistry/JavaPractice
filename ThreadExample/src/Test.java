
public class Test {

	public static void main(String[] args) {
		int[] arr = new int[100];
		int result = 0;
		
		for(int i=0; i<100;i++) {
			arr[i] = i;
		}
		//System.out.println("array length: "+arr.length);
		Sum sum = new Sum(arr);
		
		Thread[] threadArr = new Thread[arr.length/10];
		for(int i=0, j=0; i<threadArr.length; i++) {
			
			threadArr[i] = new CreateThread(Integer.toString(i), j, sum);
			threadArr[i].start();
			j += 10;
		}
		//new CreateThread().getResult();	
	}
}
