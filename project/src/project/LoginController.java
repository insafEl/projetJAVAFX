package project;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class LoginController implements Initializable 
{
    @FXML
    private Button profL;

    @FXML
    private Button studentL;

    @FXML
    private AnchorPane studentFormL;
    
    @FXML
    private AnchorPane professorFormL;

    @FXML
    private TextField fullnameL1;

    @FXML
    private TextField fullnameL;

    @FXML
    private TextField courseL;
    
    @FXML
    private PasswordField idL;
    
    @FXML
    private PasswordField codeapogeeL;
    
    @FXML
    private Button adminL;
    
    @FXML
    private AnchorPane adminFormL;
    
    @FXML
    private TextField usernameL;
    
    @FXML
    private PasswordField passwordL;
    
    Alert alert;
    public Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    public void loginAccountP()
    {
        String sql;
        sql = "SELECT full_name1,professor_id,module FROM professor_info WHERE full_name1=? and professor_id= ? ";
        connect=database.connect();
        try
        {
            prepare=connect.prepareStatement(sql);
            prepare.setString(1,fullnameL.getText());
            prepare.setString(2,idL.getText()); 
            result=prepare.executeQuery();
            if(fullnameL.getText().isEmpty() || idL.getText().isEmpty())
            {   
                alert=new Alert(AlertType.ERROR);
                alert.setTitle("Error message");
                alert.setHeaderText(null);
                alert.setContentText("please fill all blank fields");
                alert.showAndWait();
            }
            else
            {
                if(result.next())
                {
                    if(result.getString("module").equals("JAVA"))
                    {
                        alert=new Alert(AlertType.INFORMATION);
                        alert.setTitle("Information message");
                        alert.setHeaderText(null);
                        alert.setContentText("Successfully login");
                        alert.showAndWait();

                        profL.getScene().getWindow().hide();
                        Parent root=FXMLLoader.load(getClass().getResource("professorrJAVAFXML.fxml"));
                        Stage stage=new Stage();
                        Scene scene=new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    }
                    if(result.getString("module").equals("C"))
                    {
                        alert=new Alert(AlertType.INFORMATION);
                        alert.setTitle("Information message");
                        alert.setHeaderText(null);
                        alert.setContentText("Successfully login");
                        alert.showAndWait();

                        profL.getScene().getWindow().hide();
                        Parent root=FXMLLoader.load(getClass().getResource("professorrCFXML.fxml"));
                        Stage stage=new Stage();
                        Scene scene=new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    }
                }
                else
                {
                    alert=new Alert(AlertType.ERROR);
                    alert.setTitle("Error message");
                    alert.setHeaderText(null);
                    alert.setContentText("Incorrect name/id");
                    alert.showAndWait();
                }
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void loginAccountS()
    {
        String sql;
        sql = "SELECT full_name,code_apogee FROM student_info WHERE full_name=? and code_apogee= ?";
        connect=database.connect();
        try
        {
            if(fullnameL1.getText().isEmpty() || codeapogeeL.getText().isEmpty())
            {   
                alert=new Alert(AlertType.ERROR);
                alert.setTitle("Error message");
                alert.setHeaderText(null);
                alert.setContentText("please fill all blank fields");
                alert.showAndWait();
            }
            else
            { 
                prepare=connect.prepareStatement(sql);
                prepare.setString(1,fullnameL1.getText());
                prepare.setString(2,codeapogeeL.getText()); 
                result=prepare.executeQuery();
                if(result.next())
                {
                    alert=new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully login");
                    alert.showAndWait();
                    studentL.getScene().getWindow().hide();
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("StudenttFXML.fxml"));
                    Parent root=loader.load();
                    StudentController controller =loader.getController(); 
                    controller.MyFunction(fullnameL1.getText(),codeapogeeL.getText());
                    Stage stage=new Stage();
                    Scene scene=new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
                else
                {
                    alert=new Alert(AlertType.ERROR);
                    alert.setTitle("Error message");
                    alert.setHeaderText(null);
                    alert.setContentText("Incorrect name/code apogee");
                    alert.showAndWait();
                }
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void loginAccountA()
    {
        String sql;
        sql = "SELECT username,password FROM admin_info WHERE username=? and password= ?";
        connect=database.connect();
        try
        {
            if(usernameL.getText().isEmpty() || passwordL.getText().isEmpty())
            {   
                alert=new Alert(AlertType.ERROR);
                alert.setTitle("Error message");
                alert.setHeaderText(null);
                alert.setContentText("please fill all blank fields");
                alert.showAndWait();
            }
            else
            { 
                prepare=connect.prepareStatement(sql);
                prepare.setString(1,usernameL.getText());
                prepare.setString(2,passwordL.getText());
                result=prepare.executeQuery();
                if(result.next())
                {
                    alert=new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully login");
                    alert.showAndWait();
                    adminL.getScene().getWindow().hide();
                    Parent root=FXMLLoader.load(getClass().getResource("adminFXML.fxml"));
                    Stage stage=new Stage();
                    Scene scene=new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
                else
                {
                    alert=new Alert(AlertType.ERROR);
                    alert.setTitle("Error message");
                    alert.setHeaderText(null);
                    alert.setContentText("Incorrect username/password");
                    alert.showAndWait();
                }
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void switchForm(ActionEvent event)
    {
        if(event.getSource()==studentL)
        {
            studentFormL.setVisible(true);
            professorFormL.setVisible(false);
            adminFormL.setVisible(false);
        }else if(event.getSource()==profL)
        {
            studentFormL.setVisible(false);
            professorFormL.setVisible(true);
            adminFormL.setVisible(false);
        }
        else if(event.getSource()==adminL)
        {
            studentFormL.setVisible(false);
            professorFormL.setVisible(false);
            adminFormL.setVisible(true);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources){};
}






