package jdddd.domain.shared;

import java.util.UUID;

public class DefaultEntityIdentifier<T extends Entity<T>> extends AbstractValueObject implements EntityIdentifier<T> {

	private UUID uuid;
	
	public DefaultEntityIdentifier(UUID uuid) {
		super();
		this.uuid = uuid;
	}

	@Override
	public UUID toUUID() {
		return this.uuid;
	}

}
