package za.ac.cput.service.physical.impl;
/**
 * author: Llewelyn Klaase
 * student no: 216267072
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.physical.Building;
import za.ac.cput.repository.physical.impl.BuildingRepository;
import za.ac.cput.service.physical.IBuildingService;

import java.util.HashSet;
import java.util.Set;

@Service
public class BuildService implements IBuildingService {
    @Autowired
    private BuildingRepository repository;

    @Override
    public Building create(Building building) {
        return this.repository.save(building);
    }

    @Override
    public Building read(String s) {
        return this.repository.findById(s).orElse(null);
    }

    @Override
    public Building update(Building building) {
        return this.repository.save(building);
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
    public Set<Building> getAll() {
        return new HashSet<>(this.repository.findAll());
    }
}
