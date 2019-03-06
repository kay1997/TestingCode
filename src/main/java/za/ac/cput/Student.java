package za.ac.cput;

/**
 * Kaylen Abrahams
 * Student Number: 216054664
 * Group: 3G
 */

public class Student {

    private String studentName;
    private long studentNumber;

    int numberOfYearsStudying;

    public Student()
    {

    }

    public Student(String studentName, long studentNumber)
    {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }

    public boolean equals (Student s)
    {
        if (s == null) return false;

        return (((this.studentName).equals(s.studentName) &&
                this.studentNumber == s.studentNumber));
    }

    public int yearsOfStudy(int currentYear, int yearEnrolled)
    {
        numberOfYearsStudying = currentYear - yearEnrolled;

        return currentYear;
    }

    public String toString()
    {
        return ("Name: " + studentName + " " + "Student Number: " + studentNumber
                + " " + "Enrollment Year: " + " " +
                "Number of years studying: " + numberOfYearsStudying);
    }
}

