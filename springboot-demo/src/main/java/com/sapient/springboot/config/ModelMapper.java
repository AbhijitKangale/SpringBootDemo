package com.sapient.springboot.config;

import com.sapient.springboot.jpa.JpaDepartment;
import com.sapient.springboot.model.Department;
import ma.glasnost.orika.MapperFactory;
import net.rakugakibox.spring.boot.orika.OrikaMapperFactoryConfigurer;

public class ModelMapper implements OrikaMapperFactoryConfigurer {

	@Override
	public void configure(MapperFactory orikaMapperFactory) {

		orikaMapperFactory.classMap(Department.class, JpaDepartment.class).mapNulls(false).byDefault().register();
	}
}
