// write a program to print as follows : Odd : 1
// 				        Even : 2
// 				        .
// 				        .
// 				        .
// 				        Odd :15




class Program{

	public static void main(String[] args){
	
		for(int i = 1; i <= 15; i++){
		
			if(i % 2 == 0)
				System.out.println("Even : "+i);
			else
				System.out.println("Odd : "+i);
		}	
	}
}
