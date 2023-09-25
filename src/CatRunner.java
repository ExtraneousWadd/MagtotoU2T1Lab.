public class CatRunner {
    public static void main(String [] args) {

        Cat cat1 = new Cat("Bob", 4, 12.5);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Joe", 11, 15);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
