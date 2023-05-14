package co.develhope.websocket.entities;

public class MessageDTO {

    String type;
    String message;
    String topic;

    public MessageDTO(){}

    public MessageDTO(String type, String message) {
        this.type = type;
        this.message = message;
        //this.topic = topic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /*public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }*/
}