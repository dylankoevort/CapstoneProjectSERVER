package za.ac.cput.entity.physical;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * author: Llewelyn Klaase
 * student no: 216267072
 */

@Entity
public class Room {

    @Id
    private String roomCode;
    private String roomType;
    private int roomCapacity, roomFloor, buildingID;

    public Room(RoomBuilder room) {
        this.roomCode = room.roomCode;
        this.roomType = room.roomType;
        this.roomCapacity = room.roomCapacity;
        this.roomFloor = room.roomFloor;
        this.buildingID = room.buildingID;
    }

    protected Room() {
    }

    public String getRoomCode() {
        return roomCode;
    }

    public String getRoomType() { return roomType; }

    public int getRoomCapacity() { return roomCapacity; }

    public int getBuildingID() { return buildingID; }

    public int getRoomFloor() { return roomFloor; }

    @Override
    public String toString() {
        return "Room{" +
                "roomType='" + roomType + '\'' +
                ", roomCode=" + roomCode +
                ", roomCapacity=" + roomCapacity +
                ", roomFloor=" + roomFloor +
                ", buildingID=" + buildingID +
                '}';
    }

    public static class RoomBuilder {

        private String roomCode, roomType;
        private int roomCapacity, roomFloor, buildingID;

        public RoomBuilder setRoomType(String roomType) {
            this.roomType = roomType;
            return this;
        }

        public RoomBuilder setRoomCode(String roomCode) {
            this.roomCode = roomCode;
            return this;
        }

        public RoomBuilder setRoomCapacity(int roomCapacity) {
            this.roomCapacity = roomCapacity;
            return this;
        }

        public RoomBuilder setRoomFloor(int roomFloor) {
            this.roomFloor = roomFloor;
            return this;
        }

        public RoomBuilder setBuildingID(int buildingID) {
            this.buildingID = buildingID;
            return this;
        }

        public Room build() { return new Room(this); }

        public RoomBuilder copy (Room room){
            this.roomType = room.roomType;
            this.roomCode = room.roomCode;
            this.roomCapacity = room.roomCapacity;
            this.roomFloor = room.roomFloor;
            this.buildingID = room.buildingID;

            return this;
        }
    }
}
