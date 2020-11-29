import com.lagou.ShardingExampleApp;
import com.lagou.entity.City;
import com.lagou.repositrory.CityRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingExampleApp.class)
public class TestMasterSlave {
    @Autowired
    CityRepository cityRepository;

    @Test
    public void testCityAdd() {
        City city = new City();
        city.setProvince("广东");
        city.setName("广州");
        cityRepository.save(city);
    }
}
