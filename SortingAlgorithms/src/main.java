import java.util.Random;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1000000; i>0; i--) {
			int[] xs =  testArray();
					
			System.out.println("\r\nThe array is:");
			outputArray(xs);
			
			SelectionSort s = new SelectionSort();
			xs = s.sort(xs);
			outputArray(xs);
		}
		
	}
	
	public static int[] testArray() {
		Random r = new Random();
		int[] xs =  new int[r.nextInt(50)+1];
		for(int i = xs.length; i>0; i--) {
			xs[i-1] = r.nextInt(100);
		}
		return xs;
	}
	

	public static void outputArray(int[] xs) {
		String array = "["+(xs[0]);
		for(int i = 1; i<xs.length; i++) {
			array = array+", "+xs[i];
		}
		System.out.println(array+"]");
	}

}
