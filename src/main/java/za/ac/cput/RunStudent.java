package za.ac.cput;

/**
 * Hello world!
 *
 */
public class RunStudent
{
    public static void main( String[] args )
    {
        Student stud1 = new Student("Kaylen Abrahams", 216054664);
        Student stud2 = new Student("Dean Ambrose", 123456789);
        Student stud3 = new Student("Kaylen Abrahams", 216054664);

       /* if(stud1.equals(stud2))
        {
            System.out.println("This does not match");
        }

        if(stud1.equals(stud3))
        {
            System.out.println("This matches");
        }*/
        stud1.yearsOfStudy(2019, 2016);
        System.out.println(stud1.toString());

    }
}
