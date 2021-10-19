package za.ac.cput.repository.physical;

import za.ac.cput.entity.physical.Room;
import za.ac.cput.repository.IRepository;

import java.util.Set;

@Deprecated
public interface IRoomRepository extends IRepository<Room, String> {
    public Set<Room> getAll();
}
