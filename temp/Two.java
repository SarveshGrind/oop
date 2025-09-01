class reference {
    int a;
    int b;
}

public class Two {
    public static void add(int a, int b){
        a = a + b;
    }
    public static void sub(int a, int b){
        a = a - b;
    }
    public static void multiply(int a, int b){
        a = a * b;
    }
    public static void division(int a, int b){
        a = a / b;
    }

    public static void refadd( reference r ){
        r.a = r.a + r.b;
    }
    public static void refsub(reference r){
        r.a = r.a - r.b;
    }
    public static void refmultiply(reference r){
        r.a = r.a * r.b;
    }
    public static void refdivision(reference r){
        r.a = r.a / r.b;
    }

    public static void main(String[] args) {
        int x = 20;
        int y = 10;

        System.out.println("The below are form call by value\n");
        add(x, y);
        System.out.println("add: "+ x);
        sub(x, y);
        System.out.println("substract: "+ x);
        multiply(x, y);
        System.out.println("multiply: "+ x);
        division(x, y);
        System.out.println("division: "+ x);
        
        System.out.println("\nThe below are form call by reference\n");
        reference ref = new reference();
        ref.a = 20;
        ref.b = 10;
        refadd(ref);
        System.out.println("add: "+ ref.a);
        refsub(ref);
        System.out.println("substract: "+ ref.a);
        refmultiply(ref);
        System.out.println("multiply: "+ ref.a);
        refdivision(ref);
        System.out.println("division: "+ ref.a);
    }
}
