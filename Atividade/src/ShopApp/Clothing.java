/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShopApp;

/**
 *
 * @author kenneth.santos
 */
public class Clothing implements Comparable<Clothing> {
    
    private String description;
    private double price;
    private String size = "M";
    
    static final double MIN_PRICE = 10.0;
    private final static double TAX_RATE = .2;
    

    public Clothing(String description, double price, String aSize) {
        this.description = description;
        this.price = price;
        size = aSize; 
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + (price * TAX_RATE);
    }

    public void setPrice(double price) {
        
        this.price = (price > MIN_PRICE) ? price: MIN_PRICE;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    @Override
    public String toString(){
        return getDescription() + ", " + getSize() + ", " + getPrice();
    }
    
    @Override
    public int compareTo(Clothing c){
        return this.description.compareTo(c.description);
    }
}
