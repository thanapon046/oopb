
public class Student {

    String studentId;
    String studentName;
    String major;
    String faculty;

    void enrollment() {
        System.out.println("ฉันลงทะเบียนแล้ว");
    }

    void payment() {
        System.out.println("ฉันชำระเงินแล้ว");
    }

    void addCourse() {
            System.out.println("ฉันเพิ่มรายวิชา GE");
    }

    void dropCosrse() {
        System.out.println("ฉันถอนวิชา GR");
    }

//psvm+tab
    public static void main(String[] args) {
        //sout+tab

        /*System.out.println("Hellp World");
        System.out.println("My name is Thanapon");*/
        Student thanapon = new Student();
        System.out.println(">>"+thanapon);
        thanapon.enrollment();
        thanapon.payment();
        thanapon.addCourse();
        thanapon.dropCosrse();
                

    }

}//end
