/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author Chazool
 */
public class OrderItemSelection  {

    private String ItemName;
    private float UnitPrice;
    private int AvailableQTY;

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public float getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public int getAvailableQTY() {
        return AvailableQTY;
    }

    public void setAvailableQTY(int AvailableQTY) {
        this.AvailableQTY = AvailableQTY;
    }
   

}
