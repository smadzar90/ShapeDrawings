/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package shapedrawings;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author stipanmadzar
 */
public class ShapeDrawings extends Application {
    
    public static int num = 0;
    public static String color;
    public static String shape;
    
    @Override
    public void start(Stage primaryStage) {
        
        MenuBar menuBar = new MenuBar();
        Menu numbers = new Menu("Numbers");
        Menu shapes = new Menu("Shapes");
        Menu colors = new Menu("Colors");
        RadioMenuItem one = new RadioMenuItem("1");
        RadioMenuItem ten = new RadioMenuItem("10");
        RadioMenuItem twenty = new RadioMenuItem("20");
        RadioMenuItem thirty = new RadioMenuItem("30");
        ToggleGroup tg = new ToggleGroup();
        one.setToggleGroup(tg);
        ten.setToggleGroup(tg);
        twenty.setToggleGroup(tg);
        thirty.setToggleGroup(tg);
        numbers.getItems().addAll(one, ten, twenty, thirty);
        RadioMenuItem circle = new RadioMenuItem("Circle");
        RadioMenuItem oval = new RadioMenuItem("Oval");
        RadioMenuItem rectangle = new RadioMenuItem("Rectangle");
        RadioMenuItem square = new RadioMenuItem("Square");
        ToggleGroup tg2 = new ToggleGroup();
        circle.setToggleGroup(tg2);
        oval.setToggleGroup(tg2);
        rectangle.setToggleGroup(tg2);
        square.setToggleGroup(tg2);
        shapes.getItems().addAll(circle, oval, rectangle, square);
        RadioMenuItem red = new RadioMenuItem("Red");
        RadioMenuItem green = new RadioMenuItem("Green");
        RadioMenuItem blue = new RadioMenuItem("Blue");
        RadioMenuItem black = new RadioMenuItem("Black");
        ToggleGroup tg3 = new ToggleGroup();
        red.setToggleGroup(tg3);
        green.setToggleGroup(tg3);
        blue.setToggleGroup(tg3);
        black.setToggleGroup(tg3);
        colors.getItems().addAll(red, green, blue, black);
        menuBar.getMenus().addAll(numbers, shapes, colors);
        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        Pane pane = new Pane();
        root.setCenter(pane);
        rectangle.setSelected(true);
        shape = "rectangle";
        blue.setSelected(true);
        color = "blue";
        twenty.setSelected(true);
        num = 20;
        drawShape(pane);
       
        one.setOnAction(e -> {
           num = 1;
           drawShape(pane);
        });
       
        ten.setOnAction(e -> {
            num = 10;   
            drawShape(pane);
        });
       
        twenty.setOnAction(e -> {  
            num = 20;  
            drawShape(pane);
        });
       
        thirty.setOnAction(e -> {
            num = 30;  
            drawShape(pane);         
        });
       
        red.setOnAction(e -> {
           color = "red";
           drawShape(pane); 
        });
       
        green.setOnAction(e -> {
            color = "green";
            drawShape(pane); 
        });
       
        blue.setOnAction(e -> {
            color = "blue";
            drawShape(pane); 
        });
       
        black.setOnAction(e -> {
            color = "black";  
            drawShape(pane); 
        });
       
        rectangle.setOnAction(e -> {
          shape = "rectangle";
          drawShape(pane); 
        });
       
        oval.setOnAction(e -> {
           shape = "oval";
           drawShape(pane);
        });
       
        circle.setOnAction(e -> {
           shape = "circle";
           drawShape(pane);
        });
       
        square.setOnAction(e -> {
           shape = "square";
           drawShape(pane);
        });
       
        Scene scene = new Scene(root, 540, 450);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Select a number, shape, and color");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
    public void drawShape(Pane pane) {
     
    if(shape.equals("rectangle")) {
   
         double rectangleX = 100.0, rectangleY = 100.0, rectangleW = 70.0, rectangleH = 30.0;
         
         if(num > 0) {
             pane.getChildren().clear();
             
           for(int i = 0; i < num; ++i) {
             Rectangle rect = new Rectangle(rectangleX, rectangleY, rectangleW, rectangleH);
             
             rect.setFill(Color.TRANSPARENT);
             
             if(color.equals("red")) {
             rect.setStroke(Color.RED);
             }
             else if(color.equals("green")) {
             rect.setStroke(Color.GREEN);
             }
             else if(color.equals("blue")) {
             rect.setStroke(Color.BLUE);
             }
             else if(color.equals("black")) {
             rect.setStroke(Color.BLACK);
             }
             
             pane.getChildren().addAll(rect);
             rectangleX += 2.5;
             rectangleY += 2.5;
             rectangleW += 2.5;
             rectangleH += 2.5; 
             }
         }
    }
     
    else if(shape.equals("oval")) {
        
        double ovalX = 130.0, ovalY = 110.0, radiusX = 43.0, radiusY = 20.0;
        
        if(num > 0) {
           pane.getChildren().clear();
            
            for(int i = 0; i < num; ++i) {
                Ellipse elipse = new Ellipse(ovalX, ovalY, radiusX, radiusY);
                pane.getChildren().addAll(elipse);
                
                elipse.setFill(Color.TRANSPARENT);
             
                if(color.equals("red")) {
                elipse.setStroke(Color.RED);
                }
                else if(color.equals("green")) {
                elipse.setStroke(Color.GREEN);
                }
                else if(color.equals("blue")) {
                elipse.setStroke(Color.BLUE);
                }
                else if(color.equals("black")) {
                elipse.setStroke(Color.BLACK);
                }
             
                ovalX += 2.5;
                ovalY += 2.5;
                radiusX += 2.0;
                radiusY += 2.5;
                
            }}}
     
    else if(shape.equals("circle")) {
        
        
        if(num > 0) {
            
            double circleX = 130.0, circleY = 110.0, radius = 30.0;
            pane.getChildren().clear();
            
            for(int i = 0; i < num; i++) {
                
                Circle circle = new Circle(circleX, circleY, radius);
                pane.getChildren().addAll(circle);
                
                circle.setFill(Color.TRANSPARENT);
             
                if(color.equals("red")) {
                circle.setStroke(Color.RED);
                }
                else if(color.equals("green")) {
                circle.setStroke(Color.GREEN);
                }
                else if(color.equals("blue")) {
                circle.setStroke(Color.BLUE);
                }
                else if(color.equals("black")) {
                circle.setStroke(Color.BLACK);
                }
                
                circleX += 2.5;
                circleY += 2.5;
                radius += 2.5;
            }
            
            
            
            
        }}
     
    else if(shape.equals("square")) {
        
        if(num > 0) {
            pane.getChildren().clear();
            double squareX = 100.0, squareY = 100.0, side = 50.0;
            
            
            for(int i = 0; i < num; i++) {
            
            Rectangle square = new Rectangle(squareX, squareY, side, side);
            square.setFill(Color.TRANSPARENT);
            if(color.equals("red")) {
            square.setStroke(Color.RED);
            }
            else if(color.equals("green")) {
            square.setStroke(Color.GREEN);
            }
            else if(color.equals("blue")) {
            square.setStroke(Color.BLUE);
            }
            else if(color.equals("black")) {
            square.setStroke(Color.BLACK);
            }
            pane.getChildren().addAll(square);
 
            squareX += 2.5;
            squareY += 2.5;
            side += 2.5;
        }
        }
}}}
