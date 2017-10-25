    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package uidemo;

    import javafx.application.Application;
    import javafx.event.ActionEvent;
    import javafx.event.EventHandler;
    import javafx.geometry.Insets;
    import javafx.geometry.Pos;
    import javafx.scene.Scene;
    import javafx.scene.control.Button;
    import javafx.scene.control.Label;
    import javafx.scene.control.TextField;
    import javafx.scene.layout.GridPane;
    import javafx.scene.layout.StackPane;
    import javafx.stage.Stage;

    /**
     *
     * @author Yasser Muhamed
     * 
     */
    public class UIDemo extends Application {

        @Override
        public void start(Stage primaryStage) {
            Label labelNumber1 = new Label("Number 1:");
            TextField textNumber1 = new TextField();
            
            Label labelNumber2 = new Label("Number 2:");
            TextField textNumber2 = new TextField();
            
            Label labelResults = new Label("Result :");
            //TextField textResults = new TextField();
            
            Button btn = new Button();
            btn.setText("Click to sum");
            btn.setId("button");
            btn.setOnAction(event ->{
                // Sum Operation
                int number1 = Integer.parseInt(textNumber1.getText().toString());
                int number2 = Integer.parseInt(textNumber2.getText().toString());
                int sum = number1 + number2 ;
                labelResults.setText("Result : " + sum );
                
            });
           /* Button btn = new Button();
            btn.setText("Say 'Hello World'");*/
         /**
          *  btn.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {
                    // When someone click 
                    System.out.println("Hello World!");
                }
            });
            */
           

           // Lambda Expression
           /*  btn.setOnAction( (event) -> {
                 System.out.println("Hello from new Lambda Expression!");
            });
            */
            /* StackPane root = new StackPane();
            root.getChildren().add(btn);
            */
           GridPane gridPane = new GridPane();
           
           // Set The UI
           gridPane.add(labelNumber1 , 0 , 0);
           gridPane.add(textNumber1 , 1 , 0);
           gridPane.setAlignment(Pos.CENTER);
           gridPane.setHgap(10);
           gridPane.setVgap(10);
           gridPane.setGridLinesVisible(false);
           gridPane.setPadding(new Insets( 25 , 25 , 25 , 25 ));
           gridPane.add(labelNumber2  , 0 ,1 );
           gridPane.add(textNumber2, 1, 1);
           gridPane.add(labelResults , 1 ,2);
           gridPane.add(btn , 2 , 3);
           
           Scene scene = new Scene(gridPane, 400, 250);
           scene.getStylesheets().add(UIDemo.class.getResource("Calculator.css").toExternalForm());
           
           primaryStage.setTitle("Hello World!");
           primaryStage.setScene(scene);
           primaryStage.show();
        }

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
           launch(args);
        }

    }
