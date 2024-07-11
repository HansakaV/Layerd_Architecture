package lk.ijse.manathungatours.bo.custom.impl;

import lk.ijse.manathungatours.bo.BOFactory;
import lk.ijse.manathungatours.bo.custom.BookingDetailBO;
import lk.ijse.manathungatours.dao.DAOFactory;
import lk.ijse.manathungatours.dao.DAOTypes;
import lk.ijse.manathungatours.dao.custom.bookingDetailDAO;
import lk.ijse.manathungatours.dto.BookingDetailDTO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookingDetailBOImpl implements BookingDetailBO {

    bookingDetailDAO bookingDetailDAO = (lk.ijse.manathungatours.dao.custom.bookingDetailDAO) DAOFactory.getDaoFactory().getDAO(DAOTypes.BOOKING_DETAIL);

    @Override
    public   boolean save(List<BookingDetailDTO> odList) throws SQLException {
       return bookingDetailDAO.save(odList);
    }

    @Override
    public ArrayList<BookingDetailDTO> getAll() throws SQLException {
        return null;
    }

    public   boolean save(BookingDetailDTO od) throws SQLException {
       return bookingDetailDAO.save(od);
    }

    @Override
    public ArrayList<BookingDetailDTO> search(String s) throws SQLException {
        return null;
    }

    @Override
    public boolean update(BookingDetailDTO dto) throws SQLException {
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

    @Override
    public String getCurrentId() throws SQLException {
        return null;
    }
}
