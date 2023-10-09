public class Main {
    public static void main(String[] args) {
        Administrator admin = new Administrator();
        System.out.println(admin.getInfo());
        System.out.println(admin.isOverWork());

        admin.setName("Петя");
        admin.setSurname("Егоров");
        admin.setAddress("2 street");
        admin.setId(2);
        admin.setTasks("task2");
        admin.setWork_time(12);
        admin.setExperience("small");

        System.out.println(admin.getInfo());
        System.out.println(admin.isOverWork());
        System.out.println();


        Programmer prog = new Programmer();
        System.out.println(prog.getInfo());
        System.out.println(prog.DayWork());

        prog.setWork_week(25);
        prog.setLanguage("python");

        System.out.println(prog.getInfo());
        System.out.println(prog.DayWork());
        System.out.println(prog.isJava());
        System.out.println();


        Manager manager = new Manager();
        System.out.println(manager.getInfo());
        System.out.println(manager.isSalary());

        manager.setSalary(45000);
        manager.setId(10);

        System.out.println(manager.getInfo());
        System.out.println(manager.isSalary());
        System.out.println();


        Administrator admin1 = new Administrator();
        admin.printCount();
    }
}