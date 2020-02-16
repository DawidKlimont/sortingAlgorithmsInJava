
public abstract class Sort {

	public abstract void sort(int[] xs);
	
	protected void swap(int fst, int snd, int[] xs) {
		if((fst!=snd)&&(fst>=0)&&(snd>=0)&&(fst<xs.length)&&(snd<xs.length)) {
			int temp = xs[fst];
			xs[fst] = xs[snd];
			xs[snd] = temp;
		}
	}
}
