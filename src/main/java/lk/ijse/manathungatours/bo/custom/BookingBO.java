package lk.ijse.manathungatours.bo.custom;

import lk.ijse.manathungatours.bo.SuperBO;
import lk.ijse.manathungatours.dto.BookingDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface BookingBO extends SuperBO {

    public  String getCurrentId() throws SQLException;


    public ArrayList<BookingDTO> getAll() throws SQLException;

    public  boolean save(BookingDTO booking) throws SQLException;


    public ArrayList<BookingDTO> search(String s) throws SQLException;


    public boolean update(BookingDTO dto) throws SQLException;


    public boolean delete(String s) throws SQLException;


    public ArrayList<String> getIds() throws SQLException;
}
