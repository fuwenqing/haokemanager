package cn.haoke.dubbo.server.pojo;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public abstract class BasePojo implements java.io.Serializable {
        private LocalDateTime created;
    private LocalDateTime updated;
}