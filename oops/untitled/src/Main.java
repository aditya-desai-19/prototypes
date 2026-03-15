//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Encapsulation e = new Encapsulation();
//        e.setData(10);
//        System.out.println("Current value of data is " + e.getData());

//        Inheritance in = new Inheritance();
//        in.run();

//        Polymorphism po = new Polymorphism();
//        int sum2 = po.add(1, 2);
//        int sum3 = po.add(2, 3, 4);
//        System.out.println(sum2 + " " + sum3);
//        po.run();

        Child ch = new Child();
        ch.run();
        ch.stop();

        Child2 ch2 = new Child2();
        ch2.run();
    }
}