import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.network.pubsub.QueueMessage;
import com.mycompany.network.pubsub.MessageTopic;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class QueueMessageTest {
    
    public QueueMessageTest() {
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
        // 新刊通知を発行する
        String _name = "new book notification";
        int _state = 1;
        String _commandMessage = "10 * * * exec_message_pub";
        String _description = "新刊キュー確認して通知を送信";
        MessageTopic _target = new MessageTopic();
        int _execCode = 1000;
            
        QueueMessage queueMessage = new QueueMessage(
                _name,
                _state,
                _commandMessage,
                _description,
                _target,
                _execCode
        );
        assertEquals(_name, queueMessage.name);
        assertEquals(_state, queueMessage.state);
        assertEquals(_commandMessage, queueMessage.commandMessage);
        assertEquals(_target, queueMessage.target);
        assertEquals(_execCode, queueMessage.execCode);
    }
    
}