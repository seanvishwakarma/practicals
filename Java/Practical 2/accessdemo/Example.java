package accessdemo;

public class Example {
    // Methods with different access levels
    public void publicMethod() {
        System.out.println("Public method called");
    }

    private void privateMethod() {
        System.out.println("Private method called");
    }

    protected void protectedMethod() {
        System.out.println("Protected method called");
    }

    void defaultMethod() {   // default (no modifier)
        System.out.println("Default method called");
    }

    // Access from inside the same class
    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println("Inside same class:");
        obj.publicMethod();
        obj.privateMethod();
        obj.protectedMethod();
        obj.defaultMethod();
    }
}
