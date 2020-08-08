class ContinueDemo {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 40; i++) {
		
			if(i % 7 == 0 && i % 5 == 0)
				continue;
			else
				System.out.println(i);
		}
	}
}
/* Output
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_7August/Codes$ javac ContinueDemo1.java
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_7August/Codes$ java ContinueDemo 
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
36
37
38
39
40
*/

