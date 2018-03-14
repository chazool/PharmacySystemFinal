/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Logic.SystemAvailable;
import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

/**
 *
 * @author Chazool
 */
@Entity
@Table

public class DrugsItem extends Drugs {

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "DrugsId", column = @Column(name = "ItemNo")),})
    private String ItemNo;
    private String ItemName;

    private float ItemResalePrice;

    public String getItemNo() {
        return ItemNo;
    }

    public void setItemNo(String ItemNo) {
        this.ItemNo = ItemNo;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public float getItemResalePrice() {
        return ItemResalePrice;
    }

    public void setItemResalePrice(float ItemResalePrice) {
        this.ItemResalePrice = ItemResalePrice;
    }

}
