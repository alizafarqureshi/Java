import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        LinkList LL = new LinkList();
int nums;
        Scanner sc = new Scanner(System.in);

        int input = 0;
//        do {
        System.out.println("1)Insert in First and Last Position");
        System.out.println("2)Remove a number from First and Last Position");
        System.out.println("3)Find Minimum");
        System.out.println("4)Print odd Numbers");
        System.out.println("5)Print data in Reverse Order");
        System.out.println("6)Exit ");
        input = sc.nextInt();

        if (input == 1) {


                LL.insertAtFirst(1);
                LL.insertAtFirst(2);
                LL.insertAtFirst(3);


                LL.insertAtLast(6);
                LL.insertAtLast(9);


            LL.print();
        } else if (input == 2) {

            LL.insertAtFirst(1);
            LL.insertAtFirst(2);
            LL.insertAtFirst(3);


            LL.insertAtLast(6);
            LL.insertAtLast(9);


            LL.deleteFirstNode();
            LL.deleteLastNode();
            LL.print();
        } else if (input == 3) {

            System.out.print("Minimum : ");


            LL.insertAtFirst(1);
            LL.insertAtFirst(2);
            LL.insertAtFirst(3);


            LL.insertAtLast(6);
            LL.insertAtLast(9);
            System.out.println(LL.min());

        }else if (input == 4){

            LL.insertAtFirst(1);
            LL.insertAtFirst(2);
            LL.insertAtFirst(3);


            LL.insertAtLast(6);
            LL.insertAtLast(9);

            LL.oddNumber();
        }
        else if ( input == 5){
            LL.insertAtFirst(1);
            LL.insertAtFirst(2);
            LL.insertAtFirst(3);


            LL.insertAtLast(6);
            LL.insertAtLast(9);

            LL.printReverse();
        }
        System.out.println();
        System.out.println();
        System.out.println();

//        }while(input != 6);
    }

}
