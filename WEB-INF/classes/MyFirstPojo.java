public class MyFirstPojo
{
    private String name;
    private int id;

    public MyFirstPojo(int id, String name)
    {    
        this.name = name;
        this.id = id;
    }

    public String getName() { return this.name; } 
    public int getId() { return this.id; }

    public String toString() { 
      return "ID: " + this.id + ", Name: " + this.name;
    } 
}