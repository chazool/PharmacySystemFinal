/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.CreateId;
import Bean.Generic;
import Bean.Item;
import Bean.Order;

import Bean.OrderItemSelection;
import Bean.Stock;
import DB.HibernateSession;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Chazool
 */
public class DBOrder {

    public static ArrayList<Item> SelectKeyType(String Text) {

        SessionFactory sessionFactory = HibernateSession.getSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from Item where ItemName like ? or Generic like ? or Barcord like ?");

        query.setString(0, Text + "%");

        query.setString(1, Text + "%");

        query.setString(2, Text + "%");

        ArrayList<Item> list = (ArrayList<Item>) query.list();

        transaction.commit();

        session.close();

        return list;
    }

    public ArrayList<Stock> newRow(String ItemName) {

        SessionFactory sessionFactory = HibernateSession.getSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from Stock where ItemName='" + ItemName + "' ");
        //from Cat where name

        // query.setString(0, ItemName);
        ArrayList<Stock> list = (ArrayList<Stock>) query.list();

        transaction.commit();

        session.close();

        return list;
    }

    public ArrayList<Item> newRowBarcode(String Barcode) {

        SessionFactory sessionFactory = HibernateSession.getSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from Item where Barcord='" + Barcode + "' ");

        ArrayList<Item> list = (ArrayList<Item>) query.list();

        transaction.commit();

        session.close();

        return list;
    }

    public int Sale(Order order) {

        SessionFactory sessionFactory = HibernateSession.getSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();

        CreateId id = new CreateId();
        session.save(id);
        System.out.println("ID-------------------------------  " + id.getId());
        order.setOrderID(id.getId());
       // session.save(order);
        
        Query query = session.createSQLQuery("INSERT INTO `pharmacysystem`.`order` (`OrderID`,`Itemname`, `QTY`, `Value`) VALUES ('" + order.getOrderID() + "','" + order.getItemname() + "','" + order.getQTY() + "','" + order.getValue() + "');");
        query.executeUpdate();
        
        tx.commit();

        session.close();

        return 0;
    }

    public static void main(String[] args) {

        Order order = new Order();

        order.setItemname("sdhasgja");
        order.setQTY(2);
        order.setValue(8);

        new DBOrder().Sale(order);

    }

}
