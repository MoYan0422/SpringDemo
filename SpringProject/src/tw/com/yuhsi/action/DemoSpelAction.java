package tw.com.yuhsi.action;

import java.util.ArrayList;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import tw.com.yuhsi.model.TruckBean;

public class DemoSpelAction {

	public static void main(String[] args) {
		SpelExpressionParser parser = new SpelExpressionParser();
		Expression parseExpression = parser.parseExpression("'hola,'+'amigo!!'");
		String result1 = parseExpression.getValue(String.class);
		System.out.println(result1);
		
		Expression parseExpression2 = parser.parseExpression("2*5+1");
		Integer value = parseExpression2.getValue(Integer.class);
		System.out.println(value);
		
		
		StandardEvaluationContext context = new StandardEvaluationContext();
		TruckBean truckBean1 = new TruckBean(1001,"Bmw");
		TruckBean truckBean2 = new TruckBean(1002,"Mercedes-Benz");
		
		ArrayList<TruckBean> trucks = new ArrayList<TruckBean>();
		trucks.add(truckBean1);
		trucks.add(truckBean2);
		
		context.setVariable("trucks", trucks);
		
		String brand = parser.parseExpression("#trucks[1].brand").getValue(context,String.class);
		System.out.println(brand);
	}

}
