package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

    // message sent from client to create topic on the broker
    // Object variable

    // TODO:
    // Implement object variables - a topic is required
    private String topic;

    // Constructor
    public DeleteTopicMsg(String user, String topic) {
        super(MessageType.DELETETOPIC, user);
        this.topic = topic;
    }

    // TODO:
    // Complete the constructor, get/set-methods, and toString method
    // as described in the project text

    // get-metode
    public String getTopic() {
        return topic;
    }

    // set-metode
    public void setTopic(String topic) {
        this.topic = topic;
    }

    // toString-metode
    @Override
    public String toString() {
        return "CreateTopicMsg [topic=" + topic + "]" + super.toString();
    }

}