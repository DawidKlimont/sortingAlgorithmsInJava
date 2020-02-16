
public class SelectionSort extends Sort{
	
	@Override
	public void sort(int[] xs) {
		for (int i = 0; i < xs.length; i++) {
			int smallestIndex = i;
			for (int j = 1; j+i < xs.length; j++) {
				if(xs[smallestIndex]>xs[i+j]) {
					smallestIndex = i+j;
				}
			}
			swap(i, smallestIndex, xs);
		}
	}
}
