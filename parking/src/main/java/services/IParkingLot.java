package services;

import services.exception.ParkingFullException;
import services.model.Vehicle;

public interface IParkingLot {

    /**
     * Allocates the parking
     * @return the parking slot.
     */
    public int park(Vehicle vehicleInstance) throws ParkingFullException;

    /**
     * Dallocates the parking for a given vehicle
     * @return the parking slot.
     */
    public int unpark(Vehicle vehicleInstance);

    /**
     * Deallocates the parking for a given parking slot
     * @return the parking slot.
     */
    public int unpark(int slot);


    /**
     * @return true if parking id full
     *
     */
     public boolean isParkingFull();

    /**
     *
     * @return number of available parking slots
     */
     public int freeParkingSlotsCount();


}
