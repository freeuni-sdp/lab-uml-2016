
public interface ISpecification<T> {
	 boolean IsSatisfiedBy(T o);
     ISpecification<T> And(ISpecification<T> specification);
     ISpecification<T> Or(ISpecification<T> specification);
     ISpecification<T> Not(ISpecification<T> specification);
}