package machineproblem1;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {

    //class and method
    int x = 10;

    //public
    public void innerside() {
        System.out.println("public");
        // you need to create an object in the main
    }
    static void malupetmain(){
        System.out.println("static");
    }

    public static void main(String[] args) throws IOException{


        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        Main main = new Main();
        main.innerside();
        //object
        System.out.println(main.x);
        //ends here
        int age = 0;

        System.out.println("Banking System");

        boolean continues = true;

        while (continues) {
            System.out.println("Age: ");
            age = Integer.parseInt(br.readLine());
            if(age < 10){
                age += 20;
                greet();
                continues = false;
            }
            continues = false;
        }
        System.out.println(age);
        paramarg("Rhenz");
        myReturnMethod(age, age);

        //method overloading
        plusmethodInt(age, age);
        plusmethoddouble(age, age);

        malupetmain();
    }

    //method
    static void greet(){
        System.out.println("Hello");
    }

    //parameters and argument
    static void paramarg(String name){
        System.out.println("Hello my: "+ name);
    }

    //return method
    static int myReturnMethod(int x, int y){
        return x + y;
    }

    //method overloading => multiple method, same name with different paramters

    static int plusmethodInt(int x, int y){
        return x + y;
    }
    static double plusmethoddouble(int x, int y){
        return x + y;
    }
    
}
