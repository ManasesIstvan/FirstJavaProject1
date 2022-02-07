package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.setName("Rex");
        rex.setBreed("Bulldog");
        String breed =rex.getBreed();
        rex.age = 1;
        System.out.println(rex.getName());
        System.out.println(rex.age);
        rex.play();


        Dog lola = new Dog();
        lola.setBreed("Labrador");
        lola.age = 7;
        lola.setName("Lola");
        System.out.println(lola.getName());
        System.out.println(lola.age);
        lola.sleep();

    }
}
