package Part_3.Exercise_3_2;

import java.util.Scanner;

class Help2 {
    public static void main(String[] args) {

        int choice;

        Scanner input = new Scanner(System.in);
        System.out.println("Справка по:");
        System.out.println("  1. if");
        System.out.println("  2. switch");
        System.out.println("  3. for");
        System.out.println("  4. while");
        System.out.println("  5. do-while");
        System.out.print("Выберите вариант: ");

        do {
            choice = input.nextInt();
        } while( choice < 1 | choice > 5);

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
            case 3:
                System.out.println("Цикл for:\n");
                System.out.print("for(инициализация; условие; итерация)");
                System.out.println(" оператор;");
                break;
            case 4:
                System.out.println("Цикл while:\n");
                System.out.println("while(условие) оператор;");
                break;
            case 5:
                System.out.println("Цикл do-while:\n");
                System.out.println("do {");
                System.out.println(" оператор;");
                System.out.println("} while (условие);");
                break;
        }
    }
}
