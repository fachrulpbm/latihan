public class Person{

    private String id;
    private String name;
    
    public Person(String id, String name){
        this.id = id;
        this.name = name;        
    }

    public String getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    public static void main(String[] args) {
        Person p = new Person("P001","Joko");
        System.out.println(p.getId()+" "+p.getName());
    }

}