package lk.ijse.manathungatours.dao.custom;

import lk.ijse.manathungatours.dao.CrudDAO;
import lk.ijse.manathungatours.dto.PlaceBookingDTO;

import java.sql.SQLException;

public interface PlaceBookingDAO extends CrudDAO<PlaceBookingDTO,String> {

    public  boolean placeOrder(PlaceBookingDTO po) throws SQLException;
}
