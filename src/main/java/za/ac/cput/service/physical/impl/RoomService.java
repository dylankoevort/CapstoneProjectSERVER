package za.ac.cput.service.physical.impl;
/**
 * author: Llewelyn Klaase
 * student no: 216267072
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.physical.Room;
import za.ac.cput.repository.physical.impl.RoomRepository;
import za.ac.cput.service.physical.IRoomService;

import java.util.Set;

@Service
public class RoomService implements IRoomService {

    private static RoomService Roomservice = null;

    @Autowired
    private RoomRepository repository;

    public RoomService() {
        this.repository = RoomRepository.getRepository();
    }

    public static RoomService getService(){
        if(Roomservice == null){
            Roomservice = new RoomService();
        }
        return Roomservice;
    }

    @Override
    public Room create(Room room) {
        return this.repository.create(room);
    }

    @Override
    public Room read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Room update(Room room) {
        return this.repository.update(room);
    }

    @Override
    public boolean delete(String s) {
        return this.repository.delete(s);
    }

    @Override
    public Set<Room> getAll() {
        return this.repository.getAll();
    }
}
