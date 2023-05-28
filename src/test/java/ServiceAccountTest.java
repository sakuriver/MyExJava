import static org.junit.jupiter.api.Assertions.*;

import com.mycompany.db.crm.ServiceAccount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ServiceAccountTest {
    
    public ServiceAccountTest() {
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
        // 認証用データのセットアップが大丈夫かを確認する
       int _id = 2003;
       String _name = "tanaka tarou";
       String _tel = "111-3333-4533"; 
       String _deviceNumber = "andoroid-qeweq-qq";
       String _mailAddress = "test@test.com";
       String _location = "asia/tokyo";
       boolean _isPublic = false;
        
        
        ServiceAccount accountData = new ServiceAccount(
            _id,
            _name,
            _tel,
            _deviceNumber,
            _mailAddress,
            _location,
            _isPublic
        );
        assertEquals(_id, accountData.id);
        assertEquals(_name, accountData.name);
        assertEquals(_tel, accountData.tel);
        assertEquals(_deviceNumber, accountData.deviceNumber);
        assertEquals(_mailAddress, accountData.mailAddress);
        assertEquals(_location, accountData.location);
        assertEquals(_isPublic, accountData.isPublic);

    }
    
}