package module_06_basic_of_oops;

public class ClassAndObject {
    String name;
    String color;
    int no_of_blades;
    float price;

    void staring() {
        System.out.println("Fan is starting");
    }

    void rotating() {
        System.out.println("Fan is rotating");
    }

    void blowing() {
        System.out.println("Fan is blowing air");
    }

    void stopping() {
        System.out.println("Fan is stopping..");
    }


    public static void main(String[] args) {
        ClassAndObject f1 = new ClassAndObject();
        f1.color = "USHA";
        f1.staring();

        ClassAndObject f2 = new ClassAndObject();
        f2.color = "BROWN";
        f2.rotating();
        ClassAndObject f3 = new ClassAndObject();
        f3.price = 2000;
        f3.blowing();

    }
}

