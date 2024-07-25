package p0722.collection;

public class LottoNumber {

	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<>();
		while(lotto.size() < 6) {
			lotto.add((int)(Math.random()*45 + 1));   //  1 - 45사이의 수 6개
		}
		
		
//1. 
//		List<Integer> lo=new ArrayList<>(lotto);
//		Collections.sort(lo, Collections.reverseOrder());
//2.
		List<Integer> lo=new ArrayList<>(lotto);
		Collections.sort(lo, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		
		for(Integer ob:lo) {
			System.out.print(ob + " ");
		}
		
		//--------------------------------------------------------------------
/*		Set<Integer> lotto = new HashSet<>();
		while(lotto.size() < 6) {
			lotto.add((int)(Math.random()*45 + 1));   //  1 - 45사이의 수 6개
		}
		
		List<Integer> lo=new ArrayList<>(lotto);
		Collections.sort(lo);
		Collections.reverse(lo);
		
		for(Integer ob:lo) {
			System.out.print(ob+"  ");
		}

	}

}
