package com.jzf.innerclass;

class People{
	
}

public class Man {
	
	public People getWoman(){
	   class Woman extends People{
			
		}
		return new Woman();
	}
	
}
