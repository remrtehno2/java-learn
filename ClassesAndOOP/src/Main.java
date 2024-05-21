import java.beans.IntrospectionException;
import java.beans.Introspector;

public class Main {
    // Generic? OR General Class
    //    public static void printInfoOfStudents() {

    //    }
    public static void main(String[] args) throws IntrospectionException {
        /*
        System.out.println("********* Student 1 *********");
        Student Mark = new Student("Mark", "1995", "NONE");
        System.out.println(Mark.name);
        System.out.println(Mark.dateOfBirth);
        System.out.println(Mark.course);

        System.out.println("");
        System.out.println("********* Student 2 *********");
        Student Piter = new Student("Piter", "1992", "2th");
        System.out.println(Piter.name);
        System.out.println(Piter.dateOfBirth);
        System.out.println(Piter.course);

        System.out.println("");
        System.out.println("********* Student 3 *********");
        Student Vlad = new Student("Vlad", "1992", "NONE");
        System.out.println(Vlad.name);
        System.out.println(Vlad.dateOfBirth);
        System.out.println(Vlad.course);


        System.out.println("\n********* Student 4 *********");
        Student vasya = new Student("Vasya", "1992", "5th");
        System.out.println(vasya.name);
        System.out.println(vasya.dateOfBirth);
        System.out.println(vasya.course);

        System.out.println("");
        System.out.println("********* Student 5 *********");
        Student anna = new Student("Anna", "1992", "1th");
        System.out.println(anna.name);
        System.out.println(anna.dateOfBirth);
        System.out.println(anna.course);
         */

        System.out.println("");
        System.out.println("**** Friend 1 ****");
        Friend natia = new Friend("Natia", "9955554345", "Tbilsi", Friend.blizkiy);
        System.out.println(natia.name);
        System.out.println(natia.telNumber);
        System.out.println(natia.city);

        System.out.println("");
        System.out.println("**** Friend 2 ****");
        Friend dilyara = new Friend("Dilyara", "9984450002", "Tashkent", Friend.blizkiy);
        System.out.println(dilyara.name);
        System.out.println(dilyara.telNumber);
        System.out.println(dilyara.city);
//        System.out.println(dilyara.keyValue);

        System.out.println("");
        System.out.println("**** Friend 3 ****");
        Friend nilufar = new Friend("Nilufar", "9989994647", "Angren", Friend.neblizkiy);
        System.out.println(nilufar.name);
        System.out.println(nilufar.telNumber);
        System.out.println(nilufar.city);

        SimpleJavaBean smpBean = new SimpleJavaBean("Igor", 18);
        smpBean.setAge(25);
        smpBean.getAge();

        smpBean.setName("Name");
        smpBean.getName();


        BankAccountBean bankAccount = new BankAccountBean();

        bankAccount.getMoney(true);
        bankAccount.setMoney(10, true);


        Backend ourBackend = new Backend();
        String username = ourBackend.getUserById(1);





        /*
        System.out.println(nilufar);















        Colors colors = new Colors();

        System.out.println(colors);

        LPAStudent2 recordStudent = new LPAStudent2("S923007", "Bill",
                "05/11/1985", "Java Masterclass");

        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());
        System.out.println(recordStudent);

//       System.out.println( Introspector.getBeanInfo(colors.getClass()).getPropertyDescriptors());

        IntrospectorDemo.main();





         ========================= */
    }
}