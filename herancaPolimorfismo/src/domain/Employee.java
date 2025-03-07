package domain;

public sealed abstract class Employee permits Manager, Salesman {
    /* O sealed serve para definir regras para permitir subclasses, e para as outras classes permits funcionar, tem
     que definir a classe também como sealed ou como non-sealed ou como final*/
    protected String code;
    protected String nome;
    protected String address;
    protected int age;
    protected double salary;

    public Employee(String code, String nome, String address, int age, double salary) {
        this.code = code;
        this.nome = nome;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double getFullSalary();
}
