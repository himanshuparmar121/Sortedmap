class Mall {

	public static void main(String[] args) {
	
		int floor = 1;

		switch(floor) {
		
			case 1:
				{
					char ch = 'S';		// S for shopping and F for food.

					System.out.println("At case 1");
					
					switch(ch) {
					
						case 'S':
						case 's':
							System.out.println("Shopping");
							break;

						case 'F':
						case 'f':
							System.out.println("Nusat Khaiche");
							break;
						
						default:
							System.out.println("Service Not Available");
							break;
					}

				}
				break;

			case 2:
				{
					char ch = 'M';		// M for shopping and P for Play Station.
					
					System.out.println("At case 1");

					switch(ch) {
					
						case 'M':
						case 'm':
							System.out.println("Dil Bechara | Movie");
							break;

						case 'P':
						case 'p':
							System.out.println("Football");
							break;

						default:
							System.out.println("Service Not Available");
							break;
					}
				}
				break;

			default :
				System.out.println("Wrong Choice");
		}
	}
}
