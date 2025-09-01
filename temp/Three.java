class Vehicle{
    String brand = "Toyota";
    void honk(){
        System.out.println("Beep Beep move aside");
    }
}

class Car extends Vehicle{
    int year = 2024;
    void display(){
        System.out.println("Brand: "+ brand);
        System.out.println("Year: "+ year);
    }w
}
class MyCollection extends Car{
    String brand2 = "Range Rover";
    int year2 = 2000;
    void display2(){
        System.out.println("Brand2: "+ brand2);
        System.out.println("Year2: "+ year2);
    }
}

class FriendCollection extends Car{
    String fbrand = "BMW";
    int fyear = 2025;
    void fdisplay(){
        System.out.println("fbrand: "+ fbrand);
        System.out.println("fyear: "+ fyear);
    }
}

public class Three {
    public static void main(String[] args) {
        MyCollection my = new MyCollection();
        my.honk();
        System.out.println("\n");
        my.display();
        System.out.println("\n");
        my.display2();
        System.out.println("\n");
        FriendCollection friend = new FriendCollection();
        friend.fdisplay();
    }
}