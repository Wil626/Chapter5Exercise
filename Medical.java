import java.util.*;
public class Medical {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("This program helps people self-diagnose the symptoms of an earache arrcording to the following self-help chart.\n");

        System.out.print("Does the pain get worse when you pull at your earlobe?(1 for YES and 0 for No.)\n");
        int choice = sc.nextInt();
        if(choice == 1)
            System.out.println("YES: You probably have an infection of the outer ear canal.");
            else if (choice == 0){
                System.out.println("NO: Do you have a blocked-up feeling in your ear that cannot be cleared by swallowing?(1 for YES and 0 for No.)");
                int choice1 = sc.nextInt();
                     if(choice1 == 1) {
                    sayYes();
                     hearingWorse();
                    }
                    else if(choice1 == 0)
                    System.out.println("NO: Is there a sticky yellow-green discharge?(1 for YES and 0 for No.)");
                    int choice3 = sc.nextInt();
                    if( choice3 == 1)
                    System.out.println("YES: You may have an infection of the outer ear canal or middle ear.");
                    else if(choice3 == 0) {
                    sayNo();
                    painTeethJaw();

            }

        }
    }
    static void sayYes() {
        int choice = sc.nextInt();
        if(choice == 1)
            System.out.println("YES: Changes in air pressure may have damaged your inner ear.");
        else if(choice == 0) {
            System.out.println("NO: Has your hearing become worse over the past few weeks?(1 for YES and 0 for No.)");
        }
    }
    static void hearingWorse() {
        int choice = sc.nextInt();
        if( choice == 1)
            System.out.println("Yes: You may have wax blockage.");
        else if(choice == 0)
            System.out.println("No: You may have an acute middle ear infection.");

    }
    static void sayNo() {
        System.out.println("NO: Do you have cold?(1 for YES and 0 for No.)");
        int choice = sc.nextInt();
        if(choice == 1)
            System.out.println("Yes: Earache is a common symptom of colds.");
        else if(choice == 0) {
            System.out.println("No: Do you also have pain your teeth or jaw?(1 for YES and 0 for No.)");

        }
    }
    static void painTeethJaw() {
        int choice = sc.nextInt();
        if(choice == 1)
            System.out.println("Yes: Tooth or gum trouble is sometimes felt as ear pain---contact your dentist.");
        else if(choice == 0)
            System.out.println("No: Unable to suggest a diagnosis--Contact your physician.");

    }

}



		/*
		System.out.println("This program helps people self-diagnose the symptoms of an earache arrcording to the following self-help chart.\n");
		System.out.print("Does the pain get worse when you pull at your earlobe?(1 for YES and 0 for No.)");
		int choice = sc.nextInt();

		if(choice == 1) {
			System.out.println("YES: You probably have an infection of the outer ear canal.");
		}
		else if (choice == 0){

			System.out.println("NO: Do you have a blocked-ip feeling in your ear that cannot be cleared by swallowing?(1 for YES and 0 for No.)");
			int choice2 = sc.nextInt();
			if(choice2 == 1)
				System.out.println("YES: Changes in air pressure may have damaged your inner ear.");
			else if(choice2 == 0) {
				System.out.println("NO: Has your hearing become worse ober the past few weeks?(1 for YES and 0 for No.)");
				if( choice == 1)
					System.out.println("Yes: You may have wax blockage.");
				else if(choice == 0)
					System.out.println("No: You may have an acute middle ear infection.");
			}

			else if(choice == 0) {
				System.out.println("NO: Is there a sticky yellow-green discharge?(1 for YES and 0 for No.)");
				if(choice == 1)
					System.out.println("YES: You may have an infection of the outer ear canal or middle ear.");
				else if(choice == 0) {
					System.out.println("NO: Do you have cold?(1 for YES and 0 for No.)");
					if(choice == 1)
						System.out.println("Yes: Earache is a common symptom of colds.");
					else if(choice == 0) {
						System.out.println("No: Do you also have pain your teeth or jaw?(1 for YES and 0 for No.)");
						if(choice == 1)
							System.out.println("Yes: Tooth or gum trouble is sometimes felt as ear pain---contact your dentist.");
						else if(choice == 0)
								System.out.println("No: Unable to suggest a diagnosis--Contact your physician.");

					}
				}
			}


		}
		else
			System.out.println("Invalid output.");

	}

}
*/

