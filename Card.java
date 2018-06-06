/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackJack;

/**
 *
 * @author userx
 */
public class Card {
        private String type;
        private int value;
          
    public  void setType(String type) {
            this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setValue(int value){
        this.value=value;
    }
    public int getValue(){
        return this.value;
    }
    public Card(){
        this.value=0;
        this.type="";
        
    }
    
    public Card(int value, String type){
        this.value=value;
        this.type=type;
    }
     //objeden override ettik.
    @Override
    public String toString() {
        return this.getType()+ " "+this.getValue();
            }
    
    
}
