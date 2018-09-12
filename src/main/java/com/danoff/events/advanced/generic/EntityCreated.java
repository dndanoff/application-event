package com.danoff.events.advanced.generic;

import org.springframework.core.ResolvableType;
import org.springframework.core.ResolvableTypeProvider;

public class EntityCreated<T> implements ResolvableTypeProvider{

	private final T entity;
	
	public EntityCreated(T entity) {
        this.entity = entity;
    }

    @Override
    public ResolvableType getResolvableType() {
        return ResolvableType.forClassWithGenerics(getClass(),
                ResolvableType.forInstance(entity));
    }

}
