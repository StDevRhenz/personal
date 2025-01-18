package LearnThings;
class Person {
    // encapsulation
    private String name;
    private int age;

    
    //constructor
    public Person(String name, int age){

        this.name = name;
        this.age = age;
    }

    //getter and setter methods for encapsulation
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int age(){
        return age;
    }

    public void getAge(int age){
        this.age = age;
    }

    //method for printing whole details
    public void printDetails(){
        System.out.println("Name: " + name + " \nAge: " + age + "\n");
    }
}

    // INHERITANCE: Students is a subclass of a person
    class Student extends Person{
        private String studentId;

        public Student(String name, int age, String studentId){
            super(name, age); //calling the constructor
            this.studentId = studentId;
        }

        public String getStudentID(){
            return studentId;
        }
        public void setStudentId(String studentId){
            this.studentId = studentId;
        }

        @Override
        public void printDetails(){
            super.printDetails(); //calling the supercalss method
            System.out.println("Student ID: " + studentId);
        }
    }

    //abstraction: using abstract class
    abstract class Employee extends Person{
        private String employeeId;

        public Employee(String name, int age, String employeeId){
            super(name, age);
            this.employeeId = employeeId;
        }

        public String getEmployeeId(){
            return employeeId;
        }

        public void setEmployeeId(String employeeId){
            this.employeeId = employeeId;
        }

        //Abstract Method
        public abstract void work();
    }

    
    //Concrete class extending abstract class 
    class Developer extends Employee{

        public Developer(String name, int age, String employeeId){
            super(name, age, employeeId);
        }

        @Override
        public void work(){
            System.out.println("Developer is coding");
        }



    public static void main(String[] args) {

        String name[] = {"Rhenz", "Hyacinth", "Abi"};
        int age[] = {20, 19, 19};
        String id[] = {"A123456", "A123457", "A1234568"};


        //Person object
        Person person = new Person(name[0], age[0]);
        person.printDetails();


        //Student object
        Student student = new Student(name[1], age[1], id[1]);
        student.printDetails();

        //Developer object
        Developer developer = new Developer(name[2], age[2], id[2]);
        developer.printDetails();
        developer.work();

    }
}
