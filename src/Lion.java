public class Lion extends Predator implements Huntable{
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void hunt() {
        System.out.println("Lion's name is " + getName() + ". Age is " + getAge());
    }
}
