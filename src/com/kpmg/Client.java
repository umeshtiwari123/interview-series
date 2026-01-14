package com.kpmg;

import java.util.Objects;

public class Client {

    String s3= new String("hello");


        private int id;

        public Client (int id){

            this.id=id;

        }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Client client = (Client) object;
        return id == client.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        Client client1= new Client (25);

        Client client2= new Client (25);

        System.out.println("below: ");
        System.out.println(client1==client2);

        System.out.println(client1.equals(client2));
        System.out.println("above: ");
    }
//
//System.out.print(client1.equals(client2));
}
