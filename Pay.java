import java.util.*;
public class Pay {
    static Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {
        final double hourPay1 = 17;

        System.out.println("--------------------------------------");
        System.out.println("Skill level \t\tHourly Pay Rate($)\n--------------------------------------" +
                "\n\t1\t\t\t\t\t17.00\n\t2\t\t\t\t\t20.00\n\t3\t\t\t\t\t22.00\n--------------------------------------");
            System.out.print("Enter your skill level(1-3): ");
            int skill = sc.nextInt();
            System.out.print("Enter your hours work: ");
            int hoursWork = sc.nextInt();

            if( skill == 1){

                if(hoursWork > 40) {
                    double regPay = 40 * hourPay1;
                    double numOvertime = hoursWork - 40;
                    double overtime = hourPay1 * 1.5 * numOvertime;
                    double totalPay = regPay +overtime;
                    System.out.println("\n[PAY CHECK]");
                    System.out.println("Hours Worked: "+ hoursWork);
                    System.out.println("Hourly Payrate: $"+hourPay1);
                    System.out.println("Regular Pay: $"+regPay);
                    System.out.println("Overtime hour " + numOvertime);
                    System.out.println("Your total overtime pay is " + overtime);
                    System.out.println("Your Total pay is " + totalPay);
                    System.out.println("Total itemized deductions $ 0.00" );
                    System.out.println("Your Net pay $" + totalPay);
                }
                    else {
                    double regPay = hoursWork * hourPay1;
                    System.out.println("\n[PAY CHECK]");
                    System.out.println("Hours Worked: "+ hoursWork);
                    System.out.println("Hourly Payrate: $"+hourPay1);
                    System.out.println("Regular Pay: $"+regPay);
                    System.out.println("Overtime hour: 0.00");
                    System.out.println("Your total overtime pay is 0.00");
                    System.out.println("Your Total pay is " + regPay);
                    System.out.println("Total itemized deductions $ 0.00" );
                    System.out.println("Your Net pay $" + regPay);

                }

                }
            else if (skill == 2 || skill == 3){

                displayInsurance();
                System.out.print("Choose Option:");
                int option = sc.nextInt();
                double insurance = insuranceOption(option);
                double hourPay = payRateOption(skill);



                if(hoursWork > 40) {
                    double regPay = 40 * hourPay1;
                    double numOvertime = hoursWork - 40;
                    double overtime = hourPay * 1.5 * numOvertime;
                    double totalPay = regPay + overtime;
                    double totalInsurance = totalPay - insurance;

                    System.out.println("\n[PAY CHECK]");
                    System.out.println("Hours Worked: " + hoursWork);
                    System.out.println("Hourly Payrate: $" + hourPay);
                    System.out.println("Regular Pay: $" + regPay);
                    System.out.println("Overtime hour " + numOvertime);
                    System.out.println("Your total overtime pay is " + overtime);
                    System.out.println("Your Total pay is " + totalPay);
                    System.out.println("Total itemized deductions $ "+ insurance);
                    System.out.println("Your Net pay $" + totalInsurance);

                }
                else {
                    double regPay = hoursWork * hourPay1;
                    System.out.println("\n[PAY CHECK]");
                    System.out.println("Hours Worked: " + hoursWork);
                    System.out.println("Hourly Payrate: $" + hourPay);
                    System.out.println("Regular Pay: $" + regPay);
                    System.out.println("Overtime hour: 0.00");
                    System.out.println("Your total overtime pay is 0.00");
                    System.out.println("Your Total pay is " + regPay);
                    System.out.println("Total itemized deductions $ "+ insurance);

                    System.out.println("Your Net pay $" + regPay);
                }




            }
            }
            static void displayInsurance(){
                System.out.println("--------------------------------------------------------\n  Option\t\tExplanation\t\tWeekly cost to Employee\n--------------------------------------------------------" +
                        "\n\t1\t\t\tMedical Insurance1\t\t\t35.50\n\t2\t\t\tDental Insurance\t\t\t20.00\n\t3\t\t\tlong-term disability\t\t22.00 \n\t\t\t\tInsurance\n--------------------------------------------------------");


            }
            public static double insuranceOption(int option){
        double insurance;
                if(option == 1) {
                     insurance = 35.50;
                }
                else if(option == 2) {
                     insurance = 20.00;
                }
                else {
                     insurance = 10.0;
                }
            return insurance;
             }
             public static double payRateOption(int skill){
                double hourPay;
            if(skill == 2)
                hourPay =  20;
            else{
                hourPay = 22;

            }



                 return hourPay;
             }




    }

