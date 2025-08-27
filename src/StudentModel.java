public class StudentModel {
    private int id;
    private String name;
    private int age;

    public StudentModel(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return "StudentModel [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}
