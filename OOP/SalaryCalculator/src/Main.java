public class Main {
    public static void main(String[] args) {
        Employee em1=new Employee("Kemal",2000,45,1985);
        Employee em2=new Employee("Utku",3000,15,2015);
        Employee em3=new Employee("Halil",3000,10,2000);

        em1.printInfo();
        System.out.println("\n\n");
        em2.printInfo();
        System.out.println("\n\n");
        em3.printInfo();
        System.out.println("\n\n");
    }
}
