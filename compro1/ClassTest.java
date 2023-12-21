package compro1;

public class ClassTest {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println("mm.add(3, 3):" + mm.add(3, 3));
        System.out.println("mm.add(3L, 3):" + mm.add(3L, 3));
        System.out.println("mm.add(3, 3L):" + mm.add(3, 3L));
        System.out.println("mm.add(3L, 3L):" + mm.add(3L, 3L));
        int[] a = {100, 200, 300};
        System.out.println("mm.add(a):" +mm.add(a));
    }
}

class MyMath3 {
    int add(int a, int b) {
        System.out.print("int add(int a, int b) - ");
        return a + b;
    }
    long add(int a, long b) {
        System.out.print("long add(long a, int b) - ");
        return a + b;
    }
    long add(long a, int b) {
        System.out.print("long add(long a, int b) - ");
        return a + b;
    }
    long add(long a, long b) {
        System.out.print("long add(long a, long b) -");
        return a + b;
    }
    int add(int[] a) {
        System.out.print("int add(int[] a) -");
        int result = 0;
        for(int i = 0; i < a.length; i++)
            result += a[i];
        return result;
    }
}

class Data_1 {
    int value;
    Data_1() {
        value = 5;
    }
}

class Data_2 {
    int value;
    Data_2(int x) {
        value = x;
    }
}

class Ex2 {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2(10);
    }
}

class Car {
    String color;
    String gearType;
    int door;

    Car() {}

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}

class Ex3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("white", "auto", 4);
        System.out.println("c1.color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2.color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
    }
}

class Car2 {
    String color;
    String gearType;
    int door;
    Car2() {
        this("white", "auto", 4);
    }
    Car2(String color) {
        this(color, "auto", 4);
    }
    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

class Ex4 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");
        System.out.println("c1.color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2.color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
    }
}

class Car3 {
    String color;
    String gearType;
    int door;

    Car3() {
        color = "red";
        gearType = "auto";
        door = 4;
    }

    Car3(Car3 c) {
        this.color = c.color;
        this.gearType = c.gearType;
        this.door = c.door;
    }
}

class Ex5 {
    public static void main(String[] args) {
        Car3 c1 = new Car3();
        Car3 c2 = new Car3(c1);

        System.out.println("c1 : " + c1.color + " " + c1.gearType + " " + c1.door);
        System.out.println("c2 : " + c2.color + " " + c2.gearType + " " + c2.door);
    }
}

class InitTest{
    static int cv = 1;
    int iv = 1;

    static { cv = 2; }

    { iv = 2; }

    InitTest() {
        iv = 3;
    }
}

class Ex6 {
    public static void main(String[] args) {
        InitTest it = new InitTest();
    }
}

class Ex7 {
    static int[] arr = new int[10];

    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++)
            System.out.println("arr["+i+"] : " + arr[i]);
    }
}