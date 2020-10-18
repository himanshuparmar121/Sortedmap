/// Wrte a pgram that drives loop in ascending order and find the numbers divided by 3 or 5 in descending order.

class Loop {

	public static void main(String[] args)  {

		int temp = 0;

		for(int i = 10; i <= 20; i++) {
		
			temp = ((10 + 30) - i);

			if(temp % 3 == 0 || temp % 5 == 0)
				System.out.print(temp + "  ");
		}
	}
}
