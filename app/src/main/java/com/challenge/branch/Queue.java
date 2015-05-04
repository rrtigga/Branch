package com.challenge.branch;

import org.w3c.dom.Node;

import java.util.LinkedList;


/**
 * Created by Spicycurryman on 3/12/15.
 */
public class Queue<T> {

    private LinkedList<T> queue;
    private int cursor;
    private Node head;




    public Queue() {
        queue = new LinkedList<T>();
        cursor = -1;
        head = null;

    }

    public void enqueue(T item){
        queue.add(item);
    }

    public T dequeue(T item){
        return(queue.remove(queue.indexOf(item)));
    }

    public T peekAt(int location){
        return queue.get(location);
    }

    public int getSize(){
        return queue.size();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void clear(){
        queue.clear();

    }

    public T peek(){
        return queue.getFirst();
    }

    public int positionOf(T item){
        return queue.indexOf(item);
    }

    public void removeAt(int index){

        queue.remove(index);
    }

    public T first(){
        return peek();
    }

    public void insertAt(int element, T item)
    {
        queue.add(element, item);
    }

    public void next(){
        cursor++;

    }

}