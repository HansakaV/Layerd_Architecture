package lk.ijse.manathungatours.bo.custom;

import lk.ijse.manathungatours.bo.SuperBO;
import lk.ijse.manathungatours.dto.ConductorDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ConductorBO extends SuperBO {

    public ArrayList<ConductorDTO> getAll() throws SQLException;

    public boolean save(ConductorDTO dto) throws SQLException;

    public boolean delete(String id) throws SQLException;

    public boolean update(ConductorDTO dto) throws SQLException;

    public ArrayList<ConductorDTO> search(String id) throws SQLException;
    public ArrayList<String> getIds() throws SQLException;


    public String getCurrentId() throws SQLException;
}
