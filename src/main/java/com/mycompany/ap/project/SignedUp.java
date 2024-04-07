package com.mycompany.ap.project;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
@Entity
public class SignedUp implements java.io.Serializable {
@Id
 @Column(name="Email")
 private String Email;
 @Column(name="Password")
 private String password;


   //constructors
 public SignedUp() {
 }
 
 public SignedUp(String Email) {
 
 this.Email = Email;
 }

 //setters and getters
 public String getpassword() {
 return this.password;
 }
 public void setpassword(String password) {
 this.password= password;
 }
 
 public String getEmail() {
 return Email;
 }
 public void setEmail(String Email) {
 this.Email= Email;
 }

}
