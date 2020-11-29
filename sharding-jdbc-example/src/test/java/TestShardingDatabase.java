import com.lagou.ShardingExampleApp;
import com.lagou.entity.BOrder;
import com.lagou.entity.City;
import com.lagou.entity.Position;
import com.lagou.entity.PositionDetail;
import com.lagou.repositrory.BOrderRepository;
import com.lagou.repositrory.CityRepository;
import com.lagou.repositrory.PositionDetailRepository;
import com.lagou.repositrory.PositionRepository;
import com.lagou.utils.RandomUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.annotation.Repeat;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingExampleApp.class)
public class TestShardingDatabase {
    @Autowired
    PositionRepository positionRepository;
    @Autowired
    PositionDetailRepository detailRepository;
    @Autowired
    CityRepository cityRepository;
    @Autowired
    BOrderRepository bOrderRepository;


    @Test
    public void testAdd() {
        for (int i = 1; i < 21; i++) {
            Position position = new Position();
            //position.setId(i);
            position.setCity("深圳");
            position.setName("java架构师" + i);
            position.setSalary("30K~50k");
            positionRepository.save(position);
            PositionDetail detail = new PositionDetail();
            detail.setPid(position.getId());
            detail.setDescription("this is a message: " + position.getName());
            detailRepository.save(detail);
        }
    }
    @Test
    public void testFindAll(){
        List<Position> positionList = positionRepository.findAllByOrderByIdAsc();
        for (Position position : positionList) {
            System.out.println(position);
        }
    }

    @Test
    public void testFindById(){
        Optional<Position> optional = positionRepository.findById(539529691837497345L);
        if (optional.isPresent()){
            Position position = optional.get();
            System.out.println(position);
        }
    }
    @Test
    public void testBroadcast(){
        City city = new City();
        city.setName("广州");
        city.setProvince("广东");
        cityRepository.save(city);
    }

    @Test
    @Repeat(10000)
    public void  testBOrder(){
        BOrder order = BOrder.builder().companyId(RandomUtil.randomNumbers(15))
                .publishUserId(RandomUtil.randomNumbers(15))
                .positionId(RandomUtil.randomNumbers(15))
                .userId(RandomUtil.randomNumbers(15))
                .positionName("java架构师")
                .name("老妖怪的小可爱" + RandomUtil.randomNumbers(3))
                .workYear(RandomUtil.randomNumbers(1))
                .resumeType(RandomUtil.randomInt(0, 1))
                .resumeId(RandomUtil.randomNumbers(10))
                .status("AUTO_DELIVER")
                .createTime(new Date())
                .operateTime(new Date())
                .isDel(false).build();
        bOrderRepository.save(order);
    }

}
