// Student Name 	: Odhrán Butler
// Student Id Number: C00263565
// Date 			: Oct-2021
// Purpose 			: class implementation

public class lab2aq2 {
    public static void main(String[] args) throws Exception {
        HotelRoom room1 = new HotelRoom();
        HotelRoom room2 = new HotelRoom();

        room1.setRoomNum(200);
        room1.setRoomType("single");

        room2.setRoomNum(201);
        room2.setRoomType("Double");

        room1.setOccupied(1);
        room1.setRate(100);

        room2.setOccupied(0);
        room2.setRate(80);

        System.out.println("the first room number is: " + room1.getRoomNum());
        System.out.println("the fisrt room type is " + room1.getRoomType());

        if (room1.getOccupied() == 0) 
        {
            System.out.println("the first room is currently unoccupied");
        }
        else
        {
            System.out.println("the first room is currently occupied");
        }

        System.out.println("the first room has a rate of " + room1.getRate());


        System.out.println("the second room number is: " + room2.getRoomNum());
        System.out.println("the second room type is " + room2.getRoomType());

        if (room2.getOccupied() == 0) 
        {
            System.out.println("the second room is currently unoccupied");
        }
        else
        {
            System.out.println("the second room is currently occupied");
        }

        System.out.println("the second room has a rate of " + room2.getRate());
    }
}
