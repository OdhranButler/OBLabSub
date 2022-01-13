import java.util.ArrayList;

public class Office {

    private static int roomNumberCount = 100;
    private int roomNumber;
    private Address address;
    private ArrayList<Employee> employees = new ArrayList<>();
    
    // contructor
    public Office() {

        setRoomNumber(roomNumberCount);
        roomNumberCount++;

    }

    // roomcount gets
    public int getRoomCount() {
        return roomNumberCount;
    }

    // room number set and get

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int numberIn) {
        roomNumber = numberIn;
    }

    // address set and get

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address addressIn) {
        this.address = addressIn;
    }

    // get employees assiged to this office
    public Employee getEmployee(int index) {
        return employees.get(index);
    }

    // assign employees to this office
    public void setEmployee(Employee employeeIn) {
        if (employees.size() < 2) {
            employees.add(employeeIn);
        } else {
            System.out.println("there are too many employees at this office already");
        }
    }

    // return number of employees in this office
    public int numberOfEmployees() {
        return employees.size();
    }

    // print all office employees details
    public void printEmployees() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("employee " + (i + 1) + " details: ");
            employees.get(i).toString();
            System.out.println("");
        }
    }

}
