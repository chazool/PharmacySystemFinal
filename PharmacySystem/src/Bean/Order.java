/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Home
 */
@Entity
@Table
public class Order implements Serializable {

    @Id
    private int OrderID;
    private String Itemname;
    private int QTY;
    private float Value;

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public String getItemname() {
        return Itemname;
    }

    public void setItemname(String Itemname) {
        this.Itemname = Itemname;
    }

    public int getQTY() {
        return QTY;
    }

    public void setQTY(int QTY) {
        this.QTY = QTY;
    }

    public float getValue() {
        return Value;
    }

    public void setValue(float Value) {
        this.Value = Value;
    }

}
