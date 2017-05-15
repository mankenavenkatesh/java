package java8examples.interfacemethods;

public interface Interface2 {

	default public void log(String str){
		System.out.println("I2 Logging - "+str);
	}
}
