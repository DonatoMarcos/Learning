package reflections;

import java.lang.reflect.Field;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.lang.reflect.Constructor;

public class Reflection {

	    public static void main(String[] args) {
	        Class<?> classePessoa = Pessoa.class;
	        
	        Field[] campos = classePessoa.getDeclaredFields();
	        for (Field campo : campos) {
	            System.out.println("Field - "+campo.getName());
	        }

	        Constructor<?>[] construtores = classePessoa.getConstructors();
	        for (Constructor<?> construtor : construtores) {
	            System.out.println("Construtor - "+construtor.getName());
	        }	  
	        
	        Class<?>[] classeParameters = construtores[0].getParameterTypes();
	        for (Class<?> classeParameter : classeParameters) {
	            System.out.println("Parameter - "+classeParameter);
	        }	  

            System.out.println("Parameters - "+Arrays.toString(construtores[0].getParameters()));

	    }
}

