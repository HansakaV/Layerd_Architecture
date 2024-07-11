package lk.ijse.manathungatours.dao.custom;

import lk.ijse.manathungatours.dao.CrudDAO;
import lk.ijse.manathungatours.dto.BookingDetailDTO;

import java.sql.SQLException;
import java.util.List;

public interface bookingDetailDAO extends CrudDAO<BookingDetailDTO,String> {

    public boolean save(List<BookingDetailDTO> odList) throws SQLException;
}
