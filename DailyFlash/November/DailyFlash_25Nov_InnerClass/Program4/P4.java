import java.util.*;

class Gym {

	class Day0 {
	
		void workoutPlan() {
		
			System.out.println("Upper Body Workout");
		}
	}
	
	class Day1 {
	
		void workoutPlan() {
		
			System.out.println("Lower Body Workout");
		}
	}
	
	class Day2 {
	
		void workoutPlan() {
		
			System.out.println("Biceps and Triceps Workout");
		}
	}
	
	class Day3 {
	
		void workoutPlan() {
		
			System.out.println("Abs Workout");
		}
	}
	
	class Day4 {
	
		void workoutPlan() {
		
			System.out.println("Legs Workout");
		}
	}

	Scanner sc = new Scanner(System.in);

	void todaysWorkout() {
		
		System.out.println("Enter the Day Number 0 - 4: ");
		int n = sc.nextInt();

		switch(n) {
		
			case 0:
				new Day0().workoutPlan();
				break;
			
			case 1:
				new Day1().workoutPlan();
				break;

			case 2:
				new Day2().workoutPlan();
				break;

			case 3:
				new Day3().workoutPlan();
				break;

			case 4:
				new Day4().workoutPlan();
				break;

			default:
				System.out.println("Enter valid Day");
				break;
		}
	}

	public static void main(String[] args) {
	
		Gym obj = new Gym();
		obj.todaysWorkout();
	}
}
