package test123;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import javax.lang.model.element.Element;

import org.apache.poi.xwpf.usermodel.*;
import org.apache.poi.xwpf.model.*;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;

import test123.DocumentedField.FIELD_TYPE;



public class Radar extends RadarBase {
	
	@DocumentedField(isusedWord = true, type = FIELD_TYPE.NUMBER) 
	private double range = 0.0;
	
	@DocumentedField(isusedWord = true, type = FIELD_TYPE.TEXT)
	private String RadarName = null;
	
	@DocumentedField(isusedWord = true, type = FIELD_TYPE.NUMBER)
	private int Hertz = 10; 
	
	
	private List<Element> list;
	private Map<String,List<Element>> elementmap; 
	
	@DocumentedField(type = DocumentedField.FIELD_TYPE.IMAGE)
	private BufferedImage image = null; 
	
	public Radar() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
	
		Radar a = new Radar();
		  
		List<Object> get = Radar.class.getField("list").get(a);
		for(Object object : get) {
			Object get1 = object.getClass().getFields("valý").get(object);
			yazdýrma methodu yazdýr = String.valueOf(get1);
			
		}
		
	}
	
	public static void main(String[]	args ) throws Exception  {
		
		XWPFDocument doc = new XWPFDocument(new FileInputStream("templatetest1.docx"));
		XWPFWordExtractor we = new XWPFWordExtractor(doc);
        XWPFTable table = doc.createTable();
        XWPFParagraph para = doc.createParagraph();
        XWPFRun run = para.createRun();
		XWPFRun run = para.set
		
		for(int i = 1; i >= Array.getLength(); i++) {
			table.
		}
			
			for(j = 1; j >= Array.getLength(); j++){
				
		
			}
			
		FileOutputStream out = new FileOutputStream(new File ("templatetest2.docx"));
		Filepath("/users/berkan/desktop/")
		
	
	} 
	
	public void test() {
	}


	public Field[] getFields() {
		// TODO Auto-generated method stub
		return null;
	} 

	}


