public class AirPurifier {

    String colour;
    String brand;
    int price;
    int airquality;
    int filter;
    int speed;

    void displayAirPurifier(){
        System.out.println("Colour: "+colour);
        System.out.println("Make by "+brand);
        System.out.println("Price: "+price);
        System.out.println("Air Quality: "+airquality);
        System.out.println("Filter Quality: "+filter+"%");
        System.out.println("Speed: "+speed);
    }



    AirPurifier(){
        this("White","Xiaomi",22000,100,1);
    }

    AirPurifier(String _colour,String _brand,int _price,int _filter,int _speed){
        this.colour = _colour;
        this.brand = _brand;
        this.price = _price;
        this.filter = _filter;
        this.speed = _speed;



    }
}