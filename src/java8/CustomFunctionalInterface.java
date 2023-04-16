package java8;

public interface CustomFunctionalInterface {

    void method1();

    default void method2() {
        System.out.println("method2");
    }
}

class CustomFunctionalInterfaceClassImpl {

    public static void main(String[] args)
    {
        CustomFunctionalInterfaceClassImpl customImpl=new CustomFunctionalInterfaceClassImpl();
        customImpl.method3(() -> System.out.println("Method3"));
    }

    public void method3(CustomFunctionalInterface anInterface)
    {
        anInterface.method1();
    }
}
