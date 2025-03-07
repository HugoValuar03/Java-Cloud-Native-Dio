//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var person = new Person("João", 12);
        System.out.println(person.getInfo());
        System.out.println(person.name());
        var newPerson = new Person(person.name(), 13); // Só é possível alterar dados de uma record através do
        // construtor
        System.out.println(newPerson);
    }
}