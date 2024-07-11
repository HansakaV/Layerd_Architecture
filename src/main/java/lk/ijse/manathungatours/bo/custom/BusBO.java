package lk.ijse.manathungatours.bo.custom;

import lk.ijse.manathungatours.bo.SuperBO;
import lk.ijse.manathungatours.dto.BusDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface BusBO extends SuperBO {

    public boolean update(BusDTO dto) throws SQLException;

    public boolean save(BusDTO dto) throws SQLException;

    public ArrayList<BusDTO> search(String id) throws SQLException;
    public boolean delete(String id) throws SQLException;
    public ArrayList<String> getIds() throws SQLException;


    public String getCurrentId() throws SQLException;
    public ArrayList<String> checkAvailability() throws SQLException;
    public ArrayList<BusDTO> getAll() throws SQLException;
}
