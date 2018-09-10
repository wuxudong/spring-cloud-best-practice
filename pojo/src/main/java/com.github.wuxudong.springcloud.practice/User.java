package com.github.wuxudong.springcloud.practice;

import java.util.Stack;

public class User {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        class PeekbleStack<T> {
            Stack<T> stack = new Stack<>();

            Object empty = new Object();

            Object top = empty;

            public T push(T o) {
                if (top != empty) {
                    stack.push((T) top);
                }

                top = o;
                return o;
            }

            public T peek() {
                if (top != empty) {
                    return (T) top;
                } else {
                    T pop = stack.pop();
                    top = pop;
                    return pop;
                }
            }

            public T pop() {
                if (top != empty) {
                    T o = (T)top;
                    top = empty;
                    return o;
                } else {
                    return stack.pop();
                }
            }

        }

    }
}
