package br.com.internet.eventos.modeloeventosspringboot.eventos;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventProcessor {

	@Autowired
	private EventPublisher evento;
	
	public void process() {
		
		for (int i = 0; i < 5; i++) {
			
			MyEventPayload payload = new MyEventPayload();
			payload.setId(UUID.randomUUID().toString());
			payload.setValue(10);
			
			MyEvent event = new MyEvent(this, payload);
			
			evento.evento(event);
			
		}
		
	}

}
