public class Main {
    public static void main(String[] args) {
        Volf volf = new Volf("nameVolf", 32);
        Bear bear = new Bear("nameBear", 32);
        Lion lion = new Lion("nameLion", 32);

        Huntable[] huntArray = {volf, bear, lion};
        for (Huntable a : huntArray){
            a.hunt();
        }

    }
}