import java.util.*;

class Farmer {
    int Amount;
    float years;
    float interest = 8.0f;

    void farmer() {
        System.out.println("Please enter loan amount : - ");
        Scanner scan = new Scanner(System.in);
        Amount = scan.nextInt();
        System.out.println("Please enter loan years : - ");
        years = scan.nextInt();
        System.out.println("Your interest amount - " + Amount*years*interest/100);
    }
}

class CalculatorInterest {
    public static void main(String[] args) {
      Farmer farmer= new Farmer();
      farmer.farmer();
    }
}

// interest = PA * Years * interest rate /100;