package zkyx;

public class Student {

    private Integer age;
    private Integer id;
    private boolean male;
    private String name;
    private Integer schoolId;

    public Student(Integer age, Integer id, boolean male, String name, Integer schoolId) {
        this.age = age;
        this.id = id;
        this.male = male;
        this.name = name;
        this.schoolId = schoolId;
    }

    public Student() {
    }
}
