package lk.ijse.manathungatours.bo.custom.impl;

import lk.ijse.manathungatours.bo.custom.PlaceBookingBO;
import lk.ijse.manathungatours.dao.DAOFactory;
import lk.ijse.manathungatours.dao.DAOTypes;
import lk.ijse.manathungatours.dao.custom.PlaceBookingDAO;
import lk.ijse.manathungatours.dto.PlaceBookingDTO;

import java.sql.SQLException;

public class PlaceBookingBOImpl implements PlaceBookingBO {

    PlaceBookingDAO placeBookingDAO = (PlaceBookingDAO) DAOFactory.getDaoFactory().getDAO(DAOTypes.PLACE_BOOKING);

    public boolean placeOrder(PlaceBookingDTO po) throws SQLException {
        return placeBookingDAO.placeOrder(po);
    }
}
