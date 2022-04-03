package list;

public class LinkedList01 {
    public static void main(String[] args) {
        //模拟简单的双向链表
        //创建节点
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node mary = new Node("mary");

        //链表构建
        jack.next = tom;
        tom.next = mary;
        mary.pre = tom;
        tom.pre = jack;

        Node first = jack;//first是一个对象引用，引用jack，头节点
        Node last = mary;

        //遍历
        while(true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        //插入对象
        /*
        1.创建一个Node对象
        2.设置prev，next
         */
        Node smith = new Node("smith");
        smith.pre = tom;
        smith.next = mary;
        mary.pre = smith;
        tom.next = smith;

        first = jack;

        while(true){
            if(last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }


    }
}
//定义一个Node类
class Node{
    public Object item;
    public Node next;
    public Node  pre;

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name=" + item;
    }
}
