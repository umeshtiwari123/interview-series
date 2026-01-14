package com.altemetric;

public class Interview {
    /*
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.lang.InterruptedException;
import java.util.*;
class Main  {
    private static final Object lock = new Object();
    private static boolean numberTurn = true;
    public static void main(String[] args) {
        Thread numberThread = new Thread( () ->{
            for(int i=1;i<=5;i++){
                synchronized(lock){
                    while(!numberTurn){
                        try{
                            lock.wait();
                        }catch(InterruptedException e){
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println("Number "+i);
                    numberTurn = false;
                    lock.notify();
                }
            }
        });

        Thread letterThread = new Thread( () ->{
            for(char c='A';c<='E';c++){
                synchronized(lock){
                    while(numberTurn){
                        try{
                            lock.wait();
                        }catch(InterruptedException e){
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println("Letter "+c);
                    numberTurn = true;
                    lock.notify();
                }
            }
        });

        numberThread.start();
        letterThread.start();
    }
}
     */

    /*
    class Node{

	int data;
	Node next;

	Node(int data){
		this.data = data;
		this.next = null;
	}
}


public class DetectAndRemoveCycle{

	public static void detectAndRemoveCycle(Node head){

		if(head == null || head.next == null) return;

		Node slow = head;
		Node fast = head;

		Boolean hasCycle = false;

		while(fast != null && fast.next != null ){

			slow = slow.next;
			fast = fast.next.next;

			if(slow == fast){

				hasCycle = true;
				break;
			}
		}

		if(!hasCycle){
			System.out.println("No CYCLE IS DETECTED");
			return;
		}


		slow = head;

		while(slow.next != fast.next)
		{

			slow = slow.next;
			fast = fast.next;
		}

		// break the cycle
		fast.next = null;
		System.out.println("CYCLE IS DETECTED");









	}
}



// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        String input = "javaaabbbbccddd";

        Map.Entry<Character, Long> result =input.chars()
            .mapToObj(c->(char)c)
            .collect(Collectors.groupingBy(Function.identity(),
            Collectors.counting()))
            .entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .orElseThrow();

        System.out.println(result.getKey()+"============="+result.getValue());
    }
}
     */
}
