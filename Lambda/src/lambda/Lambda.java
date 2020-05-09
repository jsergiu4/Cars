/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

/**
 *
 * @author Sergiu
 */
public class Lambda {
    
    String producator;
    String model;
    int an;
    int motorcapacity;      
    String tip;

    public Lambda(String producator, String model, int an, int motorcapacity, String tip) {
        this.producator = producator;
        this.model = model;
        this.an = an;
        this.motorcapacity = motorcapacity;
        this.tip = tip;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public int getMotorcapacity() {
        return motorcapacity;
    }

    public void setMotorcapacity(int motorcapacity) {
        this.motorcapacity = motorcapacity;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
    
    
    
    
}


