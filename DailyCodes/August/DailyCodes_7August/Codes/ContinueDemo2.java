class ContinueDemo {

	public static void main(String[] args) {
	
		int i = 1;

		while(i <= 50) {
		
			if(i % 5 == 0 || i % 7 == 0) {
			
				i++;
				continue;
			} else
				System.out.println(i);

			i++;
		}
	}
}
/* Output
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_7August/Codes$ vim ContinueDemo2.java
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_7August/Codes$ javac ContinueDemo2.java
^[[Ahimanshu@himansh:~/java9/DailyCodes/August/DailyCodes_7August/Codes$ java ContinueDemo 
1
2
3
4
6
8
9
11
12
13
16
17
18
19
22
23
24
26
27
29
31
32
33
34
36
37
38
39
41
43
44
46
47
48
*/
