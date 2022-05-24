public class ListClient1 {
    public static void main(String[] args) {
        LinkedIntList list1 = new LinkedIntList();
        list1.add(18);
        list1.add(27);
        list1.add(93);
        list1.add(16);
        list1.add(65);
        list1.add(23);
        list1.add(68);
        list1.add(22);
        list1.add(93);
        System.out.println(list1);
        list1.switchPairs();
        System.out.println(list1);

        LinkedIntList list2 = new LinkedIntList();
        list2.add(18);
        list2.add(-27);
        list2.add(-93);
        list2.add(18);
        list2.add(-27);
        list2.add(93);
        list2.add(18);
        list2.add(27);
        list2.add(-93);
        System.out.println(list2);
        list2.split();
        System.out.println(list2);
    }
}