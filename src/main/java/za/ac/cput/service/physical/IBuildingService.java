/**
 * author: Llewelyn Klaase
 * student no: 216267072
 */
package za.ac.cput.service.physical;

import za.ac.cput.entity.physical.Building;
import za.ac.cput.service.IService;
import java.util.Set;

public interface IBuildingService extends IService<Building, String> {
    Set<Building> getAll();
}
