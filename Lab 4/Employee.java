
public class Employee {
    private static int employeeRecordCount = 1000;
    private int employeeNumber;
    private String employeeType;
    companyCar employeeCar = null;

    public Employee() // constructor method #1
    {
        setNumber(employeeRecordCount);
		employeeRecordCount++;
    }

    // return employee record count
    public int getEmployeeRecordCount()
	{
		return employeeRecordCount;
	}

        
    //number set and get

    public int getNumber() {
        return employeeNumber;
    }

    public void setNumber(int numberIn)
    {
        employeeNumber = numberIn;
    }

    //employee type set and get
    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String typeIn) {
        employeeType = typeIn;
    }

    // assigns a car to this employee when called
    public void assignCar(String makeIn, String modelIn, int yearIn) {
        employeeCar = new companyCar();
        employeeCar.setMake(makeIn);
        employeeCar.setModel(modelIn);
        employeeCar.setYear(yearIn);
    }

    //returns the record count
    public int recordOut()
    {
        return employeeRecordCount;
    }

    // prints details and adds car if employee is a manager
    public String toString()
    {
        if(!"manager".equals(employeeType))
        {
            return "this employee's id is: " + employeeNumber +
            "\nthis employee is a " + employeeType +
            "\nbecause this employee is not a manager, they are not assigned a company car";
        }
        else if(employeeCar == null)
        {
            return "this employee's id is: " + employeeNumber +
            "\nthis employee is a " + employeeType +
            "\nthis manager is not assigned a car";
        }
        else
        {
            return "this employee's id is: " + employeeNumber +
            "\nthis employee is a " + employeeType +
            "\nthis employee has been assigned a company car see details below\n" +
            employeeCar.toString();
        }
    }
}