public class Rectangle {

    private double length;
    private double width;

    public Rectangle() // constructor method #1
	{
		setLength(1);
        setWidth(1);
        
	}

	public Rectangle(double lengthIn,double widthIn) // constructor method #2
	{
		length = lengthIn;
        width = widthIn;
	}

	public void setLength(double lengthSet) {

        if(lengthSet > 0 && lengthSet <= 40)
        {
            length = lengthSet;
        }
        else
        {
            System.out.println("Please enter a number between 1 and 40");
        }
	}

	public double getLenght() {
		return length;
	}

    public void setWidth(double widthSet) {
		width = widthSet;
	}

	public double getWidth() {
		return width;
	}

    public String toString()
    {
        return "Lenth = "+getLenght()+", Width = "+getWidth();
    }

    public double getArea()
    {
        return getLenght()*getWidth();
    }

    public double getPerimeter()
    {
        return (getLenght()*2) + (getWidth()*2);
    }

    public void printRectangle()
    {
        for (int i = 0; i < getWidth(); i++) 
        {
            System.out.print("*");
        }

        System.out.println();
        for (int i = 0; i < getLenght()-2; i++) 
        {
            System.out.print("*");
            for (int j = 0; j < getWidth()-2; j++) 
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        
        for (int i = 0; i < getWidth(); i++) 
        {
            System.out.print("*");
        }
    }
}
