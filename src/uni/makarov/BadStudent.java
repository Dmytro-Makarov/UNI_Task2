package uni.makarov;

public class BadStudent extends Student {

    protected BadStudent(String name) {
        super(name);
        state += "Bad";
    }

    @Override
    void Study(){
        Relax();
        Relax();
        Relax();
        Relax();
        Relax();
    }
}
