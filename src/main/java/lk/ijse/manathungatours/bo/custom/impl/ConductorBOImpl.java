package lk.ijse.manathungatours.bo.custom.impl;

import lk.ijse.manathungatours.bo.custom.ConductorBO;
import lk.ijse.manathungatours.dao.DAOFactory;
import lk.ijse.manathungatours.dao.DAOTypes;
import lk.ijse.manathungatours.dao.custom.conductorDAO;
import lk.ijse.manathungatours.dto.ConductorDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class ConductorBOImpl implements ConductorBO {

    conductorDAO conductorDAO = (lk.ijse.manathungatours.dao.custom.conductorDAO) DAOFactory.getDaoFactory().getDAO(DAOTypes.CONDUCTOR);

    public ArrayList<ConductorDTO> getAll() throws SQLException {
        return conductorDAO.getAll();

    }

    public boolean save(ConductorDTO dto) throws SQLException {
        return conductorDAO.save(dto);
    }

    public boolean delete(String id) throws SQLException {
        return conductorDAO.delete(id);
    }

    public boolean update(ConductorDTO dto) throws SQLException {
       return conductorDAO.update(dto);
    }

    public ArrayList<ConductorDTO> search(String id) throws SQLException {
        return conductorDAO.search(id);
    }
    public ArrayList<String> getIds() throws SQLException {
       return conductorDAO.getIds();

    }

    @Override
    public String getCurrentId() throws SQLException {
        return null;
    }
}
