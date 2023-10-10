public class Programmer extends Employee {
    private String goals;
    private int work_week;
    private String language;

    public Programmer(String name, String surname, String address, int id, String goals, int work_week, String language) {
        super(name, surname, address, id);
        this.goals=goals;
        this.work_week=work_week;
        this.language=language;
    }

    public Programmer(){this("Антон","Александров","3 street", 3, "todo",40,"java");}

    public void setGoals(String goals){ this.goals=goals;}
    public void setWork_week(int work_week){this.work_week=work_week;}
    public void setLanguage(String language){this.language=language;}


    public String getGoals(){return goals;}
    public int getWork_week(){return work_week;}
    public String getLanguage(){return language;}

    public String getInfo() {
        return getName()+", "+getSurname()+", "+getAddress()+", "+getId()+", "+goals+", "+work_week+", "+language;
    }
    public boolean isJava(){
        return language.equalsIgnoreCase("java");
    }
    public int DayWork(){
        return work_week/5;
    }
}
