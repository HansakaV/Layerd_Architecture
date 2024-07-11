package lk.ijse.manathungatours.bo.custom;

import lk.ijse.manathungatours.bo.SuperBO;
import lk.ijse.manathungatours.dto.RouteDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface RouteBO extends SuperBO {

    public ArrayList<RouteDTO> getAll() throws SQLException;

    public boolean save(RouteDTO routeDTO) throws SQLException;
    public boolean delete(String id) throws SQLException;


    public ArrayList<String> getIds() throws SQLException;


    public String getCurrentId() throws SQLException;

    public boolean update(RouteDTO routeDTO) throws SQLException;
    public ArrayList<RouteDTO> search(String id) throws SQLException;
}
