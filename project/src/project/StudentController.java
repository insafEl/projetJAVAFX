/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class StudentController implements Initializable
{
    
    @FXML
    private TableView<professorData> crud_tableView1;

    @FXML
    private TableColumn<professorData,String> crud_col_ProfessorNumber;

    @FXML
    private TableColumn<professorData,String> crud_col_FullName1;

    @FXML
    private TableColumn<professorData,String> crud_col_ProfessorID;

    @FXML
    private TableColumn<professorData,String> crud_col_CNI1;

    @FXML
    private TableColumn<professorData,String> crud_col_Module;
    @FXML
    private TableColumn<studentData,String> crud_col_Groupee;
    
    
    @FXML
    private TableView<studentData> crud_tableView;
    @FXML
    private TableColumn<studentData,String> crud_col_StudentNumber;

    @FXML
    private TableColumn<studentData,String> crud_col_FullName;

    @FXML
    private TableColumn<studentData,String> crud_col_CodeApogee;

    @FXML
    private TableColumn<studentData,String> crud_col_CNI;

    @FXML
    private TableColumn<studentData,String> crud_col_Groupe;
    
    
    @FXML
    private TableView<studentData> crud_tableViewJAVA;

    @FXML
    private TableColumn<studentData,String> crud_col_S1J;
    
    @FXML
    private TableColumn<studentData,String> crud_col_S2J;

    @FXML
    private TableColumn<studentData,String> crud_col_S3J;

    @FXML
    private TableColumn<studentData,String> crud_col_S4J;

    @FXML
    private TableColumn<studentData,String> crud_col_S5J;

    @FXML
    private TableColumn<studentData,String> crud_col_S6J;

    @FXML
    private TableColumn<studentData,String> crud_col_S7J;

    @FXML
    private TableColumn<studentData,String> crud_col_S8J;
    
    @FXML
    private TableColumn<studentData,String> crud_col_PercentJ;
    
    @FXML
    private TableColumn<studentData,String> crud_col_ScoreJ;
    
    
    
    @FXML
    private TableView<studentData> crud_tableViewC;
    @FXML
    private TableColumn<studentData,String> crud_col_S1C;
    
    @FXML
    private TableColumn<studentData,String> crud_col_S2C;

    @FXML
    private TableColumn<studentData,String> crud_col_S3C;

    @FXML
    private TableColumn<studentData,String> crud_col_S4C;

    @FXML
    private TableColumn<studentData,String> crud_col_S5C;

    @FXML
    private TableColumn<studentData,String> crud_col_S6C;

    @FXML
    private TableColumn<studentData,String> crud_col_S7C;

    @FXML
    private TableColumn<studentData,String> crud_col_S8C;
    
    @FXML
    private TableColumn<studentData,String> crud_col_PercentC;
    
    @FXML
    private TableColumn<studentData,String> crud_col_ScoreC;
    
    
    
    
    @FXML
    private TextField setfullname;

    @FXML
    private TextField setcodeapogee;
    
   
    @FXML
    private Button students_info;

    @FXML
    private Button professors_info;

    @FXML
    private AnchorPane your_infoForm;
    
    @FXML
    private AnchorPane addProfessorForm;
    
    @FXML
    private Button Semester1;

    @FXML
    private Button Semester2;

    @FXML
    private Button Semester3;

    @FXML
    private Button Semester4;

    @FXML
    private Button Semester5;

    @FXML
    private Button Semester6;

     @FXML
    private ImageView imageview;
    
    
    @FXML
    private Button Schedules_button;
    @FXML
    private AnchorPane scheduleForm;
    
    @FXML
    private Button logOut_button;
    
    @FXML
    private TextField crud_course;
    
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    
    private String fullnameText;
    private boolean myFunctionExecuted = false;
    
    public void MyFunction(String fullname, String codeapogee)
    {
        setfullname.setText(fullname);
        setcodeapogee.setText(codeapogee);
        fullnameText = setfullname.getText();
        System.out.print(fullnameText);
        myFunctionExecuted = true;
    }
    public ObservableList<studentData> studentListData()
    {
        System.out.print(fullnameText);
        ObservableList<studentData> listData=FXCollections.observableArrayList();
        String selectData="SELECT * FROM student_info";
        connect=database.connect();
        try
        {
            prepare=connect.prepareStatement(selectData);
            result=prepare.executeQuery();
            studentData sData;
            while(result.next())
            {
                    sData= new studentData(result.getInt("student_number"),result.getString("full_name")
                        ,result.getInt("code_apogee"),result.getInt("cni"),result.getString("groupe")
                        ,result.getInt("S1JAVA"),result.getInt("S2JAVA"),
                        result.getInt("S3JAVA"),result.getInt("S4JAVA")
                        ,result.getInt("S5JAVA"),result.getInt("S6JAVA"),
                        result.getInt("S7JAVA"),result.getInt("S8JAVA"),
                        result.getDouble("percentJAVA"),result.getDouble("scoreJAVA")
                        ,result.getInt("S1C"),result.getInt("S2C"),
                        result.getInt("S3C"),result.getInt("S4C")
                        ,result.getInt("S5C"),result.getInt("S6C"),
                        result.getInt("S7C"),result.getInt("S8C"),
                        result.getDouble("percentC"),result.getDouble("scoreC"));
                    listData.add(sData);
                
            }
        }catch(Exception e){e.printStackTrace();}
        return listData;
    }
    
    private ObservableList<studentData> studentData;
    public void studentShowData()
    {
        studentData=studentListData();
        crud_col_StudentNumber.setCellValueFactory(new PropertyValueFactory<>("studentNumber"));
        crud_col_FullName.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        crud_col_CodeApogee.setCellValueFactory(new PropertyValueFactory<>("codeApogee"));
        crud_col_CNI.setCellValueFactory(new PropertyValueFactory<>("CNI"));
        crud_col_Groupe.setCellValueFactory(new PropertyValueFactory<>("groupe"));
        crud_tableView.setItems(studentData);
    }
    
    private ObservableList<studentData> studentDataC;
    public void studentShowCData()
    {
        studentDataC=studentListData();
        crud_col_ScoreC.setCellValueFactory(new PropertyValueFactory<>("scoreC"));
        crud_col_S1C.setCellValueFactory(new PropertyValueFactory<>("S1C"));
        crud_col_S2C.setCellValueFactory(new PropertyValueFactory<>("S2C"));
        crud_col_S3C.setCellValueFactory(new PropertyValueFactory<>("S3C"));
        crud_col_S4C.setCellValueFactory(new PropertyValueFactory<>("S4C"));
        crud_col_S5C.setCellValueFactory(new PropertyValueFactory<>("S5C"));
        crud_col_S6C.setCellValueFactory(new PropertyValueFactory<>("S6C"));
        crud_col_S7C.setCellValueFactory(new PropertyValueFactory<>("S7C"));
        crud_col_S8C.setCellValueFactory(new PropertyValueFactory<>("S8C"));
        crud_col_PercentC.setCellValueFactory(new PropertyValueFactory<>("percentC"));
        crud_tableViewC.setItems(studentDataC);
    }
    private ObservableList<studentData> studentDataJAVA;
    public void studentShowJAVAData()
    {
        studentDataJAVA=studentListData();
        crud_col_ScoreJ.setCellValueFactory(new PropertyValueFactory<>("scoreJAVA"));
        crud_col_S1J.setCellValueFactory(new PropertyValueFactory<>("S1JAVA"));
        crud_col_S2J.setCellValueFactory(new PropertyValueFactory<>("S2JAVA"));
        crud_col_S3J.setCellValueFactory(new PropertyValueFactory<>("S3JAVA"));
        crud_col_S4J.setCellValueFactory(new PropertyValueFactory<>("S4JAVA"));
        crud_col_S5J.setCellValueFactory(new PropertyValueFactory<>("S5JAVA"));
        crud_col_S6J.setCellValueFactory(new PropertyValueFactory<>("S6JAVA"));
        crud_col_S7J.setCellValueFactory(new PropertyValueFactory<>("S7JAVA"));
        crud_col_S8J.setCellValueFactory(new PropertyValueFactory<>("S8JAVA"));
        crud_col_PercentJ.setCellValueFactory(new PropertyValueFactory<>("percentJAVA"));
        crud_tableViewJAVA.setItems(studentDataJAVA);
    }
    
    public ObservableList<professorData> professorListData()
    {
        ObservableList<professorData> listData=FXCollections.observableArrayList();
        String selectData="SELECT * FROM professor_info";
        connect=database.connect();
        try
        {
            prepare=connect.prepareStatement(selectData);
            result=prepare.executeQuery();
            professorData pData;
            while(result.next())
            {
                pData= new professorData(result.getInt("professor_number"),result.getString("full_name1")
                        ,result.getInt("professor_id"),result.getInt("cni1"),
                        result.getString("module"),result.getString("groupee"));
                listData.add(pData);
            }
        }catch(Exception e){e.printStackTrace();}
        return listData;
    }
    private ObservableList<professorData> professorData;
    public void professorShowData()
    {
        professorData=professorListData();
        crud_col_ProfessorNumber.setCellValueFactory(new PropertyValueFactory<>("professorNumber"));
        crud_col_FullName1.setCellValueFactory(new PropertyValueFactory<>("fullName1"));
        crud_col_ProfessorID.setCellValueFactory(new PropertyValueFactory<>("professorID"));
        crud_col_CNI1.setCellValueFactory(new PropertyValueFactory<>("CNI1"));
        crud_col_Module.setCellValueFactory(new PropertyValueFactory<>("module"));
        crud_col_Groupee.setCellValueFactory(new PropertyValueFactory<>("groupee"));
        crud_tableView1.setItems(professorData);
    }
    
    public void switchForm(ActionEvent event)
    {
        if(event.getSource()==students_info)
        {
            your_infoForm.setVisible(true);
            addProfessorForm.setVisible(false);
            scheduleForm.setVisible(false);
        }else if(event.getSource()==professors_info)
        {
            addProfessorForm.setVisible(true);
            your_infoForm.setVisible(false);
            scheduleForm.setVisible(false);
        }else if(event.getSource()==Schedules_button)
        {
            addProfessorForm.setVisible(false);
            your_infoForm.setVisible(false);
            scheduleForm.setVisible(true);
        }
    }
    
    public void switchToSemester1(ActionEvent event)
    {
       Image image=new Image("/Schedules/S1.jpg");
       imageview.setImage(image);
    }
    public void switchToSemester2(ActionEvent event)
    {
       Image image=new Image("/Schedules/S2.jpg");
       imageview.setImage(image);
    }
    public void switchToSemester3(ActionEvent event)
    {
       Image image=new Image("/Schedules/S3.jpg");
       imageview.setImage(image);
    }
    public void switchToSemester4(ActionEvent event)
    {
       Image image=new Image("/Schedules/S4.jpg");
       imageview.setImage(image);
    }
    public void switchToSemester5(ActionEvent event)
    {
       Image image=new Image("/Schedules/S5.jpg");
       imageview.setImage(image);
    }
    public void switchToSemester6(ActionEvent event)
    {
       Image image=new Image("/Schedules/S6.jpg");
       imageview.setImage(image);
    }
    public void logOut() throws IOException
    {
        logOut_button.getScene().getWindow().hide();
        Parent root=FXMLLoader.load(getClass().getResource("LoginFXML.fxml"));
        Stage stage=new Stage();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void display()
    {
        if(crud_course.getText().equals("JAVA"))
        {
            crud_tableViewC.setVisible(false);
            crud_tableViewJAVA.setVisible(true);
        }
        else if(crud_course.getText().equals("C"))
        {
            crud_tableViewJAVA.setVisible(false);
            crud_tableViewC.setVisible(true);
        }
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) 
    {
        /*while(true)
        {
            if(myFunctionExecuted)
            {
                studentShowData();
                break;
            }
        }*/
        studentShowCData();
        studentShowData();
        studentShowJAVAData();
        professorShowData();
    }

}
