
class Dynamic_M_D {

	public abstract class Game {
		abstract void rules();

		public Game() {

		}

	}

	class Basketball extends Game {
		@Override
		void rules() {
			System.out.println("Basketball rule method");
		}

		class Football extends Game {
			@Override
			void rules() {
				System.out.println("Football rule method  ");
			}

		}
	}
//		public static void main(String[] args) {

//	Write a program to implement dynamic method dispatch
//	Take a abstract class Game. Create abstract method void rules (). 
//	create non-abstract method and constructors and implement them in inherited 
//  class like Basketball, Football etc

	// Game g1 = new Basketball();

 }
