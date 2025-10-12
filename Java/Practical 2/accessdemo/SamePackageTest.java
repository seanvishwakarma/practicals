package accessdemo;

public class SamePackageTest {
    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println("Inside same package, different class:");
        obj.publicMethod();      // ✅ Accessible
        // obj.privateMethod();  // ❌ Not accessible
        obj.protectedMethod();   // ✅ Accessible (same package)
        obj.defaultMethod();     // ✅ Accessible (same package)
    }
}
