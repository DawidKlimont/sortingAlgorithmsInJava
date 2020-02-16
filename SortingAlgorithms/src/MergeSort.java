
public class MergeSort extends Sort{

	@Override
	public void sort(int[] xs) {
		sortRecursion(xs, 0, xs.length-1);
	}
	
	public void sortRecursion(int[] xs, int index1, int index2) {
		if(index1>=index2) {
			return;
		}else {
			int halfpoint = index1 + (index2-index1)/2;
			sortRecursion(xs, index1, halfpoint);
			sortRecursion(xs, halfpoint+1, index2);
			
			merge(xs, index1, halfpoint, index2);
		}
	}

	private void merge(int[] xs, int index1, int halfpoint, int index2) {
		// TODO Auto-generated method stub
		int[] left = new int[(halfpoint-index1)+1];
		int[] right = new int[index2-halfpoint];
		
		for (int i = 0; i < left.length; i++) {
			left[i] = xs[index1+i];
		}
		for (int i = 0; i < right.length; i++) {
			right[i] = xs[halfpoint+1+i];
		}
		
		int indexLeft = 0;
		int indexRight = 0;
		int index = index1;
		while(index<=index2) {
			if(indexLeft>=left.length) {
				xs[index] = right[indexRight];
				indexRight++;
			}else if(indexRight>=right.length) {
				xs[index] = left[indexLeft];
				indexLeft++;
			}else {
				if(left[indexLeft]<=right[indexRight]) {
					xs[index] = left[indexLeft];
					indexLeft++;
				}else {
					xs[index] = right[indexRight];
					indexRight++;
				}
			}
			index++;
		}
	}

}
