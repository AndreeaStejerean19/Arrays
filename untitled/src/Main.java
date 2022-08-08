import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//1
        Calculator calculator=new Calculator();
        System.out.println(calculator.adunare(6,8));
        System.out.println(calculator.adunare( 2.4f, 5.6f));
        System.out.println(calculator.adunare( 4.1f, 5.6f, 5.9f));
        System.out.println(calculator.adunare( 4, 3, 6, 8));
        System.out.println(calculator.scadere(7,3));
        System.out.println(calculator.scadere(5.6f ,8) );
        System.out.println(calculator.inmultire(2,5));
        System.out.println(calculator.inmultire(3f,8f,6.1f));
        System.out.println(calculator.impartire(6,4));
        System.out.println(calculator.impartire(8,4));
//2
        LogicalOp op=new LogicalOp();
        op.afisare2();
//3
        int[] arr = new int[100];
        op.afisare3(arr);
//4
        int[] arr1={2,5,6,8,9};
        System.out.println(op.afisare4(arr1));
//5
        String[] arr2={"Evozon"};
        String s="Evozooooon";
        System.out.println(op.afisare5(arr2, s));
//6
        System.out.println("");
        op.afisare6();
//9
        System.out.println("Exercitiul 9:");
        int[] arr3={3,4,5,6,7};
        System.out.println(op.returnare9(arr3));

//10
        System.out.println("Exercitiul 10:");
        int[] array={1,4,5,7,76,4,3,3};
        int[] updatedArr = new int[array.length];
        op.afisare10(array, updatedArr);
    }
}
