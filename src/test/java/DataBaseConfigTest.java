

import com.mycompany.db.DataBaseConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DataBaseConfigTest {
    
    public DataBaseConfigTest() {
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
        String _userName = "dbUser123"; 
        String _password = "15963";
        String _hostName = "localhost:8080";
        String _charSet =  "UTF-8";

        DataBaseConfig databaseConfig = new DataBaseConfig(
                _userName,
                _password,
                _hostName,
                _charSet
       );
        assertEquals(_userName, databaseConfig.UserName);
        assertEquals(_password, databaseConfig.Password);
        assertEquals(_hostName, databaseConfig.HostName);
        assertEquals(_charSet, databaseConfig.CharSet);
    }
    
}