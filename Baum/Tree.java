public class Tree{
	
	Node root;
	
	public Tree(Node root){
		this.root = null;
	}
	
	public Node getRoot(){
		return this.root;
	}
	
	public void setRoot(Node root){
		this.root = root;
	}
	
	public void add(String info){
		
		if(this.root == null){
			this.setRoot(new Node(info, null, null));
		}else{
			add(this.root, info);
		}
	}
	
	public void add(Node node, String info){
		
		if(node == null){
			this.setRoot(new Node(info,null,null));
		}else{
			if(info.compareTo(node.getInfo()) < 0){
				if (node.getLeft() == null){
					node.setLeft(new Node(info, null, null));
				}else{
					add(node.getLeft(), info);
				}
			}else{
				if (node.getRight() == null){
					node.setRight(new Node(info, null, null));
				}else{
					add(node.getRight(), info);
				}
			}
		}
		/*if(info.compareTo(node.getInfo()) < 0){
			if (node.getLeft() == null){
				node.setLeft(new Node(info, null, null));
			}else{
				add(node.getLeft(), info);
			}
		}else{
			if (node.getRight() == null){
				node.setRight(new Node(info, null, null));
			}else{
				add(node.getRight(), info);
			}
		}*/
			
	}
	
	public String inOrder(Node node){
		if(node == null){
			return "_";
		}else{
			return inOrder(node.getLeft()) + node.getInfo() + inOrder(node.getRight());
		}
		
	}
	
}