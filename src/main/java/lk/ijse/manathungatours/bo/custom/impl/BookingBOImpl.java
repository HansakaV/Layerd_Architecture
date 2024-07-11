package lk.ijse.manathungatours.bo.custom.impl;

import lk.ijse.manathungatours.bo.custom.BookingBO;
import lk.ijse.manathungatours.bo.custom.BusBO;
import lk.ijse.manathungatours.dao.DAOFactory;
import lk.ijse.manathungatours.dao.DAOTypes;
import lk.ijse.manathungatours.dao.custom.bookingDAO;
import lk.ijse.manathungatours.dto.BookingDTO;
import lk.ijse.manathungatours.dto.BusDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class BookingBOImpl implements BookingBO {

    bookingDAO bookingDAO = (lk.ijse.manathungatours.dao.custom.bookingDAO) DAOFactory.getDaoFactory().getDAO(DAOTypes.BOOKING);

    @Override
    public  String getCurrentId() throws SQLException {
       return bookingDAO.getCurrentId();
    }

    @Override
    public ArrayList<BookingDTO> getAll() throws SQLException {
        return null;
    }

    public  boolean save(BookingDTO booking) throws SQLException {
       return bookingDAO.save(booking);
    }

    @Override
    public ArrayList<BookingDTO> search(String s) throws SQLException {
        return null;
    }

    @Override
    public boolean update(BookingDTO dto) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(String s) throws SQLException {
        return false;
    }

    @Override
    public ArrayList<String> getIds() throws SQLException {
        return null;
    }


}
