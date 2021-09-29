package nacos.dubbo;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Excelman
 * @date 2021/9/29 下午3:31
 * @description
 */
@RestController
public class DubboConsumer {

    @Reference(version = "${service.version}")
    private HelloService helloService;

    @RequestMapping("/testDubbo")
    public void testDubbo(){
        String excelman = helloService.hello("excelman");
        System.out.println("返回结果：" + excelman);
    }

}
