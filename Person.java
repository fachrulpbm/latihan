public class Person{

    private String name;
    
    public Person(String name){
        this.name = name;        
    }
    
    public String getName(){
        return name;
    }
    public static void main(String[] args) {
        Person p = new Person("Joko");
        System.out.println(p.getName());
    }

}