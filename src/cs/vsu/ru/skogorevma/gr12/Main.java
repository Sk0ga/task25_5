package cs.vsu.ru.skogorevma.gr12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        System.out.print("Введите высоту: ");
        int h = scan.nextInt();
        Drawer.printDrawer(h);
    }
}
