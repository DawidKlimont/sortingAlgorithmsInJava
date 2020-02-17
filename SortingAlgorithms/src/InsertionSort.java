
public class InsertionSort extends Sort {

	@Override
	public void sort(int[] xs) {
		for (int i = 0; i < xs.length; i++) {
			int j = i;
			while((j>0)&&(xs[j-1]>xs[j])) {
				swap(j-1, j, xs);
				j--;
			}
		}
	}

}
