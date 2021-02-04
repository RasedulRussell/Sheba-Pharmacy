/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RasedulRussell
 */
public class MedicineSell {

    public String Name;
    public Float UnitPrice;
    public int Quantity;
    public Float Price;

    public MedicineSell(String hello, Float unitPrice, int quantity, Float price) {
        this.Name = hello;
        this.UnitPrice = unitPrice;
        this.Quantity = quantity;
        this.Price = price;
    }
}
