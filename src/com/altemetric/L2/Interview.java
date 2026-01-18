package com.altemetric.L2;

public class Interview {
    /*
    List<String> list= new ArrayList<>() ;
      list.add("Ram");
      list.add("Jim");
      list.add("Sita");
      list.add("Elyse") ;

      for(String str: list) {
              if(str.equals("Ram")){
			list.remove("Ram");
	}
System.out.println(list.toString());

------


//Timeout


@Bean
public RestTemplate restTemplate(){

	HttpComponentClientHttpRequestFactory factory = new HttpComponentClientHttpRequestFactory();

		factory.setConnectTimeOut(5000); //establish the connection
		factory.setReadTimeOut(5000); //wait for the response

	return new ReswtTemplate(factory);
}


------------


/*
Create a threadpool of size 3 using executor framework
print integers 1 to 100
using all 3 thread
print thread name along with integers
*/
/*import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
    class Main {
        public static void main(String[] args) {

            ExecutorService executor = Executors.newFixedThreadPool(3);
            for(int i=1;i<=100;i++){
                int number = i;

                executor.submit(()->{
                    System.out.println(
                            Thread.currentThread().getName() + "->"+number
                    );
                });
            }
            executor.shutdown();
        }
    }

     */

    /*
    /*
Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]
remove duplicates using singly link list

*/
    /*
import java.util.*;

    class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            // this.next = null;
        }
    }

    class Main {

        public static ListNode removeDuplicates(ListNode head){
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode prev = dummy;
            ListNode curr = head;
            while(curr != null){
                boolean duplicate = false;
                while(curr.next != null && curr.val == curr.next.val){
                    duplicate = true;
                    curr = curr.next;
                }

                if(duplicate){
                    prev.next = curr.next;
                }else{
                    prev = prev.next;
                }
                curr = curr.next;
            }
            return dummy.next;
        }

        public static void printList(ListNode head){
            while(head != null){
                System.out.print(head.val + " ");
                head = head.next;
            }
        }

        public static void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(3);
            head.next.next.next.next = new ListNode(4);
            head.next.next.next.next.next = new ListNode(4);
            head.next.next.next.next.next.next = new ListNode(5);

            head = removeDuplicates(head);


            printList(head);
        }
    }
     */
}
