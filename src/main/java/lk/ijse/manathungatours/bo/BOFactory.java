package lk.ijse.manathungatours.bo;

import lk.ijse.manathungatours.bo.custom.impl.*;
import lk.ijse.manathungatours.dto.BookingDetailDTO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BOFactory {
    private static BOFactory boFactory;

    public BOFactory(){

    }
    public static BOFactory getBoFactory(){
        return boFactory == null ? boFactory = new BOFactory() : boFactory;
    }

    public SuperBO getBO(BOTypes boTypes){
        switch (boTypes){
            case BOOKING:
                return new BookingBOImpl();
            case BUS:
                return new BusBOImpl();
            case ROUTE:
                return new RouteBOImpl();
            case PLACE_BOOKING:
                return new PlaceBookingBOImpl();
            case FINANCIAL:
                return new FinancialBOImpl();
            case ENGINEER:
                return new EngineerBOImpl();
            case DRIVER:
                return new DriverBOImpl();
            case CUSTOMER:
                return new CustomerBOImpl();
            case CONDUCTOR:
                return new ConductorBOImpl();
            case BOOKING_DETAIL:
                return new BookingDetailBOImpl();
            default:
                return null;
        }
    }
}
