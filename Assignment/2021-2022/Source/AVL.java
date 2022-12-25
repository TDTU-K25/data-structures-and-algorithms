import java.util.ArrayList;

public class AVL {
    private Node root;

    public AVL(){
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int height(Node node){		
		if (node == null) 
            return -1;   
        return node.getHeight();
	}

    private int checkBalance(Node x){
		return height(x.getLeft()) - height(x.getRight());
	}

    private Node balance(Node x) {
		return x;
	}

    private Node insert(Node node, Receipt receipt){
		//code here and change the return value
		return null;
	}

    public void insertReceipt(Receipt receipt){
		this.root = insert(this.root, receipt);
	}

    private void NLR(Node node, ArrayList<String> result){
		if (node != null) 
        { 
			result.add(node.getReceipt().toString()) ; 
            NLR(node.getLeft(), result);             
            NLR(node.getRight(), result); 
        } 
	}
	
	public void NLR(ArrayList<String> result){
		NLR(this.root, result);
	}

    private Node search(Node x, int receiptId) {
		//code here and change the return value
		return null;
	}
	
	public String search(int receiptId){
		return search(root, receiptId).getReceipt().toString();
	}
}
