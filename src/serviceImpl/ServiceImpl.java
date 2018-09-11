package serviceImpl;

import java.util.EmptyStackException;
import java.util.Stack;

import service.Service;

public class ServiceImpl implements Service{
	Stack<String> stack = new Stack<>();

	@Override
	public String push(String params) {
		return stack.push(params);
		
	}

	@Override
	public String pop() {
		try {
		return stack.pop();
		}catch(EmptyStackException ex) {
			return null;
		}
		
	}

	@Override
	public String peek() {
		try {
		return stack.peek();
		}catch(EmptyStackException ex) {
			return null;
		}
		
	}

	@Override
	public Stack<String> getAll() {
		if(!stack.empty()) {
			return stack;
		}
		return null;
	}

}
