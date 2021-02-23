import com.imooc.Application;
import com.imooc.pojo.Stu;
import com.imooc.service.StuService;
import com.imooc.service.TestTransService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TransTest {

    @Autowired
    private StuService stuService;

    @Autowired
    private TestTransService testTransService;

    @Test
    public void myTest() {
//        stuService.testPropagationTrans();
//        testTransService.testPropagationTrans();
        Stu stuInfo = stuService.getStuInfo(1205);
        System.out.println(stuInfo.getId());
        System.out.println(stuInfo.getName());
    }

}
