/* WAP using StringBuffer "Healthy" for the following methods:
 * Insert(int, String) to insert (space) at 4th index and "self" at 8th index and deletecharAt() to delete character at 4th index.
 * Input: 
 * Healthy
 * Heal thy
 * Heal thyself
 * Healthyself
 */

class Program {

	public static void main(String[] args) {
	
		StringBuffer sb = new StringBuffer("Healthy");

		sb.insert(4, " ");
		System.out.println(sb);

		sb.insert(8, "self");
		System.out.println(sb);

		sb.deleteCharAt(4);
		System.out.println(sb);
	}
}
