/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author Snow
 */
public class professorData 
{
    private Integer professorNumber;
    private String fullName;
    private Integer professorID;
    private Integer CNI;
    private String module;
    private String groupee;
    public professorData(Integer professorNumber,String fullName,Integer ProfessorID,Integer CNI,String module,String groupee)
    {
        this.professorNumber=professorNumber;
        this.fullName=fullName;
        this.professorID=ProfessorID;
        this.CNI=CNI;
        this.module=module;
        this.groupee=groupee;
    }
    public Integer getProfessorNumber()
    {
        return professorNumber;
    }
    public String getFullName1()
    {
        return fullName;
    }
    public Integer getProfessorID()
    {
        return professorID;
    }
    public Integer getCNI1()
    {
        return CNI;
    }
    public String getModule()
    {
        return module;
    }
    public String getGroupee()
    {
        return groupee;
    }
}
