package Classes;

import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        //1
        String n,e;
        char g;
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        n = scan.nextLine();
        System.out.print("Email: ");
        e = scan.nextLine();
        System.out.print("Gender: ");
        g = scan.nextLine().charAt(0);
        Author sanya = new Author(n,e,g);
        System.out.println("Email: " + sanya.getEmail());
        sanya.setEmail("scam@mail.com");
        System.out.println(sanya.toString());
        //2
        Ball b1 = new Ball(1.2, 2.3);
        Ball b2 = new Ball();
        System.out.println(b2.toString());
        b2.setXY(1.3,7.8);
        System.out.println(b2.toString());
        b1.move(5,7);
        System.out.println(b1.toString());
        //4
        //5
    }
}
