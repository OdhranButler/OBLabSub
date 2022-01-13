public class HotelRoom 
{
    int roomNumber;
    String roomType;
    private int isOccupied;
    double rate;

    public HotelRoom()
    {

    }

    public HotelRoom(int numSet,String typeSet)
    {
        roomNumber = numSet;
        roomType = typeSet;
    }

    public HotelRoom(int numSet,String typeSet,int isOccupiedSet,double rateSet)
    {
        roomNumber = numSet;
        roomType = typeSet;
        isOccupied = isOccupiedSet;
        rate = rateSet;
    }

    public int getRoomNum()
    {
        return roomNumber;
    }

    public void setRoomNum(int numSet)
    {
        roomNumber = numSet;
    }

    public String getRoomType()
    {
        return roomType;
    }

    public void setRoomType(String typeSet)
    {
        roomType = typeSet;
    }    

    public int getOccupied()
    {
        return isOccupied;
    }

    public void setOccupied(int isOccupiedSet)
    {
        if(!isOccupied())
        {
            isOccupied = isOccupiedSet;
        }
    }

    public double getRate()
    {
        return rate;
    }

    public void setRate(double rateSet)
    {
        rate = rateSet;
    }

    public boolean isOccupied()
    {
        if(isOccupied == 1)
        {
            System.out.println("sorry, this room is booked already");
            return true;
        }
        else
        {
            return false;
        }
    }
}
