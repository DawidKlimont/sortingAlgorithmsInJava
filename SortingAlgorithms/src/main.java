import java.util.Arrays;
import java.util.Random;


public class main {

	public static void main(String[] args) {
		
		int runs = 1000000;//how many test-runs shall be executed
		int arrayMaxSize = 50; //The arrays will have random length between [1,arrayMaxSize]
		int arrayMaxValue = 100; //The arrays will contain random values between [1,arrayValue[

		int succesfullRuns = 0;
		int sortedValues = 0;
		for(int i = runs; i>0; i--) {
			int[] xs =  testArray(arrayMaxSize,arrayMaxValue);
			int[] ys =  xs.clone();//Second array for testing if correct
					
			System.out.println("\r\nThe array is:");
			outputArray(xs);
			
			Sort s = new MergeSort();//MergeSort and SelectionSort are available
			s.sort(xs);
			
			outputArray(xs);
			
			Arrays.sort(ys);
			boolean Correct = sameContent(xs, ys);
			System.out.println("The array has been sorted correctly: "+Correct);
			if(Correct) {
				succesfullRuns++;
				sortedValues = sortedValues + xs.length;
			}
		}
		System.out.println("\r\n--- "+succesfullRuns+"/"+runs+" runs were succesfull --\r\n--- "+sortedValues+" integers were sorted ---");
	}
	
	public static int[] testArray(int arrayMaxSize, int arrayMaxValue) {
		Random r = new Random();
		int[] xs =  new int[r.nextInt(arrayMaxSize)+1];
		for(int i = xs.length; i>0; i--) {
			xs[i-1] = r.nextInt(arrayMaxValue);
		}
		return xs;
	}
	
	//Pretty much just toString
	public static void outputArray(int[] xs) {
		String array = "["+(xs[0]);
		for(int i = 1; i<xs.length; i++) {
			array = array+", "+xs[i];
		}
		System.out.println(array+"]");
	}
	
	//Just a check in order to test properly 
	public static boolean sameContent(int[] xs, int[] ys) {
		if(xs.length!=ys.length) {
			return false;
		}else {
			for (int i = 0; i < xs.length; i++) {
				if(xs[i]!=ys[i]) {
					return false;
				}
			}
			return true;
		}
	}

}
