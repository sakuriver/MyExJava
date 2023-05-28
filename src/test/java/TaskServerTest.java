import static org.junit.jupiter.api.Assertions.*;

import com.mycompany.network.server.TaskServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TaskServerTest {
    
    public TaskServerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        String project = "project-1123--eeq";
        String queue = "2122-jio";
        String location = "asia/tokyo";
        String[] applyPathes = new String[]{};
        
        TaskServer taskServer = new TaskServer(
            project,
            queue,
            location,
            applyPathes
        );
        
        assertEquals(project, taskServer.project);
        assertEquals(queue, taskServer.queue);
        assertEquals(location, taskServer.location);
        assertEquals(applyPathes, taskServer.applyPathes);
        
    }
    
}