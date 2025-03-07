public record Person(String name, int age) { // Toda variável criada entre os parenteses no record ele é privado e é usado como construtor

    public String getInfo(){
        return "Name: " + name + ", age: " + age;
    }
}
// O record é uma classe imutável