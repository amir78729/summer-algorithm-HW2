import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;
        while (true){
            showPrompt();
            op = scanner.nextInt();
            if(op == -1)
                break;
            switch (op){
                case 1:
                    System.out.println("add...");
                    break;
                case 2:
                    System.out.println("search...");

                    break;
                default:
                    System.out.println("wrong input!!");
            }
            System.out.println("--------------------------");
        }
        System.out.println("end of the program...");
    }
    private static void showPrompt(){
        System.out.println("what are you going to do?\n" +
                "  1) add\n" +
                "  2) search\n" +
                " -1) exit");
    }
}
