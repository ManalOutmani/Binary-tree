import java.util.List;

public class BinaryTree {
    Node racine;
    void insert(int nbr){
        racine=insertNode(racine,nbr);
    }
    public Node insertNode(Node racine,int nbr){
        if (racine==null){
            racine=new Node(nbr);
            return racine;
        }
        if(nbr<racine.value){
            racine.left=insertNode(racine.left,nbr);
            System.out.println("on the left insert"+racine.left.value);
            return racine;
        }
        if(nbr>racine.value){
            racine.right=insertNode(racine.right,nbr);
            System.out.println("on the right insert"+racine.right.value);
            return racine;
        }
        return racine;
    }
    public void searchTree(Node racine,int nbr){
        if(racine==null){
            System.out.println("not found");

        }
        else{
        if(racine.value==nbr){
            System.out.println("found");
        }

        if(nbr<racine.value){
            System.out.println("in left");


            searchTree(racine.left,nbr);

        }
        if(nbr>racine.value){
            System.out.println("in right");
            searchTree(racine.right,nbr);
        }}



    }

    public BinaryTree(Node racine) {
        this.racine = racine;
    }


}
