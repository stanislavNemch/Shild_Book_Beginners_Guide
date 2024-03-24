package Part_3.Exercise_3_1;

import java.util.Scanner;

class Help {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Справка по:");
        System.out.println("  1. if");
        System.out.println("  2. switch");
        System.out.print("Выберите вариант: ");

        int choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.print("Оператор if:\n");
                System.out.println("if(условие) оператор;");
                System.out.println("else оператор;");
                break;
            case 2:
                System.out.print("Традиционный оператор switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println("   case константа:");
                System.out.println("     последовательность операторов");
                System.out.println("     break;");
                System.out.println("   // ...");
                System.out.println("}");
                break;
            default:
                System.out.print("Выбранный вариант не найден.");
        }
    }
}
