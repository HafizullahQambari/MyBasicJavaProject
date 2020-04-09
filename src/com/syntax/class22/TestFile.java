package com.syntax.class22;

public class TestFile {
	public static void main(String[] args) {
		
//		File file=new JavaFile(); 
//		file.open();
//		file.close();
//		file.edit();
//		
//		File word=new WordFile();
//		word.open();
//		word.close();
//		word.edit();
//		
//		File pdf=new PDFFile();
//		pdf.open();
//		pdf.close();
//		pdf.edit();
//		
//		System.out.println("======USING ARRAYS AND FOR LOOP==============");
		File[] f= {new JavaFile(), new WordFile(), new PDFFile()};
		
		for(int i=0; i<f.length; i++) {
			f[i].open();
			f[i].close();
			f[i].edit();
		}
	}
		
}
