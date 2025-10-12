package otherpackage;
import accessdemo.Example;

public class SubClassTest extends Example {
    public static void main(String[] args) {
        SubClassTest obj = new SubClassTest();
        System.out.println("Inside subclass in another package:");
        obj.publicMethod();      // ✅ Accessible
        // obj.privateMethod();  // ❌ Not accessible
        obj.protectedMethod();   // ✅ Accessible (through inheritance)
        // obj.defaultMethod();  // ❌ Not accessible (different package)
    }
}
