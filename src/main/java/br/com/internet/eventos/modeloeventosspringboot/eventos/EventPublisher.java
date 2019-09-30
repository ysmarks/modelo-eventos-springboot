package br.com.internet.eventos.modeloeventosspringboot.eventos;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher EventPublisher;
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher EventPublisher) {
		this.EventPublisher = EventPublisher;
		
	}

	public void evento(MyEvent event) {
		this.EventPublisher.publishEvent(event);
		
	}


}
