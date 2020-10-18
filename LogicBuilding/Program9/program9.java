// Write a program to print ASCCI of character Capital 'A' to Capital 'Z'


class Program{
	
	public static void main(String... args){
	
		for(char ch = 'A'; ch <= 'Z'; ch++){
		
			System.out.printf("%c = %d \n ", ch,(int)ch);
		
		}
	}
}
