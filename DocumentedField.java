package test123;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

public @interface DocumentedField {

	boolean isusedWord() default false;
	FIELD_TYPE type()	;
	
	public enum FIELD_TYPE{
		TEXT,
		IMAGE,
		NUMBER;
		
	}

}
