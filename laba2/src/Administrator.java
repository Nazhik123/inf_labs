public class Administrator extends Employee {
    private String tasks;
    private int work_time;
    private String experience;

    public Administrator(String name, String surname, String address, int id,String tasks, int work_time, String experience){
        super(name,surname,address,id);
        this.tasks=tasks;
        this.work_time=work_time;
        this.experience=experience;
    }

    public Administrator(){
        this("Коля","Петров","1 street", 1,"task1",8,"big");
    }


    public void setExperience(String experience) {
        this.experience = experience;
    }
    public void setTasks(String tasks) {
        this.tasks = tasks;
    }
    public void setWork_time(int work_time) {
        this.work_time = work_time;
    }


    public String getExperience(){
        return experience;
    }
    public String getTasks(){
        return tasks;
    }
    public int getWork_time(){
        return work_time;
    }


    public String getInfo() {
        return getName()+", "+getSurname()+", "+getAddress()+", "+getId()+", "+tasks+", "+work_time+", "+experience;
    }
    public boolean isOverWork(){
        return work_time>8;
    }
    @Override
    public String FullName(String name, String surname){
        return  surname+" "+name;
    }
    public boolean isProfessional(String experience){
        return experience.equals("big");
    }
}