package com.vv.init;

import lombok.extern.slf4j.Slf4j;

/**
 * @author kw
 * @program SyncInitBoot
 * @description 初始化人脸扫描
 * @create 2023 - 06 - 07 22:28
 **/
@Slf4j
public class InitFaceOcr {

    public void init() {
        log.info("initFaceOcr Bean init start" + Thread.currentThread().getName());
        try {
            Thread.sleep(5000L); // 线程睡眠5秒，模拟业务启动
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("initFaceOcr Bean init end"+Thread.currentThread().getName());
    }
}
