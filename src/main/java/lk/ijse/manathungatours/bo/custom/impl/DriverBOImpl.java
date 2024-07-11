package lk.ijse.manathungatours.bo.custom.impl;

import lk.ijse.manathungatours.bo.custom.DriverBO;
import lk.ijse.manathungatours.dao.DAOFactory;
import lk.ijse.manathungatours.dao.DAOTypes;
import lk.ijse.manathungatours.dao.custom.driverDAO;
import lk.ijse.manathungatours.dto.DriverDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class DriverBOImpl implements DriverBO {

    driverDAO driverDAO = (lk.ijse.manathungatours.dao.custom.driverDAO) DAOFactory.getDaoFactory().getDAO(DAOTypes.DRIVER);

    public ArrayList<DriverDTO> getAll() throws SQLException {
       return driverDAO.getAll();

    }
    public boolean save(DriverDTO dto) throws SQLException {
       return driverDAO.save(dto);
    }
    public boolean delete(String id) throws SQLException {
        return driverDAO.delete(id);

    }
    public boolean update(DriverDTO driver) throws SQLException {
       return driverDAO.update(driver);
    }
    public ArrayList<DriverDTO> search(String id) throws SQLException {
       return driverDAO.search(id);
    }
    public  ArrayList<String> getIds() throws SQLException {
        return driverDAO.getIds();
    }

    @Override
    public String getCurrentId() throws SQLException {
        return null;
    }
}
