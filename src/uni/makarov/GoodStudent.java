package uni.makarov;

public class GoodStudent extends Student {

    protected GoodStudent(String name) {
        super(name);
        state += "Good";
    }

    @Override
    void Study(){
        Read();
        Write();
        Read();
        Write();
        Relax();
    }
}
