/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Logic.SystemAvailable;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Chazool
 */
/**
@Entity
@Table
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
* */
@MappedSuperclass
public class CreateData extends SystemAvailable {

    
    private String CreateUser;
    private String CreateDate;
    private String CreateTime;

    public String getCreateUser() {
        return CreateUser;
    }

    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    public String getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate() {
        this.CreateDate = GetSystemDate();
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime() {
        this.CreateTime = GetSystemTime();
    }

}
