package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.OrderDAO;
import com.example.layeredarchitecture.dao.OrderDAOImpl;
import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderBoImpl {
    OrderDAO orderDAO = new OrderDAOImpl();

    public String generateNewID() throws SQLException, ClassNotFoundException {
       return orderDAO.generateNewID();
    }


    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return orderDAO.delete(id);
    }


    public <T> T search(String id) throws SQLException, ClassNotFoundException {
        return orderDAO.search(id);
    }

    public boolean exist(String orderId) throws SQLException, ClassNotFoundException {
        return orderDAO.exist(orderId);
    }


    public ArrayList<OrderDTO> getAll() throws SQLException, ClassNotFoundException {
        return orderDAO.getAll();
    }

    public boolean add(OrderDTO dto) throws SQLException, ClassNotFoundException {
        return orderDAO.add(dto);
    }


    public boolean update(OrderDTO dto) throws SQLException, ClassNotFoundException {
        return orderDAO.update(dto);
    }

}
