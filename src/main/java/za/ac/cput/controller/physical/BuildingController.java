/**
 * author: Llewelyn Klaase
 * student no: 216267072
 */
package za.ac.cput.controller.physical;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.physical.Building;
import za.ac.cput.factory.physical.BuildingFactory;
import za.ac.cput.service.physical.impl.BuildService;

import java.util.Set;

@RestController
@RequestMapping("/building")
public class BuildingController {
    @Autowired
    private BuildService buildingService;

    @PostMapping("/create")
    public Building create(@RequestBody Building building){
        Building b = BuildingFactory.build(building.getBuildingID(), building.getRoomCount(), building.getBuildingName(), building.getBuildingAddress());
        return buildingService.create(b);
    }
    @GetMapping("/read/{id}")
    public Building read(@PathVariable String id) {
        return buildingService.read(id);
    }

    @PostMapping("/update")
    public Building update(@RequestBody Building building) {
        return buildingService.update(building);
    }

    @PostMapping("/delete/{id}")
    public boolean delete(@PathVariable String id) {
        return buildingService.delete(id);
    }


    @GetMapping("/getall")
    public Set<Building> getAll() {
        return buildingService.getAll();
    }
}
