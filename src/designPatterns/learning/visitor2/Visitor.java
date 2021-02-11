package designPatterns.learning.visitor2;

public interface Visitor<R> {
	public void visit(SocieteMere sm);
	public void visit(SocieteSansFiliale sf);
}
