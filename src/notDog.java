public class notDog extends notAnimal{
    private boolean walked;
    private boolean notPuppy;
    public notDog(String name, int age, boolean vaccinated, boolean friendly, boolean notPuppy){
        super(name, age, vaccinated, friendly);
        walked = false;
        this.notPuppy = notPuppy;
    }
    public void walk(){
        System.out.println("doggo walked");
        walked = true;
    }
    public void attackPillow(){
        System.out.println("Your pillow is gone. Look at all the fluffy pillow-insides from the! :D ");
    }
    public boolean hasBeenWalked(){
        return walked;
    }
    public boolean getNotPuppy(){
        return notPuppy;
    }
}
{
}
