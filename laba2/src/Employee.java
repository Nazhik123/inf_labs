public abstract class Employee {
    protected String name;
    protected String surname;
    protected String address;
    protected int id;
    static int count;

    public Employee(String name, String surname, String address, int id){
        this.name=name;
        this.surname=surname;
        this.address=address;
        this.id=id;
        count++;
    }

    public Employee(){this("Костя","Капустин","0 street",0);}

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getAddress(){
        return address;
    }
    public int getId(){
        return id;
    }

    public String FullName(String name, String surname){
        return  name+" "+surname;
    }
    public boolean isId(int id){
        return (id>5);
    }
    public void printCount(){System.out.println(count);}
}