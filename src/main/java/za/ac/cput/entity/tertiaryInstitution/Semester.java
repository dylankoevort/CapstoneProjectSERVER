package za.ac.cput.entity.tertiaryInstitution;

/**
 * Enroll.java
 * Entity for semester using builder pattern
 * Author: Tisetso Kotoana
 * Date:01 June 2021
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Semester")
public class Semester {

   @Id
   private String semesterID;
   private String semesterStart;
   private String semesterEnd;

   public Semester(SemesterBuilder semester) {
      this.semesterID = semester.semesterID;
      this.semesterStart = semester.semesterStart;
      this.semesterEnd = semester.semesterEnd;
   }
   @Override
   public String toString() {
      return "SemesterBuilder{" +
              "semesterID=" + semesterID +
              ", semesterStart=" + semesterStart +
              ", semesterEnd=" + semesterEnd +
              '}';
   }

   public String getSemesterID() {

      return semesterID;
   }
   public String getSemesterStart(){
      return semesterStart;
   }
   public String getSemesterEnd(){
      return semesterEnd;
   }

   public static class SemesterBuilder{
      private String semesterID;
      private String semesterStart;
      private String semesterEnd;

      public SemesterBuilder setSemesterID(String semesterID) {
         this.semesterID = semesterID;
         return this;
      }

      public SemesterBuilder setSemesterStart(String semesterStart) {
         this.semesterStart = semesterStart;
         return this;
      }

      public SemesterBuilder setSemesterEnd(String semesterEnd) {
         this.semesterEnd = semesterEnd;
         return this;
      }

      public Semester build(){

         return new Semester(this);
      }
      public SemesterBuilder copy(Semester semester){
         this.semesterID=semester.semesterID;
         this.semesterStart=semester.semesterStart;
         this.semesterEnd=semester.semesterEnd;

         return this;
      }


   }
}
