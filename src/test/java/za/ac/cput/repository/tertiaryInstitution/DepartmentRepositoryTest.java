package za.ac.cput.repository.tertiaryInstitution;//package za.ac.cput.repository.tertiaryInstitution;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ac.Department;
//import za.ac.DepartmentFactory;
//import za.ac.DepartmentRepository;
//
//import static org.junit.jupiter.api.Assertions.*;
//
///**
// * DepartmentRepositoryTest.java
// * Test cases for Department Repository implementation
// * @author Jonathan Kleynhans 217268153
// * 22 July 2021
// */
//
//@TestMethodOrder(MethodOrderer.MethodName.class)
//class DepartmentRepositoryTest {
//    private static DepartmentRepository repository = DepartmentRepository.getRepository();
//    private static Department department = DepartmentFactory.build("021", "PROJECTS", " ");
//
//    @Test
//    void a_create(){
//        Department created = repository.create(department);
//        assertEquals(department.getDepartmentId(), created.getDepartmentId());
//        System.out.println("Created: " + created);
//    }
//
//    @Test
//    void b_read(){
//        Department read = repository.read(department.getDepartmentId());
//        assertNotNull(read);
//        System.out.println("Read: " + read);
//    }
//
//    @Test
//    void c_update(){
//        Department updated = new Department.DepartmentBuilder().copy(department).setDepartmentDesc("Test").build();
//        assertNotNull(repository.update(updated));
//        System.out.println("Updated: " + updated);
//    }
//
//    @Test
//    void e_delete(){
//        boolean x = repository.delete(department.getDepartmentId());
//        assertTrue(x);
//        System.out.println("Deleted: " + x);
//    }
//
//    @Test
//    void d_getAll(){
//        System.out.println("Display all: \n" + repository.getAll());
//    }
//
//}