class MyEmployee{
    private int id;
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void setid(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

}

public class Prog36_AccessModifiers {
    public static void main(String[] args) {
        MyEmployee omkar = new MyEmployee();
        omkar.setid(100);
        omkar.setName("Omkar");
        System.out.println(omkar.getId());
        System.out.println(omkar.getName());
        
    }
}
