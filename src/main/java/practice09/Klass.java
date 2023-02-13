package practice09;

import java.util.ArrayList;

public class Klass {
    private final int number;
    private Student leader;

    private final ArrayList<Student> memberList = new ArrayList<>();

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void appendMember(Student student){
        memberList.add(student);
    }

    public void assignLeader(Student student){
        if (student.getKlass().getNumber() != this.getNumber()){
            System.out.println("It is not one of us.");
        }else {
            setLeader(student);
        }
    }
}
