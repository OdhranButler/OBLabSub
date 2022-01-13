

public class point {
    protected int xPos;
    protected int yPos;

    public point()
    {

    }

    public point(int xPosIn, int yPosIn)
    {
        setXPos(xPosIn);
        setYPos(yPosIn);
    }

    public int getXPos()
    {
        return xPos;
    }

    public void setXPos(int xPosIn)
    {
        xPos = xPosIn;
    }

    public int getYPos()
    {
        return yPos;
    }

    public void setYPos(int yPosIn)
    {
        yPos = yPosIn;
    }

    public String toString()
    {
        return ("xpos is : " + xPos + " \n yPos is : " + yPos);
    }
    
}
