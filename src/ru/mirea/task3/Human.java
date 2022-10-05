package ru.mirea.task3;

public class Human {
    private int head;
    private int leg;
    private int hand;

    public Human(){
        head = 0;
        leg = 0;
        hand = 0;
    }
    public Human(int head, int leg, int hand){
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getHand() {
        return hand;
    }

    public void setHand(int hand) {
        this.hand = hand;
    }

    public void getHuman(){
        System.out.println("\nHead: " + this.head +
                "\nLeg: " + this.leg +
                "\nHand: " + this.hand);
    }
}