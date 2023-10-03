package work04;

public class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        return "Person"+id;
    }
}
