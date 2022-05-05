package hello.core.web;

import hello.core.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoServce {

    private final MyLogger myLogger;

    public void logic(String testId) {
        myLogger.log("Service.Id = " + testId);
    }
}
