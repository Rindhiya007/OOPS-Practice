class Display {
    void show(int a, String name) {
        System.out.println("Roll No: " + a);
        System.out.println("Name: " + name);
    }
    void show(String name, int a) {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + a);
    }
    public static void main(String[] args) {
        Display d = new Display();
        d.show(101, "Anu");
        d.show("Rahul", 102);
    }
}
