import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tree t = new Tree();

        Scanner sc = new Scanner(System.in);

        t.insert(10);
        t.insert(9);
        t.insert(8);
        t.insert(15);
        t.insert(14);

        int input = 0;
//        do {
        System.out.println("1)Insert Float Value");
        System.out.println("2)Find Float Value");
        System.out.println("3)Height");
        System.out.println("4)Post Order Traversal");
        System.out.println("5)Max");
        System.out.println("6)Exit ");
        input = sc.nextInt();
        if (input == 1) {
            t.insert(9);
            t.insert(2);
            t.insert(1);

        } else if (input == 2) {
            t.find(9);

        } else if (input == 3) {
            System.out.println(t.height());

        } else if (input == 4) {
            t.traversePostOrder();

        } else if (input == 5) {
            System.out.println(t.max());

        }
    }
}