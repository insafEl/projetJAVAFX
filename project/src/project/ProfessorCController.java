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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class ProfessorCController implements Initializable
{
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
    private Button students_info;

    @FXML
    private Button professors_info;

    @FXML
    private AnchorPane addStudentForm;
    
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
    private AnchorPane groupForm;
     @FXML
    private Button Groups_button;
    @FXML
    private Button GB;
    @FXML
    private Button GA;
    @FXML
    private Button GC;
    @FXML
    private Button GD;
    @FXML
    private Button GD1;
    
    @FXML
    private TextField crud_S8;

    @FXML
    private TextField crud_S7;

    @FXML
    private TextField crud_S6;
    
    @FXML
    private TextField crud_S5;

    @FXML
    private TextField crud_S4;

    @FXML
    private TextField crud_S3;

    @FXML
    private TextField crud_S2;

    @FXML
    private TextField crud_S1;
    @FXML
    private TextField crud_Number;
    
    
    
    
    @FXML
    private AnchorPane groupAForm;
    
    @FXML
    private TableView<studentData> c_tableViewA;
    
    @FXML
    private TableColumn<studentData,String> col_FullNameA;

    @FXML
    private TableColumn<studentData,String> col_Number;
    
    @FXML
    private TableColumn<studentData,String> col_S1;
    
    @FXML
    private TableColumn<studentData,String> col_S2;

    @FXML
    private TableColumn<studentData,String> col_S3;

    @FXML
    private TableColumn<studentData,String> col_S4;

    @FXML
    private TableColumn<studentData,String> col_S5;

    @FXML
    private TableColumn<studentData,String> col_S6;

    @FXML
    private TableColumn<studentData,String> col_S7;

    @FXML
    private TableColumn<studentData,String> col_S8;
    
    @FXML
    private TableColumn<studentData,String> col_Percent;
    
    
    
    @FXML
    private AnchorPane groupBForm;

    @FXML
    private TableView<studentData> c_tableViewB;
    @FXML
    private TableColumn<studentData,String> col_FullNameB;
    
    @FXML
    private TableColumn<studentData,String> col_S11;

    @FXML
    private TableColumn<studentData,String> col_S21;

    @FXML
    private TableColumn<studentData,String> col_S31;

    @FXML
    private TableColumn<studentData,String> col_S41;

    @FXML
    private TableColumn<studentData,String> col_S51;

    @FXML
    private TableColumn<studentData,String> col_S61;

    @FXML
    private TableColumn<studentData,String> col_S71;

    @FXML
    private TableColumn<studentData,String> col_S81;
    @FXML
    private TableColumn<studentData,String> col_Percent1;
    @FXML
    private TableColumn<studentData,String> col_Number1;
    
    @FXML
    private AnchorPane groupCForm;

    @FXML
    private TableView<studentData> c_tableViewC;
    @FXML
    private TableColumn<studentData,String> col_FullNameC;
    
    @FXML
    private TableColumn<studentData,String> col_S111;

    @FXML
    private TableColumn<studentData,String> col_S211;

    @FXML
    private TableColumn<studentData,String> col_S311;

    @FXML
    private TableColumn<studentData,String> col_S411;

    @FXML
    private TableColumn<studentData,String> col_S511;

    @FXML
    private TableColumn<studentData,String> col_S611;

    @FXML
    private TableColumn<studentData,String> col_S711;

    @FXML
    private TableColumn<studentData,String> col_S811;
    @FXML
    private TableColumn<studentData,String> col_Percent11;
    @FXML
    private TableColumn<studentData,String> col_Number11;
    
    @FXML
    private AnchorPane groupDForm;

    @FXML
    private TableView<studentData> c_tableViewD;
    @FXML
    private TableColumn<studentData,String> col_FullNameD;
    
    @FXML
    private TableColumn<studentData,String> col_S1111;

    @FXML
    private TableColumn<studentData,String> col_S2111;

    @FXML
    private TableColumn<studentData,String> col_S3111;

    @FXML
    private TableColumn<studentData,String> col_S4111;

    @FXML
    private TableColumn<studentData,String> col_S5111;

    @FXML
    private TableColumn<studentData,String> col_S6111;

    @FXML
    private TableColumn<studentData,String> col_S7111;

    @FXML
    private TableColumn<studentData,String> col_S8111;
    @FXML
    private TableColumn<studentData,String> col_Percent111;
    @FXML
    private TableColumn<studentData,String> col_Number111;
    
    
    @FXML
    private TextField crud_A;
    @FXML
    private TextField crud_B;
    @FXML
    private TextField crud_C;
    @FXML
    private TextField crud_D;
    @FXML
    private TextField crud_V;
      
    @FXML
    private Button logOut_button;
    
    
    @FXML
    private Button add_score;
    @FXML
    private TextField crud_score;
    @FXML
    private TextField crud_n;
    @FXML
    private TableColumn<studentData,String> crud_col_Score;
    
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    
 
    private double a=1;
    private double b=0;
    private double c=0;
    private double d=0;
    private double NGA;
    private double NGB;
    private double NGC;
    private double NGD;
    public ObservableList<studentData> studentListData()
    {
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
                if(result.getString("groupe").equals("A"))
                    a++;
                if(result.getString("groupe").equals("B"))
                    b++;
                if(result.getString("groupe").equals("C"))
                    c++;
                if(result.getString("groupe").equals("D"))
                    d++;
            }
            NGA=a;
            NGB=b;
            NGC=c;
            NGD=d;
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
        crud_col_Score.setCellValueFactory(new PropertyValueFactory<>("scoreC"));
        crud_tableView.setItems(studentData);
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
            addStudentForm.setVisible(true);
            addProfessorForm.setVisible(false);
            scheduleForm.setVisible(false);
            groupForm.setVisible(false);
        }else if(event.getSource()==professors_info)
        {
            addProfessorForm.setVisible(true);
            addStudentForm.setVisible(false);
            scheduleForm.setVisible(false);
            groupForm.setVisible(false);
        }else if(event.getSource()==Schedules_button)
        {
            addProfessorForm.setVisible(false);
            addStudentForm.setVisible(false);
            scheduleForm.setVisible(true);
            groupForm.setVisible(false);
        }else if(event.getSource()==Groups_button)
        {
            addProfessorForm.setVisible(false);
            addStudentForm.setVisible(false);
            scheduleForm.setVisible(false);
            groupForm.setVisible(true);
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
    Alert alert;
    public void switchGroup(ActionEvent event) throws SQLException
    {
        if(event.getSource()==GA)
        {
            String checkDataA = "SELECT professor_id FROM professor_info WHERE groupee='A' AND module='C'";
            prepare = connect.prepareStatement(checkDataA);
            result = prepare.executeQuery();
            if(result.next()) 
            {
                if(crud_V.getText().isEmpty()) 
                {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Please enter your id");
                    alert.showAndWait();
                }else
                {
                    if(crud_V.getText().equals(result.getString("professor_id")))
                    {
                        alert=new Alert(AlertType.INFORMATION);
                        alert.setTitle("Information message");
                        alert.setHeaderText(null);
                        alert.setContentText("Correct id for group A");
                        alert.showAndWait();
                        groupAForm.setVisible(true);
                        groupBForm.setVisible(false);
                        groupCForm.setVisible(false);
                        groupDForm.setVisible(false);
                    }
                    else
                    {
                        alert = new Alert(AlertType.ERROR);
                        alert.setTitle("Error Message");
                        alert.setHeaderText(null);
                        alert.setContentText("wrong id!!");
                        alert.showAndWait();
                    }
                }
            }
        }
        if(event.getSource()==GB)
        {
            String checkDataB = "SELECT professor_id FROM professor_info WHERE groupee='B' AND module='C'";
            prepare = connect.prepareStatement(checkDataB);
            result = prepare.executeQuery();
            if(result.next()) 
            {
                if(crud_V.getText().isEmpty()) 
                {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Please enter your id");
                    alert.showAndWait();
                }else
                {
                    if(crud_V.getText().equals(result.getString("professor_id")))
                    {
                        alert=new Alert(AlertType.INFORMATION);
                        alert.setTitle("Information message");
                        alert.setHeaderText(null);
                        alert.setContentText("Correct id for group B");
                        alert.showAndWait();
                        groupAForm.setVisible(false);
                        groupBForm.setVisible(true);
                        groupCForm.setVisible(false);
                        groupDForm.setVisible(false);
                    }
                    else
                    {
                        alert = new Alert(AlertType.ERROR);
                        alert.setTitle("Error Message");
                        alert.setHeaderText(null);
                        alert.setContentText("wrong id!!");
                        alert.showAndWait();
                    }
                }
            }
        }
        if(event.getSource()==GD)
        {
            String checkDataD = "SELECT professor_id FROM professor_info WHERE groupee='D' AND module='C'";
            prepare = connect.prepareStatement(checkDataD);
            result = prepare.executeQuery();
            if(result.next()) 
            {
                if(crud_V.getText().isEmpty()) 
                {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Please enter your id");
                    alert.showAndWait();
                }else
                {
                    if(crud_V.getText().equals(result.getString("professor_id")))
                    {
                        alert=new Alert(AlertType.INFORMATION);
                        alert.setTitle("Information message");
                        alert.setHeaderText(null);
                        alert.setContentText("Correct id for group D");
                        alert.showAndWait();
                        groupAForm.setVisible(false);
                        groupBForm.setVisible(false);
                        groupCForm.setVisible(false);
                        groupDForm.setVisible(true);
                    }
                    else
                    {
                        alert = new Alert(AlertType.ERROR);
                        alert.setTitle("Error Message");
                        alert.setHeaderText(null);
                        alert.setContentText("wrong id!!");
                        alert.showAndWait();
                    }
                }
            }
        }
        if(event.getSource()==GD1)
        {
            String checkDataC = "SELECT professor_id FROM professor_info WHERE groupee='C' AND module='C'";
                prepare = connect.prepareStatement(checkDataC);
                result = prepare.executeQuery();
                if(result.next()) 
                {
                    if(crud_V.getText().isEmpty()) 
                    {
                        alert = new Alert(AlertType.ERROR);
                        alert.setTitle("Error Message");
                        alert.setHeaderText(null);
                        alert.setContentText("Please enter your id");
                        alert.showAndWait();
                    }else
                    {
                        if(crud_V.getText().equals(result.getString("professor_id")))
                        {
                            alert=new Alert(AlertType.INFORMATION);
                            alert.setTitle("Information message");
                            alert.setHeaderText(null);
                            alert.setContentText("Correct id for group C");
                            alert.showAndWait();
                            groupAForm.setVisible(false);
                            groupBForm.setVisible(false);
                            groupCForm.setVisible(true);
                            groupDForm.setVisible(false);
                        }
                        else
                        {
                            alert = new Alert(AlertType.ERROR);
                            alert.setTitle("Error Message");
                            alert.setHeaderText(null);
                            alert.setContentText("wrong id!!");
                            alert.showAndWait();
                        }
                    }
                }
        }
    }
    
    double[] tab=new double[50];
    private double v;
    private double PA=0;
    private double PB=0;
    private double PC=0;
    private double PD=0;
    public ObservableList<studentData> studentListAData()
    {
        ObservableList<studentData> listData=FXCollections.observableArrayList();
        String selectData="SELECT * FROM student_info WHERE groupe='A'";
        connect=database.connect();
        try
        {
            prepare=connect.prepareStatement(selectData);
            result=prepare.executeQuery();
            studentData sData;
            while(result.next())
            {
                    v=(result.getInt("S1C")+result.getInt("S2C")+
                        result.getInt("S3C")+result.getInt("S4C")+
                        result.getInt("S5C")+result.getInt("S6C")+
                        result.getInt("S7C")+result.getInt("S8C"))*100;
                    tab[result.getInt("student_number")]=v/8;
                    PA=PA+tab[result.getInt("student_number")];
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
            PA=PA/NGA;
        }catch(Exception e){e.printStackTrace();}
        return listData;
    }
    
    public ObservableList<studentData> studentListBData()
    {
        ObservableList<studentData> listData=FXCollections.observableArrayList();
        String selectData="SELECT * FROM student_info WHERE groupe='B'";
        connect=database.connect();
        try
        {
            prepare=connect.prepareStatement(selectData);
            result=prepare.executeQuery();
            studentData sData;
            while(result.next())
            {
                        v=(result.getInt("S1C")+result.getInt("S2C")+
                        result.getInt("S3C")+result.getInt("S4C")+
                        result.getInt("S5C")+result.getInt("S6C")+
                        result.getInt("S7C")+result.getInt("S8C"))*100;
                        tab[result.getInt("student_number")]=v/8;
                        PB=PB+tab[result.getInt("student_number")];
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
            PB=PB/NGB;
        }catch(Exception e){e.printStackTrace();}
        return listData;
    }
    public ObservableList<studentData> studentListCData()
    {
        ObservableList<studentData> listData=FXCollections.observableArrayList();
        String selectData="SELECT * FROM student_info WHERE groupe='C'";
        connect=database.connect();
        try
        {
            prepare=connect.prepareStatement(selectData);
            result=prepare.executeQuery();
            studentData sData;
            while(result.next())
            {
                        v=(result.getInt("S1C")+result.getInt("S2C")+
                        result.getInt("S3C")+result.getInt("S4C")+
                        result.getInt("S5C")+result.getInt("S6C")+
                        result.getInt("S7C")+result.getInt("S8C"))*100;
                        tab[result.getInt("student_number")]=v/8;
                        PC=PC+tab[result.getInt("student_number")];
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
            PC=PC/NGC;
        }catch(Exception e){e.printStackTrace();}
        return listData;
    }
    public ObservableList<studentData> studentListDData()
    {
        ObservableList<studentData> listData=FXCollections.observableArrayList();
        String selectData="SELECT * FROM student_info WHERE groupe='D'";
        connect=database.connect();
        try
        {
            prepare=connect.prepareStatement(selectData);
            result=prepare.executeQuery();
            studentData sData;
            while(result.next())
            {
                        v=(result.getInt("S1C")+result.getInt("S2C")+
                        result.getInt("S3C")+result.getInt("S4C")+
                        result.getInt("S5C")+result.getInt("S6C")+
                        result.getInt("S7C")+result.getInt("S8C"))*100;
                        tab[result.getInt("student_number")]=v/8;
                        PD=PD+tab[result.getInt("student_number")];
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
            PD=PD/NGD;
        }catch(Exception e){e.printStackTrace();}
        return listData;
    }
    private ObservableList<studentData> studentDataa;
    private ObservableList<studentData> studentDatab;
    private ObservableList<studentData> studentDatac;
    private ObservableList<studentData> studentDatad;
    public void studentShowA()
    {
        studentDataa=studentListAData();
        col_Number.setCellValueFactory(new PropertyValueFactory<>("studentNumber"));
        col_FullNameA.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        col_S1.setCellValueFactory(new PropertyValueFactory<>("S1C"));
        col_S2.setCellValueFactory(new PropertyValueFactory<>("S2C"));
        col_S3.setCellValueFactory(new PropertyValueFactory<>("S3C"));
        col_S4.setCellValueFactory(new PropertyValueFactory<>("S4C"));
        col_S5.setCellValueFactory(new PropertyValueFactory<>("S5C"));
        col_S6.setCellValueFactory(new PropertyValueFactory<>("S6C"));
        col_S7.setCellValueFactory(new PropertyValueFactory<>("S7C"));
        col_S8.setCellValueFactory(new PropertyValueFactory<>("S8C"));
        col_Percent.setCellValueFactory(new PropertyValueFactory<>("percentC"));
        c_tableViewA.setItems(studentDataa);
    }
    public void studentShowB()
    {
        studentDatab=studentListBData();
        col_Number1.setCellValueFactory(new PropertyValueFactory<>("studentNumber"));
        col_FullNameB.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        col_S11.setCellValueFactory(new PropertyValueFactory<>("S1C"));
        col_S21.setCellValueFactory(new PropertyValueFactory<>("S2C"));
        col_S31.setCellValueFactory(new PropertyValueFactory<>("S3C"));
        col_S41.setCellValueFactory(new PropertyValueFactory<>("S4C"));
        col_S51.setCellValueFactory(new PropertyValueFactory<>("S5C"));
        col_S61.setCellValueFactory(new PropertyValueFactory<>("S6C"));
        col_S71.setCellValueFactory(new PropertyValueFactory<>("S7C"));
        col_S81.setCellValueFactory(new PropertyValueFactory<>("S8C"));
        col_Percent1.setCellValueFactory(new PropertyValueFactory<>("percentC"));
        c_tableViewB.setItems(studentDatab);
    }
    public void studentShowC()
    {
        studentDatac=studentListCData();
        col_Number11.setCellValueFactory(new PropertyValueFactory<>("studentNumber"));
        col_FullNameC.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        col_S111.setCellValueFactory(new PropertyValueFactory<>("S1C"));
        col_S211.setCellValueFactory(new PropertyValueFactory<>("S2C"));
        col_S311.setCellValueFactory(new PropertyValueFactory<>("S3C"));
        col_S411.setCellValueFactory(new PropertyValueFactory<>("S4C"));
        col_S511.setCellValueFactory(new PropertyValueFactory<>("S5C"));
        col_S611.setCellValueFactory(new PropertyValueFactory<>("S6C"));
        col_S711.setCellValueFactory(new PropertyValueFactory<>("S7C"));
        col_S811.setCellValueFactory(new PropertyValueFactory<>("S8C"));
        col_Percent11.setCellValueFactory(new PropertyValueFactory<>("percentC"));
        c_tableViewC.setItems(studentDatac);
    }
    public void studentShowD()
    {
        studentDatad=studentListDData();
        col_Number111.setCellValueFactory(new PropertyValueFactory<>("studentNumber"));
        col_FullNameD.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        col_S1111.setCellValueFactory(new PropertyValueFactory<>("S1C"));
        col_S2111.setCellValueFactory(new PropertyValueFactory<>("S2C"));
        col_S3111.setCellValueFactory(new PropertyValueFactory<>("S3C"));
        col_S4111.setCellValueFactory(new PropertyValueFactory<>("S4C"));
        col_S5111.setCellValueFactory(new PropertyValueFactory<>("S5C"));
        col_S6111.setCellValueFactory(new PropertyValueFactory<>("S6C"));
        col_S7111.setCellValueFactory(new PropertyValueFactory<>("S7C"));
        col_S8111.setCellValueFactory(new PropertyValueFactory<>("S8C"));
        col_Percent111.setCellValueFactory(new PropertyValueFactory<>("percentC"));
        c_tableViewD.setItems(studentDatad);
    }
    public void SelectDataA()
    {
        studentData sData=c_tableViewA.getSelectionModel().getSelectedItem();
        int num=c_tableViewA.getSelectionModel().getSelectedIndex();
        if((num - 1)< -1) return;
        crud_Number.setText(String.valueOf(sData.getStudentNumber()));
        crud_S1.setText(String.valueOf(sData.getS1C()));
        crud_S2.setText(String.valueOf(sData.getS2C()));
        crud_S3.setText(String.valueOf(sData.getS3C()));
        crud_S4.setText(String.valueOf(sData.getS4C()));
        crud_S5.setText(String.valueOf(sData.getS5C()));
        crud_S6.setText(String.valueOf(sData.getS6C()));
        crud_S7.setText(String.valueOf(sData.getS7C()));
        crud_S8.setText(String.valueOf(sData.getS8C()));
    }
    public void SelectDataB()
    {
        studentData sData=c_tableViewB.getSelectionModel().getSelectedItem();
        int num=c_tableViewB.getSelectionModel().getSelectedIndex();
        if((num - 1)< -1) return;
        crud_Number.setText(String.valueOf(sData.getStudentNumber()));
        crud_S1.setText(String.valueOf(sData.getS1C()));
        crud_S2.setText(String.valueOf(sData.getS2C()));
        crud_S3.setText(String.valueOf(sData.getS3C()));
        crud_S4.setText(String.valueOf(sData.getS4C()));
        crud_S5.setText(String.valueOf(sData.getS5C()));
        crud_S6.setText(String.valueOf(sData.getS6C()));
        crud_S7.setText(String.valueOf(sData.getS7C()));
        crud_S8.setText(String.valueOf(sData.getS8C()));
    }
    public void SelectDataC()
    {
        studentData sData=c_tableViewC.getSelectionModel().getSelectedItem();
        int num=c_tableViewC.getSelectionModel().getSelectedIndex();
        if((num - 1)< -1) return;
        crud_Number.setText(String.valueOf(sData.getStudentNumber()));
        crud_S1.setText(String.valueOf(sData.getS1C()));
        crud_S2.setText(String.valueOf(sData.getS2C()));
        crud_S3.setText(String.valueOf(sData.getS3C()));
        crud_S4.setText(String.valueOf(sData.getS4C()));
        crud_S5.setText(String.valueOf(sData.getS5C()));
        crud_S6.setText(String.valueOf(sData.getS6C()));
        crud_S7.setText(String.valueOf(sData.getS7C()));
        crud_S8.setText(String.valueOf(sData.getS8C()));
    }
    public void SelectDataD()
    {
        studentData sData=c_tableViewD.getSelectionModel().getSelectedItem();
        int num=c_tableViewD.getSelectionModel().getSelectedIndex();
        if((num - 1)< -1) return;
        crud_Number.setText(String.valueOf(sData.getStudentNumber()));
        crud_S1.setText(String.valueOf(sData.getS1C()));
        crud_S2.setText(String.valueOf(sData.getS2C()));
        crud_S3.setText(String.valueOf(sData.getS3C()));
        crud_S4.setText(String.valueOf(sData.getS4C()));
        crud_S5.setText(String.valueOf(sData.getS5C()));
        crud_S6.setText(String.valueOf(sData.getS6C()));
        crud_S7.setText(String.valueOf(sData.getS7C()));
        crud_S8.setText(String.valueOf(sData.getS8C()));
    }
    public void UpdateBtn()
    {     
        connect = database.connect();
        try 
        {
            Alert alert;
            if(crud_Number.getText().isEmpty())
            {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please select a student");
                alert.showAndWait() ;
            }else
            {
                String updateData;
                updateData = "UPDATE student_info SET "
                        + "S1C = '" + crud_S1.getText()
                        + "', S2C = '" + crud_S2.getText()
                        + "', S3C = '" + crud_S3.getText()
                        + "', S4C = '" + crud_S4.getText()
                        + "', S5C = '" + crud_S5.getText()
                        + "', S6C = '" + crud_S6.getText()
                        + "', S7C = '" + crud_S7.getText()
                        + "', S8C = '" + crud_S8.getText()
                        +"' WHERE student_number = " + crud_Number.getText();
                prepare = connect.prepareStatement(updateData);
                prepare.executeUpdate();
                studentShowA();
                studentShowB();
                studentShowC();
                studentShowD();
                ClearBtn();
            }
        }catch(Exception e){e.printStackTrace();}
    }
    public void PercentageBtn()
    {     
        connect = database.connect();
        try 
        {
            Alert alert;
            if(crud_Number.getText().isEmpty())
            {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please select a student");
                alert.showAndWait() ;
            }else
            {
                String updateData;
                updateData = "UPDATE student_info SET "
                        + "percentC = '" + getPercentage()
                        +"' WHERE student_number = " + crud_Number.getText();
                prepare = connect.prepareStatement(updateData);
                prepare.executeUpdate();
                studentShowA();
                studentShowB();
                studentShowC();
                studentShowD();
                ClearBtn();
            }
        }catch(Exception e){e.printStackTrace();}
    }
    public void PercentageBtnA()
    {     
        System.out.println(PA);
        crud_A.setText(String.valueOf(PA));
    }
    public void PercentageBtnB()
    {     
        System.out.println(PB);
        crud_B.setText(String.valueOf(PB));
    }
    public void PercentageBtnC()
    {     
        crud_C.setText(String.valueOf(PC));
    }
    public void PercentageBtnD()
    {     
        crud_D.setText(String.valueOf(PD));
    }
    private double getPercentage() 
    {
        return tab[Integer.parseInt(crud_Number.getText())];
    }
    public void ClearBtn()
    {
        crud_Number.setText("");
        crud_S1.setText("");
        crud_S2.setText("");
        crud_S3.setText("");
        crud_S4.setText("");
        crud_S5.setText("");
        crud_S6.setText("");
        crud_S7.setText("");
        crud_S8.setText("");
    }
    
    public void AddScore() throws SQLException
    {
        String updateData;
        updateData = "UPDATE student_info SET "
                    + "scoreC = '" + crud_score.getText()
                    +"' WHERE student_number = " + crud_n.getText();
        prepare = connect.prepareStatement(updateData);
        prepare.executeUpdate();
        studentShowData();
        ClearBtnScore();
    }
    public void ClearBtnScore()
    {
        crud_n.setText("");
        crud_score.setText("");
    }
    public void SelectDataa()
    {
        studentData Dataaa=crud_tableView.getSelectionModel().getSelectedItem();
        int num=crud_tableView.getSelectionModel().getSelectedIndex();
        if((num - 1)< -1) return;
        crud_n.setText(String.valueOf(Dataaa.getStudentNumber()));
        crud_score.setText(String.valueOf(Dataaa.getScoreC()));
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
    
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) 
    {
        studentShowData();
        professorShowData();      
        studentShowA();
        studentShowB();
        studentShowC();
        studentShowD();
    }

}
