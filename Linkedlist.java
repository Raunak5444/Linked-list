class Linkedlist{
  private int data;
  private Linkedlist next;
  private Linkedlist head;
  private int size = 0;

  public Linkedlist(){
    this.data = 0;
  }
  public Linkedlist(int data){
    this.data=data;
  }
  public Linkedlist(int data,Linkedlist next){
    this.data=data;
    this.next=next;
  }
  public int getData(){
    return data;
  }
  public Linkedlist getNext(){
    return next;
  }
  public void setData(int data){
    this.data=data;
  }
  public void setNext(Linkedlist next){
    this.next=next;
  }
  public void add(int data){
      Linkedlist node = new Linkedlist(data);
    if(size == 0){
      head = node;

    }
    else{
      node.next = head;
      head = node;
    }
    size++;
}
  public void display(){
      Linkedlist temp = head;
    while(temp!=null){
      System.out.print(temp.data+"-->");
      temp = temp.next;
    }
    System.out.println("null");
  }
  public void addlast(int data){
    Linkedlist node = new Linkedlist(data);
    Linkedlist temp = head;
  while(temp.next!=null){
    temp = temp.next;
  }
    temp.next = node;
    node.next = null;
    size++;
  }
  public void insert(int data,int index){
      Linkedlist temp = head;
      Linkedlist node = new Linkedlist(data);
    for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
  }
  public void delete(){
    head = head.next;
    size--;
  }
  public void deleteLast(){
    Linkedlist temp = head;
    while(temp.next.next != null){
     temp = temp.next;
    }
    temp.next = null;
    size--;
  }
  public void deleteAt(int index){
    Linkedlist temp = head;
    for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
    temp.next = temp.next.next;
    size--;
  }
}
public class Main{
  public static void main(String[] args) {
    Linkedlist list = new Linkedlist();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);
    list.add(60);
    list.add(70);
    
    // list.addlast(50);
    // list.display();
    // list.insert(60, 3);
    list.deleteAt(3);
    // list.deleteLast();
    list.display();
  }
}
