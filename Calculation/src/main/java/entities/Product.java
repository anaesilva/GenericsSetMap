package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Comparable<Product> {

    private String name;
    private Double price;

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }

    @Override
    public int compareTo(Product other) {
        return price.compareTo(other.getPrice());
    }
}
