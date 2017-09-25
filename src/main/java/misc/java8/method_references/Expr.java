package misc.java8.method_references;

@FunctionalInterface
public interface Expr {
    boolean test(MethodReferences mr, int n);
}
