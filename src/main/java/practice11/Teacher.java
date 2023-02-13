package practice11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Teacher extends Person {
    private LinkedList<Klass> classes = new LinkedList<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        for (Klass klass : classes) {
            klass.setTeacher(this);
        }
    }

    @Override
    public String introduce() {
        if (classes.isEmpty()) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            List<String> teachClass = new ArrayList<>();
            for (Klass aClass : classes) {
                teachClass.add(String.valueOf(aClass.getNumber()));
            }
            return super.introduce() + " I am a Teacher. I teach Class " + String.join(", ", teachClass) + ".";
        }
    }

    public String introduceWith(Student student) {
        for (Klass aClass : classes) {
            if (student.getKlass().getNumber() == aClass.getNumber()) {
                return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
            } else {
                return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(classes, teacher.classes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), classes);
    }

    public boolean isTeaching(Student student) {
        for (Klass aClass : classes)
            return aClass.isIn(student);
        return false;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }
}
