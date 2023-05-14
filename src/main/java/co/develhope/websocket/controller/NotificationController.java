package co.develhope.websocket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NotificationController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;


    /**
     * Questa è l'operazione di invio di un messaggio
     *
     * Concetto di "accepted": ok, ho preso in carico questa richiesta...
     * e ho chiesto a qualcun altro di fare qualcosa
     */

    /*@PostMapping("/broadcast")
    public ResponseEntity sendBroadcast (@RequestBody MessageDTO messageDTO){
        //ricevo oggetti di tipo MessageDTO e li reinoltro verso un canale broadcast
        simpMessagingTemplate.convertAndSend("/topic/broadcast", messageDTO);
        return ResponseEntity.accepted().body("Messaggio " + messageDTO.getMessage() + " inviato al canale /topic/broadcast");
    }*/

    /*
    @PostMapping("/broadcast-message")
    public ResponseEntity sendNotification(@RequestBody MessageDTO message){
        simpMessagingTemplate.convertAndSend("/topic/broadcast", message);

        return ResponseEntity.status(HttpStatus.OK).build();
    }
    */

     /*
    /**
     * Questa è l'operazione di ricezione del messaggio
     * e successivo reinoltro verso un altro canale
     * Fa uso del @PostMapping precedente!
     * Questa funzione permette di usare la casella in alto a destra nel browser 'your name here'

    @MessageMapping("/hello")
    @SendTo("/topic/broadcast")
    public MessageDTO forwardMessage(ClientMessageDTO message){
        return new MessageDTO("FrontEnd", message.getText());
        //return new MessageDTO("FrontEnd", "Messaggio da " + message.getFrom(), ": " + message.getText());
    }*/
}