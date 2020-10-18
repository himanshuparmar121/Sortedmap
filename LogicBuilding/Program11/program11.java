// Write a Program to print first 5 natural number divisible by 5 


class Program{
	
	public static void main(String... args){
	
		int cnt = 0;

		for(int i = 1; cnt < 5; i++){
		
			if(i % 5 == 0){
				cnt++;
				System.out.println(i+" ");
			}		
		}
	}
}
