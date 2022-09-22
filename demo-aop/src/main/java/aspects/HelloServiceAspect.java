package aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {

    //Package,class,name of methood
    @Before("execution(* services.HelloService.hello(..))")
    public void before() {
        System.out.println("Before");
    }

    @After("execution(* services.HelloService.hello(..))")
    public void after() {
        System.out.println("After");
    }

    @AfterReturning("execution(* services.HelloService.hello(..))")
    public void afterReturning() {
        System.out.println("AfterReturning");
    }

    @AfterThrowing("execution(* services.HelloService.hello(..))")
    public void afterThrowing() {
        System.out.println("AfterThrowing");
    }

//    @Around("execution(* services.HelloService.hello(..))")
//    public Object around(ProceedingJoinPoint joinPoint) {
//        System.out.println("A");
//        Object result = null;
//        try {
//            result = joinPoint.proceed(new Object[]{"Bill"});
//            System.out.println("B");
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
//        return result;
//    }
}
