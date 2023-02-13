package practice09;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }


    @Override
    public String introduce() {
        if (klass.getLeader() == this) {
            return super.introduce() + " I am a Student. I am Leader of Class " + klass.getNumber() + ".";
        } else {
            return super.introduce() + " I am a Student. I am at Class " + klass.getNumber() + ".";
        }
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}
