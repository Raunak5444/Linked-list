class doublyLinkedList{
  private int data;
  private doublyLinkedList head;
  private doublyLinkedList next;
  private doublyLinkedList prev;
  private int size = 0;

  public doublyLinkedList(int data){
    this.data=data;
    this.next= null;
    this.prev = null;
  }
  public int getData(){
    return data;
  }
  public void setData(int data){
    this.data=data;
  }
  public doublyLinkedList getNext(){
    return next;
  }
  public void setNext(doublyLinkedList next){
    this.next=next;
  }
  public doublyLinkedList getPrev(){
    return prev;
  }
  public void setPrev(doublyLinkedList prev){
    this.prev=prev;
  }
  public void add(int data){
    doublyLinkedList node = new doublyLinkedList(data);
    if(size == 0){
      head = node;
    }else{
      node.setNext(head);
      head.setPrev(node);
      head = node;
    }
    size++;
  }
  public void display(){
        doublyLinkedList temp = head;
    System.out.print("null<--");
    while(temp!=null){
      System.out.print(temp.data+"<-->");
      temp = temp.next;
    }
    System.out.println("null");
  }
  public void addLast(int data){
    doublyLinkedList node = new doublyLinkedList(data);
    if(size == 0){
      head = node;
    }else{
      doublyLinkedList temp = head;
      while(temp.next != null){
        temp = temp.next;
      }
      temp.next = node;
      node.prev = temp;
    }
    size++;
  }
   public void addAt(int data, int index){
     doublyLinkedList node = new doublyLinkedList(data);
     doublyLinkedList temp = head;
     doublyLinkedList temp2 = head;
     for(int i = 0; i < index - 1 ; i++){
       temp = temp.next;
       temp2 = temp.next;
     }
      temp.next = node;
      temp2.prev = node;
      node.prev = temp;
      node.next = temp2;
      size++;
   }
   public void delete(){
     head = head.next;
     size--;
   }
   public void deleteLast(){
     doublyLinkedList temp = head;
     while(temp.next != null){
       temp = temp.next;
     }
     temp.prev.next = null;
     size--;
   }
   public void deleteAt(int index){
     doublyLinkedList temp = head;
     doublyLinkedList temp2 = head;
     for (int i = 0; i < index -1 ;i++){
       temp = temp.next;
     }
      temp2 = temp.next.next;
     temp.next = temp2;
     temp2.prev = temp;
   }
 }
class Main {
  public static void main(String[] args) {
     doublyLinkedList list = new doublyLinkedList(1);
       list.add(10);
       list.add(20);
       list.add(30);
       list.add(40);
       list.add(50);
       list.addLast(60);
       list.addAt(70,3);
       list.deleteAt(3);
       list.display();
  }
}
