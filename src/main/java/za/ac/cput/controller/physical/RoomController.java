/**
 * author: Llewelyn Klaase
 * student no: 216267072
 */
package za.ac.cput.controller.physical;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.physical.Room;
import za.ac.cput.factory.physical.RoomFactory;
import za.ac.cput.service.physical.impl.RoomService;
import java.util.Set;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @PostMapping("/create")
    public Room create(@RequestBody Room room){
        Room r = RoomFactory.build(room.getRoomCode(),room.getRoomType(),room.getRoomCapacity(), room.getRoomFloor(), room.getBuildingID());
        return  roomService.create(r);
    }
    @GetMapping("/read/{id}")
    public Room read(@PathVariable String id) {
        return roomService.read(id);
    }

    @PostMapping("/update")
    public Room update(@RequestBody Room room) {
        return roomService.update(room);
    }

    @PostMapping("/delete/{id}")
    public boolean delete(@PathVariable String id) {
        return roomService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Room> getAll() {
        return roomService.getAll();
    }
}
