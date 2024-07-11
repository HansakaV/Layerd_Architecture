package lk.ijse.manathungatours.bo.custom;

import lk.ijse.manathungatours.bo.SuperBO;
import lk.ijse.manathungatours.dto.PassengerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBO extends SuperBO {

    public ArrayList<PassengerDTO> getAll() throws SQLException;

    public boolean save(PassengerDTO dto) throws SQLException;


    public ArrayList<PassengerDTO> search(String id) throws SQLException;

    public boolean update(PassengerDTO dto) throws SQLException;

    public boolean delete(String id) throws SQLException;
    public  ArrayList<String> getIds() throws SQLException;


    public String getCurrentId() throws SQLException;
}
