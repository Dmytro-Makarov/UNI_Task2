package uni.makarov;

public class Main {

    public static void main(String[] args) {
        Student student1 = new GoodStudent("Рандом Рандомниченко");
        Student student2 = new GoodStudent("Добро Добровельчин");
        Student student3 = new BadStudent("Лін-Тянь");

        Group DemoGroup = new Group("К-25");
        DemoGroup.AddStudent(student1);
        DemoGroup.AddStudent(student2);
        DemoGroup.AddStudent(student3);
        
        student2.Study();
        student3.Study();

        DemoGroup.GetInfo();
        DemoGroup.GetFullInfo();
    }
}
