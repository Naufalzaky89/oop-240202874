<<<<<<< HEAD
// Hello.OOP
=======
// HelloOOP
>>>>>>> 9c5669a55c5d7c9a2e266ca1bec738c6b8ea1677
class Student {
    String nim;
    String name;
    Student(String nim, String name) {
        this.nim = nim;
        this.name = name;
    }

    void introduce() {
<<<<<<< HEAD
        System.out.println("Hello world, I am " + name + " - "nim);
=======
        System.out.println("Hello World, I am " + name + " - " + nim);
>>>>>>> 9c5669a55c5d7c9a2e266ca1bec738c6b8ea1677
    }
}

public class HelloOOP {
    public static void main(String[] args) {
<<<<<<< HEAD
        Student s = new Student("240202847", "Naufal Zaky");
=======
        Student s = new Student("240202874", "Naufal Zaky");
>>>>>>> 9c5669a55c5d7c9a2e266ca1bec738c6b8ea1677
        s.introduce();
    }
}