public class Volf extends Predator implements Huntable{
    public Volf(String name, int age) {
        super(name, age);
    }

    @Override
    public void hunt() {
        System.out.println("Volf's name is " + getName() + ". Age is " + getAge());
    }
}
