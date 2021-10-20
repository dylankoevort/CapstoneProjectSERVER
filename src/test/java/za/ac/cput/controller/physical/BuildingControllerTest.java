/**
 * author: Llewelyn Klaase
 * student no: 216267072
 */
package za.ac.cput.controller.physical;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import za.ac.cput.entity.physical.Building;
import za.ac.cput.factory.physical.BuildingFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class BuildingControllerTest {

    @Autowired
    private static Building building = BuildingFactory.build("ENG1",50,"Engineering Building","Disctrict Six Campus");

    private TestRestTemplate restTemplate;
    private final String BASE_URL = "http://localhost:8080/building";


    @Test
    @Order(1)
    void create() {
        String url = BASE_URL+ "/create";
        ResponseEntity<Building> postResponse = restTemplate.postForEntity(url, building, Building.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        assertEquals(postResponse.getStatusCode(), HttpStatus.OK);
        building = postResponse.getBody();
        System.out.println("Saved data: " + building);
        assertEquals(building.getBuildingID(), postResponse.getBody().getBuildingID());
    }

    @Test
    @Order(2)
    void read_Building() {
        String url = BASE_URL + "/read" + building.getBuildingID();
        System.out.println("URL for read: " + url);
        ResponseEntity<Building> response = restTemplate.getForEntity(url, Building.class);
        assertEquals(response.getBody().getBuildingID(), response.getBody().getBuildingID());
    }

    @Test
    @Order(3)
    void update_Building() {
        Building updated = new Building.BuildingBuilder().copy(building).setBuildingID("ENG2").build();
        String url = BASE_URL + "/update";
        System.out.println("URL for update: " + url);
        System.out.println("Post data: " + updated);
        ResponseEntity<Building> response = restTemplate.postForEntity(url, updated, Building.class);
        assertNotNull(response.getBody());
    }

    @Test
    @Order(4)
    void delete_Building() {
        String url = BASE_URL + "/delete" + building.getBuildingID();
        System.out.println("URL: " + url);;
        restTemplate.delete(url);
    }

    @Test
    @Order(5)
    void getAll_Building() {
        String url = BASE_URL + "/getall";
        HttpHeaders head = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, head);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println(url);
        System.out.println("Show All Buildings:");
        System.out.println(response);
        System.out.println(response.getBody());

    }
}