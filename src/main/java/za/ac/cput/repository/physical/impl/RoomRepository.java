package za.ac.cput.repository.physical.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.physical.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, String> {
}
