public class Bear extends Predator implements Huntable{
    public Bear(String name, int age) {
        super(name, age);
    }

    @Override
    public void hunt() {
        System.out.println("Bear's name is " + getName() + ". Age is " + getAge());
    }
}