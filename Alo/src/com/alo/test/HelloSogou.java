package com.alo.test;


public class HelloSogou {
	public static  void main(String[] a) {
		ClassLoader loader = HelloSogou.class.getClassLoader();
		if(loader==null) {
			System.out.println("null");
			return;
		}
		System.out.println(loader.toString());
		System.out.println(ClassLoader.getSystemClassLoader());
		System.out.println(color.red);
	}
/*	public void testClassIdentity() { 
		   String classDataRootPath = "d:\\myloader\\HelloSogou"; 
		   FileSystemClassLoader fscl1 = new FileSystemClassLoader(classDataRootPath); 
		   FileSystemClassLoader fscl2 = new FileSystemClassLoader(classDataRootPath); 
		   String className = "com.example.Sample";    
		   try { 
		       Class<?> class1 = fscl1.loadClass(className); 
		       Object obj1 = class1.newInstance(); 
		       Class<?> class2 = fscl2.loadClass(className); 
		       Object obj2 = class2.newInstance(); 
		       Method setSampleMethod = class1.getMethod("setSample", java.lang.Object.class); 
		       setSampleMethod.invoke(obj1, obj2); 
		   } catch (Exception e) { 
		       e.printStackTrace(); 
		   } 
		}*/
	
	public void Box() {
		Integer i = new Integer(1);
		System.out.println(i);
	}
	public enum color{
		red,blue,yellow,gray;

		private color() {
			System.out.println("test");
		}
		
	}

}