/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Bean.Item;
import Bean.Order;
import Bean.Stock;
import DAO.DBOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chazool
 */
public class OrderManager {

    public static DefaultTableModel SelectKeyType(String Text) {

        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new String[]{"", "Item Name", "Generic"});

        ArrayList<Item> list = DBOrder.SelectKeyType(Text);

        Iterator<Item> iterator = list.iterator();

        Object row[] = new Object[3];
        int no = 0;
        while (iterator.hasNext()) {
            Item next = iterator.next();
            row[0] = ++no;
            row[1] = next.getItemName();
            row[2] = next.getGeneric();

            model.addRow(row);
        }

        return model;
    }

    /*
    get Unit price and Availble Qty
     */
    public static Stock newRow(String ItemName) {

        DBOrder db = new DBOrder();
        ArrayList<Stock> list = db.newRow(ItemName);

        Stock stock = list.get(0);
        return stock;
    }

    public static String newRowBarcode(String ItemName) {

        DBOrder db = new DBOrder();

        ArrayList<Item> list = db.newRowBarcode(ItemName);

        Item item = list.get(0);
        System.out.println(item.getItemName());
       
        return item.getItemName();
    }
    
    
    
    
    public void Sale(Order order){
        
        DBOrder db=new DBOrder();
        int OrderNo=db.Sale(order);
        
    }
}
