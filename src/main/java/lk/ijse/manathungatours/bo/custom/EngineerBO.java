package lk.ijse.manathungatours.bo.custom;

import lk.ijse.manathungatours.bo.SuperBO;
import lk.ijse.manathungatours.dto.EngineerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface EngineerBO extends SuperBO {

    public ArrayList<EngineerDTO> getAll() throws SQLException;
    public boolean save(EngineerDTO dto) throws SQLException;
    public boolean delete(String id) throws SQLException;
    public boolean update(EngineerDTO engineer) throws SQLException;
    public ArrayList<EngineerDTO> search(String id) throws SQLException;
    public  ArrayList<String> getIds() throws SQLException;


    public String getCurrentId() throws SQLException;
}
