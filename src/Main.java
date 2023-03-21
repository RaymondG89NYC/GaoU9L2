public class Main {
    public static void main(String[] args){
        Animal mystery = new Animal("Tom", 1000, true, true);
        mystery.adopt();
        mystery.feed();
        mystery.sayName();
        System.out.println(mystery.getAge());
        System.out.println(mystery.getName());
        System.out.println(mystery.getVaccinated());
        System.out.println();

        Cat kitten = new Cat("Fluffy", 1, true, false, true);
        kitten.adopt();
        kitten.feed();
        kitten.sayName();
        kitten.play();
        kitten.attackCouch();
        System.out.println(kitten.getKitten());
        System.out.println(kitten.getAge());
        System.out.println(kitten.getVaccinated());
        System.out.println(kitten.getName());
        System.out.println(kitten.hasPlayedWith());
        System.out.println();

        Dog puppy = new Dog("Fluffiest", 1, true, true, true);
        puppy.adopt();
        puppy.feed();
        puppy.sayName();
        puppy.walk();
        puppy.attackPillow();
        System.out.println(puppy.getPuppy());
        System.out.println(puppy.getAge());
        System.out.println(puppy.getVaccinated());
        System.out.println(puppy.getName());
        System.out.println(puppy.hasBeenWalked());
    }
}
