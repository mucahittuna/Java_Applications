public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    int currentYear=2021;

    Employee(String name,int salary,int workHours,int hireYear)
    {
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    double tax()
    {
        if(this.salary<=1000)
            return 0;
        else
            return this.salary*0.03;
    }
    double bonus()
    {
        if(this.workHours>=40)
        {
            return (this.workHours-40)*30;
        }
        else
            return 0;
    }
    double raiseSalary()
    {

        if(this.currentYear-this.hireYear<10)
        {
            return this.salary*0.05;
        }
        else if(this.currentYear-this.hireYear>=9&&this.currentYear-this.hireYear<=20)
        {
            return this.salary*0.10;
        }
        else if(this.currentYear-this.hireYear>=19)
        {
            return this.salary*0.15;
        }
        else
            return salary;

    }
    void printInfo()
    {
        System.out.println("Adi: "+this.name);
        System.out.println("Maas: "+this.salary);
        System.out.println("Calisma Saati: "+this.workHours);
        System.out.println("Vergi: "+this.tax());
        System.out.println("Bonus: "+this.bonus());
        System.out.println("Maas Artisi: "+this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maas: "+(this.salary+this.bonus()-this.tax()));
        System.out.println("Toplam Maas: "+(this.salary+this.raiseSalary()));
    }
}
