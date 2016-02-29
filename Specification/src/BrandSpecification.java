public class BrandSpecification<T> extends CompositeSpecification<T>
{
    private String BrandName;
    public BrandSpecification(String BrandName) {
        this.BrandName = BrandName;
    }
    
 @Override
    public boolean IsSatisfiedBy(T o) {
        return ((Mobile) o).getBrandName().equals(this.BrandName);
    }
}