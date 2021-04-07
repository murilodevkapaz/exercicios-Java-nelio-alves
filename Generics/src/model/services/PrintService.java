package model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	private List<T> list= new ArrayList<>();


	public List<T> getList() {
		return list;
	}

	public void addValue(T value) {
		list.add(value);
	}
	
	public void print() {
		for(T l : list) {
			System.out.println(l);
		}
	}
	
	
	
	
}
