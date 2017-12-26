package jjsevi.advanced.jaxrs.converters;

import jjsevi.advanced.jaxrs.model.MyDate;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public class MyDateConverterProvider implements ParamConverterProvider {

    @Override
    public <T> ParamConverter<T> getConverter(Class<T> aClass, Type type, Annotation[] annotations) {
        if (aClass.getName().equals(MyDate.class.getName())){
            return new ParamConverter<T>() {
                @Override
                public T fromString(String s) {
                    return null;
                }

                @Override
                public String toString(T t) {
                    return null;
                }
            };
        }

        return null;
    }
}
