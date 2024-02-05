public class Node{
	
	Node left;
	Node right;
	String info;
	
	public Node(String info, Node left, Node right){
		this.info = info;
		this.left = left;
		this.right = right;
	}
	
	public String getInfo(){
		return this.info;
	}
	
	public void setInfo(String info){
		this.info = info;
	}
	
	public Node getLeft(){
		return this.left;
	}
	
	public Node getRight(){
		return this.right;
	}
	
	public void setLeft(Node left){
		this.left = left;
	}
	
	public void setRight(Node right){
		this.right = right;
	}
	
	
}