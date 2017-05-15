package java8examples.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class TestNashornJSEngine {

	public static void main(String[] args) {
		
		ScriptEngineManager manager=new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByName("JavaScript");
		System.out.println(engine.getClass().getName());
		
		try {
			System.out.println(engine.eval("function f() {return 1;}; f()+1;"));
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
