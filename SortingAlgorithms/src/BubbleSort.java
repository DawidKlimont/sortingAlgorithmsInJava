
public class BubbleSort extends Sort{

	@Override
	public void sort(int[] xs) {
		boolean sorted = false;
		while(!sorted) {
			sorted = true;
			for (int i = 0; i < xs.length-1; i++) {
				if(xs[i]>xs[i+1]) {
					swap(i, i+1, xs);
					sorted = false;
				}
			}
		}
	}

}
