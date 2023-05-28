import static org.junit.jupiter.api.Assertions.*;

import com.mycompany.network.server.LoggingServerRecord;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LoggingServerRecordTest {
    
    public LoggingServerRecordTest() {
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
        var execDateTime = "2020-05-20 00:00:00";
        var bodyData = "{'key':'value'}";
        LoggingServerRecord _record = new LoggingServerRecord(execDateTime, bodyData);
        assertEquals(execDateTime, _record.ExecDateTime);
        assertEquals(bodyData, _record.BodyData);
    }
    
}