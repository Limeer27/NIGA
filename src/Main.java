import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


       /*    long a = 5*9999999999L;
        int c = 3;
        long d = a + c;

        double b = 3.2;
        double e = 2.8;
        double g = b + e;

        String name = "Ivan";
        String surname = "Berezutskij";
        String fullName = name + " " + surname;

        // System.out.println("Hello world");
        *//*System.out.println(3);
        System.out.println(1 + 2);
        System.out.println(5 * 4);
        System.out.println(6 / 2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
        System.out.println(g);
        System.out.println(fullName);*//*
        System.out.println(a);
        System.out.println(d);

        boolean hasAccess = false; // false
        System.out.println(hasAccess);

        char X = 'x';
        System.out.println(X);*/

        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);


        int zadumannoeChislo = 102;

        // int guessNumber = scanner.nextInt();

        int tr = 10;
        int fl = 15;

        boolean res = tr < fl;

        System.out.println("res=" + res);
        System.out.println("tr==fl? " + (tr == fl));
        System.out.println("tr > fl? " + (tr > fl));
        System.out.println("tr != fl? " + (tr != fl));
        System.out.println("!true? " + !true);
        System.out.println("!false? " + !false);

      /*  if (guessNumber < zadumannoeChislo) {
            System.out.println("Введенное число меньше загаданного");
        } else if (guessNumber == zadumannoeChislo) {
            System.out.println("вы угадали!");
        } else {
            System.out.println("Введенное число больше загаданного");
        }*/


    }