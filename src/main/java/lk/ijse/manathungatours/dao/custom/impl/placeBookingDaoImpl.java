package lk.ijse.manathungatours.dao.custom.impl;

import lk.ijse.manathungatours.dao.custom.PlaceBookingDAO;
import lk.ijse.manathungatours.db.DbConnection;
import lk.ijse.manathungatours.dto.PlaceBookingDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class placeBookingDaoImpl implements PlaceBookingDAO {
    public boolean placeOrder(PlaceBookingDTO po) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        connection.setAutoCommit(false);

        try {
            bookingDaoImpl bookingDao = new bookingDaoImpl();
            boolean isOrderSaved = bookingDao.save(po.getBooking());
            if (isOrderSaved) {
                BookingDetailDaoImpl bookingDetailDao = new BookingDetailDaoImpl();
                boolean isOrderDetailSaved = bookingDetailDao.save(po.getOdList());
                if (isOrderDetailSaved) {
                    connection.commit();
                    return true;
                }
            }
            connection.rollback();
            return false;
        } catch (Exception e) {
            connection.rollback();
            return false;
        } finally {
            connection.setAutoCommit(true);
        }
    }

    @Override
    public ArrayList<PlaceBookingDTO> getAll() throws SQLException {
        return null;
    }

    @Override
    public boolean save(PlaceBookingDTO dto) throws SQLException {
        return false;
    }

    @Override
    public ArrayList<PlaceBookingDTO> search(String s) throws SQLException {
        return null;
    }

    @Override
    public boolean update(PlaceBookingDTO dto) throws SQLException {
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
