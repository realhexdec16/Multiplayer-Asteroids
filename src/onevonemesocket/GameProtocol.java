/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onevonemesocket;
import java.util.*;
/**
 *
 * @author jackn
 */
public class GameProtocol{
    private OnevOneMeSocket plaayball;
    private final States states;
    /**enum has nothing other than its defined enum constants 
     * (implicitly public static final)
     */
    
public enum States {
        WELCOME, MOVE, OPPONENT_MOVE, VICTORY, COCKSUCKERS
    }
public GameProtocol(States states){
    this.states=states;
}
public static void main(String[] args){
    for (States s: States.values()){
        //not sure if need dis loop
        System.out.println(s);
    }
}

    public String testingONETWOTHREEbitch(String input) {
        String outputTest=null;
        switch(states) {
            case WELCOME:
                System.out.print("WORK");
                break; //tbt
                
        }
        return " ";
    }
}
