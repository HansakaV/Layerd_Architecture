package lk.ijse.manathungatours.bo.custom;

import lk.ijse.manathungatours.bo.SuperBO;
import lk.ijse.manathungatours.dto.DriverDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DriverBO extends SuperBO {

    public ArrayList<DriverDTO> getAll() throws SQLException;
    public boolean save(DriverDTO dto) throws SQLException;
    public boolean delete(String id) throws SQLException;
    public boolean update(DriverDTO driver) throws SQLException;
    public ArrayList<DriverDTO> search(String id) throws SQLException;
    public  ArrayList<String> getIds() throws SQLException;
    public String getCurrentId() throws SQLException;
}
