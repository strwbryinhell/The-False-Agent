package com.mycompany.ap.project;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
@Entity
public class Stats implements java.io.Serializable {
 @Id
 @Column(name="id")
 private int id;
 @Column(name="TimesAsFalseAgent")
 private int TimesAsFalseAgent =0;
  @Column(name="TimesWon")
 private int TimesWon =0;
   //constructors
 public Stats() {
 }

 //setters and getters
 public int getId() {
 return this.id;
 }
 public void setId(int id) {
 this.id = id;
 }

  public int getTimesAsFalseAgent() {
 return this.TimesAsFalseAgent;
 }
 public void setTimesAsFalseAgent(int TimesAsFalseAgent) {
 this.TimesAsFalseAgent = TimesAsFalseAgent;
 }
 
  public int getTimesWon() {
 return this.TimesWon;
 }
 public void setTimesWon(int TimesWon) {
 this.TimesWon = TimesWon;
 }
         
}
