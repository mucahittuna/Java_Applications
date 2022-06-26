public class Course
{
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int quizNote;

    Course(String name,String code, String prefix,Teacher teacher)
    {
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.teacher=teacher;
        this.note=0;
        this.quizNote=0;
    }

    void addTeacher(Teacher teacher)
    {
        if(teacher.branch.equals(this.prefix))
        {
            this.teacher=teacher;
        }else
            System.out.println("Brans secımı yanlis");
    }
    void printTeacherInfo()
    {
        System.out.println(this.teacher.name);
        System.out.println(this.teacher.branch);
        System.out.println(this.teacher.mpno);
    }

}
