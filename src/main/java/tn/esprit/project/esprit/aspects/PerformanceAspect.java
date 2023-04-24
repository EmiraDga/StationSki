package tn.esprit.project.esprit.aspects;

import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.util.List;

@Component
@Aspect
@Slf4j

public class PerformanceAspect {

    @Around("execution(* tn.esprit.project.esprit.service.*.add*(..))")
   public  Object executiontime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Object object =  proceedingJoinPoint.proceed();
stopWatch.stop();
log.info("executionTime of {} is {} " , proceedingJoinPoint.getSignature().getName(), stopWatch.getLastTaskTimeMillis());
         return object;
    }

    @Around("execution(* tn.esprit.project.esprit.service.IinscriptionImpl.getAll(..))")
    public List <Object> executiontime2(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        List<Object> objectList = (List<Object>) proceedingJoinPoint.proceed();
        return objectList;
    }
 }
