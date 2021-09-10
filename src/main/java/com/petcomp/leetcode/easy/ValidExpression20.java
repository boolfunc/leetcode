package com.petcomp.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ValidExpression20 {

    private static Map<Character, Character> values = new HashMap<Character, Character>(){

        {
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }

    };
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(values.containsValue(ch)){
                stack.push(ch);
            }else{
                Character poped = stack.pop();
                if (poped != null && (char)poped != values.get(ch)){
                    return false;
                }
            }

        }

        return stack.isEmpty();

    }

    private class Stack<T>{
        private Object[] items = new Object[10000];
        private int size;
        private int top = -1;

        public void push(T value){
            items[++top] = value;
            size++;
        }

        public T pop(){
            @SuppressWarnings({"unchecked"})
            T item = (T)items[top--];
            size--;
            return item;
        }

        public boolean isEmpty(){
            return size == 0;
        }
    }

    public static void main(String[] args) {
        String test = "([)";
        ValidExpression20 valid = new ValidExpression20();
        System.out.println(valid.isValid(test));
    }
}
