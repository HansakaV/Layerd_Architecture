package lk.ijse.manathungatours.bo.custom.impl;

import lk.ijse.manathungatours.bo.custom.CustomerBO;
import lk.ijse.manathungatours.dao.DAOFactory;
import lk.ijse.manathungatours.dao.DAOTypes;
import lk.ijse.manathungatours.dao.custom.customerDAO;
import lk.ijse.manathungatours.dto.PassengerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO {

    customerDAO customerDAO = (lk.ijse.manathungatours.dao.custom.customerDAO) DAOFactory.getDaoFactory().getDAO(DAOTypes.CUSTOMER);

    public ArrayList<PassengerDTO> getAll() throws SQLException {
       return customerDAO.getAll();
    }
    @Override
    public boolean save(PassengerDTO dto) throws SQLException {
      return customerDAO.save(dto);

    }

    @Override
    public ArrayList<PassengerDTO> search(String id) throws SQLException {
       return customerDAO.search(id);
    }
    @Override
    public boolean update(PassengerDTO dto) throws SQLException {
       return customerDAO.update(dto);
    }
    @Override
    public boolean delete(String id) throws SQLException {
      return customerDAO.delete(id);
    }
    public  ArrayList<String> getIds() throws SQLException {
       return customerDAO.getIds();
    }

    @Override
    public String getCurrentId() throws SQLException {
        return null;
    }
}
