package tw.leonchen.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("logAdvice")
@Aspect
public class LogAdvice {


	//@Pointcut(value = "execution(* tw.leonchen.model.HouseService.selectBy*(..))")
	@Pointcut(value = "execution(* tw.leonchen.model.HouseService.selectBy*(..))")
	private void pointcut1(){};

	@Before(value = "pointcut1()")
	public void logBefore(JoinPoint point) {
		System.out.println("befroe at " + point.getTarget().getClass());
		System.out.println("calling " + point.getSignature().getName());
		System.out.println("using " + point.getArgs()[0]);
		System.out.println("before : going into joinTpoint method");
	}

	@Around(value = "pointcut1()")
	public Object logAround(ProceedingJoinPoint pp) throws Throwable {
		System.out.println("around at " + pp.getTarget().getClass());
		System.out.println("calling " + pp.getSignature().getName());
		System.out.println("using " + pp.getArgs()[0]);
		Object result = pp.proceed();
		System.out.println("around result" + result);
		return result;
	}

	@AfterReturning(pointcut = "pointcut1()", returning = "result")
	public void logAfter(JoinPoint point, Object result) {
		System.out.println("after method finished");
		System.out.println("after result:" + result);
	}

	@AfterThrowing(pointcut = "pointcut1()", throwing = "e")
	public void logThrow(JoinPoint point, Throwable e) {
		System.out.println("Exception:" + e);
	}

}
