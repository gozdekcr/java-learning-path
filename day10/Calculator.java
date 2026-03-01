package day10;

public class Calculator {
    public double num1;
    public double num2;

    Calculator(int num1 , int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //Constructor
    
    public double add() {
        return this.num1 + this.num2;
    }

    public double subtraction() {
        return this.num1 - this.num2;
    }

    public double mult() {
        return this.num1 * this.num2;
    }

    public double divi() {
        return this.num1 / this.num2;
    }


}
