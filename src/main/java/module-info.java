module com.mycompany.ap.project {
requires javafx.controls;
exports com.mycompany.ap.project;
requires org.hibernate.orm.core; 
 requires java.naming;
 requires java.persistence;
 requires java.sql;
 opens com.mycompany.ap.project to org.hibernate.orm.core;
}
