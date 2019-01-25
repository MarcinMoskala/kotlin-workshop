package java;

public class JavaClass {

    public static void main(String[] args) {
        KotlinTopLevel.topLevelFunction("KOKO");
        KotlinClass.staticFunction();
        KotlinPerson person = new KotlinPerson("Marcin");
        KotlinPerson person2 = new KotlinPerson();
    }
}
