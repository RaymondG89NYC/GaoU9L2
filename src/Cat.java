public class Cat extends Animal{
    private boolean played;
    private boolean kitten;
    public Cat(String name, int age, boolean vaccinated, boolean friendly, boolean kitten){
        super(name, age, vaccinated, friendly);
        this.kitten = kitten;
        played = false;
    }
    public void play(){
        System.out.println("cat got outplayed by laser");
        played = true;
    }
    public void attackCouch(){
        System.out.println("Your couch has been shred to smithereens");
    }
    public boolean hasPlayedWith(){
        return played;
    }
    public boolean getKitten(){
        return kitten;
    }
}
