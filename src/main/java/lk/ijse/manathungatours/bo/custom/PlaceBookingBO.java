package lk.ijse.manathungatours.bo.custom;

import lk.ijse.manathungatours.bo.SuperBO;
import lk.ijse.manathungatours.dto.PlaceBookingDTO;

import java.sql.SQLException;

public interface PlaceBookingBO extends SuperBO {

    public  boolean placeOrder(PlaceBookingDTO po) throws SQLException;
}
