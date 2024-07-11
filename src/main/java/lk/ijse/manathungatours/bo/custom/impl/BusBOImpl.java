package lk.ijse.manathungatours.bo.custom.impl;

import lk.ijse.manathungatours.bo.custom.BusBO;
import lk.ijse.manathungatours.dao.DAOFactory;
import lk.ijse.manathungatours.dao.DAOTypes;
import lk.ijse.manathungatours.dao.custom.busDAO;
import lk.ijse.manathungatours.dto.BusDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class BusBOImpl implements BusBO{



      busDAO  busDAO= (lk.ijse.manathungatours.dao.custom.busDAO) DAOFactory.getDaoFactory().getDAO(DAOTypes.BUS);


        public boolean update(BusDTO dto) throws SQLException {
            return busDAO.update(dto);
        }

        public boolean save(BusDTO dto) throws SQLException {
            return busDAO.save(dto);
        }

        public ArrayList<BusDTO> search(String id) throws SQLException {
            return busDAO.search(id);
        }
        public boolean delete(String id) throws SQLException {
            return busDAO.delete(id);
        }
        public ArrayList<String> getIds() throws SQLException {
            return busDAO.getIds();
        }

        @Override
        public String getCurrentId() throws SQLException {
            return null;
        }

        public ArrayList<String> checkAvailability() throws SQLException {
            return busDAO.checkAvailability();
        }
        public ArrayList<BusDTO> getAll() throws SQLException {
            return busDAO.getAll();
        }
    }

