class RollsRoyceEngine {

    final int costOfOne = 50000000;

    void sound(){
        System.out.println("Rolls Royce engine has the sweetest sound of a engine");
    }
}

class Airbus extends RollsRoyceEngine {

    void TotalCost(){
        int cost = super.costOfOne * 2;

        System.out.println("Cost of 2 rollsroyce engine is = $"+ cost);
    }

    void sound(){
        System.out.println("2 Rolls Royce engines are even better");
    }

    void PrintSoundAndCost(){
        sound();
        super.sound();
        System.out.println("Its Price is: \n");
        TotalCost();
    }
}

public class Four {

    public static void main(String[] args) {
        Airbus A380 = new Airbus();
        A380.PrintSoundAndCost();
    }
}