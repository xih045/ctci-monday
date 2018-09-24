public A {
	public static List<Integer> plusOne (ArrayList<Integer> num) {
		
		int temp = num.get(num.size() - 1) + 1;
		for (int i=num.size() - 1; i> 0; i--) {
			if(num.get(i) != 10) break;
			num.set(i, 0);
			num.set(i-1, num.get(i-1) + 1);	
		}
		if (num.get(0) == 10) {
			num.set(0, 0);
			num.add(0,1);
		}
		return num;
	}
}