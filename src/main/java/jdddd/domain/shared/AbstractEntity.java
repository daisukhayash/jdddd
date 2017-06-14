package jdddd.domain.shared;

public abstract class AbstractEntity<T extends Entity<T>> implements Entity<T> {

	private final EntityIdentifier<T> identifier;

	protected AbstractEntity(EntityIdentifier<T> identifier) {
		super();
		this.identifier = identifier;
	}

	@Override
	public EntityIdentifier<T> getIdentifier() {
		return this.identifier;
	}

	@Override
	public int hashCode() {
		return this.getIdentifier().hashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		
		if (this == null || other instanceof Entity == false) {
			return false;
		}

		return this.getIdentifier().equals(((Entity) other).getIdentifier());
	}

	@Override
	public T clone() throws CloneNotSupportedException {
		return (T) super.clone();
	}
}
