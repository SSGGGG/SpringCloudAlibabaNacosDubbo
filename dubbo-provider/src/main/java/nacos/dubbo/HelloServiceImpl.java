package nacos.dubbo;

import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Excelman
 * @date 2021/9/29 下午3:24
 * @description
 */
@Service(version = "${service.version}")
public class HelloServiceImpl implements HelloService{

    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String hello(String id) {
        logger.info(RpcContext.getContext().getRemoteHost() + "正在远程调用服务...");
        return "参数为：" + id;
    }
}
