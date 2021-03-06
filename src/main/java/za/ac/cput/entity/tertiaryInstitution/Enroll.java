package za.ac.cput.entity.tertiaryInstitution;


/**
 * Enroll.java
 * Entity for enroll using builder pattern
 * Author: Tisetso Kotoana
 * Date:01 June 2021
 */


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Enroll")

public class Enroll {

    @Id
    private String studentID;
    private String courseCode;
    private String date;
    private String paymentReceived;

    private Enroll(EnrollBuilder enroll) {
        this.studentID = enroll.studentID;
        this.courseCode = enroll.courseCode;
        this.date = enroll.date;
        this.paymentReceived = enroll.paymentReceived;
    }

    public String getStudentID() {

        return studentID;
    }

    public String getCourseCode(){
        return courseCode;
    }

    public String getDate(){
        return date;
    }

    public String getPaymentReceived(){
        return paymentReceived;
    }
    @Override
    public String toString() {
        return "EnrollBuilder{" +
                "studentID=" + studentID +
                ", courseCode='" + courseCode + '\'' +
                ", date=" + date +
                ", paymentReceived=" + paymentReceived +
                '}';
    }

    public static class EnrollBuilder{
        private String studentID;
        private String courseCode;
        private String date;
        private String paymentReceived;

        public EnrollBuilder setStudentID(String studentID) {
            this.studentID = studentID;
            return this;
        }

        public EnrollBuilder setCourseCode(String courseCode) {
            this.courseCode = courseCode;
            return this;
        }

        public EnrollBuilder setDate(String date) {
            this.date = date;
            return this;
        }

        public EnrollBuilder setPaymentReceived(String paymentReceived) {
            this.paymentReceived = paymentReceived;
            return this;
        }
        public Enroll build(){

            return new Enroll(this);
        }

        public EnrollBuilder copy(Enroll enroll){
            this.studentID=enroll.studentID;
           this.courseCode=enroll.courseCode;
           this.date=enroll.date;
           this.paymentReceived=enroll.paymentReceived;
            return this;
        }

    }
}
