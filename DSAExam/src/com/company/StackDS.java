package com.company;

public class StackDS {
    private int top;
    private int maxSize;
    private int[] arr;


    private int pop;
    private int push;
    private int count;


    StackDS(int size){
    this.maxSize = size;
    this.arr = new int[maxSize];
    this.top = -1;
    }
    public boolean isEmpty(){
    return top == -1;
    }
    public boolean isFull(){
    return top ==  maxSize -1;
    }


    public void push(int item){
        if(isFull()){ //O(n)
         throw new IllegalStateException("Stack Full");
        }
     top = top + 1;
     arr[top] = item;
    }

    public int pop(){
        if(isEmpty()){ // O(n)
        throw new IllegalStateException("Unable to Delete, Stack is empty");
        }
     int temp = arr[top];
    top --;
    return temp;
    }


    public void print(){
        while(!isEmpty()){ //O(n)
         System.out.println(pop());
        }
    }
    public void evenNumbers(){  //O(n)
        for (int i = 0; i < count ; i++) {
            if (arr[i] % 2 == 0 ){
                arr[i]= arr[i+1];
                System.out.println(arr[i]);
            }
        }
    }

    public void powerOfNumber(int item){
        for (int i = 0; i < count ; i++) { // O(n)
            item = item * item;
            System.out.println();
        }
    }

    public void avgNum(){ //O(n)
        int Avg = 0;

        for (int i = 0; i < count ; i++) {
            Avg += arr[i+1];
        }
        Avg = Avg/maxSize;
    }

    public void reverseStack(){  //O(n)
        for (int i = count ; i < count - 1 ; i++) {
            arr[i] = arr[i+1];
            System.out.println(arr[i]);
        }
    }

    public void product(){
        int product = 1;
        for (int i = 0; i < count ; i++) { //O(n)
            product= arr[i] * arr[i+1];
        }
        System.out.println(product);
    }


}