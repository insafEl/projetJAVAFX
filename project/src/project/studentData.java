/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author Snow
 */
public class studentData 
{
    private Integer studentNumber;
    private String fullName;
    private Integer codeApogee;
    private Integer CNI;
    private String groupe;
    private Integer S1JAVA,S2JAVA,S3JAVA,S4JAVA,S5JAVA,S6JAVA,S7JAVA,S8JAVA;
    private Integer S1C,S2C,S3C,S4C,S5C,S6C,S7C,S8C;
    public double percentJAVA,percentC;
    public double scoreJAVA,scoreC;
    public studentData(Integer studentNumber,String fullName,Integer codeApogee,Integer CNI,String groupe,
            Integer S1JAVA,Integer S2JAVA,Integer S3JAVA,Integer S4JAVA,Integer S5JAVA,Integer S6JAVA,
            Integer S7JAVA,Integer S8JAVA,double percentJAVA,double scoreJAVA,
            Integer S1C,Integer S2C,Integer S3C,Integer S4C,Integer S5C,Integer S6C,
            Integer S7C,Integer S8C,double percentC,double scoreC)
    {
        this.studentNumber=studentNumber;
        this.fullName=fullName;
        this.codeApogee=codeApogee;
        this.CNI=CNI;
        this.groupe=groupe;
        this.S1JAVA=S1JAVA;
        this.S2JAVA=S2JAVA;
        this.S3JAVA=S3JAVA;
        this.S4JAVA=S4JAVA;
        this.S5JAVA=S5JAVA;
        this.S6JAVA=S6JAVA;
        this.S7JAVA=S7JAVA;
        this.S8JAVA=S8JAVA;
        this.percentJAVA=percentJAVA;
        this.scoreJAVA=scoreJAVA;
        this.S1C=S1C;
        this.S2C=S2C;
        this.S3C=S3C;
        this.S4C=S4C;
        this.S5C=S5C;
        this.S6C=S6C;
        this.S7C=S7C;
        this.S8C=S8C;
        this.percentC=percentC;
        this.scoreC=scoreC;
    }
    public Integer getStudentNumber()
    {
        return studentNumber;
    }
    public String getFullName()
    {
        return fullName;
    }
    public Integer getCodeApogee()
    {
        return codeApogee;
    }
    public Integer getCNI()
    {
        return CNI;
    }
    public String getGroupe()
    {
        return groupe;
    }
    public Integer getS1JAVA()
    {
        return S1JAVA;
    }
    public Integer getS2JAVA()
    {
        return S2JAVA;
    }
    public Integer getS3JAVA()
    {
        return S3JAVA;
    }
    public Integer getS4JAVA()
    {
        return S4JAVA;
    }
    public Integer getS5JAVA()
    {
        return S5JAVA;
    }
    public Integer getS6JAVA()
    {
        return S6JAVA;
    }
    public Integer getS7JAVA()
    {
        return S7JAVA;
    }
    public Integer getS8JAVA()
    {
        return S8JAVA;
    }
    public double getPercentJAVA()
    {
        return percentJAVA;
    }
    public double getScoreJAVA()
    {
        return scoreJAVA;
    }
    public Integer getS1C()
    {
        return S1C;
    }
    public Integer getS2C()
    {
        return S2C;
    }
    public Integer getS3C()
    {
        return S3C;
    }
    public Integer getS4C()
    {
        return S4C;
    }
    public Integer getS5C()
    {
        return S5C;
    }
    public Integer getS6C()
    {
        return S6C;
    }
    public Integer getS7C()
    {
        return S7C;
    }
    public Integer getS8C()
    {
        return S8C;
    }
    public double getPercentC()
    {
        return percentC;
    }
    public double getScoreC()
    {
        return scoreC;
    }
}
