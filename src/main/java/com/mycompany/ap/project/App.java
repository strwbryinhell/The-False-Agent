/*
!!
HI THERE!
PLEASE MAKE SURE TO GIVE THE IMAGES (10)ATTACHED WITH THE SOURCE CODE 
THEIR CORRECT FILE PATH.
TO FIND THE IMAGE FILES LOOK FOR THE GIANT ARROW POINTING AT THEM.
*/
package com.mycompany.ap.project;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javafx.animation.FadeTransition;
import javafx.animation.Animation.Status;
import javafx.animation.PathTransition;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.effect.DropShadow;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Polygon;
import javafx.scene.text.TextAlignment;
import javafx.util.Duration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class App extends Application {

    @Override
    public void start(Stage stage) {        
        //images
        /*
       YES, THIS IS THE ARROW  :>
                                            ||
                                            ||
                                            ||       
                                            ||
                                            ||
                                            ||
                                            ||
                                            ||
                                            ||
                                            ||
                                            ||
                                            ||
                                            ||
                                            ||
                                            ||
                                            ||
                                            ||
                        \\                  ||                  //
       
                           \\               ||               //
       
                              \\            ||            //
       
                                 \\                     //
       
                                   \\                //
        
                                     \\           //
       
                                       \\      //
       
                                          \\//
       
       */
       //case images                                
       Image caseA = new Image("file:///Users\\\\jarir\\\\Desktop\\\\caseA.png");
       Image caseB = new Image("file:///Users\\\\jarir\\\\Desktop\\\\caseB.png");
       Image caseC = new Image("file:///Users\\\\jarir\\\\Desktop\\\\caseC.png");
       Image falsepic = new Image("file:///Users\\\\jarir\\\\Desktop\\\\FA.jpg");
        //sign up logo
       Image SUlogo = new Image("file:///Users\\\\jarir\\\\Desktop\\\\signup.png");
        //scene 5 images
       Image file = new Image("file:///Users\\\\jarir\\\\Desktop\\\\hackerfile.png");
       Image web = new Image("file:///Users\\\\jarir\\\\Desktop\\\\Web.png");
       Image building = new Image("file:///Users\\\\jarir\\\\Desktop\\\\Building.png");
       //mini game images
        Image virusicon = new Image("file:///Users\\\\jarir\\\\Desktop\\\\virusicon.png");
        Image pcicon = new Image("file:///Users\\\\jarir\\\\Desktop\\\\pcicon.png");
        /////////////////////////////////////////////////////////////////////////////
       //OBJECTS CREATION FOR THE DATABASE
       Agent agent1DB = new Agent();
       Agent agent2DB = new Agent();
       Agent agent3DB = new Agent();
       Agent agent4DB = new Agent();
       Agent agent5DB = new Agent();
       //
       Ratings rating = new Ratings();
       //
       SignedUp signeduser = new SignedUp();
       //
       Stats hoststats = new Stats();
       //SESSION AND TRANSACTION 
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction tx = session.beginTransaction();
        /////////////////////////////////////////////START OF BACKGROUND FOR SCENE 1
        // Create a stack pane
        StackPane spbg = new StackPane();
        BorderPane recBG= new BorderPane();
        // Create horizontal green rectangles
        Rectangle gg1 = new Rectangle(0,0,500, 40);
        Rectangle gg2 = new Rectangle(0,60,500, 10);
        Rectangle gg3 = new Rectangle(0,80,500, 30);
        Rectangle gg4 = new Rectangle(0,180,500, 80); 
        Rectangle gg5 = new Rectangle(0,300,500, 60);
        Rectangle gg6 = new Rectangle(0,450,500, 30);
        Rectangle gg7 = new Rectangle(0,500,500, 40);
        Rectangle gg8 = new Rectangle(0,580,500, 5);
        Rectangle gg9 = new Rectangle(0,590,500, 5);
        
        Rectangle gg10 = new Rectangle(80,20,35, 5); //black
        Rectangle gg11 = new Rectangle(50,310,5, 160);
        Rectangle gg12 = new Rectangle(450,70,5, 120);//black
        Rectangle gg13 = new Rectangle(380,460,5, 30);//black
        Rectangle gg14 = new Rectangle(90,400,10, 90);
        Rectangle gg15 = new Rectangle(500,600);        
        gg1.setFill(Color.LIME);
        gg2.setFill(Color.FORESTGREEN);
        gg3.setFill(Color.LIME);
        gg4.setFill(Color.LIME);
        gg5.setFill(Color.FORESTGREEN);
        gg6.setFill(Color.LIME);
        gg7.setFill(Color.LIME);
        gg8.setFill(Color.FORESTGREEN);
        gg9.setFill(Color.LIME);
        
        gg10.setFill(Color.BLACK); //top left
        gg11.setFill(Color.LIME);
        gg12.setFill(Color.BLACK); //top right
        gg13.setFill(Color.BLACK); //bottom righ
        gg14.setFill(Color.FORESTGREEN);
        
       recBG.getChildren().addAll(gg15,gg1,gg2,gg3,gg4,gg5,gg6,gg7,gg8,gg9,gg10,gg11,gg12, gg13, gg14);
       spbg.getChildren().add(recBG);
       //glitch animation
                   Line line = new Line(50,310,50,315);
            PathTransition transition = new PathTransition();
            transition.setNode(gg11);
            transition.setDuration(Duration.seconds(0.1));
            transition.setPath(line);
            transition.setCycleCount(PathTransition.INDEFINITE);
            transition.play();
            //
            Line line2 = new Line(380,460,380,470);
            PathTransition transition2 = new PathTransition();
            transition2.setNode(gg13);
            transition2.setDuration(Duration.seconds(0.1));
            transition2.setPath(line2);
            transition2.setCycleCount(PathTransition.INDEFINITE);
            transition2.play();
            //
            Line line3 = new Line(250,300,250,305);
            PathTransition transition3 = new PathTransition();
            transition3.setNode(gg5);
            transition3.setDuration(Duration.millis(300));
            transition3.setPath(line3);
            transition3.setCycleCount(PathTransition.INDEFINITE);
            transition3.play();
            //
             Line line4 = new Line(250,550,250,545);
            PathTransition transition4 = new PathTransition();
            transition4.setNode(gg8);
            transition4.setDuration(Duration.millis(300));
            transition4.setPath(line4);
            transition4.setCycleCount(PathTransition.INDEFINITE);
            transition4.play();
            //
                         Line line5 = new Line(90,400,90,395);
            PathTransition transition5 = new PathTransition();
            transition5.setNode(gg14);
            transition5.setDuration(Duration.millis(100));
            transition5.setPath(line5);
            transition5.setCycleCount(PathTransition.INDEFINITE);
            transition5.play();
            //
            Line line6 = new Line(80,20,85,20);
            PathTransition transition6 = new PathTransition();
            transition6.setNode(gg10);
            transition6.setDuration(Duration.millis(100));
            transition6.setPath(line6);
            transition6.setCycleCount(PathTransition.INDEFINITE);
            transition6.play();
            //
                        Line line7 = new Line(250,60,250,55);
            PathTransition transition7 = new PathTransition();
            transition7.setNode(gg2);
            transition7.setDuration(Duration.millis(300));
            transition7.setPath(line7);
            transition7.setCycleCount(PathTransition.INDEFINITE);
            transition7.play();
                        //
            Line line8 = new Line(450,70,450,65);
            PathTransition transition8 = new PathTransition();
            transition8.setNode(gg12);
            transition8.setDuration(Duration.millis(100));
            transition8.setPath(line8);
            transition8.setCycleCount(PathTransition.INDEFINITE);
            transition8.play();
       //end of glitch animation
        ////////////////////////////////////////////END OF BACKGROUND (scene 1)
        ////////////////////////////////////////////START OF BACKGROUNDS FOR OTHER SCENE
         /////////////////Backgornd2////////////////////////////
////Black Rectanlge/////
Rectangle rec1 = new Rectangle(0,0,500,600);
Rectangle rec2 = new Rectangle(0,0,500,600);
Rectangle rec3 = new Rectangle(0,0,500,600);
Rectangle rec4 = new Rectangle(0,0,500,600);
Rectangle rec5 = new Rectangle(0,0,500,600);
Rectangle rec6 = new Rectangle(0,0,500,600);
Rectangle rec7 = new Rectangle(0,0,500,600);
Rectangle rec8 = new Rectangle(0,0,500,600);
Rectangle rec9 = new Rectangle(0,0,500,600);

/////green trinangle////
Polygon tri1Up = new Polygon(0,0,0,250,250,0);
Polygon tri1Down = new Polygon(500,600,250,600,500,350);

Polygon tri2Up = new Polygon(0,0,0,250,250,0);
Polygon tri2Down = new Polygon(500,600,250,600,500,350);

Polygon tri3Up = new Polygon(0,0,0,250,250,0);
Polygon tri3Down = new Polygon(500,600,250,600,500,350);

Polygon tri4Up = new Polygon(0,0,0,250,250,0);
Polygon tri4Down = new Polygon(500,600,250,600,500,350);

Polygon tri5Up = new Polygon(0,0,0,250,250,0);
Polygon tri5Down = new Polygon(500,600,250,600,500,350);

Polygon tri6Up = new Polygon(0,0,0,250,250,0);
Polygon tri6Down = new Polygon(500,600,250,600,500,350);

Polygon tri7Up = new Polygon(0,0,0,250,250,0);
Polygon tri7Down = new Polygon(500,600,250,600,500,350);

Polygon tri8Up = new Polygon(0,0,0,250,250,0);
Polygon tri8Down = new Polygon(500,600,250,600,500,350);

Polygon tri9Up = new Polygon(0,0,0,250,250,0);
Polygon tri9Down = new Polygon(500,600,250,600,500,350);
/////////////////Lines///////////////////
Line line1Up= new Line(310,0,0,310);
Line line1Down= new Line(500,310,200,600);


Line line2Up= new Line(310,0,0,310);
Line line2Down= new Line(500,310,200,600);


Line line3Up= new Line(310,0,0,310);
Line line3Down= new Line(500,310,200,600);


Line line4Up= new Line(310,0,0,310);
Line line4Down= new Line(500,310,200,600);


Line line5Up= new Line(310,0,0,310);
Line line5Down= new Line(500,310,200,600);


Line line6Up= new Line(310,0,0,310);
Line line6Down= new Line(500,310,200,600);

Line line7Up= new Line(310,0,0,310);
Line line7Down= new Line(500,310,200,600);


Line line8Up= new Line(310,0,0,310);
Line line8Down= new Line(500,310,200,600);

Line line9Up= new Line(310,0,0,310);
Line line9Down= new Line(500,310,200,600);

//////////////////////////////////////////////////

//////////////Style the lines////////////////////
line1Up.setStroke(Color.LIME);
line1Up.setStrokeWidth(5);

line2Up.setStroke(Color.LIME);
line2Up.setStrokeWidth(5);

line3Up.setStroke(Color.LIME);
line3Up.setStrokeWidth(5);

line4Up.setStroke(Color.LIME);
line4Up.setStrokeWidth(5);

line5Up.setStroke(Color.LIME);
line5Up.setStrokeWidth(5);

line6Up.setStroke(Color.LIME);
line6Up.setStrokeWidth(5);

line7Up.setStroke(Color.LIME);
line7Up.setStrokeWidth(5);

line8Up.setStroke(Color.LIME);
line8Up.setStrokeWidth(5);

line1Down.setStroke(Color.LIME);
line1Down.setStrokeWidth(5);

line2Down.setStroke(Color.LIME);
line2Down.setStrokeWidth(5);

line3Down.setStroke(Color.LIME);
line3Down.setStrokeWidth(5);

line4Down.setStroke(Color.LIME);
line4Down.setStrokeWidth(5);

line5Down.setStroke(Color.LIME);
line5Down.setStrokeWidth(5);

line6Down.setStroke(Color.LIME);
line6Down.setStrokeWidth(5);

line7Down.setStroke(Color.LIME);
line7Down.setStrokeWidth(5);

line8Down.setStroke(Color.LIME);
line8Down.setStrokeWidth(5);

line9Up.setStroke(Color.LIME);
line9Up.setStrokeWidth(5);

line9Down.setStroke(Color.LIME);
line9Down.setStrokeWidth(5);

////////////////  Style the recangles///////////////////
rec1.setFill(Color.BLACK);
rec2.setFill(Color.BLACK);
rec3.setFill(Color.BLACK);
rec4.setFill(Color.BLACK);
rec5.setFill(Color.BLACK);
rec6.setFill(Color.BLACK);
rec7.setFill(Color.BLACK);
rec8.setFill(Color.BLACK);
rec9.setFill(Color.BLACK);
////////////////Style triangles//////////////////
tri1Up.setFill(Color.LIME);
tri1Down.setFill(Color.LIME);

tri2Up.setFill(Color.LIME);
tri2Down.setFill(Color.LIME);

tri3Up.setFill(Color.LIME);
tri3Down.setFill(Color.LIME);

tri4Up.setFill(Color.LIME);
tri4Down.setFill(Color.LIME);

tri5Up.setFill(Color.LIME);
tri5Down.setFill(Color.LIME);

tri6Up.setFill(Color.LIME);
tri6Down.setFill(Color.LIME);

tri7Up.setFill(Color.LIME);
tri7Down.setFill(Color.LIME);

tri8Up.setFill(Color.LIME);
tri8Down.setFill(Color.LIME);

tri9Up.setFill(Color.LIME);
tri9Down.setFill(Color.LIME);
////////////////////////////////      Groups     /////////////////////////////////////////////////////////////


        Group root1 = new Group(rec1,tri1Up,tri1Down,line1Up,line1Down);

       /////////////////////////////////////////////////
       
       Group root2 = new Group(rec2,tri2Up,tri2Down,line2Up,line2Down);

       
       ///////////////////////////////////////////////////////
       Group root3 = new Group(rec3,tri3Up,tri3Down,line3Up,line3Down);

      
       ////////////////////////////////////////////////////
       Group root4 = new Group(rec4,tri4Up,tri4Down,line4Up,line4Down);

       
       ///////////////////////////////////////////////////////////
       
       Group root5 = new Group(rec5,tri5Up,tri5Down,line5Up,line5Down);

       
       ////////////////////////////////////////////////////////////////////
       
       Group root6= new Group(rec6,tri6Up,tri6Down,line6Up,line6Down);

       
       ///////////////////////////////////////////////////////////////////////
       
       Group root7 = new Group(rec7,tri7Up,tri7Down,line7Up,line7Down);

       
       //////////////////////////////////////////////////////////////////
       
       Group root8 = new Group(rec8,tri8Up,tri8Down,line8Up,line8Down);

       /////////////////////////////////////////////////////////////////////
       
       Group root9 = new Group(rec9,tri9Up,tri9Down,line9Up,line9Down);
       
        //
                //1
        //lines v
       Line lbg1 = new Line(0,20,500,20);
       Line lbg2 = new Line(0,580,500,580);
       Line lbg3 = new Line(0,45,500,45);
       Line lbg4 = new Line(0,555,500,555);
       //h
       Line lbg5 = new Line(20,0,20,600);
       Line lbg6 = new Line(480,0,480,600);
       Line lbg7 = new Line(45,0,45,600);
       Line lbg8 = new Line(455,0,455,600);
       //2
        //lines v
       Line lbg9 = new Line(0,20,500,20);
       Line lbg10 = new Line(0,580,500,580);
       Line lbg11 = new Line(0,45,500,45);
       Line lbg12 = new Line(0,555,500,555);
       //h
       Line lbg13 = new Line(20,0,20,600);
       Line lbg14 = new Line(480,0,480,600);
       Line lbg15 = new Line(45,0,45,600);
       Line lbg16 = new Line(455,0,455,600);
       //3
               //lines v
       Line lbg17 = new Line(0,20,500,20);
       Line lbg18 = new Line(0,580,500,580);
       Line lbg19 = new Line(0,45,500,45);
       Line lbg20 = new Line(0,555,500,555);
       //h
       Line lbg21 = new Line(20,0,20,600);
       Line lbg22 = new Line(480,0,480,600);
       Line lbg23 = new Line(45,0,45,600);
       Line lbg24 = new Line(455,0,455,600);
              //4
               //lines v
       Line lbg25 = new Line(0,20,500,20);
       Line lbg26 = new Line(0,580,500,580);
       Line lbg27 = new Line(0,45,500,45);
       Line lbg28 = new Line(0,555,500,555);
       //h
       Line lbg29 = new Line(20,0,20,600);
       Line lbg30 = new Line(480,0,480,600);
       Line lbg31 = new Line(45,0,45,600);
       Line lbg32 = new Line(455,0,455,600);
       //#5
       //lines v
       Line lbg33 = new Line(0,20,500,20);
       Line lbg34 = new Line(0,580,500,580);
       Line lbg35 = new Line(0,45,500,45);
       Line lbg36 = new Line(0,555,500,555);
       //h
       Line lbg37 = new Line(20,0,20,600);
       Line lbg38 = new Line(480,0,480,600);
       Line lbg39 = new Line(45,0,45,600);
       Line lbg40 = new Line(455,0,455,600);
       //color
       lbg1.setStroke(Color.LIME);
       lbg2.setStroke(Color.LIME);
       lbg3.setStroke(Color.LIME);
       lbg4.setStroke(Color.LIME);
       lbg5.setStroke(Color.LIME);
       lbg6.setStroke(Color.LIME);
       lbg7.setStroke(Color.LIME);
       lbg8.setStroke(Color.LIME);
       lbg9.setStroke(Color.LIME);
       lbg10.setStroke(Color.LIME);
       lbg11.setStroke(Color.LIME);
       lbg12.setStroke(Color.LIME);
       lbg13.setStroke(Color.LIME);
       lbg14.setStroke(Color.LIME);
       lbg15.setStroke(Color.LIME);
       lbg16.setStroke(Color.LIME);
       lbg17.setStroke(Color.LIME);
       lbg18.setStroke(Color.LIME);
       lbg19.setStroke(Color.LIME);
       lbg20.setStroke(Color.LIME);
       lbg21.setStroke(Color.LIME);
       lbg22.setStroke(Color.LIME);
       lbg23.setStroke(Color.LIME);
       lbg24.setStroke(Color.LIME);
       lbg25.setStroke(Color.LIME);
       lbg26.setStroke(Color.LIME);
       lbg27.setStroke(Color.LIME);
       lbg28.setStroke(Color.LIME);
       lbg29.setStroke(Color.LIME);
       lbg30.setStroke(Color.LIME);
       lbg31.setStroke(Color.LIME);
       lbg32.setStroke(Color.LIME);
       lbg33.setStroke(Color.LIME);
       lbg34.setStroke(Color.LIME);
       lbg35.setStroke(Color.LIME);
       lbg36.setStroke(Color.LIME);
       lbg37.setStroke(Color.LIME);
       lbg38.setStroke(Color.LIME);
       lbg39.setStroke(Color.LIME);
       lbg40.setStroke(Color.LIME);
       //size
       lbg1.setStrokeWidth(20);
       lbg2.setStrokeWidth(20);
       lbg3.setStrokeWidth(5);
       lbg4.setStrokeWidth(5);
       lbg5.setStrokeWidth(20);
       lbg6.setStrokeWidth(20);
       lbg7.setStrokeWidth(5);
       lbg8.setStrokeWidth(5);
       lbg9.setStrokeWidth(20);
       lbg10.setStrokeWidth(20);
       lbg11.setStrokeWidth(5);
       lbg12.setStrokeWidth(5);
       lbg13.setStrokeWidth(20);
       lbg14.setStrokeWidth(20);
       lbg15.setStrokeWidth(5);
       lbg16.setStrokeWidth(5);
       lbg17.setStrokeWidth(20);
       lbg18.setStrokeWidth(20);
       lbg19.setStrokeWidth(5);
       lbg20.setStrokeWidth(5);
       lbg21.setStrokeWidth(20);
       lbg22.setStrokeWidth(20);
       lbg23.setStrokeWidth(5);
       lbg24.setStrokeWidth(5);
       lbg25.setStrokeWidth(20);
       lbg26.setStrokeWidth(20);
       lbg27.setStrokeWidth(5);
       lbg28.setStrokeWidth(5);
       lbg29.setStrokeWidth(20);
       lbg30.setStrokeWidth(20);
       lbg31.setStrokeWidth(5);
       lbg32.setStrokeWidth(5);
       lbg33.setStrokeWidth(20);
       lbg34.setStrokeWidth(20);
       lbg35.setStrokeWidth(5);
       lbg36.setStrokeWidth(5);
       lbg37.setStrokeWidth(20);
       lbg38.setStrokeWidth(20);
       lbg39.setStrokeWidth(5);
       lbg40.setStrokeWidth(5);
       //black recs
       Rectangle bbgg1 = new Rectangle(500,600);
       Rectangle bbgg2 = new Rectangle(500,600);
       Rectangle bbgg3= new Rectangle(500,600);
       Rectangle bbgg4= new Rectangle(500,600);
       Rectangle bbgg5= new Rectangle(500,600);
       //groups
       Group bg3group1 = new Group(bbgg1,lbg1,lbg2,lbg3,lbg4,lbg5,lbg6,lbg7,lbg8);
       Group bg3group2 = new Group(bbgg2,lbg9,lbg10,lbg11,lbg12,lbg13,lbg14,lbg15,lbg16);
       Group bg3group3 = new Group(bbgg3,lbg17,lbg18,lbg19,lbg20,lbg21,lbg22,lbg23,lbg24);
       Group bg3group4 = new Group(bbgg4,lbg25,lbg26,lbg27,lbg28,lbg29,lbg30,lbg31,lbg32);
       Group bg3group5 = new Group(bbgg5,lbg33,lbg34,lbg35,lbg36,lbg37,lbg38,lbg39,lbg40);
       //stack panes
       StackPane background31 = new StackPane();
       background31.getChildren().addAll(bg3group1);
       StackPane background32 = new StackPane();
       background32.getChildren().addAll(bg3group2);
       StackPane background33 = new StackPane();
       background33.getChildren().addAll(bg3group3);
       StackPane background34 = new StackPane();
       background34.getChildren().addAll(bg3group4);
       StackPane background35 = new StackPane();
       background35.getChildren().addAll(bg3group5);
       /////////////////////////////////////////////
               
////Black Rectanlge 1/////
        Rectangle rec1bg = new Rectangle(0, 0, 500, 600);
         rec1.setFill(Color.BLACK); 

/////green trinangle 1////
        Polygon triTop1 = new Polygon(250, 120, 100, 0, 400, 0);
           triTop1.setFill(Color.LIME);
            
        Polygon triDown1= new Polygon(250, 450, 400, 600, 100, 600);
            triDown1.setFill(Color.LIME);
            
        Polygon triRight1 = new Polygon(320, 250, 500, 100, 500, 400);
         triRight1.setFill(Color.LIME);

        Polygon triLeft1 = new Polygon(150, 250, 0, 100, 0, 400);
          triLeft1.setFill(Color.LIME);

        Group root1bg = new Group(rec1bg, triTop1,triDown1,triLeft1,triRight1);
        
        
        
////Black Rectanlge 2/////
        Rectangle rec2bg = new Rectangle(0, 0, 500, 600);
         rec2.setFill(Color.BLACK); 

/////green trinangle 2////
        Polygon triTop2 = new Polygon(250, 120, 100, 0, 400, 0);
           triTop2.setFill(Color.LIME);
            
        Polygon triDown2= new Polygon(250, 450, 400, 600, 100, 600);
            triDown2.setFill(Color.LIME);
            
        Polygon triRight2 = new Polygon(320, 250, 500, 100, 500, 400);
         triRight2.setFill(Color.LIME);

        Polygon triLeft2 = new Polygon(150, 250, 0, 100, 0, 400);
          triLeft2.setFill(Color.LIME);

        Group root2bg = new Group(rec2bg, triTop2,triDown2,triLeft2,triRight2);
        
        
        
////Black Rectanlge 3/////
        Rectangle rec3bg = new Rectangle(0, 0, 500, 600);
         rec3.setFill(Color.BLACK); 

/////green trinangle 3////
        Polygon triTop3 = new Polygon(250, 120, 100, 0, 400, 0);
           triTop3.setFill(Color.LIME);
            
        Polygon triDown3= new Polygon(250, 450, 400, 600, 100, 600);
            triDown3.setFill(Color.LIME);
            
        Polygon triRight3 = new Polygon(320, 250, 500, 100, 500, 400);
         triRight3.setFill(Color.LIME);

        Polygon triLeft3 = new Polygon(150, 250, 0, 100, 0, 400);
          triLeft3.setFill(Color.LIME);

        Group root3bg = new Group(rec3bg, triTop3,triDown3,triLeft3,triRight3);
        
        
        
////Black Rectanlge 4/////
        Rectangle rec4bg = new Rectangle(0, 0, 500, 600);
         rec4.setFill(Color.BLACK); 

/////green trinangle 4////
        Polygon triTop4 = new Polygon(250, 120, 100, 0, 400, 0);
           triTop4.setFill(Color.LIME);
            
        Polygon triDown4= new Polygon(250, 450, 400, 600, 100, 600);
            triDown4.setFill(Color.LIME);
            
        Polygon triRight4 = new Polygon(320, 250, 500, 100, 500, 400);
         triRight4.setFill(Color.LIME);

        Polygon triLeft4 = new Polygon(150, 250, 0, 100, 0, 400);
          triLeft4.setFill(Color.LIME);

        Group root4bg = new Group(rec4bg, triTop4,triDown4,triLeft4,triRight4);
        
        
        
////Black Rectanlge 5/////
        Rectangle rec5bg = new Rectangle(0, 0, 500, 600);
         rec5.setFill(Color.BLACK); 

/////green trinangle 5////
        Polygon triTop5 = new Polygon(250, 120, 100, 0, 400, 0);
           triTop5.setFill(Color.LIME);
            
        Polygon triDown5= new Polygon(250, 450, 400, 600, 100, 600);
            triDown5.setFill(Color.LIME);
            
        Polygon triRight5 = new Polygon(320, 250, 500, 100, 500, 400);
         triRight5.setFill(Color.LIME);

        Polygon triLeft5 = new Polygon(150, 250, 0, 100, 0, 400);
          triLeft5.setFill(Color.LIME);

        Group root5bg = new Group(rec5bg, triTop5,triDown5,triLeft5,triRight5);
        
        
        
////Black Rectanlge 6/////
        Rectangle rec6bg = new Rectangle(0, 0, 500, 600);
         rec6.setFill(Color.BLACK); 

/////green trinangle 6////
        Polygon triTop6 = new Polygon(250, 120, 100, 0, 400, 0);
           triTop6.setFill(Color.LIME);
            
        Polygon triDown6= new Polygon(250, 450, 400, 600, 100, 600);
            triDown6.setFill(Color.LIME);
            
        Polygon triRight6 = new Polygon(320, 250, 500, 100, 500, 400);
         triRight6.setFill(Color.LIME);

        Polygon triLeft6 = new Polygon(150, 250, 0, 100, 0, 400);
          triLeft6.setFill(Color.LIME);

        Group root6bg = new Group(rec6bg, triTop6,triDown6,triLeft6,triRight6);
        ////////////////////////////////////////////END OF BACKGROUNDS
        /////////////////////////////////////////////scene 1 content
        StackPane sp = new StackPane();
        //title
        Label title = new Label("The\nFalse Agent");
        title.setBackground(Background.fill(Color.BLACK));
        title.setAlignment(Pos.CENTER);
        title.setTextAlignment(TextAlignment.CENTER);
        title.setStyle("-fx-text-fill: LIME;");
        title.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,70));
        //description for the game
        Label desc = new Label("one of you is lying...but who?\n figure out who is the\nsecret liar to win!");
        DropShadow shadow = new DropShadow(15,Color.WHITE);
        DropShadow shadowb = new DropShadow();
        desc.setEffect(shadowb);
        desc.setAlignment(Pos.CENTER);
        desc.setTextAlignment(TextAlignment.CENTER);
        desc.setStyle("-fx-text-fill: LIME;");
        desc.setFont(Font.font("Baskerville Old Face",FontWeight.NORMAL,FontPosture.ITALIC,25));
        //button to start the game
        Button st = new Button("start");
        st.setAlignment(Pos.CENTER);
        st.setStyle("-fx-text-fill: LIME;");
        st.setStyle("-fx-background-color: FORESTGREEN;");
        st.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,35));
        //button for playing instructions
        Button htp = new Button("how to\n  play");
        htp.setAlignment(Pos.CENTER);
        htp.setStyle("-fx-text-fill: LIME;");
        htp.setStyle("-fx-background-color: FORESTGREEN;");
        htp.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,25));
        //button for sign up
        Button signup = new Button("sign up");
        signup.setAlignment(Pos.CENTER);
        signup.setStyle("-fx-text-fill: LIME;");
        signup.setStyle("-fx-background-color: FORESTGREEN;");
        signup.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,26));
        //button for exiting the game
        Button exitgame = new Button("exit");
        exitgame.setAlignment(Pos.CENTER);
        exitgame.setStyle("-fx-text-fill: LIME;");
        exitgame.setStyle("-fx-background-color: FORESTGREEN;");
        exitgame.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,35));
        //border pane
        BorderPane s1border = new BorderPane();
        VBox cen = new VBox(80);
        cen.setAlignment(Pos.CENTER);
        cen.getChildren().addAll(title,desc);
        s1border.setCenter(cen);
        //linking content to the stack pane using a flow pane
        
        GridPane gps1 = new GridPane();
        gps1.setAlignment(Pos.CENTER);
        gps1.setPadding(new Insets(30));
        gps1.setHgap(20);
        gps1.setVgap(20);
        gps1.add(st,0,0);
        gps1.add(htp,1,0);
        gps1.add(signup,0,1);
        gps1.add(exitgame,1,1);
        s1border.setBottom(gps1);
        sp.getChildren().addAll(recBG,s1border);
        ////////////////////////////////////////////////HTP SCENE CONTENT 
        Rectangle htpbg = new Rectangle(500,600);
        //title
        Label ttl = new Label("~~~HOW TO PLAY~~~");
        ttl.setAlignment(Pos.CENTER);
        ttl.setTextAlignment(TextAlignment.CENTER);
        ttl.setStyle("-fx-text-fill: LIME;");
        ttl.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,25));
        HBox top = new HBox(15);
        top.getChildren().add(ttl);
        top.setAlignment(Pos.CENTER);
        //instructions
        Label inst = new Label("1-enter your names (5 MAX).\n2-choose a case file\nthat will be displayed to you.\n3-hand over the device to whichever agent\nthe game asks you to,\nif you are that agent then memorise the case in front of you\n especially the key details.\n4-once all agents viewed their files,\na series of questions will be displayed to you \n and you will have to discuss them together.\nthis is your chance to figure out who might be hesitant to answer\nor is not so confident.\n5-once the file containing the truth\n reaches our building,all of you\nwill have to vote out who you think is \nthe false agent,AKA who did not see the same file\nas you,if you manage to vote out the false agent\nthen all the rightful agents will win\nbut if you vote out the wrong agent\nthen the false agent will win.");
        inst.setAlignment(Pos.CENTER);
        inst.setTextAlignment(TextAlignment.CENTER);
        inst.setStyle("-fx-text-fill: LIME;");
        inst.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,18));
        HBox center = new HBox(15);
        center.getChildren().add(inst);
        center.setAlignment(Pos.CENTER);
        //button to go back to scene 1
        Button htpgi = new Button("got it");
        htpgi.setStyle("-fx-text-fill: LIME;");
        htpgi.setStyle("-fx-background-color: FORESTGREEN;");
        htpgi.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,25));
        HBox bottom = new HBox(30);
        bottom.getChildren().add(htpgi);
        bottom.setAlignment(Pos.CENTER);
        htpgi.setAlignment(Pos.CENTER);
        //border pane
        BorderPane htpb = new BorderPane();
        htpb.setPadding(new Insets(15));
        htpb.setTop(top);
        htpb.setCenter(center);
        htpb.setBottom(bottom);
        //stack pane
        StackPane htps = new StackPane();
        //htps.setAlignment(Pos.CENTER);
        htps.getChildren().addAll(htpbg,htpb);
        //
        //
        //
        //////////////////////////////////////////////////////////SIGN UP SCENE
        StackPane spSU = new StackPane();
        shadow.setColor(Color.FORESTGREEN);
        Label lb1SU = new Label("\n Sign up to view a hidden\npromo video available only\nfor signed users!");
        lb1SU.setTextAlignment(TextAlignment.CENTER);
        lb1SU.setStyle("-fx-text-fill:LIME");
        lb1SU.setFont(Font.font("Baskerville Old Face", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC, 30));
        lb1SU.setEffect(shadow);

        TextField t1SU = new TextField();
        Label lb2SU = new Label(" Email  :", t1SU);
        lb2SU.setContentDisplay(ContentDisplay.RIGHT);
        lb2SU.setFont(Font.font("Baskerville Old Face", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC, 30));
        lb2SU.setStyle("-fx-background-color: FORESTGREEN; -fx-text-fill: LIME; -fx-background-radius: 20;");
        
        ImageView a = new ImageView(SUlogo);
        a.setFitWidth(50);
        a.setFitHeight(50);

        TextField t2SU = new TextField();
        Label lb3SU = new Label(" Pass  :", t2SU);
        lb3SU.setContentDisplay(ContentDisplay.RIGHT);
        lb3SU.setFont(Font.font("Baskerville Old Face", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC, 34));
        lb3SU.setStyle("-fx-background-color: FORESTGREEN; -fx-text-fill: LIME; -fx-background-radius: 20;");
        
        Label Warning3 = new Label("please make sure to fill all info.");
        Warning3.setFont(Font.font("Baskerville Old Face", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC, 15));
        Warning3.setStyle("-fx-text-fill: RED;");
        Warning3.setOpacity(0);

        Button DoneSU  = new Button("Done");
        DoneSU.setFont(Font.font("Baskerville Old Face", 30));
        DoneSU.setStyle("-fx-background-color: FORESTGREEN; -fx-text-fill: LIME;");

        Button backSU  = new Button("back");
        backSU.setFont(Font.font("Baskerville Old Face", 30));
        backSU.setStyle("-fx-background-color: FORESTGREEN; -fx-text-fill: LIME;");
        HBox buttonsSU = new HBox(10);
        buttonsSU.getChildren().addAll(DoneSU,backSU);
        buttonsSU.setAlignment(Pos.CENTER);
        VBox vboxSU = new VBox();
        vboxSU.setSpacing(20);
        vboxSU.setAlignment(Pos.CENTER);
        vboxSU.getChildren().addAll(lb1SU, a, lb2SU, lb3SU,Warning3, t1SU, t2SU,buttonsSU);
        BorderPane ssign = new BorderPane();
        ssign.setPadding(new Insets(20));
        ssign.setCenter(vboxSU);
        spSU.getChildren().add(ssign);
        spSU.setStyle("-fx-background-color: black;");
///////////////////////////////////////////////////////////////SIGNED SCENE
BorderPane signedbp = new BorderPane();
    //top
    Label thx = new Label("thank you for signing up!\n copy the link shown to you\n and paste it in Google to view\n the games promotional video!");
        thx.setStyle("-fx-text-fill: LIME;");
        thx.setStyle("-fx-background-color: FORESTGREEN;");
        thx.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,26));
        thx.setTextAlignment(TextAlignment.CENTER);
        HBox topsigned = new HBox(15);
        topsigned.setAlignment(Pos.CENTER);
        topsigned.getChildren().add(thx);
        //center
        TextArea tt = new TextArea();
        tt.setFont(Font.font("Baskerville Old Face",20));
        tt.setEditable(false);
        tt.setText("https://youtube.com/shorts/7XcBP2SV0Tk?si=yD2mmfx7xRoSP5UG");
        tt.setMaxWidth(400);
        tt.setMaxHeight(130);
        tt.setWrapText(true);
        HBox centersigned = new HBox(15);
        centersigned.setAlignment(Pos.CENTER);
        centersigned.getChildren().add(tt);
        //bottom
        Button contsigned = new Button("continue");
                contsigned.setStyle("-fx-text-fill: LIME;");
        contsigned.setStyle("-fx-background-color: FORESTGREEN;");
        contsigned.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,26));
        contsigned.setTextAlignment(TextAlignment.CENTER);
        HBox bottomsigned = new HBox(15);
        bottomsigned.setAlignment(Pos.CENTER);
        bottomsigned.getChildren().add(contsigned);
        //link
        signedbp.setTop(topsigned);
        signedbp.setCenter(centersigned);
        signedbp.setBottom(bottomsigned);
        signedbp.setPadding(new Insets(60));
        StackPane signed = new StackPane();
        Rectangle recsigned = new Rectangle(500,600);
        signed.getChildren().addAll(recsigned,signedbp);
        
        ////////////////////////////////////////////SCENE 2
//Top *****************************************************************
    DropShadow shadow2= new DropShadow();//add shadow to text1
    Text text1 = new Text("Please enter your names ");
    text1.setFont(Font.font("Baskerville Old Face",30));
    text1.setFill(Color.LIME);
    text1.setEffect(shadow2);
    Button ReturnButton = new Button("back");
      ReturnButton.setFont(Font.font("Baskerville Old Face",15));
  ReturnButton.setStyle("-fx-background-color: FORESTGREEN;" +"-fx-text-fill: BLACK;");
  ReturnButton.setScaleX(1.5);
  ReturnButton.setScaleY(1.5);
    HBox top1= new HBox();//ReturnButton
    HBox top2= new HBox();//text1
    top1.setPadding(new Insets(20, 80, 0, 0));
    top1.getChildren().addAll(ReturnButton);
    top1.setAlignment(Pos.TOP_RIGHT);
    top2.setPadding(new Insets(20, 20, 20, 20));
    top2.getChildren().addAll(text1);
    top2.setAlignment(Pos.CENTER);
    VBox tops2= new VBox();// add ReturnButton and text1
    tops2.getChildren().addAll(top1,top2);
    tops2.setAlignment(Pos.CENTER);

    //left*****************************************************************
    VBox lefts2= new VBox();
    lefts2.setPadding(new Insets(40));
    //right*****************************************************************
    VBox rights2= new VBox();
    rights2.setPadding(new Insets(40));
   
    //center*****************************************************************
    Label lb1 = new Label("AGENT 1 ");
    lb1.setFont(Font.font("Baskerville Old Face",25));
    TextField Ag1textField = new TextField();
    //Ag1textField = new TextField();
    Label lb2 = new Label("AGENT 2 ");
    lb2.setFont(Font.font("Baskerville Old Face",25));
    TextField Ag2textField = new TextField();
    Label lb3 = new Label("AGENT 3 ");
    lb3.setFont(Font.font("Baskerville Old Face",25));
    TextField Ag3textField = new TextField();
    Label lb4 = new Label("AGENT 4 ");
    lb4.setFont(Font.font("Baskerville Old Face",25));
    TextField Ag4textField = new TextField();
    Label lb5 = new Label("AGENT 5 ");
    lb5.setFont(Font.font("Baskerville Old Face",25));
      TextField Ag5textField = new TextField();
    //HBOX for evry Agent
    HBox center1= new HBox(15);
    center1.getChildren().addAll(lb1,Ag1textField);
    center1.setAlignment(Pos.CENTER);
    HBox center2= new HBox(15);
    center2.getChildren().addAll(lb2,Ag2textField);
    center2.setAlignment(Pos.CENTER);
    HBox center3= new HBox(15);
    center3.getChildren().addAll(lb3,Ag3textField);
    center3.setAlignment(Pos.CENTER);
    HBox center4= new HBox(15);
    center4.getChildren().addAll(lb4,Ag4textField);
    center4.setAlignment(Pos.CENTER);
    HBox center5= new HBox(15);
    center5.getChildren().addAll(lb5,Ag5textField);
    center5.setAlignment(Pos.CENTER);
    Label warning = new Label("please make sure at least\n3 players are joining.");
    warning.setFont(Font.font("Baskerville Old Face",15));
    warning.setStyle("-fx-text-fill: RED");
    warning.setOpacity(0);
    warning.setEffect(shadow);
    HBox warningbox = new HBox(warning);
    warningbox.setAlignment(Pos.CENTER);
    
VBox centers2= new VBox(28);//add All HBOX to VBoX
centers2.setStyle("-fx-background-color: FORESTGREEN;"+"-fx-background-radius: 10;" );
centers2.getChildren().addAll(center1,center2,center3,center4,center5,warningbox);
centers2.setAlignment(Pos.CENTER);
//bottom *****************************************************************
    ToggleButton DoneButton = new ToggleButton("Done");
    DoneButton.setFont(Font.font("Baskerville Old Face",30));
    DoneButton.setStyle("-fx-background-color: FORESTGREEN;" +"-fx-text-fill: BLACK;");
    VBox bottoms2= new VBox();
    bottoms2.setPadding(new Insets(40, 40, 40, 40));
    bottoms2.getChildren().addAll(DoneButton);
    bottoms2.setAlignment(Pos.CENTER);
/////////////////////////////////////////////////////////////////////////////////////////
BorderPane pane2 = new BorderPane(); //Create a Border Pane
pane2.setTop(tops2);// Place nodes in the pane
pane2.setCenter(centers2);
pane2.setRight(rights2);
pane2.setLeft(lefts2);
pane2.setBottom(bottoms2);
    StackPane sc2s = new StackPane();
    sc2s.getChildren().addAll(background34,pane2);
      
    
/////////////////////////////////////////////////////SCENE 3
StackPane sps3 = new StackPane();
    ////////////////////TEXT/////////////////////////////
    Text texts3= new Text("Please choose\n The case you want to discuss.");
    DropShadow shadow3 = new DropShadow(15,Color.BLACK);
        texts3.setFont(Font.font("Baskerville Old Face", FontWeight.BOLD, 30));
        texts3.setFill(Color.LIME);
        texts3.setTextAlignment(TextAlignment.CENTER);
        texts3.setEffect(shadow3);
     sps3.setAlignment(texts3, Pos.TOP_CENTER);
     sps3.setMargin(texts3, new Insets(80));

   
 
    //////////////COMBO BOX FOR THEMES//////////////////////////
   
    ComboBox<String> themes = new ComboBox<>();
    themes.setScaleX(2);
    themes.setScaleY(2);
    String pic1 = "case A";
    String pic2 = "case B";
    String pic3 = "case C";
    themes.setStyle("-fx-border-color: FORESTGREEN; -fx-border-width:9");
    themes.getItems().addAll(pic1,pic2,pic3);
    sps3.setAlignment(themes, Pos.CENTER);
    sps3.setMargin(themes, new Insets(20));
    
   
 //////////////////////DONE BUTTON////////////////////////////////////  

 Button dones3 = new Button("DONE");
dones3.setFont(Font.font("Baskerville Old Face", FontWeight.BOLD, 20));
dones3.setStyle("-fx-background-color: FORESTGREEN; -fx-text-fill: black;");
sps3.setAlignment(dones3, Pos.BOTTOM_CENTER);
sps3.setMargin(dones3, new Insets(20));

Label warning2 = new Label("please choose a case first.");
warning2.setFont(Font.font("Baskerville Old Face",20));
warning2.setStyle("-fx-text-fill: RED");
warning2.setOpacity(0);
sps3.setAlignment(warning2, Pos.BOTTOM_CENTER);
     
   sps3.getChildren().addAll(background33,texts3,themes,warning2,dones3);

///////////////////////////////////////////////////////////////////// PREP FOR SCENE 4.1
       /////////////////////randomizer for the false agent
       int temp = 0;
       
       
       if(Ag4textField.getText().isEmpty()&& Ag5textField.getText().isEmpty() ){
        temp = 2;
    }
    else if(Ag5textField.getText().isEmpty() ){
        temp = 1;
    }
    else{
        temp=0;
    }
        int randnum =ThreadLocalRandom.current().nextInt(1,5 + 1 - temp);
       //
       //
      
       //image views for each agents screen
        ImageView a1iv = new ImageView();
       a1iv.setFitWidth(510);
       a1iv.setFitHeight(370);
       //
              ImageView a2iv = new ImageView();
       a2iv.setFitWidth(510);
       a2iv.setFitHeight(370);
       //
              ImageView a3iv = new ImageView();
       a3iv.setFitWidth(510);
       a3iv.setFitHeight(370);
       //
              ImageView a4iv = new ImageView();
       a4iv.setFitWidth(510);
       a4iv.setFitHeight(370);
       //
              ImageView a5iv = new ImageView();
       a5iv.setFitWidth(510);
       a5iv.setFitHeight(370);
       ////////////////////////setting up image views depending on the themes
       
       
           //finding out which option the user chooses.
    themes.setOnAction(e->{String chosen = themes.getValue();
       
       if(chosen.equals(pic1) && randnum!=1){
           a1iv.setImage(caseA);
       }
              if(chosen.equals(pic1) && randnum!=2){
           a2iv.setImage(caseA);
       }
                     if(chosen.equals(pic1) && randnum!=3){
           a3iv.setImage(caseA);
       }
                            if(chosen.equals(pic1) && randnum!=4){
           a4iv.setImage(caseA);
       }
                                   if(chosen.equals(pic1) && randnum!=5){
           a5iv.setImage(caseA);
       }
       ////////////
              if(chosen.equals(pic2)&& randnum!=1){
           a1iv.setImage(caseB);
       }
             if(chosen.equals(pic2)&& randnum!=2){
           a2iv.setImage(caseB);
       }
             if(chosen.equals(pic2)&& randnum!=3){
           a3iv.setImage(caseB);
       }
             if(chosen.equals(pic2)&& randnum!=4){
           a4iv.setImage(caseB);
       }
             if(chosen.equals(pic2)&& randnum!=5){
           a5iv.setImage(caseB);
       }
              /////////////////////
              if(chosen.equals(pic3)&& randnum!=1){
           a1iv.setImage(caseC);
       }
             if(chosen.equals(pic3)&& randnum!=2){
           a2iv.setImage(caseC);
       }
             if(chosen.equals(pic3)&& randnum!=3){
           a3iv.setImage(caseC);
       }
             if(chosen.equals(pic3)&& randnum!=4){
           a4iv.setImage(caseC);
       }
             if(chosen.equals(pic3)&& randnum!=5){
           a5iv.setImage(caseC);
       }
                     });
    
    
    
                     //assigning a different pic for the false agent.
        if(randnum ==1){
                  a1iv.setImage(falsepic);       
                     }
        if(randnum ==2){
                  a2iv.setImage(falsepic);       
                     }
        if(randnum ==3){
                  a3iv.setImage(falsepic);       
                     }
        if(randnum ==4){
                  a4iv.setImage(falsepic);       
                     }
        if(randnum ==5){
                  a5iv.setImage(falsepic);       
                     }
       /////////////////////////////////////////////////////////////////////////scene 4.1
       
        StackPane root41 = new StackPane();
        ///////
        DropShadow shadow1= new DropShadow();
        Label lb1s = new Label("Agent 1 ");
        lb1s.setStyle("-fx-text-fill: FORESTGREEN");
        lb1s.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,45));
        lb1s.setEffect (shadow1);
        Label lb1ss = new Label();
        lb1ss.setStyle("-fx-text-fill: FORESTGREEN");
        lb1ss.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,45));
        lb1ss.setEffect (shadow1);
        lb1ss.textProperty().bind(Ag1textField.textProperty());//bind the agent name with this label
        Label lb1sss = new Label(" :");
        lb1sss.setStyle("-fx-text-fill: FORESTGREEN");
        lb1sss.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,45));
        lb1sss.setEffect (shadow1);
        HBox hbox = new HBox(lb1s, lb1ss,lb1sss);//hbox to show it in same line
        hbox.setAlignment(Pos.CENTER);
        Label lb11 = new Label("You have 30 seconds\nto memorise this case...");
        lb11.setStyle("-fx-text-fill: FORESTGREEN");
        lb11.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,45));
        lb11.setEffect (shadow1);
        
        
        
        
     // hidden animation for 30 seconds
     Line hline41 = new Line(60,60,470,60);
     Rectangle hrec41 = new Rectangle();
     hrec41.setX(30);
     hrec41.setY(30);
     hrec41.setFill(Color.RED);
     hrec41.setOpacity(0);
     //
    PathTransition hidden = new PathTransition();
    hidden.setNode(hrec41);
    hidden.setDuration(Duration.seconds(10));
    hidden.setPath(hline41);
    hidden.setCycleCount(1);
            
            
            
            
      VBox s1 = new VBox();
      BorderPane s41 = new BorderPane();
      s1.getChildren().addAll(hbox,lb11,a1iv);
      s1.setAlignment(Pos.CENTER);
      s41.setCenter(s1);
      s41.setTop(hrec41);
        root41.getChildren().addAll(root1bg,s41);
                 
///////////////////////////////////////////////////////////////////// scene 4.2
        StackPane root42 = new StackPane();
        ///////
         Label bl2= new Label("Agent 2 ");
        bl2.setStyle("-fx-text-fill: FORESTGREEN");
        bl2.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,45));
        bl2.setEffect (shadow1);
        Label bl22 = new Label();
        bl22.setStyle("-fx-text-fill: FORESTGREEN");
        bl22.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,45));
        bl22.setEffect (shadow1);
        bl22.textProperty().bind(Ag2textField.textProperty());//bind the agent name with this label
        Label bl222 = new Label(" :");
        bl222.setStyle("-fx-text-fill: FORESTGREEN");
        bl222.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,45));
        bl222.setEffect (shadow1);
        HBox hbox2 = new HBox(bl2, bl22,bl222);//hbox to show it in same line
        hbox2.setAlignment(Pos.CENTER);
        Label lb112 = new Label("You have 30 seconds\nto memorise this case...");
        lb112.setStyle("-fx-text-fill: FORESTGREEN");
        lb112.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,45));
        lb112.setEffect (shadow1);
       
      VBox s2 = new VBox();
      BorderPane s42 = new BorderPane();
      s2.getChildren().addAll(hbox2,lb112,a2iv);
      s2.setAlignment(Pos.CENTER);
      //
           Line hline42 = new Line(60,60,470,60);
     Rectangle hrec42 = new Rectangle();
     hrec42.setX(30);
     hrec42.setY(30);
     hrec42.setOpacity(0);
     //
     //2
            PathTransition hidden2 = new PathTransition();
            hidden2.setNode(hrec42);
            hidden2.setDuration(Duration.seconds(10));
            hidden2.setPath(hline42);
            hidden2.setCycleCount(1);
            
     //
      s42.setCenter(s2);
      s42.setTop(hrec42);
        root42.getChildren().addAll(root2bg,s42);
        
/////////////////////////////////////////////////////////////////////// scene 4.3
        StackPane root43 = new StackPane();
        ///////
         Label bl3 = new Label("Agent 3 ");
        bl3.setStyle("-fx-text-fill: FORESTGREEN");
        bl3.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,45));
        bl3.setEffect (shadow1);
        Label bl33 = new Label();
        bl33.setStyle("-fx-text-fill: FORESTGREEN");
        bl33.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,45));
        bl33.setEffect (shadow1);
        bl33.textProperty().bind(Ag3textField.textProperty());//bind the agent name with this label
        Label bl333 = new Label(" :");
        bl333.setStyle("-fx-text-fill: FORESTGREEN");
        bl333.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,45));
        bl333.setEffect (shadow1);
        HBox hbox3 = new HBox(bl3, bl33,bl333);//hbox to show it in same line
        hbox3.setAlignment(Pos.CENTER);
        Label lb113 = new Label("You have 30 seconds\nto memorise this case...");
        lb113.setStyle("-fx-text-fill: FORESTGREEN");
        lb113.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,45));
        lb113.setEffect (shadow1);
       
      VBox s3 = new VBox();
      BorderPane s43 = new BorderPane();
      s3.getChildren().addAll(hbox3,lb113,a3iv);
      s3.setAlignment(Pos.CENTER);
      //
           Line hline43 = new Line(60,60,470,60);
     Rectangle hrec43 = new Rectangle();
     hrec43.setX(30);
     hrec43.setY(30);
     hrec43.setOpacity(0);
     //
                 //3
            PathTransition hidden3 = new PathTransition();
            hidden3.setNode(hrec43);
            hidden3.setDuration(Duration.seconds(10));
            hidden3.setPath(hline43);
            hidden3.setCycleCount(1);
            
            
     //
      s43.setCenter(s3);
      s43.setTop(hrec43);
        root43.getChildren().addAll(root3bg,s43);    
/////////////////////////////////////////////////////////////////////// scene 4.4
        StackPane root44 = new StackPane();
        ///////
         Label bl4 = new Label("Agent 4 ");
        bl4.setStyle("-fx-text-fill: FORESTGREEN");
        bl4.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,45));
        bl4.setEffect (shadow1);
        Label bl44 = new Label();
        bl44.setStyle("-fx-text-fill: FORESTGREEN");
        bl44.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,45));
        bl44.setEffect (shadow1);
        bl44.textProperty().bind(Ag4textField.textProperty());//bind the agent name with this label
        Label bl444 = new Label(" :");
        bl444.setStyle("-fx-text-fill: FORESTGREEN");
        bl444.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,45));
        bl444.setEffect (shadow1);
        HBox hbox4 = new HBox(bl4, bl44,bl444);//hbox to show it in same line
        hbox4.setAlignment(Pos.CENTER);
        Label lb114 = new Label("You have 30 seconds\nto memorise this case...");
        lb114.setStyle("-fx-text-fill: FORESTGREEN");
        lb114.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,45));
        lb114.setEffect (shadow1);
       
      VBox s4 = new VBox();
      BorderPane s44 = new BorderPane();
      s4.getChildren().addAll(hbox4,lb114,a4iv);
      s4.setAlignment(Pos.CENTER);
           Line hline44 = new Line(60,60,470,60);
     Rectangle hrec44 = new Rectangle();
     hrec44.setX(30);
     hrec44.setY(30);
     hrec44.setOpacity(0);
     //
                 //4
            PathTransition hidden4 = new PathTransition();
            hidden4.setNode(hrec44);
            hidden4.setDuration(Duration.seconds(10));
            hidden4.setPath(hline44);
            hidden4.setCycleCount(1);
           
            //
      s44.setCenter(s4);
      s44.setTop(hrec44);
        root44.getChildren().addAll(root4bg,s44); 
/////////////////////////////////////////////////////////////////////// scene 4.5
        StackPane root45 = new StackPane();
        ///////
         Label bl5 = new Label("Agent 5 ");
        bl5.setStyle("-fx-text-fill: FORESTGREEN");
        bl5.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,45));
        bl5.setEffect (shadow1);
        Label bl55 = new Label();
        bl55.setStyle("-fx-text-fill: FORESTGREEN");
        bl55.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,45));
        bl55.setEffect (shadow1);
        bl55.textProperty().bind(Ag5textField.textProperty());//bind the agent name with this label
        Label bl555 = new Label(" :");
        bl555.setStyle("-fx-text-fill: FORESTGREEN");
        bl555.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,45));
        bl555.setEffect (shadow1);
        HBox hbox5 = new HBox(bl5,bl55,bl555);//hbox to show it in same line
        hbox5.setAlignment(Pos.CENTER);
        Label lb115 = new Label("You have 30 seconds\nto memorise this case...");
        lb115.setStyle("-fx-text-fill: FORESTGREEN");
        lb115.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,45));
        lb115.setEffect (shadow1);
       
      VBox s5 = new VBox();
      BorderPane s45 = new BorderPane();
      s5.getChildren().addAll(hbox5,lb115,a5iv);
      s5.setAlignment(Pos.CENTER);
      //
           Line hline45 = new Line(60,60,470,60);
     Rectangle hrec45 = new Rectangle();
     hrec45.setX(30);
     hrec45.setY(30);
     hrec45.setOpacity(0);
     //
                //5
                        PathTransition hidden5 = new PathTransition();
            hidden5.setNode(hrec45);
            hidden5.setDuration(Duration.seconds(10));
            hidden5.setPath(hline45);
            hidden5.setCycleCount(1);
           
            
            //
      s45.setCenter(s5);
      s45.setTop(hrec45);
        root45.getChildren().addAll(root5bg,s45);   
        //changing the labels on the scene of the false agent 
        if(randnum ==1){
                  s1.setStyle("-fx-background-color: #000000;");
            lb11.setText("");
                     }
        if(randnum ==2){
                  s2.setStyle("-fx-background-color: #000000;");
              lb112.setText("");
                     }
        if(randnum ==3){
                  s3.setStyle("-fx-background-color: #000000;");
             lb113.setText("");
                     }
        if(randnum ==4){
                  s4.setStyle("-fx-background-color: #000000;");
             lb114.setText("");
                     }
        if(randnum ==5){
                  s5.setStyle("-fx-background-color: #000000;");
             lb115.setText("");
                     }
        /////////////////////////////////////////////////////////////transition scenes between 4.1-4.5
BorderPane Pane1= new BorderPane();
        BorderPane Pane2= new BorderPane();
        BorderPane Pane3= new BorderPane();
        BorderPane Pane4= new BorderPane();
        BorderPane Pane5= new BorderPane();
///////////Labels//////////////

        Label Agent1 = new Label("Pass the device to Agent 1. \n If you are agent 1, press the button.");
        Label Agent2 = new Label("Pass the device to Agent 2. \n If you are agent 2, press the button.");
        Label Agent3 = new Label("Pass the device to Agent 3. \n If you are agent 3, press the button.");
        Label Agent4 = new Label("Pass the device to Agent 4. \n If you are agent 4, press the button.");
        Label Agent5 = new Label("Pass the device to Agent 5. \n If you are agent 5, press the button.");
        Label allAgents = new Label("now that everyone has seen the case\n make sure everyone can see the device.");
        ///////////////////////////////////////////////////////////////////////////////
        Agent1.setAlignment(Pos.CENTER);
        Agent1.setTextAlignment(TextAlignment.CENTER);
        Agent1.setStyle("-fx-text-fill: LIME;");
        Agent1.setFont(Font.font("Baskerville Old Face", FontWeight.BOLD, FontPosture.REGULAR, 25));
        
        Agent2.setAlignment(Pos.CENTER);
        Agent2.setTextAlignment(TextAlignment.CENTER);
        Agent2.setStyle("-fx-text-fill: LIME;");
        Agent2.setFont(Font.font("Baskerville Old Face", FontWeight.BOLD, FontPosture.REGULAR, 25));

        Agent3.setAlignment(Pos.CENTER);
        Agent3.setTextAlignment(TextAlignment.CENTER);
        Agent3.setStyle("-fx-text-fill: LIME;");
        Agent3.setFont(Font.font("Baskerville Old Face", FontWeight.BOLD, FontPosture.REGULAR, 25));

        Agent4.setAlignment(Pos.CENTER);
        Agent4.setTextAlignment(TextAlignment.CENTER);
        Agent4.setStyle("-fx-text-fill: LIME;");
        Agent4.setFont(Font.font("Baskerville Old Face", FontWeight.BOLD, FontPosture.REGULAR, 25));

        Agent5.setAlignment(Pos.CENTER);
        Agent5.setTextAlignment(TextAlignment.CENTER);
        Agent5.setStyle("-fx-text-fill: LIME;");
        Agent5.setFont(Font.font("Baskerville Old Face", FontWeight.BOLD, FontPosture.REGULAR, 25));
        
        allAgents.setAlignment(Pos.CENTER);
        allAgents.setTextAlignment(TextAlignment.CENTER);
        allAgents.setStyle("-fx-text-fill: LIME;");
        allAgents.setFont(Font.font("Baskerville Old Face", FontWeight.BOLD, FontPosture.REGULAR, 25));

        //////////////////////DONE BUTTON////////////////////////////////////

        Button done1 = new Button("DONE");
        done1.setFont(Font.font("Baskerville Old Face", FontWeight.BOLD, 20));
        done1.setStyle("-fx-background-color: forestgreen; -fx-text-fill: black;");

        StackPane donePane1 = new StackPane(done1);
        donePane1.setPadding(new Insets(40));
        donePane1.setAlignment(Pos.CENTER);

        Button done2 = new Button("DONE");
        done2.setFont(Font.font("Baskerville Old Face", FontWeight.BOLD, 20));
        done2.setStyle("-fx-background-color: forestgreen; -fx-text-fill: black;");

        StackPane donePane2 = new StackPane(done2);
        donePane2.setPadding(new Insets(40));
        donePane2.setAlignment(Pos.CENTER);

        Button done3 = new Button("DONE");
        done3.setFont(Font.font("Baskerville Old Face", FontWeight.BOLD, 20));
        done3.setStyle("-fx-background-color: forestgreen; -fx-text-fill: black;");

        StackPane donePane3 = new StackPane(done3);
        donePane3.setPadding(new Insets(40));
        donePane3.setAlignment(Pos.CENTER);

        Button done4 = new Button("DONE");
        done4.setFont(Font.font("Baskerville Old Face", FontWeight.BOLD, 20));
        done4.setStyle("-fx-background-color: forestgreen; -fx-text-fill: black;");

        StackPane donePane4 = new StackPane(done4);
        donePane4.setPadding(new Insets(40));
        donePane4.setAlignment(Pos.CENTER);

        Button done5 = new Button("DONE");
        done5.setFont(Font.font("Baskerville Old Face", FontWeight.BOLD, 20));
        done5.setStyle("-fx-background-color: forestgreen; -fx-text-fill: black;");

        StackPane donePane5 = new StackPane(done5);
        donePane5.setPadding(new Insets(40));
        donePane5.setAlignment(Pos.CENTER);

        Pane1.setCenter(Agent1);
        Pane1.setBottom(donePane1);

        Pane2.setCenter(Agent2);
        Pane2.setBottom(donePane2);

        Pane3.setCenter(Agent3);
        Pane3.setBottom(donePane3);

        Pane4.setCenter(Agent4);
        Pane4.setBottom(donePane4);

        Pane5.setCenter(Agent5);
        Pane5.setBottom(donePane5);   
        //stackpanes for the packgrounds
        StackPane agent1bg = new StackPane();
        StackPane agent2bg = new StackPane();
        StackPane agent3bg = new StackPane();
        StackPane agent4bg = new StackPane();
        StackPane agent5bg = new StackPane();
        StackPane allagbg = new StackPane();
        //
        agent1bg.getChildren().addAll(root1,Pane1);
        agent2bg.getChildren().addAll(root2,Pane2);
        agent3bg.getChildren().addAll(root3,Pane3);
        agent4bg.getChildren().addAll(root4,Pane4);
        agent5bg.getChildren().addAll(root5,Pane5);
        
        //final scene to show all agents
        BorderPane all = new BorderPane();
        Button okayb = new Button("OK");
        okayb.setFont(Font.font("Baskerville Old Face", FontWeight.BOLD, 20));
        okayb.setStyle("-fx-background-color: forestgreen; -fx-text-fill: black;");
        StackPane sall = new StackPane();
        sall.setPadding(new Insets(45));
        sall.getChildren().add(okayb);
        sall.setAlignment(Pos.CENTER);
        all.setCenter(allAgents);
        all.setBottom(sall);
        allagbg.getChildren().addAll(background31,all);
/////////////////////////////////////////////////////////////////////SCENE 5
            BorderPane s5b = new BorderPane();
            //file animation and images
            Line s5line = new Line(60,60,470,60);
            ImageView fileiv= new ImageView(file);
            ImageView webiv= new ImageView(web);
            ImageView buildingiv= new ImageView(building);
            
            fileiv.setX(30);
            fileiv.setY(30);
            fileiv.setFitHeight(65);
            fileiv.setFitWidth(65);
            //
            webiv.setX(30);
            webiv.setY(30);
            webiv.setFitHeight(65);
            webiv.setFitWidth(65);
            //
            buildingiv.setX(440);
            buildingiv.setY(30);
            buildingiv.setFitHeight(65);
            buildingiv.setFitWidth(65);
            //
            
            VBox lefts5 = new VBox();
            lefts5.getChildren().add(webiv);
                        VBox rights5 = new VBox();
            rights5.getChildren().add(buildingiv);
            //
            
            s5b.setTop(fileiv);
            s5b.setLeft(lefts5);
            s5b.setRight(rights5);
            //
            //TIMER FUNC BUT DIFFERENT
            PathTransition transitions5 = new PathTransition();
            transitions5.setNode(fileiv);
            transitions5.setDuration(Duration.seconds(30));
            transitions5.setPath(s5line);
            transitions5.setCycleCount(1);
           
            
            
    //////////////////////////////
    s5.setPadding(new Insets(5));
    Label s5heading = new Label("all agents:\n you've all seen the case,\nnow you have 3 minutes to discuss\nit with each other and find out\nwho is the false agent before the file\ncontaining the truth\nreaches our building. ");
            
        DropShadow shadows5 = new DropShadow(15,Color.WHITE);
        s5heading.setEffect(shadows5);
        s5heading.setAlignment(Pos.CENTER);
        s5heading.setTextAlignment(TextAlignment.CENTER);
        s5heading.setStyle("-fx-text-fill: LIME;");
        s5heading.setFont(Font.font("Baskerville Old Face",FontWeight.NORMAL,FontPosture.ITALIC,20));
        VBox t = new VBox(5);
        t.setAlignment(Pos.CENTER);
        //
        Label exq = new Label("---------------------------------------------------------------\nexample questions to answer together:\n\n\n-When did the case occur?\n\n-Who are the suspects?\n\n-What seemed off about the case?.");
        exq.setEffect(shadows5);
        exq.setAlignment(Pos.CENTER);
        exq.setTextAlignment(TextAlignment.CENTER);
        exq.setStyle("-fx-text-fill: FORESTGREEN;");
        exq.setFont(Font.font("Baskerville Old Face",FontWeight.NORMAL,FontPosture.ITALIC,20));
        t.getChildren().addAll(s5heading,exq);
        s5b.setCenter(t);
        StackPane s5s = new StackPane();
        Rectangle recs5 = new Rectangle(500,600);
        s5s.getChildren().addAll(recs5,s5b);
/////////////////////////////////////////////////////////////////////SCENE 6
  //Top *************************************************************
    DropShadow shadows6= new DropShadow();//add shadow to text1
    Text text2 = new Text("Please vote for who you\nthink is the false agent: ");
    text2.setFont(Font.font("Baskerville Old Face",30));
    text2.setFill(Color.FORESTGREEN);
    text2.setEffect(shadows6);

    HBox tops6= new HBox();
    tops6.setPadding(new Insets(20, 20, 20, 20));
    tops6.getChildren().addAll(text2);//add text2
    tops6.setAlignment(Pos.CENTER);

    //left*****************************************************************
    VBox lefts6= new VBox();
    lefts6.setPadding(new Insets(50));
    //right*****************************************************************
    VBox rights6= new VBox();
    rights6.setPadding(new Insets(50));
    
    //center*****************************************************************
    String a1voting = "AGENT 1";
    String a2voting = "AGENT 2";
    String a3voting = "AGENT 3";
    String a4voting = "AGENT 4";
    String a5voting = "AGENT 5";
    Label lb1s6 = new Label("AGENT 1 ");
    lb1s6.setFont(Font.font("Impact",20));
    ComboBox<String> CB1 = new ComboBox<>();
    CB1.getItems().addAll(a1voting,a2voting,a3voting); 
    CB1.setPrefSize(100, 30);
    Label lb2s6 = new Label("AGENT 2 ");
    lb2s6.setFont(Font.font("Impact",20));
    ComboBox<String> CB2 = new ComboBox<>();
    CB2.getItems().addAll(a1voting,a2voting,a3voting); 
    CB2.setPrefSize(100, 30);
    Label lb3s6 = new Label("AGENT 3 ");
    lb3s6.setFont(Font.font("Impact",20));
    ComboBox<String> CB3 = new ComboBox<>();
    CB3.getItems().addAll(a1voting,a2voting,a3voting); 
    CB3.setPrefSize(100, 30);
    Label lb4s6 = new Label("AGENT 4 ");
    lb4s6.setFont(Font.font("Impact",20));
    ComboBox<String> CB4 = new ComboBox<>();
    CB4.getItems().addAll(a1voting,a2voting,a3voting); 
    CB4.setPrefSize(100, 30);
    Label lb5s6 = new Label("AGENT 5 ");
    lb5s6.setFont(Font.font("Impact",20));
    ComboBox<String> CB5 = new ComboBox<>();
    CB5.getItems().addAll(a1voting,a2voting,a3voting); 
    CB5.setPrefSize(100, 30);
    
    //HBOX for evry Agent
    HBox center1s6= new HBox(20);
    center1s6.getChildren().addAll(lb1s6,CB1);
    center1s6.setAlignment(Pos.CENTER);
    HBox center2s6= new HBox(20);
    center2s6.getChildren().addAll(lb2s6,CB2);
    center2s6.setAlignment(Pos.CENTER);
    HBox center3s6= new HBox(20);
    center3s6.getChildren().addAll(lb3s6,CB3);
    center3s6.setAlignment(Pos.CENTER);
    HBox center4s6= new HBox(20);
    center4s6.getChildren().addAll(lb4s6,CB4);
    center4s6.setAlignment(Pos.CENTER);
    HBox center5s6= new HBox(20);
    center5s6.getChildren().addAll(lb5s6,CB5);
    center5s6.setAlignment(Pos.CENTER);
    
VBox centers6= new VBox(40);//add All HBOX to VBoX
centers6.setStyle("-fx-background-color: FORESTGREEN;"+"-fx-background-radius: 10;" );
centers6.getChildren().addAll(center1s6,center2s6,center3s6);
centers6.setAlignment(Pos.CENTER);

//bottom *************************************************************
    Label warning4 = new Label("please choose your votes first!");
            warning4.setTextAlignment(TextAlignment.CENTER);
        warning4.setStyle("-fx-text-fill: FORESTGREEN;");
        warning4.setFont(Font.font("Baskerville Old Face",FontWeight.NORMAL,FontPosture.ITALIC,20));
        warning4.setOpacity(0);
    ToggleButton DoneButtons6 = new ToggleButton("Done");
    DoneButtons6.setFont(Font.font("Baskerville Old Face",30));
    DoneButtons6.setStyle("-fx-background-color: FORESTGREEN;" +"-fx-text-fill: BLACK;");
    VBox bottoms6= new VBox();
    bottoms6.setPadding(new Insets(40, 40, 40, 40));
    bottoms6.getChildren().addAll(warning4,DoneButtons6);
    bottoms6.setAlignment(Pos.CENTER);
/////////////////////////////////////////////////////////////////////////////////////////
BorderPane panes6 = new BorderPane(); //Create a Border Pane
panes6.setTop(tops6);// Place nodes in the pane
panes6.setCenter(centers6);
panes6.setRight(rights6);
panes6.setLeft(lefts6);
panes6.setBottom(bottoms6);
StackPane sp3s6 = new StackPane();
sp3s6.getChildren().addAll(root7,panes6);

/////////////////////////////////////////////////////////////////////SCENE 7
StackPane sp7 = new StackPane();   
       Label Label37 = new Label("\nThe file has arrived... \nThe false agent was:\n");
       Label37.setStyle("-fx-text-fill: LIME;");
       Label37.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,25));
       ScaleTransition s = new ScaleTransition(Duration.seconds(5),Label37);
       s.setToX(1.8);
       s.setToY(1.8);
       
       FadeTransition f = new FadeTransition(Duration.seconds(3),Label37);
       f.setFromValue(0);
       f.setToValue(1);
       Label Label7 = new Label("");
       Label7.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.ITALIC,50));
       Label7.setStyle("-fx-background-color: FORESTGREEN; -fx-text-fill: LIME; -fx-background-radius: 10;");

    
       Button Viewnvotes = new Button("view\nresults");
       Viewnvotes.setFont(Font.font("Baskerville Old Face", 30));
       Viewnvotes.setStyle("-fx-background-color: FORESTGREEN; -fx-text-fill: LIME; -fx-background-radius: 10; ");
       Viewnvotes.setTextAlignment(TextAlignment.CENTER);
       
       VBox vbox7 = new VBox();
       vbox7.setSpacing(50);
       vbox7.setAlignment(Pos.CENTER);
       vbox7.getChildren().addAll(Label37, Label7, Viewnvotes);

       // Add the vertical box to the stack pane
       sp7.getChildren().addAll(background32,vbox7);
/////////////////////////////////////////////////////////////////////SCENE 8
        BorderPane s8 = new BorderPane();
        Label a1tag = new Label("AGENT 1 GUESSED: ");
        Label a2tag = new Label("AGENT 2 GUESSED: ");
        Label a3tag = new Label("AGENT 3 GUESSED: ");
        Label a4tag = new Label("AGENT 4 GUESSED: ");
        Label a5tag = new Label("AGENT 5 GUESSED: ");
        //
        a1tag.setAlignment(Pos.CENTER);
        a1tag.setStyle("-fx-text-fill: LIME;");
        a1tag.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,25));
        a2tag.setAlignment(Pos.CENTER);
        a2tag.setStyle("-fx-text-fill: LIME;");
        a2tag.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,25));
        a3tag.setAlignment(Pos.CENTER);
        a3tag.setStyle("-fx-text-fill: LIME;");
        a3tag.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,25));
        a4tag.setAlignment(Pos.CENTER);
        a4tag.setStyle("-fx-text-fill: LIME;");
        a4tag.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,25));
        a5tag.setAlignment(Pos.CENTER);
        a5tag.setStyle("-fx-text-fill: LIME;");
        a5tag.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,25));
        //
        Label correct1 = new Label("CORRECTLY!");
        Label wrong1 = new Label("WRONG.");
        correct1.setAlignment(Pos.CENTER);
        correct1.setStyle("-fx-text-fill: LIME;");
        correct1.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,20));
        wrong1.setAlignment(Pos.CENTER);
        wrong1.setStyle("-fx-text-fill: LIME;");
        wrong1.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,20));
        //
        Label correct2 = new Label("CORRECTLY!");
        Label wrong2 = new Label("WRONG.");
        correct2.setAlignment(Pos.CENTER);
        correct2.setStyle("-fx-text-fill: LIME;");
        correct2.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,20));
        wrong2.setAlignment(Pos.CENTER);
        wrong2.setStyle("-fx-text-fill: LIME;");
        wrong2.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,20));
        //
        Label correct3 = new Label("CORRECTLY!");
        Label wrong3 = new Label("WRONG.");
        correct3.setAlignment(Pos.CENTER);
        correct3.setStyle("-fx-text-fill: LIME;");
        correct3.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,20));
        wrong3.setAlignment(Pos.CENTER);
        wrong3.setStyle("-fx-text-fill: LIME;");
        wrong3.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,20));
        //
        Label correct4 = new Label("CORRECTLY!");
        Label wrong4 = new Label("WRONG.");
        correct4.setAlignment(Pos.CENTER);
        correct4.setStyle("-fx-text-fill: LIME;");
        correct4.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,20));
        wrong4.setAlignment(Pos.CENTER);
        wrong4.setStyle("-fx-text-fill: LIME;");
        wrong4.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,20));
        //
        Label correct5 = new Label("CORRECTLY!");
        Label wrong5 = new Label("WRONG.");
        correct5.setAlignment(Pos.CENTER);
        correct5.setStyle("-fx-text-fill: LIME;");
        correct5.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,20));
        wrong5.setAlignment(Pos.CENTER);
        wrong5.setStyle("-fx-text-fill: LIME;");
        wrong5.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,20));
        //
        GridPane s8g = new GridPane();
        s8g.setAlignment(Pos.CENTER);
        s8g.add(a1tag,0,0);
        s8g.add(a2tag,0,1);
        s8g.add(a3tag,0,2);
        

        VBox s8center = new VBox(70);
        s8center.getChildren().addAll(s8g);
        s8center.setAlignment(Pos.CENTER);
        
        s8.
setCenter(s8center);
        HBox s8top = new HBox(20);
        Label s8title = new Label("The results! :");
        s8top.setAlignment(Pos.CENTER);
        s8title.setAlignment(Pos.CENTER);
        s8title.setStyle("-fx-text-fill: FORESTGREEN");
        s8title.setEffect(shadow);
        s8title.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,45));
        s8top.getChildren().add(s8title);
        s8.setTop(s8top);
        //left and right
        VBox s8l = new VBox(120);
        Label extra1 = new Label("  ");
        Label extra2 = new Label("  ");
        VBox s8r =new VBox(120);
        s8l.getChildren().add(extra1);
        s8r.getChildren().add(extra2);
        s8.setRight(s8r);
        s8.setLeft(s8l);
        s8.setPadding(new Insets(50));
 
        //button for scene 9
        Button goto9 = new Button("OK");
        goto9.setStyle("-fx-background-color: FORESTGREEN;");
        goto9.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,45));
        HBox s8b = new HBox(20);
        s8b.setAlignment(Pos.CENTER);
        s8b.getChildren().add(goto9);
        s8.setBottom(s8b);
        StackPane s8stack = new StackPane();
        //s8.setStyle("-fx-background-color:FORESTGREEN");
        s8stack.getChildren().addAll(root9,s8);
///////////////////////////////////////////////////////////////////////SCENE 9
    BorderPane s9 = new BorderPane();
    s9.setPadding(new Insets(50));
    Label s9title = new Label("thank you for playing!");
        s9title.setAlignment(Pos.CENTER);
        s9title.setTextAlignment(TextAlignment.CENTER);
        s9title.setStyle("-fx-text-fill: LIME;-fx-background-color: FORESTGREEN;");
        s9title.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,30));
        HBox s9top = new HBox(50);
        s9top.setAlignment(Pos.CENTER);
        s9top.getChildren().add(s9title);
    //center
    Label s9cen = new Label("the fun is not over though!\nwhat would you like to do now?");
    s9cen.setAlignment(Pos.CENTER);
        s9cen.setTextAlignment(TextAlignment.CENTER);
        s9cen.setStyle("-fx-text-fill: LIME;-fx-background-color: FORESTGREEN;");
        s9cen.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,30));
    HBox s9center = new HBox(50);
    s9center.setAlignment(Pos.CENTER);
        s9center.getChildren().add(s9cen);
        //footer
        //gridpane
        GridPane s9footer = new GridPane();
        Button s1b = new Button("start\nagain");
        s1b.setTextAlignment(TextAlignment.CENTER);
        s1b.setStyle("-fx-text-fill: LIME;");
        s1b.setStyle("-fx-background-color: FORESTGREEN;");
        s1b.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,25));
        Button mgbutton = new Button(" play\n minigame");
        mgbutton.setTextAlignment(TextAlignment.CENTER);
        mgbutton.setStyle("-fx-text-fill: LIME;");
        mgbutton.setStyle("-fx-background-color: FORESTGREEN;");
        mgbutton.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,25));
        Button ratebutton = new Button("rate\nus");
        ratebutton.setTextAlignment(TextAlignment.CENTER);
        ratebutton.setStyle("-fx-text-fill: LIME;");
        ratebutton.setStyle("-fx-background-color: FORESTGREEN;");
        ratebutton.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,25));
        Button s9exit = new Button("exit\ngame");
        s9exit.setTextAlignment(TextAlignment.CENTER);
        s9exit.setStyle("-fx-text-fill: LIME;");
        s9exit.setStyle("-fx-background-color: FORESTGREEN;");
        s9exit.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,25));
        s9footer.setAlignment(Pos.CENTER);
        s9footer.add(s1b,0,0);
        s9footer.add(mgbutton,1,0);
        s9footer.add(ratebutton,0,1);
        s9footer.add(s9exit,1,1);
        s9footer.setHgap(50);
        s9footer.setVgap(50);
        //linking
        s9.setTop(s9top);
        s9.setCenter(s9center);
        s9.setBottom(s9footer);
        StackPane sc9 = new StackPane();
        sc9.getChildren().addAll(root6bg,s9);
/////////////////////////////////////////////////////////////////////RATING SCENE
//Box1 *************************************************************
    Text textTitle = new Text("Tell us what you think! ");
    textTitle.setFont(Font.font("Baskerville Old Face",40));
    textTitle.setFill(Color.FORESTGREEN);
    textTitle.setEffect(shadow2);
    HBox Box1= new HBox();
    Box1.getChildren().addAll(textTitle);
    Box1.setAlignment(Pos.CENTER);

    //Box2*****************************************************************
    Label lbcomments = new Label("comments: ");
    lbcomments.setFont(Font.font("Baskerville Old Face",20));
    lbcomments.setStyle("-fx-text-fill: FORESTGREEN;");
    TextArea taComments = new TextArea();
    taComments.setPrefSize(200, 80);
    taComments.setFont(new Font("Serif", 10));
    taComments.setEditable(true);
    HBox Box2= new HBox(10);
    Box2.getChildren().addAll(lbcomments,taComments);
    
    //Box3*****************************************************************
    Label lbrating = new Label("Rating: ");
    lbrating.setFont(Font.font("Baskerville Old Face",20));
    lbrating.setStyle("-fx-text-fill: FORESTGREEN;");  
    Slider RatingSlider = new Slider();
    RatingSlider.setMin(0);
    RatingSlider.setMax(10);
    RatingSlider.setValue(0);//the current value
    RatingSlider.setShowTickLabels(true);//showing the numbers as labels or not
    RatingSlider.setShowTickMarks(true);//showing the ticks mark or not
    RatingSlider.setMajorTickUnit(5);//where to put major ticks
    RatingSlider.setMinorTickCount(4);//the number of minor ticks in the slider
    RatingSlider.setBlockIncrement(1);//how many positions the pointer is moved
    RatingSlider.setStyle("-fx-pref-width:300;");
    HBox Box3= new HBox(10);
    Box3.getChildren().addAll(lbrating,RatingSlider);
    
    //Box4*****************************************************************
    Text textEX = new Text("Your experience: ");
    textEX.setFont(Font.font("Baskerville Old Face",30));
    textEX.setFill(Color.FORESTGREEN);
    textEX.setEffect(shadow);
    HBox Box4= new HBox();
    Box4.getChildren().addAll(textEX);
    Box4.setAlignment(Pos.CENTER);
    
    //Box5*****************************************************************
    CheckBox chk1 = new CheckBox("Fun game");
    chk1.setStyle("-fx-text-fill: white; -fx-font-size: 15");
    CheckBox chk2 = new CheckBox("Hard to understand");
    chk2.setStyle("-fx-text-fill: white;-fx-font-size: 15");
    HBox Box5= new HBox(50);
    Box5.getChildren().addAll(chk1,chk2);
    Box5.setAlignment(Pos.CENTER);
    
    //Box6*****************************************************************
    CheckBox chk3 = new CheckBox("Boring game");
    chk3.setStyle("-fx-text-fill: white; -fx-font-size: 15;");
    CheckBox chk4 = new CheckBox("Not enough time");
    chk4.setStyle("-fx-text-fill: white; -fx-font-size: 15;");
    HBox Box6= new HBox(50);
    Box6.getChildren().addAll(chk3,chk4);
    Box6.setAlignment(Pos.CENTER);
    
    //Box7*****************************************************************
    CheckBox chk5 = new CheckBox("Needs work");
    chk5.setStyle("-fx-text-fill: white; -fx-font-size: 15");
    CheckBox chk6 = new CheckBox("Tough cases");
    chk6.setStyle("-fx-text-fill: white; -fx-font-size: 15");
    HBox Box7= new HBox(50);
    Box7.getChildren().addAll(chk5,chk6);
    Box7.setAlignment(Pos.CENTER);
    
    //Box8*****************************************************************
    Button SubButton = new Button("Submit");
    SubButton.setFont(Font.font("Baskerville Old Face",30));
    SubButton.setStyle("-fx-background-color: FORESTGREEN;" +"-fx-text-fill: BLACK;");
    HBox Box8= new HBox();
    Box8.getChildren().addAll(SubButton);
    Box8.setAlignment(Pos.CENTER);   
//////////////////
 FlowPane fpane = new FlowPane(Orientation.VERTICAL); 
 fpane.setAlignment(Pos.CENTER);
 fpane.setHgap(20);
 fpane.setVgap(30);
 fpane.getChildren().addAll(Box1,Box2,Box3,Box4,Box5,Box6,Box7,Box8);
    StackPane ST = new StackPane();
    ST.getChildren().addAll(root6,fpane);
////////////////////////////////////////////////////////////////////MINI GAME 
        ImageView vicon1 = new ImageView(virusicon);
        ImageView vicon2 = new ImageView(virusicon);
        ImageView vicon3 = new ImageView(virusicon);
        ImageView picon = new ImageView(pcicon);
        //
        BorderPane mgbp = new BorderPane();
        mgbp.setPadding(new Insets(15));
        //top
        Label mginst = new Label("click on the viruses to clean the PC\n from hacking threats!.\n when the progress bar is full\npress the ENTER key.");
        mginst.setStyle("-fx-text-fill: LIME;");
        mginst.setStyle("-fx-background-color: FORESTGREEN;");
        mginst.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,26));
        mginst.setTextAlignment(TextAlignment.CENTER);
        HBox mgtop = new HBox();
        mgtop.setAlignment(Pos.CENTER);
        mgtop.getChildren().add(mginst);
        
        //bottom
        ProgressBar mgbar = new ProgressBar();
        mgbar.setPrefSize(480, 80);
        mgbar.setProgress(0.1);
        mgbar.setStyle("-fx-accent: LIME");
        //
        Label mgwarning = new Label("not yet,theres still a few viruses left.");
        mgwarning.setStyle("-fx-text-fill: RED;");        
        mgwarning.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,20));
        mgwarning.setTextAlignment(TextAlignment.CENTER);
        mgwarning.setOpacity(0);
        VBox mgbottom = new VBox(10);
        mgbottom.setAlignment(Pos.CENTER);
        mgbottom.getChildren().addAll(mgwarning,mgbar);
        
        //settings
        mgbp.setTop(mgtop);
        mgbp.setBottom(mgbottom);
        //center
        picon.setFitHeight(340);
        picon.setFitWidth(380);
        //HBox mgcenter = new HBox();
        StackPane centerstack = new StackPane();
        vicon1.setFitHeight(80);
        vicon1.setFitWidth(80);
        vicon1.setX(100);
        vicon1.setY(150);
        //
        vicon2.setFitHeight(80);
        vicon2.setFitWidth(80);
        vicon2.setX(100);
        vicon2.setY(150);
        //
        vicon3.setFitHeight(80);
        vicon3.setFitWidth(80);
        vicon3.setX(100);
        vicon3.setY(140);
        //
        BorderPane test = new BorderPane();
        test.setPadding(new Insets(80,100,80,100));
        test.setTop(vicon2);
        test.setRight(vicon3);
        test.getChildren().add(vicon1);
        
        centerstack.getChildren().addAll(picon,test);
        
        mgbp.setCenter(centerstack);

        //black bg
        Rectangle mgrec = new Rectangle(500,600);
        //stackpane
        StackPane mgstack = new StackPane();
        mgstack.setAlignment(Pos.CENTER);
        mgstack.getChildren().addAll(mgrec,mgbp);
////////////////////////////////////////////////////////////////////////////////mgwon scene
        BorderPane wonbp = new BorderPane();
        wonbp.setPadding(new Insets(20));
        Label wontext = new Label("congrats! you won\nthe mini game and helped our agents\navoid a threat!.");
        wontext.setStyle("-fx-text-fill: LIME;");
        wontext.setStyle("-fx-background-color: FORESTGREEN;");
        wontext.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,26));
        wontext.setTextAlignment(TextAlignment.CENTER);
        HBox woncenter = new HBox();
        woncenter.setAlignment(Pos.CENTER);
        woncenter.getChildren().add(wontext);
        Button wonback = new Button("rate\nus!");
        wonback.setStyle("-fx-text-fill: LIME;");
        wonback.setStyle("-fx-background-color: FORESTGREEN;");
        wonback.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,26));
        wonback.setTextAlignment(TextAlignment.CENTER);
        Button wonexit = new Button("exit\ngame.");
        wonexit.setStyle("-fx-text-fill: LIME;");
        wonexit.setStyle("-fx-background-color: FORESTGREEN;");
        wonexit.setFont(Font.font("Baskerville Old Face",FontWeight.BOLD,FontPosture.REGULAR,26));
        wonexit.setTextAlignment(TextAlignment.CENTER);
        HBox wonbottom = new HBox(20);
        wonbottom.setAlignment(Pos.CENTER);
        wonbottom.getChildren().addAll(wonback,wonexit);
        wonbp.setCenter(woncenter);
        wonbp.setBottom(wonbottom);    
        StackPane wonn = new StackPane();
        wonn.getChildren().addAll(root8,wonbp);
/////////////////////////////////////////////////////////////////////scene 10

        //Box1 *************************************************************
    Text textTitle2 = new Text("Thank You For rating us!\n What would you \nlike to do now? ");
    textTitle2.setFont(Font.font("Baskerville Old Face",40));
    textTitle2.setFill(Color.FORESTGREEN);
    textTitle2.setEffect(shadow);
    textTitle2.setTextAlignment(TextAlignment.CENTER);
    HBox Box110= new HBox();
    Box110.getChildren().addAll(textTitle2);
    Box110.setAlignment(Pos.CENTER);
    //Box2*****************************************************************
    ToggleButton ExitButton = new ToggleButton(" Exit\nGame");
    ExitButton.setFont(Font.font("Baskerville Old Face",30));
    ExitButton.setStyle("-fx-background-color: FORESTGREEN");
    
    ToggleButton PMButton = new ToggleButton("    Play\nMinigame");
    PMButton.setFont(Font.font("Baskerville Old Face",30));
    PMButton.setStyle("-fx-background-color: FORESTGREEN");
    HBox Box210= new HBox(25);
    Box210.setPadding(new Insets(40,40,100,40));
    Box210.getChildren().addAll(ExitButton,PMButton);
    Box210.setAlignment(Pos.TOP_CENTER); 
/////////////////////////////////////////////////////////////////////////////////////////
   BorderPane pane = new BorderPane();
  pane.setCenter(Box110);
  pane.setBottom(Box210);       
    StackPane ST10 = new StackPane();
    ST10.getChildren().addAll(background35,pane);
/////////////////////////////////////////////////////////////////////
        //creation of the scenes
        Scene scene1 = new Scene(sp,500,600);
        Scene HTP = new Scene(htps,500,600);
        Scene signUp = new Scene(spSU,500,600);
        Scene signedscene = new Scene(signed,500,600);
        Scene scene2 = new Scene(sc2s,500,600);
        Scene scene3 = new Scene(sps3, 500, 600);
        Scene scene41 = new Scene(root41,500,600); 
        Scene scene42 = new Scene(root42,500,600); 
        Scene scene43 = new Scene(root43,500,600); 
        Scene scene44 = new Scene(root44,500,600); 
        Scene scene45 = new Scene(root45,500,600); 
        Scene agent1 = new Scene(agent1bg, 500, 600);
        Scene agent2 = new Scene(agent2bg, 500, 600);
        Scene agent3 = new Scene(agent3bg, 500, 600);
        Scene agent4 = new Scene(agent4bg, 500, 600);
        Scene agent5 = new Scene(agent5bg, 500, 600);
        Scene allAg = new Scene(allagbg,500,600);
        Scene scene5 = new Scene(s5s,500,600);
        Scene scene6 = new Scene(sp3s6,500,600);
        Scene scene7 = new Scene(sp7,500,600);
        Scene scene8 = new Scene(s8stack,500,600);
        Scene scene9 = new Scene(sc9,500,600);
        Scene ratingscene = new Scene(ST,500,600);
        Scene MINIGAME = new Scene(mgstack,500,600);
        Scene mgwon = new Scene(wonn,500,600);
        Scene scene10 = new Scene(ST10,500,600);
        ////////////////////////////////////////////events to switch from scene to scene
        htp.setOnAction(e->{stage.setScene(HTP);hidden.stop();hidden2.stop();
        hidden3.stop();hidden4.stop();hidden5.stop();transitions5.stop();});
        htpgi.setOnAction(e->{stage.setScene(scene1);hidden.stop();hidden2.stop();       
        hidden3.stop();hidden4.stop();hidden5.stop();transitions5.stop();});
        signup.setOnAction(e -> {stage.setScene(signUp);});
        ReturnButton.setOnAction(e->{stage.setScene(scene1);hidden.stop();hidden2.stop();
        hidden3.stop();hidden4.stop();hidden5.stop();transitions5.stop();});
        backSU.setOnAction(e->{stage.setScene(scene1);});
        DoneSU.setOnAction(e->{
            if(t1SU.getText().isEmpty() &&t2SU.getText().isEmpty()){
            Warning3.setOpacity(100);
            FadeTransition wgf3 = new FadeTransition(Duration.seconds(5),Warning3);
       wgf3.setFromValue(1);
       wgf3.setToValue(0);
       wgf3.play();
            }
            else if(t2SU.getText().isEmpty()){
            Warning3.setOpacity(100);
            FadeTransition wgf3 = new FadeTransition(Duration.seconds(5),Warning3);
       wgf3.setFromValue(1);
       wgf3.setToValue(0);
       wgf3.play();
            }
        boolean isValidEmail = t1SU.getText().contains("@") && t1SU.getText().contains(".");
        
 
        boolean isValidPassword = t2SU.getText().length() >= 8;
        
        if (!isValidEmail) {
       Warning3.setText("Invalid email format. Please enter a valid email address.");      
       Warning3.setOpacity(100);
       FadeTransition wgf4 = new FadeTransition(Duration.seconds(5),Warning3);
       wgf4.setFromValue(1);
       wgf4.setToValue(0);
       wgf4.play();
           
        } else if (!isValidPassword) {
       Warning3.setText("Invalid password. Password must be at least 8 characters.");
       Warning3.setOpacity(100);
       FadeTransition wgf4 = new FadeTransition(Duration.seconds(5),Warning3);
       wgf4.setFromValue(1);
       wgf4.setToValue(0);
       wgf4.play();

        }
            else {
          stage.setScene(signedscene);}
        
        try {
            signeduser.setEmail(t1SU.getText());
            signeduser.setpassword(t2SU.getText());
    //
    Session session3 = HibernateUtil.getSessionFactory().openSession();
    Transaction tx3 = session3.beginTransaction();
    String c1 = (String) session3.save(signeduser);
    tx3.commit();
    session3.close();
} 
        catch (Exception ex) {
    ex.printStackTrace();

}
        
        });
        contsigned.setOnAction(e->{stage.setScene(scene2);});
        exitgame.setOnAction(e->{stage.close();System.exit(0);});
        st.setOnAction(e->{stage.setScene(scene2);hidden.stop();hidden2.stop();
        hidden3.stop();hidden4.stop();hidden5.stop();transitions5.stop();});
        DoneButton.setOnAction(
                new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent e){
                
                if(Ag1textField.getText().isEmpty() &&Ag2textField.getText().isEmpty()  && Ag3textField.getText().isEmpty() ){
        warning.setOpacity(100);
        FadeTransition wgf = new FadeTransition(Duration.seconds(5),warning);
       wgf.setFromValue(1);
       wgf.setToValue(0);
       wgf.play();
    }
    else if(Ag2textField.getText().isEmpty() && Ag3textField.getText().isEmpty() ){
        warning.setOpacity(100);
        FadeTransition wgf = new FadeTransition(Duration.seconds(5),warning);
       wgf.setFromValue(1);
       wgf.setToValue(0);
       wgf.play();
    }
    else if(Ag3textField.getText().isEmpty() ){
        warning.setOpacity(100);
        FadeTransition wgf1 = new FadeTransition(Duration.seconds(5),warning);
        wgf1.setFromValue(1);
       wgf1.setToValue(0);
       wgf1.play();
    }//////////////////////////////////////////////////NAME VALIDATION HERE !!!!!
      
    else if (ValidName(Ag1textField.getText())) {
 warning.setText("Name can't start with spical characters or\ndigids or white spaces");
        warning.setOpacity(100);
        FadeTransition wgf1 = new FadeTransition(Duration.seconds(5),warning);
        wgf1.setFromValue(1);
        wgf1.setToValue(0);
        wgf1.play(); 
    }
    else if (ValidName(Ag2textField.getText())){
 warning.setText("Name can't start with spical characters or\ndigids or white spaces");
        warning.setOpacity(100);
        FadeTransition wgf1 = new FadeTransition(Duration.seconds(5),warning);
        wgf1.setFromValue(1);
        wgf1.setToValue(0);
        wgf1.play();   
    }
        
            else if (ValidName(Ag3textField.getText())){
  warning.setText("Name can't start with spical characters or \ndigids or white spaces");
        warning.setOpacity(100);
        FadeTransition wgf1 = new FadeTransition(Duration.seconds(5),warning);
        wgf1.setFromValue(1);
        wgf1.setToValue(0);
        wgf1.play();   
    }
                        else if (ValidName(Ag4textField.getText())){
 warning.setText("Name can't start with spical characters or \ndigids or white spaces");
        warning.setOpacity(100);
        FadeTransition wgf1 = new FadeTransition(Duration.seconds(5),warning);
        wgf1.setFromValue(1);
        wgf1.setToValue(0);
        wgf1.play();   
    }
                                    else if (ValidName(Ag5textField.getText())){
  warning.setText("Name can't start with spical characters or \ndigids or white spaces");
        warning.setOpacity(100);
        FadeTransition wgf1 = new FadeTransition(Duration.seconds(5),warning);
        wgf1.setFromValue(1);
        wgf1.setToValue(0);
        wgf1.play();   
    }
    else{   
        warning.setOpacity(0);
        stage.setScene(scene3);hidden.stop();hidden2.stop();
        hidden3.stop();hidden4.stop();hidden5.stop();transitions5.stop();
        }
                
        try {
    agent1DB.setName(Ag1textField.getText()); 
    agent2DB.setName(Ag2textField.getText()); 
    agent3DB.setName(Ag3textField.getText()); 
    //
        agent1DB.setNumber(1);
        agent2DB.setNumber(2);
        agent3DB.setNumber(3);
        if(!Ag4textField.getText().isEmpty()){
        agent4DB.setName(Ag4textField.getText());
        agent4DB.setNumber(4);
        }
        if(!Ag5textField.getText().isEmpty()){
        agent5DB.setName(Ag5textField.getText());
        agent5DB.setNumber(5);
        }
        if(randnum!=1){agent1DB.setIsFalseAgent(false);}else{agent1DB.setIsFalseAgent(true);}
        if(randnum!=2){agent2DB.setIsFalseAgent(false);}else{agent2DB.setIsFalseAgent(true);}
        if(randnum!=3){agent3DB.setIsFalseAgent(false);}else{agent3DB.setIsFalseAgent(true);}
        //
        if(!Ag4textField.getText().isEmpty()){
        if(randnum!=4){agent4DB.setIsFalseAgent(false);}
        else{agent4DB.setIsFalseAgent(true);}
        }
        //
        if(!Ag5textField.getText().isEmpty()){
            if(randnum!=5){agent5DB.setIsFalseAgent(false);}
            else{agent5DB.setIsFalseAgent(true);}
        }
        //

} 
        catch (Exception ex) {
    ex.printStackTrace();

}
                                   }
                    
                }
        );
        //
        dones3.setOnAction(e->{
            if(themes.getValue()== null){
            warning2.setOpacity(100);
            FadeTransition w2gf = new FadeTransition(Duration.seconds(5),warning2);
       w2gf.setFromValue(1);
       w2gf.setToValue(0);
       w2gf.play();
            }
            else if(!themes.getValue().isEmpty()){
            warning2.setOpacity(0);
            stage.setScene(agent1);hidden.stop();hidden2.stop();
        hidden3.stop();hidden4.stop();hidden5.stop();transitions5.stop();
            }
            else{
                warning2.setOpacity(0);
            }
try {
    agent1DB.setCaseChosen(themes.getValue());
    agent2DB.setCaseChosen(themes.getValue());
    agent3DB.setCaseChosen(themes.getValue());
    //
        
        if(!Ag4textField.getText().isEmpty()){
        agent4DB.setCaseChosen(themes.getValue());
        }
        if(!Ag5textField.getText().isEmpty()){
        agent5DB.setCaseChosen(themes.getValue());
        }
    Session session2 = HibernateUtil.getSessionFactory().openSession();
    Transaction tx2 = session2.beginTransaction();
    int b1 = (Integer) session2.save(agent1DB);
    int b2 = (Integer) session2.save(agent2DB);
    int b3 = (Integer) session2.save(agent3DB);
    if(!Ag4textField.getText().isEmpty()){
        int b4 = (Integer) session2.save(agent4DB);
        }
        if(!Ag5textField.getText().isEmpty()){
        int b5 = (Integer) session2.save(agent5DB);
        }
    tx2.commit();
    session2.close();
} 
        catch (Exception ex) {
    ex.printStackTrace();

}
            });
        done1.setOnAction(e -> {stage.setScene(scene41);
            hidden.play();hidden2.stop();hidden3.stop();hidden4.stop();hidden5.stop();transitions5.stop();});
        done2.setOnAction(e -> {stage.setScene(scene42);
            hidden2.play();hidden.stop();hidden3.stop();hidden4.stop();hidden5.stop();transitions5.stop();});
        done3.setOnAction(e -> {stage.setScene(scene43);
            hidden3.play();hidden2.stop();hidden.stop();hidden4.stop();hidden5.stop();transitions5.stop();});
        done4.setOnAction(e -> {stage.setScene(scene44);
            hidden4.play();hidden2.stop();hidden3.stop();hidden.stop();hidden5.stop();transitions5.stop();});
        done5.setOnAction(e -> {stage.setScene(scene45);
            hidden5.play();hidden2.stop();hidden3.stop();hidden4.stop();hidden.stop();transitions5.stop();});
           okayb.setOnAction(e->{stage.setScene(scene5);hidden.stop();hidden2.stop();
        hidden3.stop();hidden4.stop();hidden5.stop();transitions5.play();}); 
           DoneButtons6.setOnAction(e->{
               if(CB1.getValue()== null&&CB2.getValue()== null&&CB3.getValue()== null){
               warning4.setOpacity(100);
                FadeTransition w4gf = new FadeTransition(Duration.seconds(5),warning4);
                w4gf.setFromValue(1);
                 w4gf.setToValue(0);
                 w4gf.play();
               }
               else if(CB2.getValue()== null&&CB3.getValue()== null){
               warning4.setOpacity(100);
                FadeTransition w4gf = new FadeTransition(Duration.seconds(5),warning4);
                w4gf.setFromValue(1);
                 w4gf.setToValue(0);
                 w4gf.play();
               }               
               else if(CB3.getValue()== null){
               warning4.setOpacity(100);
                FadeTransition w4gf = new FadeTransition(Duration.seconds(5),warning4);
                w4gf.setFromValue(1);
                 w4gf.setToValue(0);
                 w4gf.play();
               }  
               else {
               stage.setScene(scene7);
               s.play();   
               f.play();
                hidden.stop();hidden2.stop();
                 hidden3.stop();hidden4.stop();hidden5.stop();
                 transitions5.stop();}}); 

            //actions for the hidden animations for transitions.
            hidden.setOnFinished(e->{
                stage.setScene(agent2);
            });
            //
            hidden2.setOnFinished(e->{
                stage.setScene(agent3);
            });            
            hidden3.setOnFinished(e->{
                if(!Ag4textField.getText().isEmpty()){
                stage.setScene(agent4);
                }
                else if(Ag4textField.getText().isEmpty()){
                stage.setScene(allAg);
                }
            });
            hidden4.setOnFinished(e->{
                if(!Ag5textField.getText().isEmpty()){
                stage.setScene(agent5);
                }
                else if(Ag5textField.getText().isEmpty()){
                stage.setScene(allAg);
                }
            });
            hidden5.setOnFinished(e->{            
                stage.setScene(allAg);
            });
            transitions5.setOnFinished(e->{
                
                transitions5.stop();
                
                stage.setScene(scene6);
                if(!Ag4textField.getText().isEmpty()){
                    centers6.getChildren().add(center4s6);
                    //
                    CB1.getItems().add(a4voting);
                    CB2.getItems().add(a4voting);
                    CB3.getItems().add(a4voting);
                    CB4.getItems().add(a4voting);

                };
        
                if(!Ag5textField.getText().isEmpty()){
                centers6.getChildren().add(center5s6);
                //
                    CB1.getItems().add(a5voting);
                    CB2.getItems().add(a5voting);
                    CB3.getItems().add(a5voting);
                    CB4.getItems().add(a5voting);
                    CB5.getItems().add(a5voting);
                };
                     });
            /////////
            s.setOnFinished(e->{
                s.stop();
                f.stop();
            if(randnum==1){
    Label7.setText("AGENT 1.");
    }
    else if(randnum==2){
    Label7.setText("AGENT 2.");
    }
    else if(randnum==3){
    Label7.setText("AGENT 3.");
    }
    else if(randnum==4){
    Label7.setText("AGENT 4.");
    }
    else if(randnum==5){
    Label7.setText("AGENT 5.");
    }
    else {
       Label7.setText("UNKNOWN"); 
    } 
    
            });
            Viewnvotes.setOnAction(e->{stage.setScene(scene8);

            if(!Ag4textField.getText().isEmpty()){
        s8g.add(a4tag,0,3);
        };
        if(!Ag5textField.getText().isEmpty()){
        s8g.add(a5tag,0,4);
        };
            //agent 1
        if(randnum==1 &&CB1.getValue().equals(a1voting)){
        s8g.add(correct1,1,0);
        }
        else if(randnum==1 && !CB1.getValue().equals(a1voting)){
        s8g.add(wrong1,1,0);
        }
        else if(randnum==2 &&CB1.getValue().equals(a2voting)){
        s8g.add(correct1,1,0);
        }
        else if(randnum==2 && !CB1.getValue().equals(a2voting)){
        s8g.add(wrong1,1,0);
        }
        else if(randnum==3 &&CB1.getValue().equals(a3voting)){
        s8g.add(correct1,1,0);
        }
        else if(randnum==3 && !CB1.getValue().equals(a3voting)){
        s8g.add(wrong1,1,0);
        }
        else if(randnum==4 &&CB1.getValue().equals(a4voting)){
        s8g.add(correct1,1,0);
        }
        else if(randnum==4 && !CB1.getValue().equals(a4voting)){
        s8g.add(wrong1,1,0);
        }
        else if(randnum==5 &&CB1.getValue().equals(a5voting)){
        s8g.add(correct1,1,0);
        }
        else if(randnum==5 && !CB1.getValue().equals(a5voting)){
        s8g.add(wrong1,1,0);
        };
         //agent 2
        if(randnum==1 &&CB2.getValue().equals(a1voting)){
        s8g.add(correct2,1,1);
        }
        else if(randnum==1 && !CB2.getValue().equals(a1voting)){
        s8g.add(wrong2,1,1);
        }
        else if(randnum==2 &&CB2.getValue().equals(a2voting)){
        s8g.add(correct2,1,1);
        }
        else if(randnum==2 && !CB2.getValue().equals(a2voting)){
        s8g.add(wrong2,1,1);
        }
        else if(randnum==3 &&CB2.getValue().equals(a3voting)){
        s8g.add(correct2,1,1);
        }
        else if(randnum==3 && !CB2.getValue().equals(a3voting)){
        s8g.add(wrong2,1,1);
        }
        else if(randnum==4 &&CB2.getValue().equals(a4voting)){
        s8g.add(correct2,1,1);
        }
        else if(randnum==4 && !CB2.getValue().equals(a4voting)){
        s8g.add(wrong2,1,1);
        }
        else if(randnum==5 &&CB2.getValue().equals(a5voting)){
        s8g.add(correct2,1,1);
        }
        else if(randnum==5 && !CB2.getValue().equals(a5voting)){
        s8g.add(wrong2,1,1);
        };
         //agent 3
        if(randnum==1 &&CB3.getValue().equals(a1voting)){
        s8g.add(correct3,1,2);
        }
        else if(randnum==1 && !CB3.getValue().equals(a1voting)){
        s8g.add(wrong3,1,2);
        }
        else if(randnum==2 &&CB3.getValue().equals(a2voting)){
        s8g.add(correct3,1,2);
        }
        else if(randnum==2 && !CB3.getValue().equals(a2voting)){
        s8g.add(wrong3,1,2);
        }
        else if(randnum==3 &&CB3.getValue().equals(a3voting)){
        s8g.add(correct3,1,2);
        }
        else if(randnum==3 && !CB3.getValue().equals(a3voting)){
        s8g.add(wrong3,1,2);
        }
        else if(randnum==4 &&CB3.getValue().equals(a4voting)){
        s8g.add(correct3,1,2);
        }
        else if(randnum==4 && !CB3.getValue().equals(a4voting)){
        s8g.add(wrong3,1,2);
        }
        else if(randnum==5 &&CB3.getValue().equals(a5voting)){
        s8g.add(correct3,1,2);
        }
        else if(randnum==5 && !CB3.getValue().equals(a5voting)){
        s8g.add(wrong3,1,2);
        };
         //agent 4
         if(!Ag4textField.getText().isEmpty()){
        if(randnum==1 &&CB4.getValue().equals(a1voting)){
        s8g.add(correct4,1,3);
        }
        else if(randnum==1 && !CB4.getValue().equals(a1voting)){
        s8g.add(wrong4,1,3);
        }
        else if(randnum==2 &&CB4.getValue().equals(a2voting)){
        s8g.add(correct4,1,3);
        }
        else if(randnum==2 && !CB4.getValue().equals(a2voting)){
        s8g.add(wrong4,1,3);
        }
        else if(randnum==3 &&CB4.getValue().equals(a3voting)){
        s8g.add(correct4,1,3);
        }
        else if(randnum==3 && !CB4.getValue().equals(a3voting)){
        s8g.add(wrong4,1,3);
        }
        else if(randnum==4 &&CB4.getValue().equals(a4voting)){
        s8g.add(correct4,1,3);
        }
        else if(randnum==4 && !CB4.getValue().equals(a4voting)){
        s8g.add(wrong4,1,3);
        }
        else if(randnum==5 &&CB4.getValue().equals(a5voting)){
        s8g.add(correct4,1,3);
        }
        else if(randnum==5 && !CB4.getValue().equals(a5voting)){
        s8g.add(wrong4,1,3);
        };
         }
         //agent 5
         if(!Ag5textField.getText().isEmpty()){
        if(randnum==1 &&CB5.getValue().equals(a1voting)){
        s8g.add(correct5,1,4);
        }
        else if(randnum==1 && !CB5.getValue().equals(a1voting)){
        s8g.add(wrong5,1,4);
        }
        else if(randnum==2 &&CB5.getValue().equals(a2voting)){
        s8g.add(correct5,1,4);
        }
        else if(randnum==2 && !CB5.getValue().equals(a2voting)){
        s8g.add(wrong5,1,4);
        }
        else if(randnum==3 &&CB5.getValue().equals(a3voting)){
        s8g.add(correct5,1,4);
        }
        else if(randnum==3 && !CB5.getValue().equals(a3voting)){
        s8g.add(wrong5,1,4);
        }
        else if(randnum==4 &&CB5.getValue().equals(a4voting)){
        s8g.add(correct5,1,4);
        }
        else if(randnum==4 && !CB5.getValue().equals(a4voting)){
        s8g.add(wrong5,1,4);
        }
        else if(randnum==5 &&CB5.getValue().equals(a5voting)){
        s8g.add(correct5,1,4);
        }
        else if(randnum==5 && !CB5.getValue().equals(a5voting)){
        s8g.add(wrong5,1,4);
        };
         }
            
            });
            
            goto9.setOnAction(e->{stage.setScene(scene9);
            try {
                hoststats.setId(agent1DB.getId());
                //
                if(randnum==1){
                hoststats.setTimesAsFalseAgent(hoststats.getTimesAsFalseAgent()+1);
                }
                //
                if(randnum==1 &&CB1.getValue().equals(a1voting)){
        hoststats.setTimesWon(hoststats.getTimesWon()+1);
        }
        else if(randnum==2 &&CB1.getValue().equals(a2voting)){
        hoststats.setTimesWon(hoststats.getTimesWon()+1);
        }
        else if(randnum==3 &&CB1.getValue().equals(a3voting)){
        hoststats.setTimesWon(hoststats.getTimesWon()+1);
        }
        else if(randnum==4 &&CB1.getValue().equals(a4voting)){
        hoststats.setTimesWon(hoststats.getTimesWon()+1);
        }
        else if(randnum==5 &&CB1.getValue().equals(a5voting)){
        hoststats.setTimesWon(hoststats.getTimesWon()+1);
        }
                
    //
    Session session5 = HibernateUtil.getSessionFactory().openSession();
    Transaction tx5 = session5.beginTransaction();
    int e1 = (Integer) session5.save(hoststats);
    tx5.commit();
    session5.close();
} 
        catch (Exception ex) {
    ex.printStackTrace();

}
            

            });
            ratebutton.setOnAction(e->{stage.setScene(ratingscene);});
            s9exit.setOnAction(e->{stage.close();System.exit(0);});
            
            mgbutton.setOnAction(e->{stage.setScene(MINIGAME);});
            s1b.setOnAction(e->{stage.setScene(scene1);});
            vicon1.setOnMouseClicked(e->{
        progress(mgbar);
        vicon1.setOpacity(0);
        });
        vicon2.setOnMouseClicked(e->{
        progress(mgbar);
        vicon2.setOpacity(0);
        });
        vicon3.setOnMouseClicked(e->{
        progress(mgbar);
        vicon3.setOpacity(0);
        });
        
        MINIGAME.setOnKeyPressed(e->{
        if (e.getCode() ==KeyCode.ENTER && mgbar.getProgress()==1){
            System.out.println("well done!");
            stage.setScene(mgwon);
        }
        else if(e.getCode() ==KeyCode.ENTER && mgbar.getProgress()!=1){
            mgwarning.setOpacity(100);
            FadeTransition mgf = new FadeTransition(Duration.seconds(5),mgwarning);
       mgf.setFromValue(1);
       mgf.setToValue(0);
       mgf.play();
        }
        });
        wonback.setOnAction(e->{stage.setScene(ratingscene);});
        wonexit.setOnAction(e->{stage.close();System.exit(0);});
        SubButton.setOnAction(e->{stage.setScene(scene10);
          String exp1= "";
          String exp2= "";
          String exp3= "";
          String exp4= "";
          String exp5= "";
          String exp6= "";
            //
            if(chk1.isSelected()){exp1="fun game!,";}
            if(chk2.isSelected()){exp2="hard to understand,";}         
            if(chk3.isSelected()){exp3 = "Boring game,";}
            if(chk4.isSelected()){exp4="Not enough time,";}
            if(chk5.isSelected()){exp5 ="Needs work,";}
            if(chk6.isSelected()){exp6 = "Tough cases.";}

            String endexp = exp1+exp2+exp3+exp4+exp5+exp6;
            
            
        try {
            rating.setComments(taComments.getText());
            rating.setRateOutOf10((int)RatingSlider.getValue());
            //label concat
            
            rating.setExperience(endexp);
            Session session4 = HibernateUtil.getSessionFactory().openSession();
            Transaction tx4 = session4.beginTransaction();
            String d1 = (String) session4.save(rating);
            tx4.commit();
            session4.close();
} 
        catch (Exception ex) {
    ex.printStackTrace();

}
        
        
        }
        );
        ExitButton.setOnAction(e->{stage.close();System.exit(0);});
        PMButton.setOnAction(e->{stage.setScene(MINIGAME);vicon1.setOpacity(100);vicon2.setOpacity(100);
        vicon3.setOpacity(100);
        mgbar.setProgress(0.1);
        });
        //events to change the buttons background color when hovering using the mouse
        htp.setOnMouseEntered(e->{htp.setStyle("-fx-background-color: LIME;");});
        htp.setOnMouseExited(e->{htp.setStyle("-fx-background-color: FORESTGREEN;");});
        st.setOnMouseEntered(e->{st.setStyle("-fx-background-color: LIME;");});
        st.setOnMouseExited(e->{st.setStyle("-fx-background-color: FORESTGREEN;");});
        htpgi.setOnMouseEntered(e->{htpgi.setStyle("-fx-background-color: LIME;");});
        htpgi.setOnMouseExited(e->{htpgi.setStyle("-fx-background-color: FORESTGREEN;");});
        ReturnButton.setOnMouseEntered(e->{ReturnButton.setStyle("-fx-background-color: LIME;");});
        ReturnButton.setOnMouseExited(e->{ReturnButton.setStyle("-fx-background-color: FORESTGREEN;");});
        DoneButton.setOnMouseEntered(e->{DoneButton.setStyle("-fx-background-color: LIME;");});
        DoneButton.setOnMouseExited(e->{DoneButton.setStyle("-fx-background-color: FORESTGREEN;");});
        dones3.setOnMouseEntered(e->{dones3.setStyle("-fx-background-color: LIME;");});
        dones3.setOnMouseExited(e->{dones3.setStyle("-fx-background-color: FORESTGREEN;");});
        done1.setOnMouseEntered(e->{done1.setStyle("-fx-background-color: LIME;");});
        done1.setOnMouseExited(e->{done1.setStyle("-fx-background-color: FORESTGREEN;");});
        done2.setOnMouseEntered(e->{done2.setStyle("-fx-background-color: LIME;");});
        done2.setOnMouseExited(e->{done2.setStyle("-fx-background-color: FORESTGREEN;");});
        done3.setOnMouseEntered(e->{done3.setStyle("-fx-background-color: LIME;");});
        done3.setOnMouseExited(e->{done3.setStyle("-fx-background-color: FORESTGREEN;");});
        done4.setOnMouseEntered(e->{done4.setStyle("-fx-background-color: LIME;");});
        done4.setOnMouseExited(e->{done4.setStyle("-fx-background-color: FORESTGREEN;");});
        done5.setOnMouseEntered(e->{done5.setStyle("-fx-background-color: LIME;");});
        done5.setOnMouseExited(e->{done5.setStyle("-fx-background-color: FORESTGREEN;");});
        okayb.setOnMouseEntered(e->{okayb.setStyle("-fx-background-color: LIME;");});
        okayb.setOnMouseExited(e->{okayb.setStyle("-fx-background-color: FORESTGREEN;");});
        DoneButtons6.setOnMouseEntered(e->{DoneButtons6.setStyle("-fx-background-color: LIME;");});
        DoneButtons6.setOnMouseExited(e->{DoneButtons6.setStyle("-fx-background-color: FORESTGREEN;");});
        signup.setOnMouseEntered(e->{signup.setStyle("-fx-background-color: LIME;");});
        signup.setOnMouseExited(e->{signup.setStyle("-fx-background-color: FORESTGREEN;");});
        exitgame.setOnMouseEntered(e->{exitgame.setStyle("-fx-background-color: LIME;");});
        exitgame.setOnMouseExited(e->{exitgame.setStyle("-fx-background-color: FORESTGREEN;");});
        backSU.setOnMouseEntered(e->{backSU.setStyle("-fx-background-color: LIME;");});
        backSU.setOnMouseExited(e->{backSU.setStyle("-fx-background-color: FORESTGREEN;");});
        DoneSU.setOnMouseEntered(e->{DoneSU.setStyle("-fx-background-color: LIME;");});
        DoneSU.setOnMouseExited(e->{DoneSU.setStyle("-fx-background-color: FORESTGREEN;");});         
        Viewnvotes.setOnMouseEntered(e->{Viewnvotes.setStyle("-fx-background-color: LIME;");});
        Viewnvotes.setOnMouseExited(e->{Viewnvotes.setStyle("-fx-background-color: FORESTGREEN;");});    
        goto9.setOnMouseEntered(e->{goto9.setStyle("-fx-background-color: LIME;");});
        goto9.setOnMouseExited(e->{goto9.setStyle("-fx-background-color: FORESTGREEN;");});
        s1b.setOnMouseEntered(e->{s1b.setStyle("-fx-background-color: LIME;");});
        s1b.setOnMouseExited(e->{s1b.setStyle("-fx-background-color: FORESTGREEN;");});
        mgbutton.setOnMouseEntered(e->{mgbutton.setStyle("-fx-background-color: LIME;");});
        mgbutton.setOnMouseExited(e->{mgbutton.setStyle("-fx-background-color: FORESTGREEN;");});
        s9exit.setOnMouseEntered(e->{s9exit.setStyle("-fx-background-color: LIME;");});
        s9exit.setOnMouseExited(e->{s9exit.setStyle("-fx-background-color: FORESTGREEN;");});
        ratebutton.setOnMouseEntered(e->{ratebutton.setStyle("-fx-background-color: LIME;");});
        ratebutton.setOnMouseExited(e->{ratebutton.setStyle("-fx-background-color: FORESTGREEN;");});
        wonback.setOnMouseEntered(e->{wonback.setStyle("-fx-background-color: LIME;");});
        wonback.setOnMouseExited(e->{wonback.setStyle("-fx-background-color: FORESTGREEN;");});
        wonexit.setOnMouseEntered(e->{wonexit.setStyle("-fx-background-color: LIME;");});
        wonexit.setOnMouseExited(e->{wonexit.setStyle("-fx-background-color: FORESTGREEN;");});
        SubButton.setOnMouseEntered(e->{SubButton.setStyle("-fx-background-color: LIME;");});
        SubButton.setOnMouseExited(e->{SubButton.setStyle("-fx-background-color: FORESTGREEN;");});             
        PMButton.setOnMouseEntered(e->{PMButton.setStyle("-fx-background-color: LIME;");});
        PMButton.setOnMouseExited(e->{PMButton.setStyle("-fx-background-color: FORESTGREEN;");});
        ExitButton.setOnMouseEntered(e->{ExitButton.setStyle("-fx-background-color: LIME;");});
        ExitButton.setOnMouseExited(e->{ExitButton.setStyle("-fx-background-color: FORESTGREEN;");});  
        contsigned.setOnMouseEntered(e->{contsigned.setStyle("-fx-background-color: LIME;");});
        contsigned.setOnMouseExited(e->{contsigned.setStyle("-fx-background-color: FORESTGREEN;");});  
        /////////////////////////////////////////////////////////////////////

        //initial stage preferences
        stage.setScene(scene1);
        stage.setResizable(false);
        stage.setTitle("The False Agent.");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    
    public static void progress(ProgressBar b){
        b.setProgress(b.getProgress()+0.3);
    }
    
        private boolean ValidName(String name) {
    if (!name.isEmpty()) {
        char firstChar = name.charAt(0);
        return !Character.isLetter(firstChar) && !Character.isWhitespace(firstChar);
    }
    return false;
}
    
 

}