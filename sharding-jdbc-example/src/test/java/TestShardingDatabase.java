import com.lagou.ShardingExampleApp;
import com.lagou.entity.Position;
import com.lagou.repositrory.PositionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingExampleApp.class)
public class TestShardingDatabase {
    @Autowired
    PositionRepository positionRepository;


    @Test
    public void testAdd(){
        for (int i = 1; i < 21; i++) {
            Position position = new Position();
            position.setId(i);
            position.setCity("深圳");
            position.setName("java架构师"+i);
            position.setSalary("30K~50k");
            positionRepository.save(position);
        }
    }

}
