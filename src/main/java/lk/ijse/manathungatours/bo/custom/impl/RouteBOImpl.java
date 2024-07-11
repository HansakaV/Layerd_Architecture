package lk.ijse.manathungatours.bo.custom.impl;

import lk.ijse.manathungatours.bo.custom.RouteBO;
import lk.ijse.manathungatours.dao.DAOFactory;
import lk.ijse.manathungatours.dao.DAOTypes;
import lk.ijse.manathungatours.dao.custom.routeDAO;
import lk.ijse.manathungatours.dto.RouteDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class RouteBOImpl implements RouteBO {

    routeDAO routeDAO = (lk.ijse.manathungatours.dao.custom.routeDAO) DAOFactory.getDaoFactory().getDAO(DAOTypes.ROUTE);

    public ArrayList<RouteDTO> getAll() throws SQLException {
       return routeDAO.getAll();
    }

    public boolean save(RouteDTO routeDTO) throws SQLException {
        return routeDAO.save(routeDTO);
    }
    public boolean delete(String id) throws SQLException {
       return routeDAO.delete(id);
    }

    @Override
    public ArrayList<String> getIds() throws SQLException {
        return null;
    }

    @Override
    public String getCurrentId() throws SQLException {
        return null;
    }

    public boolean update(RouteDTO routeDTO) throws SQLException {
       return routeDAO.update(routeDTO);
    }
    public ArrayList<RouteDTO> search(String id) throws SQLException {
      return routeDAO.search(id);
    }
}
