public class notCat extends notAnimal{
    private boolean played;
    private boolean notKitten;
    public notCat(String name, int age, boolean vaccinated, boolean friendly, boolean notKitten){
        super(name, age, vaccinated, friendly);
        this.notKitten = notKitten;
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
    public boolean getNotKitten(){
        return notKitten;
    }
}
