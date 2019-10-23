package DomashnieZadanie2;

import javax.swing.*;
import java.util.Scanner;

public class Dz3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ширину:");
        int a = in.nextInt();
        System.out.print("Введите длину:");
        int b = in.nextInt();
        System.out.print("Введите радиус:");
        int r = in.nextInt();
        if ((r*r)/2>(a*a+b*b)/2) {
            System.out.println("close");
        }

    }
}
