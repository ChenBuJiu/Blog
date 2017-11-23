package com.alo.offer;

public class EnumSingleton {
	
	private EnumSingleton() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static EnumSingleton getSingleton() {
		return Singleton.instance.getSingleton();
	}

	public enum Singleton{
		instance;
		private EnumSingleton singleton;
		private Singleton() {
			singleton =  new EnumSingleton();
		}
		public EnumSingleton getSingleton() {
			return this.singleton;
		}
		
	}
}
