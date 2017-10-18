public class Student {
    private String firstName;
    private String lastName;
    private Integer id;
    private Integer grade;

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public Integer getGrade() { return grade; }

    public void setGrade(Integer grade) { this.grade = grade; }

    public Student(String firstName, String lastName, Integer id, Integer grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.grade = grade;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;
        return getId().equals(student.getId());
    }
    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}


