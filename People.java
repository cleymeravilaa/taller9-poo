public class People {
    protected String name;
    protected int age;

    public People(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void showDetails(){
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
    }
}

class Employee extends People{
    private String department;

    public Employee(String name, int age, String department){
        super(name, age);
        this.department = department;
    }

    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Departamento: " + department);
    }
}