package cs.vsu.ru.skogorevma.gr12;

public class Drawer {
    public static void printDrawer(int length) {
        printLineA(length);
        for (int i = 0; i < length-2; i++) {
                printLineB(length,i);
        }
        printLineA(length);
    }

    private static void printLineA(int length) {
        System.out.print("*");
        for (int i = 0; i < length-2; i++) {
                System.out.print(" ");
        }
        System.out.println("*");
    }

    private static void printLineB(int length,int n){
        System.out.print("|");
        int slashPos1=n;
        int slashPos2=length-3-n;
        for (int i = 0; i < length-2; i++) {
            if(i==slashPos1&&i==slashPos2){
                System.out.print("*");
            } else if(i==slashPos1){
                System.out.print("\\");
            } else if (i==slashPos2) {
                System.out.print("/");
            } else System.out.print(" ");
        }
        System.out.println("|");
    }
}