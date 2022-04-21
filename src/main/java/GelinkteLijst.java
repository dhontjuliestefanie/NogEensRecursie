public class GelinkteLijst {
    public static void main(String[] args) {
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);
        Node node4 = new Node(4, null);
        Node node5 = new Node(5, null);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        System.out.println("Voorwaarts");
        printGelinkteLijstVoorwaarts(node1);
        System.out.println("");
        System.out.println("En dan achterwaarts...");
        printGelinkteLijstAchterwaarts(node1);

    }

    private static void printGelinkteLijstAchterwaarts(Node node) {
        if (node != null) {
            printGelinkteLijstAchterwaarts(node.getNext());
            System.out.print(node.getValue());
        }
    }

    private static void printGelinkteLijstVoorwaarts(Node node) {
        if (node != null) {
            System.out.print(node.getValue());
            printGelinkteLijstVoorwaarts(node.getNext());
        }
    }
}
