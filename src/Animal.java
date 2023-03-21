public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private boolean friendly;

    public Animal(String name, int age, boolean vaccinated, boolean friendly){
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.friendly = friendly;
    }
    public void adopt(){
        System.out.println("I have been adopted");
    }
    public void feed(){
        System.out.println("I am no longer hunger");
    }
    public void sayName(){
        System.out.println("My name is " + name);
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean getVaccinated(){
        return vaccinated;
    }

}
