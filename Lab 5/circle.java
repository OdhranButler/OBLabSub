public class circle extends point {
    
    private int radius;

    public circle()
    {

    }

    public circle(int xPosIn, int yPosIn, int radiusIn)
    {
        setXPos(xPosIn);
        setYPos(yPosIn);
        setRadius(radiusIn);
    }

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radiusIn)
    {
        radius = radiusIn;
    }


}
