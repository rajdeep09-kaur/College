class student {
    String name;
    String course;

    void showname() {
        System.out.println("Name: " + name);
    }
}

class dept extends student {
    void showcourse() {
        System.out.println("Course: " + course);
    }
}

class study extends dept {
    int uid ;

    void show() {
        System.out.println("UID: " + uid);
    }
}

public class Main {
    public static void main(String[] args) {

        study obj = new study();

        obj.name = "Rajdeep";
        obj.course = "BCA";
        obj.uid = 116;

        obj.showname();
        obj.showcourse();
        obj.show();
    }
}
