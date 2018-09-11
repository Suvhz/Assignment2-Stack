package service;

import java.util.Stack;

public interface Service {
	public String push(String params);
	public String pop();
	public String peek();
	public Stack<String> getAll();

}
