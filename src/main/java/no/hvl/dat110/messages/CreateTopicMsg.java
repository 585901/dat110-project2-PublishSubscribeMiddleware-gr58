package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {

    // message sent from client to create topic on the broker
    // Object variable

    // TODO:
    // Implement object variables - a topic is required
    private String topic;


    // Constructor
    public CreateTopicMsg(String user, String topic) {
        super(MessageType.CREATETOPIC, user);
        this.topic = topic;

    }
    // TODO:
    // Complete the constructor, get/set-methods, and toString method
    // as described in the project text

    // get-metode
    public String getTopic() {
        return topic;

    }

    //set-metode
    public void setTopic(String topic) {
        this.topic = topic;

    }

    // toString-metode
    @Override
    public String toString() {
        return "CreateTopicMsg [topic=" + topic + "]" + super.toString();
    }
}
