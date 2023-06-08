package com.vv;

import com.alipay.sofa.runtime.api.annotation.SofaAsyncInit;
import com.vv.init.InitFaceOcr;
import com.vv.init.InitHandSignOrc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AlipaySofaSyncInitApplication {
    // 1.848 seconds
    public static void main(String[] args) {
        SpringApplication.run(AlipaySofaSyncInitApplication.class, args);
    }

    // 自定义初始化Bean 2.092 seconds ,, 加入initMethod = "init"  11.908 seconds
    // 引入sofa  7.137 seconds
    @SofaAsyncInit
    @Bean(initMethod = "init")
    public InitFaceOcr initFaceOcr() {
        return new InitFaceOcr();
    }

    @SofaAsyncInit
    @Bean(initMethod = "init")
    public InitHandSignOrc initHandSignOrc() {
        return new InitHandSignOrc();
    }


}
