
public class NotSpecification<T> extends CompositeSpecification<T> {

	 ISpecification<T> specification;
	 
	 public NotSpecification(ISpecification<T> spec)  {
		 this.specification = spec;
	 }

	 @Override
	 public boolean IsSatisfiedBy(T o)   {
		 return this.specification.IsSatisfiedBy(o);
	 }		
	
}
