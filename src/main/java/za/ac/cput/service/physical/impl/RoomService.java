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

import java.util.HashSet;
import java.util.Set;

@Service
public class RoomService implements IRoomService {
    @Autowired
    private RoomRepository repository;

    @Override
    public Room create(Room room) {
        return this.repository.save(room);
    }

    @Override
    public Room read(String s) {
        return this.repository.findById(s).orElse(null);
    }

    @Override
    public Room update(Room room) {
        return this.repository.save(room);
    }

    @Override
    public boolean delete(String s) {
        this.repository.deleteById(s);
        if (this.repository.existsById(s))
            return false;
        else
            return true;
    }

    @Override
    public Set<Room> getAll() {
        return new HashSet<>(this.repository.findAll());
    }
}
