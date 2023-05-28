import static org.junit.jupiter.api.Assertions.*;


import com.mycompany.network.client.TaskConnectClient;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TaskConnectClientTest {
    
    public TaskConnectClientTest() {
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
    public void testCreateTask() {
        TaskConnectClient client = new TaskConnectClient();
        var _task = "task--eewlkj-1112k";
        var _parent = "parent-2112";
        var taskPath = client.CreateTask(_task, _parent);
        assertNotEquals(taskPath, _task);
        assertNotEquals(taskPath, _parent);
    }
    
    @Test
    public void testQueuePath() {
        TaskConnectClient client = new TaskConnectClient();
        var _task = "taklkw--eeewlkkj111-kjk"; 
        var _parent = "3kj2klnlk9kj0l;ll-0-";
        var _location = "asia/tokyo";
        var queuePath = client.QueuePath(_task, _parent, _location);
        assertEquals(queuePath, "");
    }
    
}