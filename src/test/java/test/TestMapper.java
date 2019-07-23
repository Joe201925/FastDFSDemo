package test;

import com.itqf.mapper.HouseInfoMapper;
import com.itqf.pojo.HouseInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Description:
 * @Company: 千锋互联
 * @Author: 李丽婷
 * @Date: 2019/7/22
 * @Time: 下午4:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMapper {


    @Resource
    private HouseInfoMapper houseInfoMapper;
    //测试 哈哈哈哈哈   do you like me ?
    @Test
    public    void  test(){
         //测试 哈哈哈哈哈
        int i  = 10;
        HouseInfo info = new HouseInfo();
        info.setTitle("好房出租");
        info.setAddress("北京海淀区");
        info.setPrice(10000);
        info.setImages("http://192.168.82.88:82/group1/M00/00/00/wKhSWF0yx0WAca9hAABdrZgsqUU496.jpg");

       int i =  houseInfoMapper.saveHouseInfo(info);
        System.err.println(i>0?"success":"fail");
    }
}
