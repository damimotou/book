package ua.mega.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Represents a Student enrolled in the college management
 * system (CMS)
 */
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String enrollmentID;
    private String name;
    private String tutorName; // This will become a class soon
    private int numberOfCourses;

    /**
     * Required by Hibernate
     */
    public Student() {
    }

    /**
     * Initialises a student with a particular tutor
     */
    public Student(String name, String tutorName) {
        this.name = name;
        this.tutorName = tutorName;
    }

    /**
     * Initialises a student with no pre set tutor
     */
    public Student(String name) {
        this.name = name;
        this.tutorName = null;
    }

    public double calculateGradePointAverage() {
        // some complex business logic!
        // we won't need this method on the course, BUT it is import
        // to remember that classes aren't just get/set pairs - we expect
        // business logic in here as well.
        return 0;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnrollmentID() {
        return enrollmentID;
    }

    public void setEnrollmentID(String enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }
}
