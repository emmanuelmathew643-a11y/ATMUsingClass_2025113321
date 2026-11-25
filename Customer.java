/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmusingclass;

/**
 *
 * @author Thinkpad T480
 */
public class Customer {
    
    private String name;
    private int pin;

    public Customer(String name, int pin) {
        this.name = name;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public boolean checkPin(int enteredPin) {
        return pin == enteredPin;
    }
}
    

