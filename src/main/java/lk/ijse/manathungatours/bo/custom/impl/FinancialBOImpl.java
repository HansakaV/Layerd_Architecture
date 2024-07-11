package lk.ijse.manathungatours.bo.custom.impl;

import lk.ijse.manathungatours.bo.custom.FinancialBO;
import lk.ijse.manathungatours.dao.DAOFactory;
import lk.ijse.manathungatours.dao.DAOTypes;
import lk.ijse.manathungatours.dao.custom.financialDAO;
import lk.ijse.manathungatours.dto.FinancialDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class FinancialBOImpl implements FinancialBO {

    financialDAO financialDAO = (lk.ijse.manathungatours.dao.custom.financialDAO) DAOFactory.getDaoFactory().getDAO(DAOTypes.FINANCIAL);

    public  boolean save(FinancialDTO financial) throws SQLException {
       return financialDAO.save(financial);
    }
    public ArrayList<FinancialDTO> search(String id) throws SQLException {
       return financialDAO.search(id);
    }

    public  boolean update(FinancialDTO financial) throws SQLException {
        return financialDAO.update(financial);
    }

    public  boolean delete(String id) throws SQLException {
       return financialDAO.delete(id);
    }

    public  ArrayList<FinancialDTO> getAll() throws SQLException {
       return financialDAO.getAll();
    }

    public  ArrayList<String> getIds() throws SQLException {
      return financialDAO.getIds();
    }

    @Override
    public String getCurrentId() throws SQLException {
        return null;
    }
}
