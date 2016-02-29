
public class AndSpecification<T> extends CompositeSpecification<T>{

	 ISpecification<T> leftSpecification;
	 ISpecification<T> rightSpecification;
	 
	 public AndSpecification(ISpecification<T> left, ISpecification<T> right)  {
		 this.leftSpecification = left;
		 this.rightSpecification = right;
	 }

	 @Override
	 public boolean IsSatisfiedBy(T o)   {
		 return this.leftSpecification.IsSatisfiedBy(o) 
			  && this.rightSpecification.IsSatisfiedBy(o);
	 }	
}
