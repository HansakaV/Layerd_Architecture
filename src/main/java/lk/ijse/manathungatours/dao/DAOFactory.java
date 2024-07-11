package lk.ijse.manathungatours.dao;

import lk.ijse.manathungatours.dao.custom.impl.*;

public class DAOFactory {

    private static  DAOFactory daoFactory;

    public DAOFactory(){

    }
    public static DAOFactory getDaoFactory(){
        return daoFactory == null ? daoFactory = new DAOFactory() : daoFactory;
    }
    public CrudDAO getDAO(DAOTypes daoTypes){
        switch (daoTypes){
            case BOOKING:
                return new bookingDaoImpl();
            case BOOKING_DETAIL:
                return new BookingDetailDaoImpl();
            case BUS:
                return new busDaoImpl();
            case CONDUCTOR:
                return new conductorDaoImpl();
            case CUSTOMER:
                return new customerDaoImpl();
            case DRIVER:
                return new driverDaoImpl();
            case ENGINEER:
                return new engineerDaoImpl();
            case FINANCIAL:
                return new financialDaoImpl();
            case PLACE_BOOKING:
                return new placeBookingDaoImpl();
            case ROUTE:
                return new routeDaoImpl();
            default:
                return null;
        }
    }
}
