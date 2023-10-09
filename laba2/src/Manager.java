public class Manager extends Employee {
    private String vacation;
    private int salary;
    private String subordinates;

    public Manager(String name, String surname, String address, int id, String vacation, int salary, String subordinates) {
        super(name, surname, address, id);
        this.vacation=vacation;
        this.salary=salary;
        this.subordinates=subordinates;
    }

    public Manager(){this("Женя", "Дмитриев", "4 street", 4, "2 week",20000,"Admin, Programmer");}

    public void setVacation(String vacation){this.vacation=vacation;}
    public void setSalary(int salary){this.salary=salary;}
    public void setSubordinates(String subordinates){this.subordinates=subordinates;}

    public String getVacation(){return vacation;}
    public int getSalary(){return salary;}
    public  String getSubordinates(){return subordinates;}

    public String getInfo() {
        return name+", "+surname+", "+address+", "+id+", "+vacation+", "+salary+", "+subordinates;
    }
    public String isSalary(){
        if (salary>=40000){
            return "big";
        } else {return "small";}
    }
    public int countSubordinates(){
        String[] sub = subordinates.split(" ");
        return sub.length;
    }
}
