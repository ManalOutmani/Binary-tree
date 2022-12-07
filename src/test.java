public class test {
    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree(new Node(9));
        tree.insert(5);
        tree.insert(6);
        tree.insert(10);
        tree.insert(7);
        System.out.println("root"+tree.racine.value);
        System.out.println("left"+tree.racine.left.value);
        System.out.println("left right"+tree.racine.left.right.value);

        tree.searchTree(tree.racine,6);

    }
}
