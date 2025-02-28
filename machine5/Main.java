
package machine5;

abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    private double marks1, marks2, marks3;

    A(double marks1, double marks2, double marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    @Override
    double getPercentage() {
        return ((marks1 + marks2 + marks3) / 300) * 100;
    }
}

class B extends Marks {
    private double marks1, marks2, marks3, marks4;

    B(double marks1, double marks2, double marks3, double marks4) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
    }

    @Override
    double getPercentage() {
        return ((marks1 + marks2 + marks3 + marks4) / 400) * 100;
    }
}

public class Main {
    public static void main(String[] args) {
        A studentA = new A(85, 90, 80);
        B studentB = new B(75, 80, 70, 85);

        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}
