/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Voting;

import java.io.Serializable;

/**
 *
 * @author Muhammad Zohaib Ali
 */
public class Vote implements Serializable {
    
    private String partyName;
    private String Votes;

    public Vote() {
    }

    
    public Vote(String partyName, String Votes) {
        this.partyName = partyName;
        this.Votes = Votes;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }
    public String getPartyName() {
        return partyName;
    }
    public void setVotes(String Votes) {
        this.Votes = Votes;
    }
    public String getVotes() {
        return Votes;
    }

    @Override
    public String toString() {
        return "Vote{" + "partyName=" + partyName + ", Votes=" + Votes + '}';
    }

    
    
    
    
}
