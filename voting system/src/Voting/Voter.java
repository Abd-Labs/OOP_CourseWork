
package Voting;

import java.io.Serializable;


public class Voter implements Serializable{
    
   private String name;
   private String fatherName;
   private String CnicId;
   private String ContactNo;
   private String VoterId;
   private String Password;

    public Voter() {
    }

    public Voter(String name, String fatherName, String CnicId, String ContactNo, String VoterId, String Password) {
        this.name = name;
        this.fatherName = fatherName;
        this.CnicId = CnicId;
        this.ContactNo = ContactNo;
        this.VoterId = VoterId;
        this.Password = Password;
    }

   

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public String getFatherName() {
        return fatherName;
    }
     public void setCnicId(String CnicId) {
        this.CnicId = CnicId;
    }
    public String getCnicId() {
        return CnicId;
    }
     public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }
    public String getContactNo() {
        return ContactNo;
    }
    public void setVoterId(String VoterId) {
        this.VoterId = VoterId;
    }
    public String getVoterId() {
        return VoterId;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPassword() {
        return Password;
    }
    

    
   
   
    
}
