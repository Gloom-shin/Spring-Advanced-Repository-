package hello.advanced.trace.template;

import hello.advanced.trace.template.code.AbstractTemplate;
import hello.advanced.trace.template.code.SubClassLogic1;
import hello.advanced.trace.template.code.SubClassLogic2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TemplateMethodTest {

    @Test
    void templateMethodV0(){
        logic1();
        logic2();
    }


    private void logic1() {
        long startTime = System.currentTimeMillis();
        log.info("비즈니스 로직1 실행");

        long endTime = System.currentTimeMillis();

        long resultTime = endTime - startTime;
        log.info("resultTime= {}", resultTime );
    }

    private void logic2() {
        long startTime = System.currentTimeMillis();
        log.info("비즈니스 로직2 실행");

        long endTime = System.currentTimeMillis();

        long resultTime = endTime - startTime;
        log.info("resultTime= {}", resultTime );

    }

    /**
     * 템플릿 메서드 패턴 적용
     */
    @Test
    void templateMethodV1(){
        AbstractTemplate abstractTemplate1 = new SubClassLogic1();
        AbstractTemplate abstractTemplate2 = new SubClassLogic2();

        abstractTemplate1.execute();
        abstractTemplate2.execute();

    }

}
