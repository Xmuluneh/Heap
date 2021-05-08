package com.Muluneh;

public class Heap {
    private int[] data;
    private int maxsize;
    private int capsize;

    public Heap() {
        maxsize = 10;
        data = new int[maxsize];
        capsize = 0;
        for (int i = 0; i < data.length; i++)
            data[i] = -1;

    }

    public int length() {
        return capsize;

    }

    public boolean isEmpty() {
        return capsize == 0;
    }

    public boolean isFull() {
        return capsize == maxsize;
    }

    public void insert(int e) {
        if (isFull()) {
            System.out.println("The heap is full");
            return;
        }
        capsize = capsize + 1;
        int index = capsize;
        while (index > 1 && e > data[index / 2]) {
            data[index] = data[index / 2];
            index = index / 2;
        }
        data[index] = e;
    }

    public int maxNode() {
        if (isEmpty()) {
            System.out.println("The heap is empty");
            return -1;
        }
        return data[1];
    }
    public int deleteMax(){
        if(isEmpty()){
            System.out.println("The heap is empty");
            return -1;
        }
        int e =data[1];
        data[1]=data[capsize];
        data[capsize]=-1;
        capsize=capsize-1;
        int pIndex=1;
        int cIndex=2;
        while(cIndex<=capsize) {
            if (data[cIndex] < data[cIndex + 1]) {
                cIndex = cIndex + 1;
            }
            if (data[pIndex]<data[cIndex]){
                int temp=data[pIndex];
                data[pIndex]=data[cIndex];
                data[cIndex]=temp;
                pIndex=cIndex;
                cIndex=2*pIndex;
            }else{
                break;
            }
        }
        return e;

    }
    public void heapSort(int []a,int n){
        Heap heap=new Heap();
        for(int i=0;i<n;i++){
           heap.insert(a[i]);
        }
        int k=n-1;
        for(int i=0;i<n;i++){
            a[k]=heap.deleteMax();
            k--;
        }
    }
    public void array_display(int []a,int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+",");
        }
        System.out.println();
    }



    public void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }
        System.out.println();

    }


}
