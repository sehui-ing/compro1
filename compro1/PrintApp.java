package compro1;

public class PrintApp {
    public static void main(String[] args) {
        Print print = new Print();
        print.print(10);
        print.print(true);
        print.print(5.7);
        print.print("홍길동");
    }
}

class Print{
    int print(int a) {
        System.out.println(a);
        return a;
    }
    boolean print(boolean a) {
        System.out.println(a);
        return a;
    }
    double print(double a) {
        System.out.println(a);
        return a;
    }
    String print(String a) {
        System.out.println(a);
        return a;
    }
}
