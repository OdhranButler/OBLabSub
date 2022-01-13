// Student Name 	: Odhrán Butler
// Student Id Number: C00263565
// Date 			: Oct-2021
// Purpose 			: class implementation

public class lab2aq1 {
    public static void main(String[] args) throws Exception {
        HotelRoom room1 = new HotelRoom();
        HotelRoom room2 = new HotelRoom();

        room1.setRoomNum(200);
        room1.setRoomType("single");

        room2.setRoomNum(201);
        room2.setRoomType("Double");

        System.out.println("the room type fo");

        System.out.println("the first room number is: " + room1.getRoomNum());
        System.out.println("the fisrt room type is " + room1.getRoomType());

        System.out.println("the second room number is: " + room2.getRoomNum());
        System.out.println("the second room type is " + room2.getRoomType());



        
    }
}
