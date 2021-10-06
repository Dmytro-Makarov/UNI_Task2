package uni.makarov;

public abstract class Student {

    Student(String name){
        this.name = name;
        state = "";
    }

    String name;
    String state;

    abstract void Study();

    public void Read(){
        state += " Read";
    };

    public void Write(){
        state += " Write";
    };

    public void Relax(){
        state += " Relax";
    };
}

