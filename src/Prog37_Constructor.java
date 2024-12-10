class Prog37_Employee{
    private int id;
    private String name;

    // constructor:
    public Prog37_Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    // CONS. OVERLOADING: employee with no name:
    public Prog37_Employee(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}

public class Prog37_Constructor {
    public static void main(String[] args) {
        Prog37_Employee omkar = new Prog37_Employee(100, "Omkaar");
        System.out.println(omkar.getId());
        System.out.println(omkar.getName());

        Prog37_Employee noname = new Prog37_Employee(21);
        System.out.println(noname.getId());
        System.out.println(noname.getName());
    }
}
