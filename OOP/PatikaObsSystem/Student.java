public class Student
{
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student( String name,String stuNo,String classes,Course c1,Course c2,Course c3)
    {
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.average=0;
        this.isPass=false;

    }
    void addBulkExamNote(int n1,int n2,int n3,int q1,int q2,int q3)
    {
        if(n1<=100&&n1>=0)
        {
            this.c1.note=n1;
        }
        if(n1<=100&&n1>=0)
        {
            this.c2.note=n2;
        }
        if(n1<=100&&n1>=0)
        {
            this.c3.note=n3;
        }
        if(n1<=100&&n1>=0)
        {
            this.c1.quizNote=q1;
        }
        if(n1<=100&&n1>=0)
        {
            this.c2.quizNote=q2;
        }
        if(n1<=100&&n1>=0)
        {
            this.c3.quizNote=q3;
        }

    }

    double calcAverage()
    {
        double c1effect=(this.c1.note*0.7)+(this.c1.quizNote*0.3);
        double c2effect=(this.c2.note*0.7)+(this.c2.quizNote*0.3);
        double c3effect=(this.c3.note*0.7)+(this.c3.quizNote*0.3);
        this.average=(c1effect+c2effect+c3effect)/3;
        return this.average;

    }

    void isPass()
    {
       calcAverage();
        if(this.average>=50)
        {
            System.out.println("Gecti");
            this.isPass=true;
        }
        else
            System.out.println("Kaldi");
            this.isPass=false;
    }
    void printNote()
    {

        System.out.println(this.name+" Sınav "+this.c1.name+" Notu : "+this.c1.note+ "  Quiz : "+this.c1.quizNote);
        System.out.println(this.name+" Sınav "+this.c2.name+" Notu : "+this.c2.note+ "  Quiz : "+this.c2.quizNote);
        System.out.println(this.name+" Sınav "+this.c3.name+" Notu : "+this.c3.note+ "  Quiz : "+this.c3.quizNote);
        System.out.println(this.name+" Genel "+"Ortalaması : "+this.average);

    }
}
