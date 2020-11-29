import com.lagou.ShardingExampleApp;
import com.lagou.entity.City;
import com.lagou.repositrory.CityRepository;
import org.apache.shardingsphere.api.hint.HintManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingExampleApp.class)
public class TestHintAlgorithm {
    @Autowired
    CityRepository cityRepository;

    @Test
    public void testCityHint() {
        HintManager manager = HintManager.getInstance();
        manager.setDatabaseShardingValue(1L);
        List<City> cityList = cityRepository.findAll();
        cityList.forEach(System.out::println);
    }
}
