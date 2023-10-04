package com.wordsmatry.mapper;

import java.util.List;

public interface Mapper<D, E> {

	E toEntity(D api);

	D toApi(E entity);

	List<E> toEntity(List<D> apiList);

	List<D> toApi(List<E> entityList);

}