import model.Student;


public class Main {

    public static void main(String[] args) {
        Student aryann = new Student("Aryann Magluyan", 23, "male", "1");
        System.out.println("Name: " + aryann.getName());
        System.out.println("Age: " + aryann.getAge());
        System.out.println("Gender: " + aryann.getGender());
        System.out.println("ID NO.: " + aryann.getIdNo());
    }
}
