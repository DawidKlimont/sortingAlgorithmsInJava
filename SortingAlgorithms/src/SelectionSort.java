
public class SelectionSort {

	public SelectionSort() {
	}
	
	public int[] sort(int[] xs) {
		for (int i = 0; i < xs.length; i++) {
			int smallestIndex = i;
			for (int j = 1; j+i < xs.length; j++) {
				if(xs[smallestIndex]>xs[i+j]) {
					smallestIndex = i+j;
				}
			}
			swap(i, smallestIndex, xs);
		}
		return xs;
	}
	
	private void swap(int fst, int snd, int[] xs) {
		if((fst!=snd)&&(fst>=0)&&(snd>=0)&&(fst<xs.length)&&(snd<xs.length)) {
			int temp = xs[fst];
			xs[fst] = xs[snd];
			xs[snd] = temp;
		}
	}
	
	
}
