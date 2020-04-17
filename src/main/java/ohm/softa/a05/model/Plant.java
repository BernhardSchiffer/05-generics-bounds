package ohm.softa.a05.model;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public abstract class Plant implements Comparable<Plant> {

    private double height;
    private String family;
    private String name;

    public Plant(double height, String family, String name) {
        if(height <= 0)
            throw new IllegalArgumentException("a plant can't be shorter than 0");
        if(StringUtils.isBlank(family))
            throw new IllegalArgumentException("invalid Family name");
        if(StringUtils.isBlank(name))
            throw new IllegalArgumentException("invalid name");

        this.height = height;
        this.family = family;
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public abstract PlantColor getColor();

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name" + this.getName())
                .append("family" + this.getFamily())
                .append("height"+ this.getHeight())
                .append("color" + this.getColor())
                .toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(this.getName())
                .append(this.getFamily())
                .append(this.getHeight())
                .append(this.getColor())
                .toHashCode();
    }

    @Override
    public boolean equals(Object o) {
        if(o == null)
            return false;

        if(this == o)
            return true;

        if(!(o instanceof Plant))
            return false;

        Plant plant = (Plant) o;

        return new EqualsBuilder()
                .append(getHeight(), plant.getHeight())
                .append(getFamily(), plant.getFamily())
                .append(getName(), plant.getName())
                .append(getColor(), plant.getColor())
                .isEquals();
    }

    @Override
    public int compareTo(Plant other) {
        return Double.compare(this.getHeight(), other.getHeight());
    }

}
