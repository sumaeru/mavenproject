package basic.spring;

public class Country {

    private int pincode;
    private String area, city;


    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Country{" +
                "pincode=" + pincode +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Country(int pincode, String area, String city) {


        this.pincode = pincode;
        this.area = area;
        this.city = city;
    }

    public Country()
    {

    }

}
