package designPatterns.learning.visitor2;

public interface Visitable {
	 public <R> void  accept(Visitor<R> visitor);
}
