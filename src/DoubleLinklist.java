

import java.util.Scanner;

public class DoubleLinklist <T> {
    public class Node{
         public int noOfParameters;
        public T value;
        public String variableName;
        public String variableSize;
        public Node next;
        public Node pre;
        public String functionName;
        public String returnVar;
        Node(){
            variableName=null;
            next=null;
            pre=null;
            noOfParameters=0;
            returnVar=null;
        }
        Node(String s, int i, String ret){ //for functions trace 
            functionName=s;
            returnVar=ret;
            next=null;
            pre=null;
            noOfParameters=i;
        } 
        Node(String d, String VS, T val){ // for data variables
            returnVar=null;
            value=val;
            variableSize=VS;
            variableName=d;
            next=null;
            pre=null;
            noOfParameters=0;
        }
    }
    protected Node head;
    protected Node tail;
    protected int size;
    DoubleLinklist(){
        head=null;
        tail=null;
        size=0;
    }
    public boolean isEmpty(){
        if(head==null)  return true;
        else return false;
    }
    public String getVariableSize(String data){
        Node current=head;
        for(int i=0; i<size; i++){
            if(current.variableName.contentEquals(data)){
                return current.variableSize;
            }
            current=current.next;
        }
        return "null";
    }
    public void insertAtStart(String data, String variableSize, T val){
        Node newNode=new Node(data, variableSize, val);
        size+=1;
        if(head==null){
            head=newNode;
            newNode=head;
            tail=head;
        }
        else{
           head.pre=newNode;
           newNode.next=head;
           head=newNode;    
           
        }
    }
    
     public void insertAtEnd(String data, String variableSize, T val){
        Node newNode=new Node(data, variableSize,val);
        size+=1;
        if(head==null){
           head=newNode;
           tail=head;
        }
        else{
            tail.next=newNode;
            newNode.pre=tail;
            tail=newNode;
        }
    }
     
     public void insertAtEnd(String data, int noP, String ret){
        Node newNode=new Node(data, noP, ret);
        size+=1;
        if(head==null){
           head=newNode;
           tail=head;
           
        }
        else{
            tail.next=newNode;
            newNode.pre=tail;
            tail=newNode;
        }
    }
    
    public int getSize(){
        return size;
    }
    public String getElemens(int pos){
        Node current=head;
        String temp="";
        for(int i=0; i<size; i++){
            if(i==pos){
                temp=current.functionName;
                break;
            }
            else{
                current=current.next;
            }
        }
        return temp;
    }
    public void getHead(){
        if(head==null){
            System.out.println("Empty list!");
        }
        else{
            System.out.println("Head="+head.variableName);

        }
    }
    public void getTail(){
        System.out.println("tail="+tail.variableName);
    }
    public void dis(){
        Node current=new Node();
        current=head;
        for(int i=0; i<size; i++){
            System.out.println(current.variableName);
            current=current.next;
        }
    }
    
    public void deleteFirst(){
        if(size==1){
            head=null;
            size-=1;
        }
        else if(head==null){
            System.out.println("Empty list!");

        }
        else{
            size-=1;
            head=head.next;
            head.pre=null;
            
        }
    }
    public void deleteLast(){
        Node current=new Node();
        current=head;
        if(size==1){
            head=null;
            size-=1;
        }
        else if(head==null){
            System.out.println("Empty List!");
        }
        else{
            for(int i=1; i<=size; i++){
                if(i==size-1){
                    current.next=null;
                    size-=1;
                }
                current=current.next;
            }
        }
    }
    public boolean search(String data){
        Node current=head;
        for(int i=0; i<size; i++){
            if(current.variableName.contentEquals(data)){
                
                return true;
            }
            current=current.next;
        }
        return false;
    }
    public void deleteByName(String fName){
        Node current=new Node();
        current=head;
        if(head.functionName==fName){
            deleteFirst();
        }
        else if(fName==tail.functionName){
            deleteLast();
        }
        
        else {
            for(int i=1; i<=size; i++){
                if(current.functionName==fName){
                    current=current.pre;
                    Node temp=current.next.next;
                    current.next=temp;
                    size-=1;
                    break;
                }
                current=current.next;
            }
        }
    }
}
