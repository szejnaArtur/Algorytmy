package pl.arturszejna.collections.list.doubleLinkedList;

public class Main {
    public static void main(String[] args) {

        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();

        list.add(11);
        list.add(22);
        list.add(23);
        list.add(44);
        list.add(77);
        list.addLast(478);
        list.addFirst(548);

        list.iterateForward();
        System.out.println();
        System.out.println("Get[2]: " + list.get(2));
        System.out.println("Size: " + list.size());
        System.out.println("Delete[2]: " + list.delete(2));
        list.iterateForward();
        System.out.println();
        System.out.println("Get[2]: " + list.get(2));
        System.out.println("Size: " + list.size());


    }
}
