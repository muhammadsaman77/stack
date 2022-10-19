public class Stack<T> {
    public Node<T> first;
    public void push(T value){
        Node<T> temp = new Node<T>(value);
        if (first == null){
            first = temp;
        }else{
            temp.setNext(first);
            first = temp;
        }
    }
    public boolean hasPop(){
        return first != null;}
    
    public void pop(){
        if(this.hasPop()){
            first = first.getNext();
        }
    }
    @Override
    public String toString(){
        String str = "";
        Node<T> temp = first;
        while (temp.getNext()!= null){
            str = str + temp.toString();
            temp = temp.getNext();
        }
        str = str + temp.toString();
        return str;
    }
}
