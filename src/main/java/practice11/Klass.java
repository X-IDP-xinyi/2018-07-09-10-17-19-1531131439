package practice11;

public class Klass {
    private final int number;
    private Student leader;
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Klass(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        if (student.getKlass().number != this.number) {
            System.out.print("It is not one of us.\n");
        }else {
            setLeader(student);
        }
        if (null != this.getTeacher()) {
            if (student.getKlass().number == this.number) {
                System.out.print("I am " + this.getTeacher().getName() + ". I know " + student.getName()
                        + " become Leader of Class " + this.getNumber() + ".\n");
            }
        }
    }
    public void appendMember(Student student){
        student.setKlass(this);
        if (null != this.getTeacher()) {
            System.out.print("I am " + this.getTeacher().getName() + ". I know " + student.getName()
                    + " has joined Class " + this.getNumber() + ".\n");
        }
    }

    public boolean isIn(Student student) {
        return this.number == student.getKlass().number;
    }
}
