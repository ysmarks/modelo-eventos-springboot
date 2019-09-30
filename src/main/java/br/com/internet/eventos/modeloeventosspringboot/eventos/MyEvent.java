package br.com.internet.eventos.modeloeventosspringboot.eventos;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;
	
	private MyEventPayload eventPayload;
	
	public MyEvent(Object source,MyEventPayload eventPayload ) {
		super(source);
		this.eventPayload = eventPayload;
		
	}

	public MyEventPayload getEventPayload() {
		return eventPayload;
	}
	
	

}
