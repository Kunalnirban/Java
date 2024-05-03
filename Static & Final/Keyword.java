class Price{
    static long rate = 100000;
    int a , b;
    static double PriceByCity(String city){
        switch (city) {
            case "delhi":
                return rate + rate/10;
            case "mumbai":
                return rate + rate/20;
            default:
                return rate;
        }
    }
}
class Data{
    static int value = 20;
    void print(){
        System.out.println("Value = " +value);
        value++;
    }
}
public class Keyword {
    public static void main(String[] args) {
        System.out.println("Price in Delhi = " +Price.PriceByCity("delhi"));
        System.out.println("Price in Mumbai = " +Price.PriceByCity("mumbai"));
        System.out.println("Default Price = " +Price.rate);

        System.out.println("Inside Data");
        Data d1 = new Data();
        d1.print();
        d1.print();
        System.out.println(Data.value);

        
    }
}
