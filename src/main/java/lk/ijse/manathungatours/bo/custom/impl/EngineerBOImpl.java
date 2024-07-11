package lk.ijse.manathungatours.bo.custom.impl;

import lk.ijse.manathungatours.bo.custom.EngineerBO;
import lk.ijse.manathungatours.dao.DAOFactory;
import lk.ijse.manathungatours.dao.DAOTypes;
import lk.ijse.manathungatours.dao.custom.engineerDAO;
import lk.ijse.manathungatours.dto.EngineerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class EngineerBOImpl implements EngineerBO {

    engineerDAO engineerDAO = (lk.ijse.manathungatours.dao.custom.engineerDAO) DAOFactory.getDaoFactory().getDAO(DAOTypes.ENGINEER);

    public ArrayList<EngineerDTO> getAll() throws SQLException {
       return engineerDAO.getAll();

    }
    public boolean save(EngineerDTO dto) throws SQLException {
        return engineerDAO.save(dto);
    }
    public boolean delete(String id) throws SQLException {
       return engineerDAO.delete(id);
    }
    public boolean update(EngineerDTO engineer) throws SQLException {
        return engineerDAO.update(engineer);
    }
    public ArrayList<EngineerDTO> search(String id) throws SQLException {
        return engineerDAO.search(id);
    }
    public  ArrayList<String> getIds() throws SQLException {
        return engineerDAO.getIds();
    }

    @Override
    public String getCurrentId() throws SQLException {
        return null;
    }
}
