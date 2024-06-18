package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.ItemDAO;
import com.example.layeredarchitecture.dao.ItemDAOImpl;
import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.model.ItemDTO;


import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBoImpl {
    ItemDAO itemDAO = new ItemDAOImpl();

    public ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException {
        return itemDAO.getAll();

    }

    public boolean add(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.add(dto);
    }
    public boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.update(dto);
    }

    public boolean exist(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.exist(code);
    }

    public String generateNewID() throws SQLException, ClassNotFoundException {
        return itemDAO.generateNewID();
    }

    public ItemDTO search(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.search(code);
    }
    public boolean delete(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.delete(code);
    }

}
