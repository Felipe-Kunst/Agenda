public class Arvore<T> {
    T data;
    Lse<Arvore<T>> children; 
    public Arvore(T data) {
        this.data = data; 
        this.children = new Lse<>(); 
    }
    public void addChild(Arvore<T> child) {
        this.children.adicionar(child);
    }
    public Arvore<T> getChild(T data) {
        for (int i = 0; i < children.tamanho(); i++) {
            Arvore<T> child = children.get(i);
            if (child != null && child.data.equals(data)) { 
                return child;
            }
        }
        return null; 
    }
    public void printTree(String prefix) {
        System.out.println(prefix + data); 
        for (int i = 0; i < children.tamanho(); i++) {
            Arvore<T> child = children.get(i);
            if (child != null) { 
                child.printTree(prefix + "--"); 
            }
        }
    }
}
