package za.ac.cput.repository.physical.impl;

/**
 * author: Llewelyn Klaase
 * student no: 216267072
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.physical.Building;

@Repository
public interface BuildingRepository extends JpaRepository<Building, String> {
}
