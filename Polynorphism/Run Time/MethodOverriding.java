class Vehicle{
    public void Horn(){
        System.out.println("Horn of Vehicle");
    }
}
class Bike extends Vehicle{
    public void Horn(){
        System.out.println("Horn of Bike");
    }
}
class Car extends Vehicle{
    public void Horn(){
        System.out.println("Horn of Car");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.Horn();
        Vehicle v1 = new Car();
        v1.Horn();
    }    
}
