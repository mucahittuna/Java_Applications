public class Main {
    public static void main(String[] args)
    {
        Teacher t1=new Teacher("Mustafa","TRH","535465");
        Teacher t2=new Teacher("Mehmet","TRH","535465");
        Teacher t3=new Teacher("Hikmet","MAT","535465");
        Teacher t4=new Teacher("Bora","FEN","535465");

        Course matematik=new Course("Matematik","202","MAT",t3);
        Course tarih=new Course("Tarih","101","TRH",t1);
        Course fen=new Course("Fen","101","FEN",t4);

        Student st1=new Student("Mucahit","18067014","8-A",matematik,tarih,fen);
        Student st2=new Student("Mesut","18067012","8-A",matematik,tarih,fen);

//        tarih.addTeacher(t2);
//        matematik.addTeacher(t1);
//        tarih.printTeacher();
//        matematik.printTeacher();

        st1.addBulkExamNote(85,25,90,80,70,60);
        st1.isPass();
        st1.printNote();

        System.out.println("**************************************");
        st2.addBulkExamNote(27,38,48,80,68,92);
        st2.isPass();
        st2.printNote();

        tarih.printTeacherInfo();
        matematik.printTeacherInfo();
        fen.printTeacherInfo();


    }
}
