package com.mikediaz.LiterAlura.service;

public interface IDataConvertion {
    <T> T convertData(String json, Class<T> clase);
}
