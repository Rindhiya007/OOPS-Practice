class Calculator {
    // Method with 2 parameters
    int add(int a, int b) {
        return a + b;
    }
    // Method with 3 parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum = " + c.add(10, 20));
        System.out.println("Sum = " + c.add(10, 20, 30));
    }
}