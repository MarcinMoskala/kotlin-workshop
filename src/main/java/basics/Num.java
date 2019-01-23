package basics;

public final class Num {
    private int number = 10;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        Student student = new Student("Marcin");
        System.out.print(student.getName());
        student.setName("Bob");
        System.out.print(student.getName());
    }
}