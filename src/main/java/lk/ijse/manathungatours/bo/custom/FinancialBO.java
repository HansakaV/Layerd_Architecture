package lk.ijse.manathungatours.bo.custom;

import lk.ijse.manathungatours.bo.SuperBO;
import lk.ijse.manathungatours.dto.FinancialDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface FinancialBO extends SuperBO {

    public  boolean save(FinancialDTO financial) throws SQLException;
    public ArrayList<FinancialDTO> search(String id) throws SQLException;

    public  boolean update(FinancialDTO financial) throws SQLException;

    public  boolean delete(String id) throws SQLException;

    public  ArrayList<FinancialDTO> getAll() throws SQLException;

    public  ArrayList<String> getIds() throws SQLException;


    public String getCurrentId() throws SQLException;
}
