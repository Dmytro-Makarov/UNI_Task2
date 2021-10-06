package uni.makarov;

import java.util.ArrayList;

public class Group {
    Group(String name) {
        this.name = name;
    }

    String name;
    ArrayList<Student> GroupList = new ArrayList<Student>();

    void AddStudent(Student st){
        GroupList.add(st);
    }

    void GetInfo(){
    System.out.println("Group name:" + name);
    for (int i = 0; i < GroupList.size(); i++){
            Student student_tmp = GroupList.get(i);
            System.out.println(student_tmp.name);
        }
    }

    void GetFullInfo(){
        System.out.println("Group name:" + name);
        for (int i = 0; i < GroupList.size(); i++){
            Student student_tmp = GroupList.get(i);
            System.out.println(student_tmp.name + " : " + student_tmp.state);
        }
    }

}