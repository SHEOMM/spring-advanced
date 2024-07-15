package hello.advanced.template.code;

import hello.advanced.template.AbstractTemplate;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class SubClassLogic2 extends AbstractTemplate {
    @Override
    protected void call() {
        log.info("비즈니스 로직2 실행");
    }
}