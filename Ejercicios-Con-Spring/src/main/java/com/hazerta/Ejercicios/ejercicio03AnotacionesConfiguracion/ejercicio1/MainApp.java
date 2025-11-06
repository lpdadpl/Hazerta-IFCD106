package com.hazerta.Ejercicios.ejercicio03AnotacionesConfiguracion.ejercicio1;

import com.hazerta.Ejercicios.ejercicio03AnotacionesConfiguracion.ejercicio1.config.AppConfig;
import com.hazerta.Ejercicios.ejercicio03AnotacionesConfiguracion.ejercicio1.modelo.MyModel;
import com.hazerta.Ejercicios.ejercicio03AnotacionesConfiguracion.ejercicio1.repository.MyRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		MyRepository repository = context.getBean(MyRepository.class);
		MyModel model = context.getBean(MyModel.class);

		repository.query();
		System.out.println("Modelo cargado: " + model.getClass().getSimpleName());

		context.close();
	}
}




