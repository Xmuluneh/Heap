package com.Muluneh;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	Heap heap=new Heap();
	heap.insert(20);
	heap.insert(90);
	heap.insert(2);
	heap.insert(14);
	heap.insert(15);
	heap.display();
	heap.insert(100);
	heap.insert(190);
	heap.insert(200);
	heap.insert(120);
		System.out.println("Before deletion heap is");
		heap.display();
	heap.deleteMax();
		System.out.println("After the deletion the heap ");
	heap.display();
	System.out.println("The max element is :"+heap.maxNode());
		System.out.println("The Current size of the heap is :"+heap.length());
		int []a={63,250,835,947,651,28};
		int n=a.length;
		heap.heapSort(a,n);
		heap.array_display(a,n);
    }
}
