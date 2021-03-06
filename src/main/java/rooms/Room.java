package rooms;

import people.Guest;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private RoomType roomType;
    private ArrayList<Guest> collectionOfGuests;

    public Room(int capacity, RoomType roomType){
        this.capacity = capacity;
        this.roomType = roomType;
        this.collectionOfGuests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public ArrayList<Guest> getCollectionOfGuests() {
        return this.collectionOfGuests;
    }

    public boolean isEmpty() {
        if (this.collectionOfGuests.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void addGuest(Guest guest){
         this.collectionOfGuests.add(guest);
    }

    public void removeGuest(Guest guest){
        this.collectionOfGuests.remove(guest);
    }

    public int guestCount(){
        return this.collectionOfGuests.size();
    }
}
