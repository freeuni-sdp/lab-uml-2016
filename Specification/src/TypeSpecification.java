public class TypeSpecification<T> extends CompositeSpecification<T>
{
    private String Type;
    public TypeSpecification(String Type) {
        this.Type = Type;
    }
    
 @Override
    public boolean IsSatisfiedBy(T o) {
        return ((Mobile) o).getBrandName().equals(this.Type);
    }
}