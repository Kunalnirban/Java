abstract class Shape {
    abstract void draw();
    void display(){
        System.out.println("Inside Shape");
    }
}
class Circle extends Shape{
    void draw (){
        System.out.println("Drwaing Circle");
    }
}
public class Main{
    public static void main(String[] args) {
     Shape s = new Circle();   
     s.display();
     s.draw();
    }
}