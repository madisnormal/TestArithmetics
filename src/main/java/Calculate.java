class Calculate {
    double addTwoNumbers(double a, double b){
        return a + b;
    }
    double substractTwoNumbers(double a, double b){
        return a - b;
    }
    double divideTwoNumbers(double a, double b){
        if (b == 0) throw new ArithmeticException();
        return a / b;
    }
    double multiplyTwoNumbers(double a, double b){
        return a * b;
    }
}
