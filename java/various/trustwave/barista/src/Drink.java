import java.math.BigDecimal;
import java.util.Collection;
public interface Drink{

	public String getName();

	public BigDecimal getPrice();

	public int getUnits(Collection<Ingredient> ingredient);

}