package com.mycompany.ap.project;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
@Entity
public class Ratings implements java.io.Serializable {
 @Id
 @Column(name="Comments")
 private String Comments;
  @Column(name="RateOutOf10")
 private int RateOutOf10;
  @Column(name="Experience")
 private String Experience; 
   //constructors
 public Ratings() {
 }
 
 //setters and getters
 public String getComments() {
 return Comments;
 }
 public void setComments(String Comments) {
 this.Comments = Comments;
 }

  public int getRateOutOf10() {
 return this.RateOutOf10;
 }
 public void setRateOutOf10(int RateOutOf10) {
 this.RateOutOf10 = RateOutOf10;
 }
 
  public String getExperience() {
 return this.Experience;
 }
 public void setExperience(String Experience) {
 this.Experience = Experience;
 }
         
}
