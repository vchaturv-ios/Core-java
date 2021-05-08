package oops;

public class MethodOverload {
    public void print(String name) {
        System.out.println("Hello "+name);
    }

    public String print(int name) {
        System.out.println("Hey "+name);
        return "OK";
    }

    public static void main(String[] args) {
        System.out.println("Woala!!! I am coding in midnight!!!");
    }

    public static void main(String args) {
        System.out.println("Nobody Cares for me!!!");
    }
}
