package org.example;
import java.util.Scanner;

        /* TASK 1
        public class Main {
            public static void main(String[] args) {
                Scanner reader = new Scanner(System.in);
                System.out.println("enter a password");
                String passattempt = reader.nextLine();
                String password = "nora123";
                while (password != passattempt) {


                    if (passattempt.equals(password)) {
                        System.out.println("RIGHT!");
                        System.out.println("the secret is: jryy qbar");
                        break;


                    } else {
                        System.out.println("WRONG!");
                        System.out.println("enter a password");
                        passattempt = reader.nextLine();


                    }
                }
            }
        }*/

        /*TASK 2
        public class Main {
            public static void main(String[] args) {
                Scanner reader = new Scanner(System.in);
                int sum = 0;
                int read;
                int i = 0;
                while (i < 3) {
                    System.out.println("enter a number");
                    read = Integer.parseInt(reader.nextLine());
                    sum += read;
                    i++;
                }
                System.out.println("sum of these numbers is " + sum);
            }
        }*/

        /* TASK 3
        public class Main {
            public static void main(String[] args) {
                Scanner reader = new Scanner(System.in);
                int sum = 0;
                while (true) {
                    System.out.println("enter a number");
                    int read = Integer.parseInt(reader.nextLine());
                    if (read == 0) {
                        break;
                    }
                    sum += read;
                    System.out.println("sum now " + sum);
                }
                System.out.println("sum is " + sum);
            }
        }*/



        /*TASK 4
        public class Main {
            public static void main(String[] args) {


                Scanner reader = new Scanner(System.in);
                System.out.println("enter the first number ");
                int a = Integer.parseInt(reader.nextLine());
                System.out.println("enter the second number ");
                int b = Integer.parseInt(reader.nextLine());

                if (b < a) {
                    System.out.println("");
                }

                while (a <= b) {
                    System.out.println(a);
                    a++;
                }
            }
        }*/

    /*TASK 5
    public class Main {
        public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int sum = 0;

        System.out.println("enter a number");
        int num = Integer.parseInt(reader.nextLine());
        for (int i = 0; i <= num; i++) {
            int result = (int) Math.pow(2, i);
            sum += result;

        }
        System.out.println("the result is " + sum);
  }
  }*/

  /* TASK 6
    public class Main {
        public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

        public static void main (String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("enter the number of times you wamt to print the text");

        int num=Integer.parseInt(reader.nextLine());

        for(int i=0;i<num;i++)
        {
            printText();
        }
    }
}*/

/*  TASK 7

public class Main {

    public static void main(String[] args) {

        printStars(5);
        printStars(7);
        printStars(13);
    }

    private static void printStars(int amount){

        for(int i=0;i<amount;i++){
                System.out.print("*");
            }
        System.out.println("");
        }

    }*/

/* TASK 8

public class Main {

    public static void main(String[] args) {

        drawStarsPiramid(15);
        drawStarsPiramid(12);
        drawStarsPiramid(3);
    }

    private static void drawStarsPiramid(int rows){
        for(int i=0;i<=rows;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
/* LOOP FOR PRINTING INVERTED HALF PYRAMID SHAPE:
for (int i = rows; i >= 1; i--) {


            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/


/* TASK 9
public class Main {

    public static void main(String[] args) {

        drawStarsPiramid(5);
        drawStarsPiramid(7);
    }
    private static void drawStarsPiramid(int rows){
        for(int i=0;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
}*/

//IF WE WANT SAME NUMBERS PRINTED WE SHOULD JUST PRINT out the i








