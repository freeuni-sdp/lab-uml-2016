
public abstract class CompositeSpecification<T> implements ISpecification<T>{


    public abstract boolean IsSatisfiedBy(T o);

    public ISpecification<T> And(ISpecification<T> specification){
        return new AndSpecification<T>(this, specification);
    }
    
    public ISpecification<T> Or(ISpecification<T> specification){
        return new OrSpecification<T>(this, specification);
    }
    
    
    public ISpecification<T> Not(ISpecification<T> specification){
        return new NotSpecification<T>(specification);
    }
	
}
