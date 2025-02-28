package machine3;
abstract class Parent {
    abstract void message(); 
}

class FirstSubclass extends Parent {
    @Override
    void message() {
        System.out.println("This is the first subclass");
    }
}

class SecondSubclass extends Parent {
    @Override
    void message() {
        System.out.println("This is the second subclass");
    }
}

public class Main {

    public static void main(String[] args) {
        Parent first = new FirstSubclass();
        first.message();
        Parent second = new SecondSubclass();
        second.message();
    }
}

