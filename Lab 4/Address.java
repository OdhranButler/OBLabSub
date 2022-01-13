public class Address {
    private String street;
    private String city;
    private String county;

    public Address() {

    }

    public Address(String streetIn, String cityIn, String countyIn) {
        this.street = streetIn;
        this.city = cityIn;
        this.county = countyIn;
    }


    public void setStreet(String streetIn)
    {
        this.street = streetIn;
    }

    public String getStreet()
    {
        return this.street;
    }

    public void setCity(String cityIn)
    {
        this.city = cityIn;
    }

    public String getCity()
    {
        return this.city;
    }

    public void setCounty(String countyIn)
    {
        this.county = countyIn;
    }

    public String getCounty()
    {
        return this.county;
    }
    
    
}
