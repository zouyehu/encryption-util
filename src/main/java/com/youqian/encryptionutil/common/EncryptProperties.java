package com.youqian.encryptionutil.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName EncryptProperties
 * @Author HU
 * @Date 2022/11/8 17:17
 * @Version 1.0
 */
@ConfigurationProperties(prefix = "spring.encrypt")
@Component
public class EncryptProperties {
    // 这一块一定要16位或者整数倍，最多256
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}

