package lk.ijse.manathungatours.dao.custom;

import lk.ijse.manathungatours.dao.CrudDAO;
import lk.ijse.manathungatours.dto.BusDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface busDAO extends CrudDAO<BusDTO,String> {

    public ArrayList<String> checkAvailability() throws SQLException;
}
