package jdddd.domain.shared;

public interface ValueObject {

	boolean equals(Object other);
	
	int hashCode();
}
