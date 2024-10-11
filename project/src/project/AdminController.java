/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Snow
 */
public class AdminController implements Initializable
{

    @FXML
    private TextField crud_FullName;

    @FXML
    private TextField crud_CodeApogee;

    @FXML
    private TextField crud_CNI;

    @FXML
    private Button crud_addBtn;

    @FXML
    private Button crud_updateBtn;

    @FXML
    private Button crud_clearBtn;

    @FXML
    private Button crud_deleteBtn;

    @FXML
    private ComboBox<?> crud_Groupe;

    @FXML
    private TextField crud_StudentNumber;

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
    private ComboBox<?> crud_Groupee;
    
    
    @FXML
    private AnchorPane addProfessorForm;
    @FXML
    private Button su_addProfessor;

    @FXML
    private Button su_addStudent;

    @FXML
    private AnchorPane addStudentForm;
    @FXML
    private AnchorPane main_form;
    
    
    @FXML
    private TextField crud_FullName1;

    @FXML
    private TextField crud_ProfessorID;

    @FXML
    private TextField crud_CNI1;

    @FXML
    private Button crud_addBtn1;

    @FXML
    private Button crud_updateBtn1;

    @FXML
    private Button crud_clearBtn1;

    @FXML
    private Button crud_deleteBtn1;

    @FXML
    private ComboBox<?> crud_Module;

    @FXML
    private TextField crud_ProfessorNumber;

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
    private TableColumn<professorData,String> crud_col_Groupee;

    
    @FXML
    private Button logOut_button;
    
    
    
    
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    private Alert alert;
    
    
    public void studentAddBtn()
    {
        connect = database.connect();
        try 
        {
            if (crud_StudentNumber.getText().isEmpty()
            || crud_FullName.getText().isEmpty()
            || crud_CodeApogee.getText().isEmpty()           
            || crud_CNI.getText().isEmpty()
            || crud_Groupe.getSelectionModel().getSelectedItem() == null) 
            {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            }else
            {
                String checkData = "SELECT student_number FROM student_info WHERE student_number = "
                + crud_StudentNumber.getText();
                prepare = connect.prepareStatement(checkData);
                result = prepare.executeQuery();
                if(result.next()) 
                {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Student Number:"+crud_StudentNumber.getText() + "is already taken");
                    alert.showAndWait();
               }else 
               { 
                    String insertData = "INSERT INTO student_info(student_number,full_name,code_apogee,cni,groupe,S1JAVA,S2JAVA,S3JAVA,S4JAVA,S5JAVA,S6JAVA,S7JAVA,S8JAVA,percentJAVA,scoreJAVA,S1C,S2C,S3C,S4C,S5C,S6C,S7C,S8C,percentC,scoreC)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    prepare = connect.prepareStatement(insertData);
                    prepare.setString(1,crud_StudentNumber.getText());
                    prepare.setString(2,crud_FullName.getText());
                    prepare.setString(3,crud_CodeApogee.getText());
                    prepare.setString(4,crud_CNI.getText());
                    prepare.setString(5,(String)crud_Groupe.getSelectionModel().getSelectedItem());
                    prepare.setString(6,"0");
                    prepare.setString(7,"0");
                    prepare.setString(8,"0");
                    prepare.setString(9,"0");
                    prepare.setString(10,"0");
                    prepare.setString(11,"0");
                    prepare.setString(12,"0");
                    prepare.setString(13,"0");
                    prepare.setString(14,"0");    
                    prepare.setString(15,"0");   
                    prepare.setString(16,"0");
                    prepare.setString(17,"0");
                    prepare.setString(18,"0");
                    prepare.setString(19,"0");
                    prepare.setString(20,"0");
                    prepare.setString(21,"0");
                    prepare.setString(22,"0");
                    prepare.setString(23,"0");
                    prepare.setString(24,"0");    
                    prepare.setString(25,"0"); 
                    prepare.executeUpdate();

                    studentShowData();
                }
            }
        }catch(Exception e){e.printStackTrace();}   
    } 
    private String[] gList={"A","B","C","D"};
    
    public void studentGroupeList() 
    {
        List<String> List = new ArrayList<>();
        for(String data: gList) 
        {
            List.add(data);
        }
        ObservableList listData1 = FXCollections.observableArrayList(List);
        crud_Groupe.setItems(listData1);
    }
    Stage stage=new Stage();
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
    public void studentSelectData()
    {
        studentData sData=crud_tableView.getSelectionModel().getSelectedItem();
        int num=crud_tableView.getSelectionModel().getSelectedIndex();
        if((num - 1)< -1) return;
        crud_StudentNumber.setText(String.valueOf(sData.getStudentNumber()));
        crud_FullName.setText(sData.getFullName());
        crud_CodeApogee.setText(String.valueOf(sData.getCodeApogee()));
        crud_CNI.setText(String.valueOf(sData.getCNI()));
    }
    
    
    
    public void studentUpdateBtn()
    {     
        connect = database.connect();
        try 
        {
            if(crud_StudentNumber.getText().isEmpty())
            {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait() ;
            }else
            {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to UPDATE Student Number: "
                + crud_StudentNumber.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();
                if(option.get().equals(ButtonType.OK))
                {
                    String updateData = "UPDATE student_info SET "
                    + "full_name = '" + crud_FullName.getText()
                    +"', code_apogee = '" + crud_CodeApogee.getText()
                    +"', cni = '" + crud_CNI.getText()
                    +"', groupe = '" + crud_Groupe.getSelectionModel().getSelectedItem()
                    +"' WHERE student_number = " + crud_StudentNumber.getText();
                    prepare = connect.prepareStatement(updateData);
                    prepare.executeUpdate();
                    alert = new Alert (AlertType.ERROR);
                    alert. setTitle ("Information Message");
                    alert. setHeaderText(null);
                    alert. setContentText("successfully updated!");
                    // TO UPDATE THE TABLEVIEW
                    studentShowData();
                    studentClearBtn();
                }
                else
                {
                    alert = new Alert (AlertType.ERROR);
                    alert. setTitle ("Information Message");
                    alert. setHeaderText(null);
                    alert. setContentText("Cancelled");
                    alert. showAndWait();
                }
            }
        }catch(Exception e){e.printStackTrace();}
    }

    public void studentClearBtn()
    {
        crud_StudentNumber.setText("");
        crud_FullName.setText("");
        crud_CodeApogee.setText("");
        crud_CNI.setText("");
        crud_Groupe.getSelectionModel().clearSelection();
    }

    public void studentDeleteBtn()
    {     
        connect = database.connect();
        try 
        {
            if(crud_StudentNumber.getText().isEmpty())
            {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait() ;
            }else
            {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to Delete Student Number:"
                + crud_StudentNumber.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();
                if(option.get().equals(ButtonType.OK))
                {
                    String deleteData="DELETE FROM student_info WHERE student_number ="
                            +crud_StudentNumber.getText();
                    prepare = connect.prepareStatement(deleteData);
                    prepare.executeUpdate () ;
                    alert = new Alert (AlertType.ERROR);
                    alert.setTitle ("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("successfully deleted!");
                    alert.showAndWait();
                    // TO UPDATE THE TABLEVIEW
                    studentShowData();
                    studentClearBtn();
                }
                else
                {
                    alert = new Alert (AlertType.ERROR);
                    alert.setTitle ("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Cancelled");
                    alert.showAndWait();
                }
            }
        }catch(Exception e){e.printStackTrace();}
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void professorAddBtn()
    {
        connect = database.connect();
        try 
        {
            if (crud_ProfessorNumber.getText().isEmpty()
            || crud_FullName1.getText().isEmpty()
            || crud_ProfessorID.getText().isEmpty()           
            || crud_CNI1.getText().isEmpty()
            || crud_Module.getSelectionModel().getSelectedItem() == null) 
            {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            }else
            {
                String checkData = "SELECT professor_number FROM professor_info WHERE professor_number = "
                + crud_ProfessorNumber.getText();
                prepare = connect.prepareStatement(checkData);
                result = prepare.executeQuery();
                if(result.next()) 
                {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Professor Number:"+crud_ProfessorNumber.getText() + "is already taken");
                    alert.showAndWait();
               }else 
               { 
                    String insertData = "INSERT INTO professor_info(professor_number,full_name1,professor_id,cni1,module,groupee)"
                    + "VALUES(?,?,?,?,?,?)";
                    prepare = connect.prepareStatement(insertData);
                    prepare.setString(1,crud_ProfessorNumber.getText());
                    prepare.setString(2,crud_FullName1.getText());
                    prepare.setString(3,crud_ProfessorID.getText());
                    prepare.setString(4,crud_CNI1.getText());
                    prepare.setString(5,(String)crud_Module.getSelectionModel().getSelectedItem());
                    prepare.setString(6,(String)crud_Groupee.getSelectionModel().getSelectedItem());
                    prepare.executeUpdate();

                    professorShowData();
                }
            }
        }catch(Exception e){e.printStackTrace();}   
    } 
    private String[] moduleList={"PHP ","C","JAVA","Algorithmics","Operating system","Data base"};
    
    public void professorModuleList() 
    {
        List<String> mList = new ArrayList<>();
        for(String data: moduleList) 
        {
            mList.add(data);
        }
        ObservableList listData = FXCollections.observableArrayList(mList);
        crud_Module.setItems(listData);
    }
    
    public void professorGroupeList() 
    {
        List<String> List = new ArrayList<>();
        for(String data: gList) 
        {
            List.add(data);
        }
        ObservableList listData1 = FXCollections.observableArrayList(List);
        crud_Groupee.setItems(listData1);
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
                        ,result.getInt("professor_id"),result.getInt("cni1")
                        ,result.getString("module"),result.getString("groupee"));
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
    
    public void professorSelectData()
    {
        professorData pData=crud_tableView1.getSelectionModel().getSelectedItem();
        int num=crud_tableView1.getSelectionModel().getSelectedIndex();
        if((num - 1)< -1) return;
        crud_ProfessorNumber.setText(String.valueOf(pData.getProfessorNumber()));
        crud_FullName1.setText(pData.getFullName1());
        crud_ProfessorID.setText(String.valueOf(pData.getProfessorID()));
        crud_CNI1.setText(String.valueOf(pData.getCNI1()));
    }
    
    public void professorUpdateBtn()
    {     
        connect = database.connect();
        try 
        {
            if(crud_ProfessorNumber.getText().isEmpty())
            {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait() ;
            }else
            {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to UPDATE Professor Number: "
                + crud_ProfessorNumber.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();
                if(option.get().equals(ButtonType.OK))
                {
                    String updateData = "UPDATE professor_info SET "
                    + "full_name1 = '" + crud_FullName1.getText()
                    +"', professor_id = '" + crud_ProfessorID.getText()
                    +"', cni1 = '" + crud_CNI1.getText()
                    +"', module = '" + crud_Module.getSelectionModel().getSelectedItem()
                    +"', groupee = '" + crud_Groupee.getSelectionModel().getSelectedItem()
                    +"' WHERE professor_number = " + crud_ProfessorNumber.getText();
                    prepare = connect.prepareStatement(updateData);
                    prepare.executeUpdate();
                    alert = new Alert (AlertType.ERROR);
                    alert. setTitle ("Information Message");
                    alert. setHeaderText(null);
                    alert. setContentText("successfully updated!");
                    // TO UPDATE THE TABLEVIEW
                    professorShowData();
                    professorClearBtn();
                }
                else
                {
                    alert = new Alert (AlertType.ERROR);
                    alert. setTitle ("Information Message");
                    alert. setHeaderText(null);
                    alert. setContentText("Cancelled");
                    alert. showAndWait();
                }
            }
        }catch(Exception e){e.printStackTrace();}
    }

    public void professorClearBtn()
    {
        crud_ProfessorNumber.setText("");
        crud_FullName1.setText("");
        crud_ProfessorID.setText("");
        crud_CNI1.setText("");
        crud_Module.getSelectionModel().clearSelection();
        crud_Groupee.getSelectionModel().clearSelection();
    }

    public void professorDeleteBtn()
    {     
        connect = database.connect();
        try 
        {
            if(crud_ProfessorNumber.getText().isEmpty())
            {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait() ;
            }else
            {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to Delete Professor Number:"
                + crud_ProfessorNumber.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();
                if(option.get().equals(ButtonType.OK))
                {
                    String deleteData="DELETE FROM professor_info WHERE professor_number ="
                            +crud_ProfessorNumber.getText();
                    prepare = connect.prepareStatement(deleteData);
                    prepare.executeUpdate () ;
                    alert = new Alert (AlertType.ERROR);
                    alert.setTitle ("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("successfully deleted!");
                    alert.showAndWait();
                    // TO UPDATE THE TABLEVIEW
                    professorShowData();
                    professorClearBtn();
                }
                else
                {
                    alert = new Alert (AlertType.ERROR);
                    alert.setTitle ("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Cancelled");
                    alert.showAndWait();
                }
            }
        }catch(Exception e){e.printStackTrace();}
    }
    
    public void switchForm(ActionEvent event)
    {
        if(event.getSource()==su_addProfessor)
        {
            addProfessorForm.setVisible(true);
            addStudentForm.setVisible(false);
        }else if(event.getSource()==su_addStudent)
        {
            addProfessorForm.setVisible(false);
            addStudentForm.setVisible(true);
        }
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
        professorModuleList();
        professorGroupeList();
        studentGroupeList();
    }
    
}
