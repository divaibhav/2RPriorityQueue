package implementation;

import myinterface.QueueADT;


public class MyQueue<E extends Comparable<E>> implements QueueADT<E> {
    int[] arr;

    E[] brr;
    int rear;
    int front;
    int size;

    public void enqueue(E element) {
        if(size != brr.length){

            brr[rear] = element;
            rear++;
            size++;
            rearrangeGeneric();
        }
        else {
            System.out.println("queue overflow");
        }
    }

    @Override
    public void rearrange() {
        for (int i = rear; i > front ; i--) {
            if(arr[i] > arr[i-1] ){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
            else{
                break;
            }
        }
    }
    public void rearrangeGeneric(){
        for (int i = rear; i > front; i++) {
            if(brr[i].compareTo(brr[i-1]) >= 1){
                E temp = brr[i];
                brr[i] = brr[i-1];
                brr[i-1] = temp;
            }
        }
    }
}
