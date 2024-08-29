class circularLL{
  private int size = 0;
  private int data;
  private circularLL head;
  private circularLL next;

  public void circularLL(){
    this.data = 0;
  }
  public void circularLL(int data){
    this.data=data;
    this.next=this;
  }
  
  public int getData(){
    return data;
  }
  public circularLL getNext(){
    return next;
  }
  public void setData(int data){
    this.data=data;
  }
  public void setNext(circularLL next){
    this.next=next;
  }
  public void add(int data){
      circularLL node = new circularLL();
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
    circularLL temp = head;
    for(int i = 0; i < 10;i++){
      System.out.print(temp.data+"-->");
      temp = temp.next;
    }
  }
}
class Main {
  public static void main(String[] args) {
    circularLL list = new circularLL();
    list.add(2);
    list.add(3);
    list.display();
  }
}
