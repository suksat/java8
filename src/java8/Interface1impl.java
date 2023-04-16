package java8;

public class Interface1impl { // absent following:- implements Interface1

    public static void main(String[] args) {

        Interface1 interface1 = (i1, i2) -> {
            if (i2 < i1) {
                throw new RuntimeException("i2 less than i1");
            } else {
                return i2 - i1;
            }
        };

        System.out.println(interface1.method1(88, 20));
    }


}
