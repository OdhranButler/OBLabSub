import java.util.ArrayList;
import java.util.Scanner;

// Student Name 	: Odhrán Butler
// Student Id Number: C00263565
// Date 			: november-2021
// Purpose 			: class implementation

public class MyHR {
    public static void main(String[] args) throws Exception {

        // int for checking amount of employees
        int employeeAmount;
        // int for menuchoice
        int mChoice;
        // exit bool
        boolean exit = false;
        ArrayList<Office> oList = new ArrayList<>();
        ArrayList<Employee> eList = new ArrayList<>();

        // clearing the console

        // instantiating offices
        for (int i = 0; i < 3; i++) {
            oList.add(new Office());
        }


        // this is the start of the menue it loops till exit is chosen
        while (!exit) {
            // clearing the screen
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // displaying menu
            System.out.println("1. list all offices");
            System.out.println("2. create new employees");
            System.out.println("3. list all employees");
            System.out.println("4. Exit");

            // reading inputs !!scannerbank!! send help 
            Scanner mScanner = new Scanner(System.in); // menue choice scanner
            Scanner eScanner = new Scanner(System.in); // scanner for amount of employees instances created
            Scanner makeScanner = new Scanner(System.in); // scanner for make of employee car
            Scanner modelScanner = new Scanner(System.in); // scanner for the model of employee car
            Scanner yearScanner = new Scanner(System.in); // scanner for the year of employee car
            Scanner oScanner = new Scanner(System.in); // scanner to choose what office the employees are assigend to
            Scanner tScanner = new Scanner(System.in); // scanner to choose what type of emplyee has been created

            //promting mChoice
            System.out.println("please enter the option 1,2 or 3: ");
            mChoice = mScanner.nextInt();

            // if invallid choice is entered
            if (mChoice != 1 && mChoice != 2 && mChoice != 3 && mChoice != 4) {

                // clear screen
                System.out.print("\033[H\033[2J");
                System.out.flush();

                // tell user they are an idiot
                System.out.println(" you have entered an invallid input, please try again");

            }

            // if option 1 is selceted
            else if (mChoice == 1) {

                // clear screen
                System.out.print("\033[H\033[2J");
                System.out.flush();

                // prints all office identifyers
                for (int i = 0; i < oList.size(); i++) {
                    System.out.println(oList.get(i).getRoomNumber());
                }

            }

            // if option 2 is selected
            else if (mChoice == 2) {

                // clear the screen
                System.out.print("\033[H\033[2J");
                System.out.flush();

                // the the user to enter the amount of employees

                System.out.println("Enter amount of employees");
                employeeAmount = eScanner.nextInt();

                // list add loop
                for (int i = 0; i < employeeAmount && i < 5; i++) {

                    eList.add(new Employee());

                }

                // user inputting employee details >send help< >headache generator<
                for (int i = 0; i < eList.size(); i++) {

                    int oTemp;
                    //clear screen
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    // prompting a bunch of shit
                    System.out.println("please enter the details for employee number " + (i + 1));
                    System.out.println("please enter the type employee type: ");
                    System.out.println("staff or manager");
                    eList.get(i).setEmployeeType(tScanner.nextLine());

                    //oh you're a manager?!?! whers your car??!??!?! >manager check and car detail input< 
                    if (eList.get(i).getEmployeeType() != "staff" && eList.get(i).getEmployeeType() == "manager") {

                        String temp1;
                        String temp2;
                        int temp3;

                        //overall and car make prompt
                        System.out.println("this employee is a manager, please fill out the following:");
                        System.out.println("please enter the car make");
                        temp1 = makeScanner.nextLine();

                        //model prompt
                        System.out.println("please enter the car model");
                        temp2 = modelScanner.nextLine();

                        //year prompt
                        System.out.println("please enter the car year");
                        temp3 = yearScanner.nextInt();

                        // car assigned to employee
                        eList.get(i).assignCar(temp1, temp2, temp3);
                    }
                    
                    // assigning employee to an office
                    System.out.println("what office is this employee assigned to? 1,2 or 3?");
                    oTemp = oScanner.nextInt();

                    // what office
                    if (oTemp != 1 && oTemp != 2 && oTemp != 3) {
                        System.out.println("no such office exists");
                    } else if (oTemp == 1) {
                        oList.get(1).setEmployee(eList.get(i));
                    } else if (oTemp == 2) {
                        oList.get(2).setEmployee(eList.get(i));
                    } else if (oTemp == 3) {
                        oList.get(3).setEmployee(eList.get(i));
                    }

                }

            }

            else if (mChoice == 3) {
                System.out.print("\033[H\033[2J");
                System.out.flush();

                for (int i = 0; i < eList.size(); i++) {
                    System.out.println(eList.get(i).getNumber());
                }

            }
            System.in.read();
            if (mChoice == 4) {
                exit = true;
                mScanner.close();
                eScanner.close();
                makeScanner.close();
                modelScanner.close();
                yearScanner.close();
                oScanner.close();
                tScanner.close();
            }

        }

    }
}