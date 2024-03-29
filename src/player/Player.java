package player;

public class Player {
   public String name;
    double contact;
   public int position;
    int age;
    public Player(){
        position=0;
    }
   
    public void setName(String name){
        this.name=name;
    }
    public void setContact(double contact){
        this.contact=contact;
    }
    public void setAge(int age){
        this.age=age;
    }
     public void getPlayer(){
        System.out.println("Name:"+name);
        System.out.println("contact:"+contact);
        System.out.println("age:"+age);
    }

}
