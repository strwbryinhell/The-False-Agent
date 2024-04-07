package com.mycompany.ap.project;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
public class Agent implements java.io.Serializable {
 @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name="id")
 private int id;
 @Column(name="Name")
 private String Name;
 @Column(name="Number")
 private int Number;
  @Column(name="CaseChosen")
 private String CaseChosen;
   @Column(name="IsFalseAgent")
 private Boolean IsFalseAgent;
 
   //constructors
 public Agent() {
 }
 
 public Agent(String name) {
 
 this.Name = name;
 }
 
  public Agent(String name,int Number) {
 
 this.Name = name;
 this.Number = Number;
 }

 //setters and getters
 public int getId() {
 return this.id;
 }
 public void setId(int id) {
 this.id = id;
 }
 
 public String getName() {
 return Name;
 }
 public void setName(String Name) {
 this.Name = Name;
 }

  public int getNumber() {
 return this.Number;
 }
 public void setNumber(int Number) {
 this.Number = Number;
 }
 
  public String getCaseChosen() {
 return this.CaseChosen;
 }
 public void setCaseChosen(String CaseChosen) {
 this.CaseChosen = CaseChosen;
 }
      
  public Boolean getIsFalseAgent() {
 return this. IsFalseAgent;
 }
 public void setIsFalseAgent(Boolean ans) {
 this.IsFalseAgent = ans;
 }
          
}
