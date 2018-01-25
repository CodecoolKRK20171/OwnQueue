package com.codecool.queue;

public class CustomQueue {

    private Node root;

    public CustomQueue(String value) {
        this.root = new Node(value);
    }

    public void enqueue(String value) {
        Node node = new Node(value);
        node.setNextNode(root);
        root = node;
    }

    public String peek() {

        Node node = root;
        Node previous = null;

        while(node.getNextNode() != null ){
            previous = node;
            node = node.getNextNode();
        }

        node = previous.getNextNode();
        return node.getValue();
    }

    public Node dequeue() {

        Node node = root;
        Node previous = null;

        while(node.getNextNode() != null ){
            previous = node;
            node = node.getNextNode();
        }

        node = previous.getNextNode();
        previous.setNextNode(null);

        return node;
    }

    public int queueSize() {
        
        int i = 0;
        Node node = root;

        if(this.isEmpty()){
            return i;
        }

        while(node.getNextNode() != null){
            i += 1;
            node = node.getNextNode();
        }

        return i;
    }

    public boolean isEmpty(){

        if(root.getNextNode() == null){
            return true;
        }
        return false;
    }
}
