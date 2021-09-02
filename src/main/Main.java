/**
 *Name : Tran Van Khoi
 *MSSV : HE130007
 *Email : khoitvhe130007@fpt.edu.vn
 *Lecturer : DuongTB
 */
package main;


import javafx.application.Application;

import javafx.stage.Stage;
import view.MainFrame;


/**
 *
 * @author khoitvhe130007@fpt.edu.vn
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
         MainFrame frame = new MainFrame();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
