package jdddd.domain.shared;

public interface Entity<T extends Entity<T>> extends Cloneable {

	EntityIdentifier<T> getIdentifier();
	
	boolean equals(Object other);
	
	int hashCode();
	
	T clone() throws CloneNotSupportedException;
}
