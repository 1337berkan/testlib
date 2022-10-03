 package test123;

import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;


import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFDocument;



public class maintest {
	
	private static final ParameterizedType name = null;

	public static void main(String[] args  ) throws NoSuchMethodException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException{
		System.out.println("Test");
		Radar radar = new Radar(); 
		
		Field[] fields = radar.getFields();
		for(Field field : fields) {
			System.out.println("main.main() " + field.getName() + " ->" + field.getType().getCanonicalName());
			
			if(field.isAnnotationPresent(null)) {
				 DocumentedField annotation = field.getAnnotation(null);
				 System.out.println("main.main()  document using Word " + annotation.isusedWord());
				 
			}
		}
		
		@DocumentedList(listType = Radar.class)
		List<Radar> list = new ArrayList<>();
		
		ArrayList<Radar> Radars = new ArrayList<>();
		
		
		//instanceof type == type ise bastýr()
		
		DocumentListContainer<Radar> lc = new DocumentListContainer(list);
		Field lf = lc.getClass().getDeclaredField("list");
		Type genericType = lf.getGenericType();
		Type[] 
		
		ParameterizedType name = (ParameterizedType) genericType;
		
		Type t = name.getActualTypeArguments() [0];
		TypeVariable x = (TypeVariable)t;
		GenericDeclaration genericDeclaration = x.getGenericDeclaration();
		
		
		
			
			
			
	
		}
				
		
	}


