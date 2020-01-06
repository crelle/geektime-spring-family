package geektime.spring.data.simplejdbcdemo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
/**
 * @Data省略掉了getter和setter方法
 * @Builder提供构造方法
 */
public class Foo {
    private Long id;
    private String bar;
}
