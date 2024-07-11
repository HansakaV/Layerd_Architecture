package lk.ijse.manathungatours.bo.custom;

import lk.ijse.manathungatours.bo.SuperBO;
import lk.ijse.manathungatours.dto.BookingDetailDTO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public  interface BookingDetailBO extends SuperBO {


    public   boolean save(List<BookingDetailDTO> odList) throws SQLException;


    public ArrayList<BookingDetailDTO> getAll() throws SQLException;

    public   boolean save(BookingDetailDTO od) throws SQLException;


    public ArrayList<BookingDetailDTO> search(String s) throws SQLException;


    public boolean update(BookingDetailDTO dto) throws SQLException;

    public boolean delete(String s) throws SQLException;


    public ArrayList<String> getIds() throws SQLException;


    public String getCurrentId() throws SQLException;
}
