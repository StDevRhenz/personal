import java.security.PublicKey;

public class Main {

    //global variables
    String name;
    int age;

    // constructor
    public Main(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        System.out.println("Enter your name: ");
        String name = System.console().readLine();

        System.out.println("Enter your age: ");
        int age = Integer.parseInt(System.console().readLine());

        Main main = new Main(name, age);
        main.printmenu();

    }

    public void printmenu(){

        boolean working = true;
        while (working) {
            System.out.println("Menu");
            System.out.println("1. Print Name");
            System.out.println("2. Print Age");
            System.out.println("3. Exit");
            int choice = Integer.parseInt(System.console().readLine());

            if(working){
                switch (choice) {
                    case 1:
                        printname();
                        break;
                    case 2:
                        printage();
                        break;
                    case 3:
                        working = false;
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }

            }
        }

    }


    public void printname(){
        System.out.println("Name: " + name);
    }

    public void printage(){
        System.out.println("Age: " + age);
    }



}