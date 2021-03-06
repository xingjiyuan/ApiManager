package com.moer.api;

public interface IRegister {
    <I extends IApi, E extends I> void register(Class<I> apiInterface, Class<E> apiImplement);
}
